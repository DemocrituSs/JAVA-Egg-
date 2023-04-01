
package ejercicios.if_else;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la contraseña");
        String contra =leer.nextLine();
        if (contra.equals("eureka")){
            System.out.println("¡Correcto!");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
}
