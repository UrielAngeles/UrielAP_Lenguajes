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
public class ProbarClientes {
    public static void main(String[] args) {
        GeneradorClientes cliente = new GeneradorClientes();
        
        for(Cliente c:cliente.generarClientes()){
          System.out.println(" Nombre: "+c.getNombre()+" Edad: "+c.getEdad()+" Email: "+c.getEmail()+" Direccion: \n"+c.getDireccion().getCalle()+" "+c.getDireccion().getColonia()+" "+c.getDireccion().getCp()+" "+c.getDireccion().getMunicipio());
          System.out.println(" Nombre: "+c.getNombre()+" Edad: "+c.getEdad()+" Email: "+c.getEmail()+" Direccion: \n"+c.getDireccion().getCalle()+" "+c.getDireccion().getColonia()+" "+c.getDireccion().getCp()+" "+c.getDireccion().getMunicipio());
          System.out.println(" Nombre: "+c.getNombre()+" Edad: "+c.getEdad()+" Email: "+c.getEmail()+" Direccion: \n"+c.getDireccion().getCalle()+" "+c.getDireccion().getColonia()+" "+c.getDireccion().getCp()+" "+c.getDireccion().getMunicipio());    
        }
    }
}
