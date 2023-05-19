
package guia.pkg8.ejercicio.pkg1;

import Entidad.Cadena;
import Servicio.ServicioCadena;
public class Guia8Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Cadena nueva_cadena=new Cadena("Esto es una cadena");
        ServicioCadena servicio = new ServicioCadena();
        servicio.mostrarVocales(nueva_cadena);
        servicio.invertirFrase(nueva_cadena);
        servicio.vecesRepetido(nueva_cadena, "a");
        servicio.reemplazar(nueva_cadena, "X");
        System.out.println(servicio.contiene(nueva_cadena, "b"));
        servicio.unirFrases(nueva_cadena, " que habla de casas");
        //
        //
        System.out.println(servicio.contiene(nueva_cadena, "a"));
        System.out.println(servicio.contiene(nueva_cadena, "A"));
        System.out.println(servicio.contiene(nueva_cadena, "X"));
        System.out.println(servicio.contiene(nueva_cadena, "i"));
        System.out.println(servicio.contiene(nueva_cadena, "E"));
    }
    
}
