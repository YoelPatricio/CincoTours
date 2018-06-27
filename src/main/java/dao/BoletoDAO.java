/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class BoletoDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
        
    public static List<Object> buscarBoleto(String cadena,int estado) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="select b.id_bol,p.id_pro,bu.nume_bus,bu.plac_bus,p.fech_pro,"
                                            + "concat(h.sali_hor,\" - \",h.lleg_hor),b.ruc_empr,b.nomb_empr,b.dni_cli,"
                                            + "b.nomb_cli,r.nomb_rut,b.prec_bol,b.acar_bol,b.tota_bol,b.esta_bol "
                                            + "from boleto b inner join programacion p on b.id_pro=p.id_pro "
                                            + "inner join ruta r on b.id_rut=r.id_rut "
                                            + "inner join usuario u on b.id_usu=u.id_usu "
                                            + "inner join horario h on p.id_hor=h.id_hor "
                                            + "inner join bus bu on p.id_bus=bu.id_bus "
                                            + "where (cast(b.id_bol as CHARACTER) like ? or "
                + " p.fech_pro like ? or concat(h.sali_hor,\" - \",h.lleg_hor) like ? or b.ruc_empr like ? or "
                + " b.nomb_empr like ? or b.dni_cli like ? or b.nomb_cli like ? or r.nomb_rut like ? )";
        
        if(estado!=-1){
            sql = sql + " and b.esta_bol=?";
        }
        
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
    
    public void cambiarEstado(int idBol) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update boleto set esta_bol=1 where id_bol=?");
       
        
        
         
        query.setParameter(0, idBol); 
        
       
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        

    }
    
    public static List<Object> getIngresosBoletos(String inicio,String termino) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="select b.fcom_bol,count(*) as cantidad,sum(b.tota_bol) as total " +
                    " from boleto b " +
                    " where b.fcom_bol BETWEEN DATE_FORMAT(?,\"%Y-%m-%d\") AND DATE_FORMAT(?,\"%Y-%m-%d\") " +
                    " and b.esta_bol=0 " +
                    " GROUP BY b.fcom_bol " +
                    " order by b.fcom_bol asc";

        Query query = session.createSQLQuery(sql);
   
        query.setParameter(0, inicio);
        query.setParameter(1, termino);

        List results = query.list();

        return results;

    }   
}
