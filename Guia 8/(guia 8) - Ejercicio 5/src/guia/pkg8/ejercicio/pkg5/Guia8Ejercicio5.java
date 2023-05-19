
package guia.pkg8.ejercicio.pkg5;

import Entidad.Persona;
import Entidad.Servicio.PersonaServicio;

public class Guia8Ejercicio5 {

    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio servicio = new PersonaServicio();
        Persona persona1 = servicio.crearPersona();
        servicio.mostrarPersona(persona1);
        System.out.println("Es menor de edad: "+servicio.menorQue(persona1, 18));
    }
    
}
