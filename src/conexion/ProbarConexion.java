/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author Uridrack7
 */
public class ProbarConexion {
       public static void main(String[] args) {
        Connection con=null ;
        try{
        con= Conexion.conectarse("root","root");    //en el mysql usuario root y pswd root
            System.out.println("Te Conectaste");
            //AQUI VIENE QUERIES DE MYSQL
            System.out.println("Te conectaste muy bien");
            //CON LA CONEXION QUE SE LLAMA CON VAMOS A GENERAR UNA SENTENCIA, LA CUAL ES UNA CLASE
            //Statement st=con.createStatement(); //Invoca una sentencia sql
            
            //GENERAMOS LA TABLITA
            
            //st.execute("create table tablita(id integer primary key,nombre varchar(40))");
            
            //Caso1:INSERT
            PreparedStatement st=con.prepareStatement("insert into tablita values(?,?)");
                st.setInt(1, 1);
                st.setString(2, "Uriel");
                st.execute();
                st.close();
                System.out.println("Registro Insertado");
            //SE CIERRAN LAS SENTENCIAS AL IGUAL QUE LAS CONEXIONES
            st.close();
            //System.out.println("Tabla generada con exito");      
            
            
            
        }catch(ClassNotFoundException e){
            System.out.println("No se cargo bien el driver");
        }catch(SQLException e){
            System.out.println("Un error de sql"+e.getMessage());
        }finally{       
    try{
        if(con!=null)con.close();
        System.out.println("Ya se cerro todo");
    }catch(SQLException ex){
    
    }

    }
}
}