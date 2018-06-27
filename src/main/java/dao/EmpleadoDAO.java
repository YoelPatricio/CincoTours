package dao;

import static dao.BusDAO.sessionFactory;
import entity.Empleado;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmpleadoDAO {

    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

    public static List<Object> buscarEmpleado(String cadena) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        Query query = session.createQuery("select e.idEmp,e.dniEmp,e.nombEmp,e.celuEmp,e.direEmp,r.nombRol,r.idRol from Empleado e inner join e.rol r where (e.dniEmp like ? or cast(e.idEmp as string) like ? or e.nombEmp like ?) and e.isDeleted=?");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, 0);
        List results = query.list();
        return results;

    }
    
    public static List<Object> buscarPiloto(String cadena) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        Query query = session.createQuery("select e.idEmp,e.dniEmp,e.nombEmp,e.celuEmp,e.direEmp,r.nombRol,r.idRol,e.estaEmp from Empleado e inner join e.rol r where (e.dniEmp like ? or cast(e.idEmp as string) like ? or e.nombEmp like ?) and e.isDeleted=? and r.nombRol=?");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, 0);
        query.setParameter(4, "Piloto");
        List results = query.list();
        return results;

    }
    
    public static List<Object> buscarCoPiloto(String cadena) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        Query query = session.createQuery("select e.idEmp,e.dniEmp,e.nombEmp,e.celuEmp,e.direEmp,r.nombRol,r.idRol,e.estaEmp from Empleado e inner join e.rol r where (e.dniEmp like ? or cast(e.idEmp as string) like ? or e.nombEmp like ?) and e.isDeleted=? and r.nombRol=?");

        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, 0);
        query.setParameter(4, "CoPiloto");
        List results = query.list();
        return results;

    }
    
    public static List<Object> buscarEmpleadoxDNI(String cadena) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        Query query = session.createQuery("select idEmp,dniEmp,nombEmp from Empleado where dniEmp=? and isDeleted=?");

        query.setParameter(0, cadena);
        query.setParameter(1, 0);

        List results = query.list();
        return results;

    }
    
    public static void cambiarEstado(int estado,String dni) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update empleado set esta_emp=? where dni_emp=?");
        query.setParameter(0, estado); 
        query.setParameter(1, dni); 
 
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();

    }
    
    public static ArrayList<Empleado> buscarAll() {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        Query query = session.createQuery("from Empleado e inner join e.rol ");
        
        ArrayList results = (ArrayList) query.list();
        return results;

    }
    
    public static void main(String[] args) {
        
        /*List<Object> ls=buscarEmpleado("a");
        Object[] s = new Object[]{};
        for (int i = 0; i < ls.size(); i++) {
            
            s=(Object[]) ls.get(i);
            System.out.println(s[4]);
        }*/
        
        ArrayList<Empleado> as=buscarAll();
       String nomb = as.get(0).getNombEmp();
        int a=0;
        
        
    }
}
