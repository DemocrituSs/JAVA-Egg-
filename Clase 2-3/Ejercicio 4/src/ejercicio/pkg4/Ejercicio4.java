
package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
       /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        float tempC = leer.nextFloat();
        float tempF = 32+(9*tempC/5);
        System.out.println("La temperatura equivalente en Fahrenheit es de: "+tempF+"°F");
    }
    
}
