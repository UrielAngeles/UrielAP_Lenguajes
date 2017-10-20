/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Uridrack7
 */
public class GeneradorUsuario {
    public static void main(String[] args) {
        //Vamos a generar a 5 usuarios
        Usuario u1=new Usuario();
        u1.setEdad(20);
        u1.setEmail("uriel@gmail.com");
        u1.setNombre("Uridrack7");
        
        Usuario u2=new Usuario();
        u2.setEdad(20);
        u2.setEmail("bicho@gmail.com");
        u2.setNombre("Davicho7");
        
        Usuario u3=new Usuario();
        u3.setEdad(21);
        u3.setEmail("karla@gmail.com");
        u3.setNombre("Lilian");
        
        Usuario u4=new Usuario();
        u4.setEdad(21);
        u4.setEmail("karen@gmail.com");
        u4.setNombre("Karen");
        
        Usuario u5=new Usuario();
        u5.setEdad(21);
        u5.setEmail("isaac@gmail.com");
        u5.setNombre("Isaac");
        
        //Generaremos un arreglo mutable
        
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        usuarios.add(u4);
        usuarios.add(u5);
        
        //Vamos a iterarlo para ver los nombres
            for(Usuario u: usuarios){
                System.out.println("Nombre"+u.getNombre()+" email "+u.getEmail()+" Edad "+u.getEdad());
            }
    }
}
