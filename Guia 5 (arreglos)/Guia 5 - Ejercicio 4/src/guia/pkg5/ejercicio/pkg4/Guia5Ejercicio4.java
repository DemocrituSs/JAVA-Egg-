
package guia.pkg5.ejercicio.pkg4;

public class Guia5Ejercicio4 {

    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
A se denota por B y se obtiene cambiando sus filas por columnas (o
viceversa). */
        int[][] matriz = new int[4][4];
        for(int fila=0; fila<4;fila++){
            for(int columna=0;columna<4;columna++){
                int numero_aleatorio = (int) (Math.random() * (10));
                matriz[fila][columna]=numero_aleatorio;
            }
        }
        //Mostrar la matriz 
        for(int fila=0; fila<4;fila++){
            for(int columna=0;columna<4;columna++){
                System.out.print("["+matriz[fila][columna]+"]");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------");
        System.out.println("Esta es la matriz traspuesta");
        //Mostrar la matriz traspuesta
       /* for(int fila=0; fila<4;fila++){
            for(int columna=0;columna<4;columna++){
                System.out.print("["+matriz[columna][fila]+"]");
            }
            System.out.println("");
        } */
        mostrar_traspuesta(matriz);
    }
    public static void mostrar_traspuesta(int[][] M){
        /*Muestra la matriz traspuesta*/
        for(int fila=0; fila<4;fila++){
            for(int columna=0;columna<4;columna++){
                System.out.print("["+M[columna][fila]+"]");
            }
            System.out.println("");
        }
    }
}
