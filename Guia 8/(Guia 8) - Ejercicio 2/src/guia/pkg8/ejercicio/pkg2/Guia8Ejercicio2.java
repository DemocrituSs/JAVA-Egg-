
package guia.pkg8.ejercicio.pkg2;

import Servicio.PardeNumerosService;
import Entidad.PardeNumeros;
public class Guia8Ejercicio2 {
    public static void main(String[] args) {
        PardeNumerosService servicio = new PardeNumerosService();
        PardeNumeros par_1 = new PardeNumeros();
        PardeNumeros par_2 = new PardeNumeros(-4.56,7.8);
        System.out.println("Par aleatorio: ");
        servicio.mostrarValores(par_1);
        System.out.println("Mayor= "+servicio.devolverMayor(par_1));
        System.out.println("Menor= "+servicio.devolverMenor(par_1));
        System.out.println("Potencia= "+servicio.calcularPotencia(par_1));
        System.out.println("Raiz= "+servicio.calculaRaiz(par_1));
        System.out.println("---------------------------------------------------");
        System.out.println("Par Ingresado: ");
        servicio.mostrarValores(par_2);
        System.out.println("Mayor= "+servicio.devolverMayor(par_2));
        System.out.println("Menor= "+servicio.devolverMenor(par_2));
        System.out.println("Potencia= "+servicio.calcularPotencia(par_2));
        System.out.println("Raiz= "+servicio.calculaRaiz(par_2));
    }
    
}
