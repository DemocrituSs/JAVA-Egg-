
package Servicio;

import java.util.Date;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento()
    {
        System.out.println("ingrese el día:");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("ingrese el año:");
        int anio = leer.nextInt();
        Date fecha =new Date(anio-1900, mes-1, dia);
        return fecha;
    }
    public Date fechaActual()
    {
         Date fechaActual = new Date();
         return fechaActual;
    }
    public int diferencia(Date nacimiento, Date Actual)
    {
        int diferencia = Actual.getYear()-nacimiento.getYear();
        if(!(Actual.getMonth()>nacimiento.getMonth() ||(Actual.getMonth()==nacimiento.getMonth()  && Actual.getDay()>=nacimiento.getDay())))
        {
          diferencia--;  
        } 
        return diferencia;
    }
}
