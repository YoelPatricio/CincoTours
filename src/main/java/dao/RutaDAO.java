package dao;

import static dao.GenericDAO.sessionFactory;
import java.util.List;
import org.hibernate.Session;
import entity.Ruta;
import java.math.BigDecimal;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RutaDAO {

    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}

    public List<Ruta> buscarRuta(String cadena) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Ruta where (nombRut like ? or cast(idRut as string) like ?) and isDeleted=?");
        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, 0);
        List results = query.list();
        return results;

    }
    
    public static List<Ruta> listRuta() {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Ruta where isDeleted=?");
        query.setParameter(0, 0);
        List results = query.list();
        return results;
    }
    
    public static List<Ruta> listRuta(int id) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Ruta where idRut=? and isDeleted=?");
        query.setParameter(0, id);
        query.setParameter(1, 0);
        List results = query.list();
        return results;
    }
    
    public static Integer getIdRutaSeleccionado(String nombre) {

        Session session = sessionFactory.openSession();
        Query query = session.createQuery(" select idRut from Ruta where nombRut=? and isDeleted=?");
        query.setParameter(0, nombre);
        query.setParameter(1, 0);
        List results = query.list();
        Integer id=0;
        
        if(results.size()>0){
         id= (Integer) results.get(0);
        }
        return id;
    }
    
    public static List<Object> getAfluenciaRutas(int orientacion) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        String sql ="select b.id_rut,r.nomb_rut,count(*) as viajes " +
                    " from boleto b inner join ruta r " +
                    " on b.id_rut=r.id_rut " +
                    " where b.esta_bol=0 ";
        
                    if(orientacion!=-1){
                        sql=sql+" and r.norsur_rut=? ";
                    }
        
                    sql = sql + " group by b.id_rut " +
                                " order by viajes desc ";

        Query query = session.createSQLQuery(sql);
   
        if(orientacion!=-1){
            query.setParameter(0, orientacion);
                    
        }         

        List results = query.list();

        return results;

    }   
}
