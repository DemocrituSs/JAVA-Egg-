
package guia.pkg7.ejercicio.pkg2.guia.extra;

import Entidad.NIF;
import Servicio.NIFservicio;

public class Guia7Ejercicio2GuiaExtra {

    public static void main(String[] args) {
        // TODO code application logic here
        NIFservicio servicio = new NIFservicio();
        NIF nuevo_nif = servicio.crearNIF();
        servicio.mostrar(nuevo_nif);
    }
}
