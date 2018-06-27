/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.GenericDAO.sessionFactory;
import entity.Parametros;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author limati
 */
public class ParametroDAO {
    
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
        
    public List<Parametros> list(int idParam) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Parametros where idParam=?");
        query.setParameter(0, idParam);
        List results = query.list();
        return results;
    }
}
