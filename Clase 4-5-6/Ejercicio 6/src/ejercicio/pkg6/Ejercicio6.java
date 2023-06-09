package ejercicio.pkg6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        System.out.println("Por favor ingrese dos números enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        float num1_copia=num1;
        boolean salir = false;
        //boolean ejecutar = true;
        do {
            System.out.println("MENU");
            System.out.println("1.SUMA");
            System.out.println("2.RESTA");
            System.out.println("3.MULTIPLICAR");
            System.out.println("4.DIVIDIR");
            System.out.println("5.SALIR");
            System.out.println("Elija una opción del menú:");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de "+num1+"+"+num2+"="+(num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es: "+(num1-num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: "+(num1*num2));
                    break;
                case 4:
                    System.out.println("La División es: "+(num1_copia/num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro de que desea salir?(S/N)");
                    String SiNo =leer.next();
                    if(SiNo.equalsIgnoreCase("S")){
                        salir=true;
                    }
                    break;
                default:
                    System.out.println("Ingrese una opción correcta");
            }
        } while (salir == false);
    }
}
