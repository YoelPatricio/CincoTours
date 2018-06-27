/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Horario;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
public class ProgramacionDAO {
    static Session session = null;
    
    public static final SessionFactory sessionFactory;
	static {
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
    
    public static List<Object> buscarProgramacion(String cadena,int estado) {

        Session session = sessionFactory.openSession();
        //Query query = session.createQuery("from Empleado where (dniEmp like ? or cast(idEmp as string) like ? or nombEmp like ?) and isDeleted=?");
        Query query = session.createSQLQuery("select p.id_pro,p.fech_pro,concat(h.sali_hor,\" - \",h.lleg_hor),r.nomb_rut,b.nume_bus,"
                                           + "b.plac_bus,pi.dni_emp as dni_pi,pi.nomb_emp as nomb_pi,cop.dni_emp as dni_co,"
                                           + "cop.nomb_emp as nomb_co,p.esta_pro,p.hllega_pro "
                                           + "from programacion p inner join bus b on p.id_bus=b.id_bus "
                                           + "inner join empleado cop on p.id_eco=cop.id_emp "
                                           + "inner join empleado pi on p.id_epi=pi.id_emp "
                                           + "inner join horario h on p.id_hor=h.id_hor "
                                           + "inner join ruta r on p.id_rut=r.id_rut "
                                           + "where (cast(p.id_pro as character) like ? or p.fech_pro like ? "
                                           + "or concat(h.sali_hor,\" - \",h.lleg_hor) like ? or r.nomb_rut like ? "
                                           + "or b.nume_bus like ? or b.plac_bus like ? or pi.dni_emp like ? "
                                           + "or pi.nomb_emp like ? or cop.dni_emp like ? or cop.nomb_emp like ? ) and p.is_deleted=0");
        
        Query query2 = session.createSQLQuery("select p.id_pro,p.fech_pro,concat(h.sali_hor,\" - \",h.lleg_hor),r.nomb_rut,b.nume_bus,"
                + "b.plac_bus,pi.dni_emp as dni_pi,pi.nomb_emp as nomb_pi,cop.dni_emp as dni_co,cop.nomb_emp as nomb_co,p.esta_pro,p.hllega_pro "
                + "from programacion p inner join bus b on p.id_bus=b.id_bus inner join empleado cop on p.id_eco=cop.id_emp "
                + "inner join empleado pi on p.id_epi=pi.id_emp inner join horario h on p.id_hor=h.id_hor "
                + "inner join ruta r on p.id_rut=r.id_rut "
                + "where (cast(p.id_pro as character) like ? or p.fech_pro like ? "
                + "or concat(h.sali_hor,\" - \",h.lleg_hor) like ? or r.nomb_rut like ? "
                + "or b.nume_bus like ? or b.plac_bus like ? or pi.dni_emp like ? "
                + "or pi.nomb_emp like ? or cop.dni_emp like ? or cop.nomb_emp like ? ) and p.esta_pro=? and p.is_deleted=0");


        query.setParameter(0, "%"+cadena+"%");
        query.setParameter(1, "%"+cadena+"%");
        query.setParameter(2, "%"+cadena+"%");
        query.setParameter(3, "%"+cadena+"%");
        query.setParameter(4, "%"+cadena+"%");
        query.setParameter(5, "%"+cadena+"%");
        query.setParameter(6, "%"+cadena+"%");
        query.setParameter(7, "%"+cadena+"%");
        query.setParameter(8, "%"+cadena+"%");
        query.setParameter(9, "%"+cadena+"%");
    
        
        query2.setParameter(0, "%"+cadena+"%");
        query2.setParameter(1, "%"+cadena+"%");
        query2.setParameter(2, "%"+cadena+"%");
        query2.setParameter(3, "%"+cadena+"%");
        query2.setParameter(4, "%"+cadena+"%");
        query2.setParameter(5, "%"+cadena+"%");
        query2.setParameter(6, "%"+cadena+"%");
        query2.setParameter(7, "%"+cadena+"%");
        query2.setParameter(8, "%"+cadena+"%");
        query2.setParameter(9, "%"+cadena+"%");
        query2.setParameter(10, estado);
        List results;
        if(estado!=-1){
            results = query2.list();
        }else{
            results = query.list();
        }
        
        return results;

    }   
    
    public void cambiarEstado(String estado,int idPro) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update programacion set esta_pro=?,hllega_pro=? where id_pro=?");
       
        int cEstado=0;
        if(estado.equals("PROGRAMADO")){
            cEstado=0;
        }else if(estado.equals("EN CURSO")){
            cEstado=1;
        }else if(estado.equals("FINALIZADO")){
            cEstado=2;
            
        }
        
        Calendar calendario = new GregorianCalendar();
        int hora, minutos;
        hora =calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        
        String time=String.valueOf(hora)+":"+String.valueOf(minutos);
        
        
        query.setParameter(0, cEstado); 
        if(estado.equals("FINALIZADO")){
            query.setParameter(1, time);
        }else{
            query.setParameter(1, "");
        }
         
        query.setParameter(2, idPro); 
        
       
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        
        cambiarEstadoEncomienda(cEstado, idPro);

    }
    
    public static void cambiarEstadoEncomienda(int estado,int idPro) {

        Session session = sessionFactory.openSession();
        Query query = session.createSQLQuery("update encomienda set esta_enc=? where id_pro=?");
        query.setParameter(0, estado); 
        query.setParameter(1, idPro); 
 
        query.executeUpdate();
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        

    }
    
    public static void main(String[] args) {
        //List<Object> a=buscarProgramacion("1");
        int as=5;
    }

    public void cambiarEstado(int i, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
