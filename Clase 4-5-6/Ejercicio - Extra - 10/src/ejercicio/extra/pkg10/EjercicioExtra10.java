
package ejercicio.extra.pkg10;

import java.util.Scanner;

public class EjercicioExtra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a = (int)(Math.random()*11);
        int b =(int)(Math.random()*11);
        int producto=a*b;
        //System.out.println("a= "+a +" b="+b+" producto= "+producto);
        System.out.println("Se multiplicaran dos números enteros entre 0 y 10");
        System.out.println("Adivine el resultado del producto:");
        int adivinar=leer.nextInt();
        while(producto!=adivinar){
            System.out.println("resultado incorrecto, pruebe una vez más: ");
            adivinar=leer.nextInt();
        }
        System.out.println("¡Correcto!");
    }
}
