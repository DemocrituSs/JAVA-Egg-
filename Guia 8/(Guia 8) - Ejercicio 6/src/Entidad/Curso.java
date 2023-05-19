
package Entidad;

public class Curso {
    private String nombreCurso;
    private int cantHorasporDia;
    private int cantDiasporSemana;
    private int PrecioxHora;
    private String turno;
    private String[] alumnos;

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasporDia, int cantDiasporSemana, int PrecioxHora, String turno, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantHorasporDia = cantHorasporDia;
        this.cantDiasporSemana = cantDiasporSemana;
        this.PrecioxHora = PrecioxHora;
        this.turno = turno;
        this.alumnos = alumnos;
    }
    
    //Setters
    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantHorasporDia(int cantHorasporDia) {
        this.cantHorasporDia = cantHorasporDia;
    }

    public void setCantDiasporSemana(int cantDiasporSemana) {
        this.cantDiasporSemana = cantDiasporSemana;
    }

    public void setPrecioxHora(int PrecioxHora) {
        this.PrecioxHora = PrecioxHora;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    //Getters
    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantHorasporDia() {
        return cantHorasporDia;
    }

    public int getCantDiasporSemana() {
        return cantDiasporSemana;
    }

    public int getPrecioxHora() {
        return PrecioxHora;
    }

    public String getTurno() {
        return turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }
}
