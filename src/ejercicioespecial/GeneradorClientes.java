/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioespecial;

import java.util.ArrayList;

/**
 *
 * @author Uridrack7
 */
public class GeneradorClientes {
    public ArrayList<Cliente> generarClientes(){
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        //generamos 3 clientes con sus direcciones
        Direccion d1 = new Direccion("independencia","Las Americas",55076,"Ecatepec");
        Direccion d2 = new Direccion("Miguel Hidalgo","Tecamac",55080,"Jardines de Morelos");
        Direccion d3 = new Direccion("Simon Bolivar","Ecatepec",55070,"Ojo de Agua");
    
    //generamos datos de cliente
        ArrayList<Direccion> direcciones1 = new ArrayList<Direccion>();
        direcciones1.add(d1);
        direcciones1.add(d2);
        direcciones1.add(d3);
        
        //generamos datos de clientes
        Cliente c1 = new Cliente("Uriel",20,"urielangeles96@gmail.com",d1);
        Cliente c2 = new Cliente("David",21,"davicho@gmail.com",d2);
        Cliente c3 = new Cliente("Karen",19,"karen@gmail.com",d3);
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        
        
    return clientes;
}
}