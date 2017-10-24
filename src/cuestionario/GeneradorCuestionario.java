/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

/**
 *
 * @author Uridrack7
 */
import java.util.*;

public class GeneradorCuestionario {   
    public ArrayList<Pregunta> generar(){
              //Primero generaremos el arreglo que contendra las preguntas 
              ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
                      //Primero generaremos cada opcion de la primera pregunta
                      Opcion op11 = new Opcion("Moscu", false);
                      Opcion op21 = new Opcion("Kiev", false);
                      Opcion op31 = new Opcion("Helsinki", true);
                      Opcion op41 = new Opcion("Turin", false);
                      
                      //Generamos la pregunta
                      ArrayList<Opcion> opciones1 = new ArrayList<Opcion>();
                      opciones1.add(op11);
                      opciones1.add(op21);
                      opciones1.add(op31);
                      opciones1.add(op41);
                      
                      Pregunta p1 = new Pregunta("Capital de Finlandia", opciones1 );
                      preguntas.add(p1);
                      
                      //Generamos Opciones para la 2 pregunta
                      Opcion op12 = new Opcion("Roma", false);
                      Opcion op22 = new Opcion("Transilvania", false);
                      Opcion op32 = new Opcion("Kiev", true);
                      Opcion op42 = new Opcion("Azerbaijan", false);

                      //Generamos la pregunta
                      ArrayList<Opcion> opciones2 = new ArrayList<Opcion>();
                      opciones2.add(op12);
                      opciones2.add(op22);
                      opciones2.add(op32);
                      opciones2.add(op42);
                      
                      Pregunta p2 = new Pregunta("Capital de Ucrania", opciones2 );
                      preguntas.add(p2);
                      
                      return preguntas;
    }
}
