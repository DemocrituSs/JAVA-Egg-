/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.extra.pkg7.alternativo;

import java.util.Scanner;

/**
 *
 * @author Adriel
 */
public class EjercicioExtra7Alternativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero positvo");
        int N = leer.nextInt();
        int max = 0, min = 0;
        float promedio = 0;
        for(int i=0;i<N;i++){
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
        }
        System.out.println("El máximo número ingresado es: " + max);
        System.out.println("El mínimo número ingresado es: " + min);
        System.out.println("El promedio: " + (promedio / N));
    }
    
}
