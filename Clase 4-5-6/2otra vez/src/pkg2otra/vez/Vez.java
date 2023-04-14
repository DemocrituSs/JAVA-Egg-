
package pkg2otra.vez;

import java.util.Scanner;

public class Vez {

    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un límite");
        int limite=leer.nextInt();
        int suma=0;
        int num;
        do{
            System.out.println("Ingrese un número");
            num=leer.nextInt();
            suma=suma+num;
        }while (suma<=limite);
        System.out.println("La suma toal es "+suma);
    }
}
