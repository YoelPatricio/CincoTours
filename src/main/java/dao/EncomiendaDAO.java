/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.BoletoDAO.sessionFactory;
import static dao.ProgramacionDAO.sessionFactory;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author limati
 */
public class EncomiendaDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
        

    public static List<Object> buscarEncomienda(String cadena,int estado) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="select e.id_enc,p.fech_pro,p.hllega_pro,b.nume_bus,e.drem_enc," +
                    "e.nrem_enc,e.dcon_enc,e.ncon_enc,e.tota_enc,e.esta_enc " +
                    " from encomienda e inner join programacion p " +
                    " on e.id_pro=p.id_pro inner join ruta r " +
                    " on e.id_rut=r.id_rut inner join bus b " +
                    " on p.id_bus=b.id_bus " +
                    //" order by e.id_enc desc " +
                    " where (cast(e.id_enc as CHARACTER) like ? or p.fech_pro like ? or "
                + " b.nume_bus like ? or e.drem_enc like ? or e.nrem_enc like ? or e.dcon_enc like ? "
                + " or e.ncon_enc like ? or e.ncon_enc like ?) ";
        
        if(estado!=-1){
            sql = sql + " and e.esta_enc=?";
        }
        sql = sql +  " order by e.id_enc desc " ;
        Query query = session.createSQLQuery(sql);

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        query.setParameter(6, "%"+cadena+"%");
        query.setParameter(7, "%"+cadena+"%");
        if(estado!=-1){
            query.setParameter(8, estado);
        }
        
        List results = query.list();
        
        
        return results;
    }
    
    public static void cambiarEstadoEntregado(int idEnc) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update encomienda set esta_enc=3 where id_enc=?"); 
        query.setParameter(0, idEnc); 
 
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        

    }
    
    public static List<Object> getIngresosEncomiendas(String inicio,String termino) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="select fech_enc,count(*) as cantidad,sum(tota_enc) as total " +
                    " from encomienda " +
                    " where fech_enc BETWEEN DATE_FORMAT(?,\"%Y-%m-%d\") AND DATE_FORMAT(?,\"%Y-%m-%d\")" +
                    " GROUP BY fech_enc" +
                    " order by fech_enc asc";

        Query query = session.createSQLQuery(sql);
   
        query.setParameter(0, inicio);
        query.setParameter(1, termino);

        List results = query.list();

        return results;

    }   
}
