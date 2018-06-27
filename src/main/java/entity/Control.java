package entity;
// Generated 05-jun-2017 19:51:55 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Control generated by hbm2java
 */
public class Control  implements java.io.Serializable {


     private Integer idCon;
     private Programacion programacion;
     private Usuario usuario;
     private BigDecimal mingCont;
     private BigDecimal megrCont;
     private BigDecimal totaCon;
     private Set movimientos = new HashSet(0);
     private Set<Movimiento> movimientoDet;

    public Control() {
    }

    public Control(Integer idCon,Programacion programacion, Usuario usuario, BigDecimal mingCont, BigDecimal megrCont, BigDecimal totaCon) {
        this.idCon = idCon;
        this.programacion = programacion;
        this.usuario = usuario;
        this.mingCont = mingCont;
        this.megrCont = megrCont;
        this.totaCon = totaCon;
    }
    
    public Control(Programacion programacion, Usuario usuario, BigDecimal mingCont, BigDecimal megrCont, BigDecimal totaCon) {
        this.programacion = programacion;
        this.usuario = usuario;
        this.mingCont = mingCont;
        this.megrCont = megrCont;
        this.totaCon = totaCon;
    }
    public Control(Programacion programacion, Usuario usuario, BigDecimal mingCont, BigDecimal megrCont, BigDecimal totaCon, Set movimientos) {
       this.programacion = programacion;
       this.usuario = usuario;
       this.mingCont = mingCont;
       this.megrCont = megrCont;
       this.totaCon = totaCon;
       this.movimientos = movimientos;
    }

    public Set<Movimiento> getMovimientoDet() {
        return movimientoDet;
    }

    public void setMovimientoDet(Set<Movimiento> movimientoDet) {
        this.movimientoDet = movimientoDet;
    }
    
    
   
    public Integer getIdCon() {
        return this.idCon;
    }
    
    public void setIdCon(Integer idCon) {
        this.idCon = idCon;
    }
    public Programacion getProgramacion() {
        return this.programacion;
    }
    
    public void setProgramacion(Programacion programacion) {
        this.programacion = programacion;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getMingCont() {
        return this.mingCont;
    }
    
    public void setMingCont(BigDecimal mingCont) {
        this.mingCont = mingCont;
    }
    public BigDecimal getMegrCont() {
        return this.megrCont;
    }
    
    public void setMegrCont(BigDecimal megrCont) {
        this.megrCont = megrCont;
    }
    public BigDecimal getTotaCon() {
        return this.totaCon;
    }
    
    public void setTotaCon(BigDecimal totaCon) {
        this.totaCon = totaCon;
    }
    public Set getMovimientos() {
        return this.movimientos;
    }
    
    public void setMovimientos(Set movimientos) {
        this.movimientos = movimientos;
    }




}


