
package Entidad.Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona()
    {
        System.out.println("Ingrese el nombre de la persona");
        String nombre=leer.nextLine();
        //crear la fecha de nacimiento
        System.out.println("ingrese el día:");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes:");
        int mes = leer.nextInt();
        System.out.println("ingrese el año:");
        int anio = leer.nextInt();
        Date fechaNacimiento =new Date(anio-1900, mes-1, dia);
        return new Persona(nombre,fechaNacimiento);
    }
    public int calcularEdad(Persona persona)
    {
        Date nacimiento = persona.getFechaNacimiento();
        Date fechaActual = new Date();
        return diferencia(nacimiento,fechaActual);
    }
    public boolean menorQue(Persona persona1,int Edad)
    {
        int edadPersona1 =calcularEdad(persona1);
        if(edadPersona1<Edad)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public void mostrarPersona(Persona persona1)
    {
        System.out.println("Nombre: "+ persona1.getNombre());
        System.out.println("Fecha de Nacimiento: "+persona1.getFechaNacimiento().toString());
        System.out.println("Edad: "+calcularEdad(persona1));
    }
    
    private int diferencia(Date nacimiento, Date Actual)
    {
        int diferencia = Actual.getYear()-nacimiento.getYear();
        if(!(Actual.getMonth()>nacimiento.getMonth() ||(Actual.getMonth()==nacimiento.getMonth()  && Actual.getDay()>=nacimiento.getDay())))
        {
          diferencia--;  
        } 
        return diferencia;
    }
}
