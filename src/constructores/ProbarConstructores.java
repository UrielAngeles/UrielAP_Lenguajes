/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author Uriel Angeles
 */
public class ProbarConstructores {
        public static void main(String[] args){
                
                //Creampos un objeto de la clase Animal
                Animal algo= new Animal();
                int x=10;
                algo.setEdad(7);
                algo.getEdad();
                
                System.out.println(x);
                System.out.println(algo.getEdad());        //Regresara el valor indicada
                System.out.println(algo.getNombre());
                System.out.println(algo.isMuerde());
                
                Animal otro=new Animal(8);
                System.out.println(otro.getEdad());
                
                //Vamos a probar un constructor de una clase que no hemos disenado nosotros
                JFrame ventana=new JFrame("Hi World");
                    ventana.setSize(300,300);
                    ventana.setVisible(true);
        }
}
