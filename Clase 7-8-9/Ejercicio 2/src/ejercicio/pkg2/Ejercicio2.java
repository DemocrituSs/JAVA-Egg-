package ejercicio.pkg2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”. */
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas que desea ingresar");
        int N = leer.nextInt();
        Ingresar(N);
    }

    public static void es_mayor(int edad) {
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }

    public static void Ingresar(int N) {
        Scanner leer = new Scanner(System.in);
        boolean ejecutar = true;
        int i = 0;
        do {
            System.out.println("Ingrese el nombre de la persona: ");
            String nombre = leer.nextLine();
            System.out.println("Ingrese la edad de la persona: ");
            int edad = leer.nextInt();
            System.out.println("Nombre: " + nombre + " Edad: " + edad);
            es_mayor(edad);
            ejecutar=confirmacion();
            leer.nextLine();
            i++;
        } while (ejecutar == true && i < N);
    }
    public static boolean confirmacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea agregar más personas?S/N");
        String opcion = leer.next();
        return opcion.equalsIgnoreCase("S");
    }
}
