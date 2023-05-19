/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad.Servicio;

import Entidad.Escuela;
import Entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author Adriel
 */
public class EstudianteServicio {
    Scanner leer = new Scanner(System.in);
    public Estudiante crearEstudiante(String nombre, double nota)
    {
        return new Estudiante(nombre,nota);
    }
    public Escuela crearEscuela()
    {
        return new Escuela();
    }
    public double PromedioNotas(Escuela Institucion)
    {
        int N=Institucion.getCantAlumnos();
        Estudiante Alumnos[]=Institucion.getAlumnos();
        double suma=0;
        for(Estudiante alumno : Alumnos)
        {
            suma+=alumno.getNota();
        }
        double promedio= suma/N;
        System.out.println("El promedio de notas de la escuela es: "+ promedio);
        return promedio;
    }
    public Estudiante[] encimaPromedio(Escuela instituto)
    {
        double promedio=PromedioNotas(instituto);
        int cant=0;
        for(Estudiante alumno : instituto.getAlumnos())
        {
            if(alumno.getNota()>promedio)
            {
                System.out.println("Estudiante: "+ alumno.getNombre()+"  nota: "+alumno.getNota());
                cant++;
            }
        }
        Estudiante mayoresProm[];
        if(cant>0)
        {
            mayoresProm = new Estudiante[cant];
            int i=0;
            for(Estudiante alumno : instituto.getAlumnos())
            {
                if(alumno.getNota()>promedio)
                {
                    mayoresProm[i]=alumno;
                    i++;
                }
            }
        }else
        {
            mayoresProm = new Estudiante[1];
        }
        return mayoresProm;
    }
    public void mostrarAlumnosprom(Escuela Instituto)
    {
        double promedio =PromedioNotas(Instituto);
        System.out.println("---------------------------------------");
        System.out.println("El promedio de la escuela es : "+promedio);
        System.out.println("Estudiantes con nota mayor al promedio: ");
        Estudiante Alumnos[] = encimaPromedio(Instituto);
        if(Alumnos.length==1 && Alumnos[0]==null)
        {
            System.out.println("Ninguno");
        }else{
            for(Estudiante alumno : Alumnos)
            {
                System.out.println(alumno.toString());
            }
        }
    }
}
