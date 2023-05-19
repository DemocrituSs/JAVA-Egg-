
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

public class NIFservicio {
    Scanner leer = new Scanner(System.in);
    char vector[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    public NIF crearNIF()
    {
        NIF nuevo_nif= new NIF();
        System.out.println("Ingrese el número de DNI");
        nuevo_nif.setNumero_DNI(leer.nextLong());
        int i = (int)(nuevo_nif.getNumero_DNI() % 23);
        nuevo_nif.setLetra(vector[i]);
        return nuevo_nif;
    }
    public void mostrar(NIF nif)
    {
        String DNI=Long.toString(nif.getNumero_DNI());
        String cadena="";
        if(DNI.length()<8)
        {
            for(int i=0;i<8-DNI.length();i++)
            {
                cadena+="0";
            }
            cadena+=DNI;
        }else
        {
            cadena=DNI.substring(DNI.length()-8);
        }
        System.out.println(cadena+"-"+nif.getLetra());
    }
}
