package entity;
// Generated 05-jun-2017 19:51:55 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Ruta generated by hbm2java
 */
public class Ruta  implements java.io.Serializable {


     private Integer idRut;
     private String nombRut;
     private BigDecimal pnorRut;
     private BigDecimal pferRut;
     private int norsurRut;
     private int isDeleted;
     private Set boletos = new HashSet(0);
     private Set programacions = new HashSet(0);

    public Ruta() {
    }

	
    public Ruta(Integer idRut,String nombRut, BigDecimal pnorRut, BigDecimal pferRut, int norsurRut, int isDeleted) {
        this.nombRut = nombRut;
        this.pnorRut = pnorRut;
        this.pferRut = pferRut;
        this.norsurRut = norsurRut;
        this.isDeleted = isDeleted;
        this.idRut = idRut;
    }
    
    public Ruta(String nombRut, BigDecimal pnorRut, BigDecimal pferRut, int norsurRut, int isDeleted) {
        this.nombRut = nombRut;
        this.pnorRut = pnorRut;
        this.pferRut = pferRut;
        this.norsurRut = norsurRut;
        this.isDeleted = isDeleted;
    }
    public Ruta(String nombRut, BigDecimal pnorRut, BigDecimal pferRut, int norsurRut, int isDeleted, Set boletos, Set programacions) {
       this.nombRut = nombRut;
       this.pnorRut = pnorRut;
       this.pferRut = pferRut;
       this.norsurRut = norsurRut;
       this.isDeleted = isDeleted;
       this.boletos = boletos;
       this.programacions = programacions;
    }
   
    public Integer getIdRut() {
        return this.idRut;
    }
    
    public void setIdRut(Integer idRut) {
        this.idRut = idRut;
    }
    public String getNombRut() {
        return this.nombRut;
    }
    
    public void setNombRut(String nombRut) {
        this.nombRut = nombRut;
    }
    public BigDecimal getPnorRut() {
        return this.pnorRut;
    }
    
    public void setPnorRut(BigDecimal pnorRut) {
        this.pnorRut = pnorRut;
    }
    public BigDecimal getPferRut() {
        return this.pferRut;
    }
    
    public void setPferRut(BigDecimal pferRut) {
        this.pferRut = pferRut;
    }
    public int getNorsurRut() {
        return this.norsurRut;
    }
    
    public void setNorsurRut(int norsurRut) {
        this.norsurRut = norsurRut;
    }
    public int getIsDeleted() {
        return this.isDeleted;
    }
    
    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
    public Set getBoletos() {
        return this.boletos;
    }
    
    public void setBoletos(Set boletos) {
        this.boletos = boletos;
    }
    public Set getProgramacions() {
        return this.programacions;
    }
    
    public void setProgramacions(Set programacions) {
        this.programacions = programacions;
    }




}

