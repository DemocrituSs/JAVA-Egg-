/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos.if_else;

import java.util.Scanner;

/**
 *
 * @author Adriel
 */
public class EjemplosIf_else {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números entero, uno detras del otro:");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        if (num1>25 && num2>25){
            System.out.println("Ambos números son mayores a 25");
        }
        else if(num1>25){
            System.out.println("El primer número: "+num1+ ", es mayor que 25");
    }
        else if (num2>25){
            System.out.println("El segundo número: "+num2+ ", es mayor que 25");
        }
        else{
            System.out.println("Ambos números son menores que 25");
        }
 
    }
    
}
