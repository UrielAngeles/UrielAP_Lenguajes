/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

/**
 *
 * @author Uridrack7
 */
public class ProbarThreads {
    public static void main(String[] args) {
        //THREADS CREADO
        Primero p=new Primero();
        Primero1 s=new Primero1();
        //THREAD EN ESTADO DE EJECUCION(RUNNABLE)
        p.start();
        s.start();
    }
}
