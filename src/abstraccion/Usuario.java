/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author Uriel Angeles
 */
public class Usuario {
private float peso;
private float altura;

public Usuario(float peso, float altura){   //creacion de constructor por defecto
    this.peso=peso;
    this.altura=altura;
}
    public Usuario(){       //creacion del segundo constructor
        this.peso=93;
        this.altura=1.70f;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
