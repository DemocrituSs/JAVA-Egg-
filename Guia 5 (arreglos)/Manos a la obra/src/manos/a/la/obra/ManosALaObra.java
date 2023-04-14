package manos.a.la.obra;

import java.util.Scanner;

public class ManosALaObra {

    public static void main(String[] args) {
        /*Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.*/
        String[] Equipo = new String[8];
        Scanner leer = new Scanner(System.in);
        
        for(int i=0;i<8;i++){
            System.out.println("Ingrese un nombre");
            String nombre= leer.nextLine();
            Equipo[i]= nombre;
        }
        System.out.println("Nombres");
        for(int i=0;i<8;i++){
            System.out.println("-"+Equipo[i]+"-" );
        }
       /* int vector[] = new int[5];

        for (int i = 0; i < 5; i++) {
            vector[i] = i + 3;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(""); */
        //
        //
        /*String[][] matriz = new String[3][3];
        // Puedo asignar valores de esta manera
        matriz[0][0] = "A";
        // Asigno valores mediante el For
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "A";
            }
        }
// Muestro la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        } */

    }
}
