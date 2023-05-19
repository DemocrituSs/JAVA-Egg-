
package Entidad;

/**
 *
 * @author Adriel
 */
public class Escuela {
    private int cantAlumnos;
    private Estudiante[] Alumnos;

    public Escuela() {
    }

    public Escuela(int cantAlumnos, Estudiante[] Alumnos) {
        this.cantAlumnos = cantAlumnos;
        this.Alumnos = Alumnos;
    }

    public int getCantAlumnos() {
        return cantAlumnos;
    }

    public Estudiante[] getAlumnos() {
        return Alumnos;
    }

    public void setCantAlumnos(int cantAlumnos) {
        this.cantAlumnos = cantAlumnos;
    }

    public void setAlumnos(Estudiante[] Alumnos) {
        this.Alumnos = Alumnos;
    }
    
}
