
package manos_a_la_obra_1;

import java.util.Scanner;
import Entidad.Persona;

public class Manos_a_la_Obra_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       // Persona Adriel = new Persona();
        Persona Angel = new Persona("Angel",12,38999123,"Argentina");
        Persona persona_X = new Persona("X",45);
        Persona Persona_1 = new Persona("uno",34);
        Persona Messi = new Persona("Messi",33000123,"Argentina");
        System.out.println(Messi.getNombre());
        System.out.println("DNI: "+Messi.getNro_identificacion());
        System.out.println(persona_X.getNombre());
        System.out.println("Ingrese un nombre");
        String nuevo_nombre = leer.next();
        persona_X.setNombre(nuevo_nombre);
        System.out.println("nuevo nobre: "+persona_X.getNombre());
    }
}
