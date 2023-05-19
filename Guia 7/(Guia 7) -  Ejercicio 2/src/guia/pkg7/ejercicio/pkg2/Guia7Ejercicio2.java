
package guia.pkg7.ejercicio.pkg2;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;

public class Guia7Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Cafetera miCafetera = new Cafetera();
        miCafetera.setCapacidadMaxima(2000);
        miCafetera.setCapacidadActual(1000);
        CafeteraServicio servicio = new CafeteraServicio();
    }
    
}
