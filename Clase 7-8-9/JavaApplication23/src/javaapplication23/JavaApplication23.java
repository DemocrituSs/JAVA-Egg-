
package javaapplication23;
import java.util.Scanner;
public class JavaApplication23 {

    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
    Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al programa");
        System.out.println("Por favor ingrese dos números enteros");
        float num1 = leer.nextFloat();
        float num2 = leer.nextFloat();
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
                    System.out.println("La suma de "+num1+"+"+num2+"="+suma(num1,num2));
                    break;
                case 2:
                    resta(num1,num2);
                    break;
                case 3:
                    multiplicar(num1,num2);
                    break;
                case 4:
                    dividir(num1,num2);
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
    public static float suma(float num1, float num2){
        //float suma=a+b;
        return num1+num2;
    }
    public static void resta(float a, float b){
        float resta=a-b;
        System.out.println("La resta "+a+"-"+b+"="+resta);
    }
    public static void multiplicar(float a,float b){
        System.out.println("La multiplicación es: "+(a*b));
    }
    public static void dividir(float a,float b){
        System.out.println("La división es: "+(a/b));
    }
}
