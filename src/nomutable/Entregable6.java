/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomutable;

/**
 *
 * @author Uridrack7
 */
public class Entregable6 {
        public static void main(String[] args) {
        int u[]={10,-2,7,11};
            System.out.println("El tamano es: "+u.length);
            System.out.println("En el indice 3 esta "+u[2]);
            int[]r={1,6,11,19};
            int []i=new int[4];
            i[0]=-9;
            i[1]=7;
            i[2]=10;
            i[3]=11;
            //Vamos a iterar el arreglo i usando un ciclo for
            for (int j=0; j<i.length; j++){
                System.out.println(i[j]);
            }
            //Aqui veremos el ciclo for mejorado
            
            for(int numero:i){
                System.out.println("Mejorado "+numero);
            }
            
            String mensaje="Entregable6 Uridrack7";
            byte []e= mensaje.getBytes();
            System.out.println("tamaño "+e.length);
            String codificado="";
            for (byte l:e){
                System.out.println("El byte es: "+l);
                codificado=codificado+l;
            }
            System.out.println("el mensaje codificado es: ");
            System.out.println(codificado);
    }
}
