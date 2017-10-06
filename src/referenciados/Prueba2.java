/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package referenciados;

import abstraccion.Usuario;

/**
 *
 * @author Uriel Angeles
 */
public class Prueba2 {
    
    public static void main(String[] args){
    
        /*Todos los refrenciados pertenecen a una clase
        Se necesita uno o mas primitivos para definirlos
        */
        String nombre="Uriel Angeles";
        String otro=new String("Terry");
        Usuario u=new Usuario();
        u.setAltura(1.68f);
        u.setPeso(90);
    }    
}
