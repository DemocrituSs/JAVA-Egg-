
package guia.pkg5.ejercicio.pkg2;

import java.util.Scanner;

public class Guia5Ejercicio2 {

    public static void main(String[] args) {
        /*Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        
        for(int i=0;i<N;i++){
            int variable_aleatoria = (int) (Math.random() * 10);
            vector[i]=variable_aleatoria;
        }
        System.out.println("Ingrese un nùmero entre 0 y 9");
        int numero=leer.nextInt();
        int contador=0;
        for(int i=0;i<N;i++){
            if(vector[i]==numero){
                contador++;
                System.out.println("El nùmero ingresado se encuentra en la posiciòn: "+i);
                //if(contador==1){
                //    System.out.println("El nùmero ingresado se encuentra en la posiciòn: "+i);
                //}
            }
        }
        if(contador>1){
            System.out.println("El nùmero se encuentra un total de "+contador+" veces.");
        }else if(contador==0){
            System.out.println("El nùmero ingresado no se encuentra en el vector.");
        }
        
        for(int i=0;i<N;i++){
            System.out.print("-"+vector[i]);
        }
        System.out.println("");
        
    }
    
}
