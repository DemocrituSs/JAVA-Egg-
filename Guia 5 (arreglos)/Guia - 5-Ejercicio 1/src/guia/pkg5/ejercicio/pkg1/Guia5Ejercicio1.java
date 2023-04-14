
package guia.pkg5.ejercicio.pkg1;

public class Guia5Ejercicio1 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente. */
        int[] vector = new int[100];
        for(int i=0;i<100;i++){
            vector[i]=i+1;
        }
        for(int i=99;i>=0;i--){
            System.out.print("-"+vector[i]+"-");
        }
    }
    
}
