/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Adriel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner(System.in); 
        int num1;
        System.out.println("Ingrese un número entero:");
        num1 = leer.nextInt();
        int num2;
        System.out.println("Ingrese un número entero:");
        num2 = leer.nextInt();
        int suma=num1+num2;
        System.out.println("La suma de los números ingresados es: " +suma);
    }
    
}
