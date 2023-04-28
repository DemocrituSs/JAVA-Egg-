
package guia.pkg7.ejercicio.pkg1;

import Entidad.CuentaBancaria;
import Servicio.CuentaBancariaServicio;
public class Guia7Ejercicio1 {

    public static void main(String[] args) {
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        CuentaBancaria cuentaCorriente = servicio.crearCuenta();
        servicio.ingresar(cuentaCorriente);
        servicio.extraccionRapida(cuentaCorriente);
        servicio.consultarSaldo(cuentaCorriente);
        servicio.consultarDatos(cuentaCorriente);
        servicio.retirar(cuentaCorriente);
        servicio.consultarDatos(cuentaCorriente);
    }
    
}
