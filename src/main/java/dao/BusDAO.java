/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.ProgramacionDAO.sessionFactory;
import entity.Bus;
import entity.Ruta;
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
public class BusDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

    public List<Bus> buscarBus(String cadena) {

        Session session = sessionFactory.openSession();  
        Query query = session.createQuery("from Bus where (numeBus like ? or placBus like ? or kmetBus like ? or marcBus like ? or modeBus like ? or cast(idBus as string) like ?) and isDeleted=?");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        query.setParameter(6, 0);
        List results = query.list();
        return results;

    }
    
    public static void cambiarEstado(int estado,String placa) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update bus set esta_bus=? where plac_bus=?");
        query.setParameter(0, estado); 
        query.setParameter(1, placa); 
 
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();

    }
}
