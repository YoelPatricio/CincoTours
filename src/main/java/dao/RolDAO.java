/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.GenericDAO.sessionFactory;
import entity.Rol;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author limati
 */
public class RolDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

    public List<Rol> buscarRol(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Rol where (nombRol like ? or descRol like ? or cast(idRol as string) like ?) and isDeleted=?");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, 0);
        List results = query.list();
        return results;

    }
    
    public List<Integer> listPermisos(Integer idRol) {
        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select p.nmod_per from rol r inner join permiso p on r.id_rol=p.id_rol where r.id_rol = "+idRol+" order by 1");
        //query.setParameter(0, idRol);
        List results = query.list();
        return results;
    }
    
    public List<Rol> listRol() {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Rol where isDeleted=?");
        query.setParameter(0, 0);
        List results = query.list();
        return results;
    }
    
    public Integer getIdRolSeleccionado(String nombre) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(" select idRol from Rol where nombRol=? and isDeleted=?");
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
        RolDAO r=new RolDAO();
        /*List<Integer> perm=r.listPermisos(12);
        
        for (int i = 0; i < perm.size(); i++) {
            if(perm.get(i)==12){
                System.out.println("Doce encontrado");
            }
        }*/
        Integer a = r.getIdRolSeleccionado("fgdfgdfgdfg");
        int dd=0;
    }
}
