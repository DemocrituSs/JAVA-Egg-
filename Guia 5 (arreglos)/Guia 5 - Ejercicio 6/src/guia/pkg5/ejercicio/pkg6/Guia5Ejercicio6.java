
package guia.pkg5.ejercicio.pkg6;

import java.util.Scanner;

public class Guia5Ejercicio6 {

    public static void main(String[] args) {
        /* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
idénticas. Crear un programa que permita introducir un cuadrado por
teclado y determine si este cuadrado es mágico o no. El programa
deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. */
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.println("Ingrese números entre el 0 y 9");
                System.out.println("Ingrese el elemento "+ fila+ " , " +columna+" de la matriz: ");
                int entrada=leer.nextInt();
                while(entrada<0 || entrada>9){
                    System.out.println("Ingreso incorrecto, vuelva a ingresar un número entre 0 y 9");
                    entrada=leer.nextInt();
                }
                matriz[fila][columna]=entrada;

            }
        }
        //Mostrar la matriz 
        for(int fila=0; fila<3;fila++){
            for(int columna=0;columna<3;columna++){
                System.out.print("["+matriz[fila][columna]+"]");
            }
            System.out.println("");
        }
        if (es_magica(matriz)) {
            System.out.println("La matriz es mágica.");
        }else{
            System.out.println("La matriz no es mágica.");
        }
    }   
    public static int suma_fila(int[][] M,int fila){
        int suma=0;
        for (int i = 0; i <3; i++) {
            //suma=suma+M[fila][i];
            suma+=M[fila][i];
        }
        return suma;
    }
    public static int suma_col(int[][] M,int columna){
        int suma=0;
        for (int i = 0; i < 3; i++) {
            suma+=M[i][columna];
        }
        return suma;
    }
    public static int suma_diag(int[][] M){
        int suma=0;
        for (int i = 0; i < 3; i++) {
            suma+=M[i][i];
        }
        return suma;
    }
    public static int suma_contradiag(int[][] M){
        int suma=0;
        for (int i = 0; i < 3; i++) {
            suma+=M[2-i][i];
        }
        return suma;
    }
    public static boolean es_magica(int[][] M){
            if(suma_fila(M,0)!=suma_fila(M,1) || suma_fila(M,0)!=suma_fila(M,2)){
                return false;
            }
            if(suma_col(M,0)!=suma_col(M,1) || suma_col(M,0)!=suma_col(M,2)){
                return false;
            }
            if(suma_fila(M,0)!=suma_col(M,0)){
                return false;
            }
            if(suma_diag(M)!=suma_fila(M,0)|| suma_contradiag(M)!=suma_fila(M,0)){
                return false;
            }
            return true;
    }
}
