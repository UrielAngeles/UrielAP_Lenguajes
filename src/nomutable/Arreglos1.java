/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutable;

/**
 *
 * @author Uriel Angeles
 */
public class Arreglos1 {
    public static void main(String[] args) {
        //Vamos a generar un arreglo simple
        int x[]={12,-4,7};
            System.out.println("El tamano es: "+x.length); //Esta instruccion indicara los elementos que tiene x=3
            //Para acceder a un elemento hacemos lo siguiente:
            System.out.println("En el indice 0 esta "+x[0]); // Indica la 1 posicion osea el 12
            int[]y={2,4,5};
            int []z=new int[3];
            z[0]=-12;
            z[1]=5;
            z[2]=4;
            //Vamos a iterar el arreglo z usando un ciclo for
            for (int i=0; i<z.length; i++){
                System.out.println(z[i]);
            }
            //Aqui veremos el ciclo for mejorado
            
            for(int valor:z){
                System.out.println("Mejorado "+valor);
            }
            
            String mensaje="Alooo como te va";
            byte []w= mensaje.getBytes();
            System.out.println("tamano "+w.length);
            String codificado="";
            for (byte b:w){
                System.out.println("El byte es: "+b);
                codificado=codificado+b;
            }
            System.out.println("el mensaje codificado es: "); //Decodifica el mensaje de alooo como te va
            System.out.println(codificado);
    }
}
