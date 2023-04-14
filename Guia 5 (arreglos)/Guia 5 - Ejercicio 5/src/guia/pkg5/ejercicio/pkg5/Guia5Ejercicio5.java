
package guia.pkg5.ejercicio.pkg5;

import java.util.Scanner;

public class Guia5Ejercicio5 {

    public static void main(String[] args) {
        /*Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa). */
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.println("Ingrese el elemento "+ fila+ " , " +columna+" de la matriz: ");
                //int numero_aleatorio = (int) (Math.random() * (10));
                matriz[fila][columna]=leer.nextInt();
            }
        }
        //Mostrar la matriz 
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.print("["+matriz[fila][columna]+"]");
            }
            System.out.println("");
        }
        
       if(es_antisimetrica(matriz)){
           System.out.println("La matriz es anisimétrica");
       }else{
           System.out.println("la matriz no es antisimétrica");
        }
    }
    public static boolean es_antisimetrica(int[][] M){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (M[i][j]!=-M[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
