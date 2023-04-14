
package ejercicio.pkg7;

import java.util.Scanner;

public class EJercicio7 {

    public static void main(String[] args) {
        /*Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas*/
        Scanner leer = new Scanner(System.in);
        String palabra;
        int correctas=0;
        int incorrectas=-1;
        do{ 
            System.out.println("Ingrese una cade de 5 caracteres");
            System.out.println("Dicha cadena tiene que comenzar con X y termine con O");
            palabra =leer.nextLine();
            if(palabra.length()==5 && palabra.substring(0,1).equals("X") && palabra.substring(4,5).equals("O")){
                //correctas=correctas+1;
                correctas++;
            }else{
                //incorrectas=incorrectas+1;
                incorrectas++;
            }
        }while(!palabra.equals("&&&&&"));
        System.out.println("La cantidad de lecturas correctas es: "+ correctas);
        System.out.println("La cantidad de lecturas incorrectas es: "+ incorrectas);
    }
}
