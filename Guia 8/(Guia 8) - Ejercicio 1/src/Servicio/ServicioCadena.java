
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {
    Scanner leer = new Scanner(System.in);
    public void mostrarVocales(Cadena nueva_cadena){
        int cant_vocales=0;
        char letra;
        String frase=nueva_cadena.getFrase();
        for(int i=0;i<nueva_cadena.getLongitud();i++)
        {
            letra=frase.toLowerCase().charAt(i);
            if(letra=='a' || letra=='e' || letra=='i' || letra=='o'|| letra=='u') 
            {
                cant_vocales++;
            }
        }
        System.out.println("La cantidad de Vocales es: "+cant_vocales);
    }
    public void invertirFrase(Cadena nueva_cadena)
    {
        String frase=nueva_cadena.getFrase();
        String frase_invertida="";
        //nueva_cadena.getLongitud()
        for(int i=frase.length()-1; i>=0;i--)
        {
            frase_invertida+=frase.substring(i, i+1);
            //System.out.print(frase.substring(i, i+1));
        }
        //System.out.println("");
        System.out.println(frase_invertida);
    }
    public void vecesRepetido(Cadena nueva_cadena,String letra)
    {
        int cant_letra=0;
        String frase = nueva_cadena.getFrase();
        for(int i=0;i<nueva_cadena.getLongitud();i++)
        {
            if(frase.substring(i, i+1).equalsIgnoreCase(letra))
            {
               cant_letra++; 
            }
        }
        System.out.println("La letra "+letra+ " aparece "+cant_letra+" veces.");
    }
    public void compararLongitud(Cadena nueva_cadena,String frase)
    {
        //int long_ingresada=frase.length();
        if(nueva_cadena.getLongitud()>frase.length())
        {
            System.out.println("La cadena ingresada es más corta.");
        }
        else if(nueva_cadena.getLongitud()==frase.length())
        {
            System.out.println("Las cadenas tienen la misma longitud.");
        }
        else
        {
            System.out.println("La cadena ingresada tiene mayor longitud.");
        }
    }
    public void  unirFrases(Cadena nueva_cadena,String frase)
    {
        nueva_cadena.setFrase(nueva_cadena.getFrase()+frase);
        System.out.println(nueva_cadena.getFrase());
    }
    public void reemplazar(Cadena nueva_cadena,String letra)
    {
        String nueva_frase="";
        String frase=nueva_cadena.getFrase();
        for (int i = 0; i < nueva_cadena.getLongitud(); i++) {
            String letra_actual=frase.substring(i, i+1);
            if(letra_actual.equalsIgnoreCase("a"))
            {
                nueva_frase+=letra;
            }
            else
            {
                nueva_frase+=letra_actual;
            }
        }
        System.out.println(nueva_frase);
    }
    public boolean contiene(Cadena cadena_nueva,String letra)
    {
        String frase=cadena_nueva.getFrase();
        for (int i = 0; i < cadena_nueva.getLongitud(); i++) {
            if(frase.substring(i, i+1).equalsIgnoreCase(letra))
            {
                return true;
            }
        }
        return false;
    }
}
