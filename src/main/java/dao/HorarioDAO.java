/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.ProgramacionDAO.sessionFactory;
import entity.Horario;
import entity.Ruta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author limati
 */
public class HorarioDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

    public List<Horario> buscarHorario(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Horario where (saliHor like ? or llegHor like ? or cast(idHor as string) like ?) and isDeleted=?");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, 0);
        List results = query.list();
        return results;

    }
    
    public static List<Object> listHorario() {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select concat(saliHor,' - ',llegHor) from Horario where isDeleted=?");
        query.setParameter(0, 0);
        List results = query.list();
        return results;
    }
    
    public static Integer getIdHorarioSeleccionado(String nombre) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(" select idHor from Horario where concat(saliHor,' - ',llegHor)=? and isDeleted=?");
        query.setParameter(0, nombre);
        query.setParameter(1, 0);
        List results = query.list();
        Integer id=0;
        
        if(results.size()>0){
         id= (Integer) results.get(0);
        }
        return id;
    }
    
    public static void main(String[] args) {
        //List<Horario> a=listHorario();
        int as=getIdHorarioSeleccionado("04:00 AM - 08:00 AM");
        int asas=0;
    }
}
