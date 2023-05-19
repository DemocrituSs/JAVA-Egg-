package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    public void llenarCafetera(Cafetera miCafetera)
    {
        miCafetera.setCapacidadActual(miCafetera.getCapacidadMaxima());
    }
    public void servirTaza(Cafetera miCafetera)
    {
        System.out.println("Ingrese el tamaño de la taza en ml:");
        int taza=leer.nextInt();
        if(taza<=miCafetera.getCapacidadActual())
        {
            miCafetera.setCapacidadActual(miCafetera.getCapacidadActual()-taza);
            System.out.println("Se ha llenado la taza de "+taza+"ml exitosamente");
            System.out.println("En la cafetera quedan: "+miCafetera.getCapacidadActual());
        }
        else
        {
            System.out.println("Se ha llenado la taza con "+miCafetera.getCapacidadActual()+"ml");
            miCafetera.setCapacidadActual(0);
        }
    }
    public void vaciarCafetera(Cafetera miCafetera)
    {
        miCafetera.setCapacidadActual(0);
    }
    public void agregarCafe(Cafetera miCafetera)
    {
        int diferencia = miCafetera.getCapacidadMaxima()-miCafetera.getCapacidadActual();
        System.out.println("Ingrese una cantidad de agua");
        int cantidad = leer.nextInt();  
        if(cantidad<=diferencia)
        {
          miCafetera.setCapacidadActual(miCafetera.getCapacidadActual()+cantidad);
            System.out.println("La cafetera ha quedado con: "+miCafetera.getCapacidadActual());
        }
        else
        {
            System.out.println("No se puede llenar con esa cantidad ingresada");
        }
    }   
}
