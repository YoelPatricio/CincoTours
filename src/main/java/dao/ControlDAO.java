/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.BoletoDAO.sessionFactory;
import static dao.EncomiendaDAO.sessionFactory;
import static dao.GenericDAO.sessionFactory;
import static dao.RolDAO.sessionFactory;
import entity.Movimiento;
import entity.Rol;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author limati
 */
public class ControlDAO {
   static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	} 
        
    public BigDecimal totalBoletos(int idPro){
        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select sum(tota_bol) from boleto where id_pro=? and esta_bol=0");
        query.setParameter(0, idPro);
        List results = query.list();
           if(results.get(0)!=null){
               return  (BigDecimal) results.get(0);

        }
        return BigDecimal.ZERO;
    }
    
    public BigDecimal totalEncomiendas(int idEnc){
        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select sum(tota_enc) from encomienda where id_enc=?");
        query.setParameter(0, idEnc);
        List results = query.list();
           if(results.get(0)!=null){
               return  (BigDecimal) results.get(0);

        }
        return BigDecimal.ZERO;
    }
    
    public static List<Object> buscarControl(String cadena,int estado) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="SELECT c.id_con,u.logi_usu,p.fech_pro,r.nomb_rut,b.nume_bus,c.ming_cont,c.megr_cont,c.tota_con " +
                    " FROM control c INNER JOIN usuario u " +
                    " ON c.id_usu=u.id_usu INNER JOIN programacion p " +
                    " ON c.id_pro=p.id_pro INNER JOIN bus b " +
                    " ON p.id_bus=b.id_bus INNER JOIN ruta r " +
                    " ON p.id_rut=r.id_rut " +
                    " WHERE cast(c.id_con as CHARACTER) like ? or u.logi_usu like ? "
                    + "or p.fech_pro like ? or r.nomb_rut like ? or b.nume_bus like ? "
                    + "order by p.fech_pro desc";
        
        Query query = session.createSQLQuery(sql);
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");

        List results = query.list();

        return results;
    }  
    
    public List<Object> detalleMovimiento(int idCon) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select tipo_mov,nomb_mov,mont_mov from movimiento where id_con=?");
        query.setParameter(0, idCon);
        
        List results = query.list();
        return results;

    }
    
    public static List<Object> getIngresosTotales(String inicio,String termino) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="SELECT p.fech_pro,sum(c.ming_cont),sum(c.megr_cont),sum(c.tota_con) " +
                    " FROM control c INNER JOIN usuario u " +
                    " ON c.id_usu=u.id_usu INNER JOIN programacion p " +
                    " ON c.id_pro=p.id_pro INNER JOIN bus b " +
                    " ON p.id_bus=b.id_bus INNER JOIN ruta r " +
                    " ON p.id_rut=r.id_rut " +
                    " where p.fech_pro BETWEEN DATE_FORMAT(?,\"%Y-%m-%d\") AND DATE_FORMAT(?,\"%Y-%m-%d\") " +
                    " group by p.fech_pro " +
                    " order by p.fech_pro asc";

        Query query = session.createSQLQuery(sql);
   
        query.setParameter(0, inicio);
        query.setParameter(1, termino);

        List results = query.list();

        return results;

    }   
}
