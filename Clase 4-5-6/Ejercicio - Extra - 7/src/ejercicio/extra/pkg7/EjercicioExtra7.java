package ejercicio.extra.pkg7;

import java.util.Scanner;

public class EjercicioExtra7 {

    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero positvo");
        int N = leer.nextInt();
        int i = 0;
        int max = 0, min = 0;
        float promedio = 0;
        while (i < N) {
            System.out.println("Ingrese un número entero");
            int num = leer.nextInt();
            if (i == 0) {
                max = num;
                min = num;
            } else {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }
            promedio = promedio + num;
            i++;
        }
        System.out.println("El máximo número ingresado es: " + max);
        System.out.println("El mínimo número ingresado es: " + min);
        System.out.println("El promedio: " + (promedio / N));
    }

}
