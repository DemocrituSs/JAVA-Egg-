package guia.pkg7.ejercicio.pkg3;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class Guia7Ejercicio3 {

    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();
        //Persona persona_nueva = servicio.crearPersona();
        int N = 4;
        Persona[] personas = new Persona[N];
        int[] IMC = new int[N];
        boolean[] edades = new boolean[N];
        for (int i = 0; i < N; i++) {
            personas[i] = servicio.crearPersona();
            IMC[i] = servicio.calcularIMC(personas[i]);
            edades[i] = servicio.esMayorDeEdad(personas[i]);
        }
        porcentajeIMC(IMC);
        porcentajeMayores(edades);
    }

    public static void porcentajeIMC(int IMC[]) {
        double bajo=0,ideal=0,alto=0,total=0;
        for (int elemento : IMC) {
            switch (elemento) {
                case -1:
                    bajo++;
                    break;
                case 0:
                    ideal++;
                    break;
                default:
                    alto++;
                    break;
            }
            total++;
        }
        System.out.println("El porcentaje de personas debajo del peso ideal es: "+((bajo/total)*100)+"%");
        System.out.println("El porcentaje de personas en su peso ideal es: "+((ideal/total)*100)+"%");
        System.out.println("El porcentaje de personas por encima de su peso ideal es:"+((alto/total)*100)+"%");
    }

    public static void porcentajeMayores(boolean edades[]) {
        double menores=0,mayores=0,total=0;
        for (boolean elemento : edades) {
            if(elemento)
            {
                mayores++;
            }
            else
            {
                menores++;
            }
            total++;
        }
            System.out.println("El porcentaje de personas mayores de edad es: "+((mayores/total)*100)+"%");
            System.out.println("El porcentaje de personas menores de edad es: "+((menores/total)*100)+"%");
    }
}
