
package manos.a.la.obra;

import java.util.Scanner;

public class ManosALaObra {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una cadena que termine en un punto");
        String cadena = leer.nextLine();
        System.out.println(codificar(cadena));
        int a=3,b=5;
        EsMultiplo(a,b);
        EsMultiplo(20,5);
        EsMultiplo(20,3);
        EsMultiplo(20,6);
    }
    
     public static String codificar(String cadena){
            String modificada="";
            for(int i=0;i<cadena.length();i++){
                String letra=cadena.substring(i, i+1);
                switch(letra){
                    case "a":
                        modificada+="@";
                        break;
                    case "e":
                        modificada+="#";
                        break;
                    case "i":
                        modificada+="$";
                        break;
                    case "o":
                        modificada+="%";
                        break;
                    case "u":
                        modificada+="*";
                        break;
                    case ".":
                        modificada+=".";
                        return modificada;
                    default:
                        modificada+=letra;
                }
            }
            return modificada;
     }
    public static void EsMultiplo(int num1, int num2){
            if (num1%num2==0){
                System.out.println("El número "+num1+" es múltiplo de "+num2);
            }else{
                System.out.println("El número "+num1+" NO es múltiplo de "+num2);
            }
    }
}
