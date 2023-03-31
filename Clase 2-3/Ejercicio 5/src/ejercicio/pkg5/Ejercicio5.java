
package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        /* Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número. */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num= leer.nextInt();
        System.out.println("El doble del número: "+num*2);
        System.out.println("El triple del número: "+num*3);
        System.out.println("La raíz cuadrada: "+Math.sqrt(num));
    }
    
}
