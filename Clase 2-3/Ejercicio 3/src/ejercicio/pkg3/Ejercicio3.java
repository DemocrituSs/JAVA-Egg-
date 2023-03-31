/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Adriel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leer.nextLine();
        String fraseMAY=frase.toUpperCase();
        System.out.println("Esta es su frase en mayúsculas: " +fraseMAY);
        System.out.println("Esta es su frase en minúsculas: " +frase.toLowerCase());
    }
    
}
