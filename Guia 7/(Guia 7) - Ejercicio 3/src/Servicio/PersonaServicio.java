
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona()
    {
        //Persona nueva_persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        //nueva_persona.setNombre(leer.nextLine());
        String nombre = leer.nextLine();
        System.out.println("Ingrese La edad de la persona:");
        int Edad =leer.nextInt();
        leer.nextLine();
        String sexo= verificarSexo();
        System.out.println("Ingrese el peso de la persona");
        int peso=leer.nextInt();
        System.out.println("Ingrese la altura de la persona");
        float altura = leer.nextFloat();
        leer.nextLine();
        return new Persona(nombre,Edad,sexo,peso,altura);
    }
    public String verificarSexo()
    {
        String sexo="I";
        do{
            System.out.println("Ingrese el sexo de la persona: ");
            sexo=leer.next();
        }while(!"H".equals(sexo) && !"O".equals(sexo) && !"M".equals(sexo));
        return sexo;
    }
    public boolean esMayorDeEdad(Persona P1)
    {
        /*
        if(P1.getEdad()>=18)
        {
            return true;
        }
        else
        {
            return false;
        }
*/
        return P1.getEdad()>=18;
    }
    public int calcularIMC(Persona P1)
    {
        double IMC=P1.getPeso()/Math.pow(P1.getAltura(), 2);
        if(IMC<20)
        {
            return -1;
        }
        else if(IMC>=20 && IMC<=25)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
