
package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
    */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un límite");
        int limite=leer.nextInt();
        int numero;
        int suma=0;
        do{
            System.out.println("Ingrese un número entero");
            numero=leer.nextInt();
            suma=suma+numero;
        }while(suma<=limite);
    }
    
}
