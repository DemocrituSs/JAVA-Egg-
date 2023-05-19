
package guia.pkg8.ejercicio.pkg4;

import Servicio.FechaService;

public class Guia8Ejercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here
        FechaService servicio = new FechaService();
        int dif = servicio.diferencia(servicio.fechaNacimiento(), servicio.fechaActual());
        System.out.println("Diferencia en años: "+ dif);
    }
    
}
