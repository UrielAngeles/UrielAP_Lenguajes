/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author Uridrack7
 */
public class Validaciones {
    public static void validarNumeroNoNegativo(float numero) throws NumeroNegativoException{   //Throws ess lanzar la excepcion
        if(numero<0)throw new NumeroNegativoException();
    
    }
}
