
package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en euros");
        float plata = leer.nextFloat();
        //System.out.println("Ingrese la moneda a convertir");
        //String moneda=leer.next();
        convertir(plata,"dolares");
        convertir(plata,"yenes");
        convertir(plata,"libras");
    }
    public static void convertir(float plata, String moneda){
        switch(moneda){
            case("dolares"):
                System.out.println("El dinero en dólares es:"+ (1.28611*plata)+"$");
                break;
            case("yenes"):
                System.out.println("El dinero en Yenes es:"+ (129.852*plata)+"Y");
                break;
            case("libras"):
                System.out.println("El dinero en libras es:"+ (0.86*plata)+"L");
                break;
        }
    }
}
