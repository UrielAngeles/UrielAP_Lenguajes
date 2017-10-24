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
public class Opcion {
    private String titulo;
    private boolean corecta;

    Opcion(String moscu, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isCorecta() {
        return corecta;
    }

    public void setCorecta(boolean corecta) {
        this.corecta = corecta;
    }
}
