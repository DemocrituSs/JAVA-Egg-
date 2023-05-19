
package Entidad.Servicio;

import Entidad.Curso;
import java.util.Scanner;
public class CursoServicio {
    private Curso curso;
    Scanner leer = new Scanner(System.in);
    public String[] cargarAlumnos()
    {
        String[] alumnos = new String[5];
        leer.nextLine();
        for(int i=0;i<5;i++)
        {
            System.out.println("Ingrese el nombre del Alumno:");
            String nombre=leer.nextLine();
            alumnos[i]=nombre;
            //leer.nextLine();
        }
        return alumnos;
    }
    public Curso crearCurso()
    {
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso=leer.nextLine();
        System.out.println("Ingrese la cantidad de horas por día");
        int cantHorasDia=leer.nextInt();
        System.out.println("Ingrese la cantidad de días por semana");
        int cantDiasSemana=leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el turno");
        String turno=leer.next();
        System.out.println("Ingrece el precio por hora");
        int precioxHora =leer.nextInt();
        String[] alumnos=cargarAlumnos(); 
        //String nombreCurso, int cantHorasporDia, int cantDiasporSemana, int PrecioxHora, String turno, String[] alumnos
        curso= new Curso(nombreCurso,cantHorasDia,cantDiasSemana,precioxHora,turno,alumnos);
        return curso;
    }
    public void calcularGananciaSemanal()
    {
        int cant_alumnos=curso.getAlumnos().length;
        int ganancia=curso.getPrecioxHora()*curso.getCantHorasporDia()*curso.getCantDiasporSemana()*cant_alumnos;
        System.out.println("La ganancia semanal es: $"+ganancia);
    }
}
