/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

/**
 *
 * @author Uridrack7
 */
public class Tablita {
    
    private Integer ID;
    private String nombre;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tablita(Integer ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public Tablita() {
    }

    
    
    
}
