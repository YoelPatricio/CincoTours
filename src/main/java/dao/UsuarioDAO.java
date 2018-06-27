/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Ruta;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UsuarioDAO {
    
    
    
   static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

    public static Integer validarUsuario(String logiUsu,String passUsu) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select r.id_rol from usuario u inner join empleado e on u.id_emp=e.id_emp inner join rol r on e.id_rol=r.id_rol WHERE u.logi_usu=? and u.pass_usu=? and u.is_deleted=?");
        query.setParameter(0, logiUsu);
        query.setParameter(1, passUsu);
        query.setParameter(2, 0);
        List results = query.list();
        
        Integer res=0;
        if (results.size()!=0) {
            res = (Integer) results.get(0);
        }
        
        
        return res;

    }
    
    public static List<Object> buscarUsuario(String cadena) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        Query query = session.createQuery("select u.idUsu,u.logiUsu,e.dniEmp,e.nombEmp from Usuario u inner join u.empleado e where (e.dniEmp like ? or cast(u.idUsu as string) like ? or e.nombEmp like ? or u.logiUsu like ?) and u.isDeleted=?");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, 0);
        List results = query.list();
        return results;

    }
    
    public static List<Object> obtenerCampos(Integer idUsu) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("select e.idEmp, u.passUsu from Usuario u inner join u.empleado e where u.idUsu = ? and u.isDeleted=?");

        query.setParameter(0, idUsu);
        query.setParameter(1, 0);
        List results = query.list();
        return results;

    }
    
    public static List<Object> usuarioInSession(String logiUsu,String passUsu) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("select u.id_usu,u.logi_usu,e.dni_emp,e.nomb_emp from usuario u inner join empleado e on u.id_emp=e.id_emp inner join rol r on e.id_rol=r.id_rol WHERE u.logi_usu=? and u.pass_usu=? and u.is_deleted=?");
        query.setParameter(0, logiUsu);
        query.setParameter(1, passUsu);
        query.setParameter(2, 0);
        List results = query.list();
        
        return results;

    }
    
    public static void main(String[] args) {
        
        
        
        
        List<Object> sa = usuarioInSession("yoel", "123");
        
        
        Object[] a = new Object[4];
        a=(Object[]) sa.get(0);
        String user=a[0].toString()+","+a[1].toString()+","+a[2].toString()+","+a[3].toString();
        int bv=5;
    }
    
    
}
