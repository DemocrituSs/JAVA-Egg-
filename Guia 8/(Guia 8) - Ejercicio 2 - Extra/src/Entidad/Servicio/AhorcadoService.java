
package Entidad.Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    Scanner leer = new Scanner(System.in);
    public Ahorcado crearJuego()
    {
        System.out.println("ingrese la palabra a buscar");
        String palabra=leer.next();
        int longitud=palabra.length();
        char[] vectorPalabra = new char[longitud];
        for(int i=0; i<palabra.length();i++)
        {
            vectorPalabra[i]=palabra.charAt(i);
        }
        System.out.println("Ingrese la cantidad máxima de jugadas");
        int maxjugadas = leer.nextInt();
        return new Ahorcado(vectorPalabra,longitud,maxjugadas);
    }
    public int longitud(Ahorcado A)
    {
        return A.getCantdeLetras();
    }
    public boolean buscarLetra(char letra, Ahorcado A)
    {
        for(char e : A.getPalabra())
        {
            if(e==letra)
            {
                return true;
            }
        }
        return false;
    }
    public boolean encontradas(char letra,Ahorcado A)
    {
        int contLetras=0;
        for(int i=0; i<A.getPalabra().length; i++)
        {
            char e=A.getPalabra()[i];
            if(e==letra)
            {
                System.out.println("La letra se encuentra en la posición: "+ (i+1));
                contLetras++;
            }
        }
        return buscarLetra(letra,A);
    }
    public void juego()
    {
        
    }
}
