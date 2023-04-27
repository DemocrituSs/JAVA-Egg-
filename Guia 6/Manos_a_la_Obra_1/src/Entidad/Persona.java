
package Entidad;

import java.util.Date;

public class Persona {
    public String nombre;
    public int edad;
    public int nro_identificacion;
    public String nacionalidad;
    public Date fecha_nacimiento;
    //constructores
    public Persona() {
    }
    public Persona(String nombre, int edad, int nro_identificacion, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nro_identificacion = nro_identificacion;
        this.nacionalidad = nacionalidad;
    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, int nro_identificacion, String nacionalidad) {
        this.nombre = nombre;
        this.nro_identificacion = nro_identificacion;
        this.nacionalidad = nacionalidad;
    }
    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNro_identificacion() {
        return nro_identificacion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNro_identificacion(int nro_identificacion) {
        this.nro_identificacion = nro_identificacion;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
}
