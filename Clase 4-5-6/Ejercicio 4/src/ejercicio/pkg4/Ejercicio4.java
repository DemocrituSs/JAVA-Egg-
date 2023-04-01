package ejercicio.pkg4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        /*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena que empiece con A");
        String cadena = leer.nextLine();
        //String letra=cadena.substring(0, 1);
        //char primLetra= cadena.charAt(0);
        //if (cadena.charAt(0)=='A'){
        if (cadena.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
