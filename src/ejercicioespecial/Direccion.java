/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioespecial;

/**
 *
 * @author Uridrack7
 */
public class Direccion {
    
    private String calle;
    private String colonia;
    private long cp;
    private String municipio;
    
    //constructor que inicializa los atributos
    public Direccion(String calle, String colonia, long cp, String municipio) { 
    this.calle = calle;
    this.colonia = colonia;
    this.cp = cp;
    this.municipio = municipio;
    }
    
    //getter and setters

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public long getCp() {
        return cp;
    }

    public void setCp(long cp) {
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    public Direccion() {    //constructor de defecto
    }
    
}
