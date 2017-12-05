/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Uridrack7
 */
public class Primero1 extends Thread{
    public void run(){
        while(true){
        //AQUI PONES LA ACCION DEL THREAD
        System.out.println("Soy el segundo Thread que no hago nada");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Primero1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
