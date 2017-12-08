/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareas;

import java.util.Calendar;

public class RelojitoChafa implements Runnable {
    public static void main(String[] args) {
        //CREAMOS EL THREAD CON ESTA INTERFAZ
        Runnable r=new RelojitoChafa();
        Thread t1=new Thread (r);
        t1.start();
    }
    
    public void run(){
        while(true){
            try{
        Calendar c=Calendar.getInstance();
        //SACAMOS LA HORA DEL SISTEMA
        Thread.sleep(1000);
        int hora=c.get(Calendar.HOUR);
        int minuto=c.get(Calendar.MINUTE);
        int segundo=c.get(Calendar.SECOND);
        System.out.println("La hora es "+hora+":"+minuto+":"+segundo);
            }catch(InterruptedException e){}
        }
    }
}