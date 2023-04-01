package ejercicios.if_else;

import java.util.Scanner;

public class EjerciciosIf_else {

    public static void main(String[] args) {
        //Ejercicio 1: Crear un programa que dado un número determine si es par o impar
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par");
        } else {
            System.out.println("El número " + numero + " es impar");
        }
    }
}
