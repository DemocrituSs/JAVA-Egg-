
package ejercicio.pkg4.numeros.primos;

import java.util.Scanner;

public class Ejercicio4NumerosPrimos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int numero = leer.nextInt();
        boolean primo=es_primo(numero);
        if (primo){
            System.out.println("El número es primo.");
        }else{
            System.out.println("El número no es primo.");
        }
    }
    public static boolean es_primo(int num){
        if (num%2==0 || num==1){
            return false;
        }else{
            for(int i=3;i<num;i+=2){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
