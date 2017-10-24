/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;

/**
 *
 * @author Uridrack7
 */
public class Pregunta {
    private ArrayList<Opcion> opciones;
    private String titulo;

    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.opciones = opciones;
        this.titulo = titulo;
    }
    
    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
