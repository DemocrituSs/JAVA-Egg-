
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    Scanner leer = new Scanner(System.in);
    public CuentaBancaria crearCuenta()
    {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Ingrese el número de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el dni del cliente");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese el saldo actual");
        cuenta.setSaldoActual(leer.nextDouble());
        return cuenta;
    }

    public void ingresar(CuentaBancaria cuenta){
        System.out.println("¿Que cantidad de dinero desea ingresar?");
        double cantidad = leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Se ha ingresado $" + cantidad + " a la cuenta.");
        System.out.println("Su saldo actual es $" + cuenta.getSaldoActual());
    }
    public void retirar(CuentaBancaria cuenta){
        System.out.println("¿Que cantidad de dinero desea retirar?");
        double cantidad = leer.nextDouble();
        if(cuenta.getSaldoActual()>cantidad)
        {
          cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
          System.out.println("Se ha retirada $" + cantidad + " de la cuenta.");
          System.out.println("Su saldo actual es $" + cuenta.getSaldoActual());  
        }
        else
        {
          cantidad=cuenta.getSaldoActual();
          cuenta.setSaldoActual(0);
          System.out.println("Se ha retirada $" + cantidad + " de la cuenta.");
          System.out.println("Su saldo actual es $" + cuenta.getSaldoActual()); 
        }
    }
    public void extraccionRapida(CuentaBancaria cuenta)
    {
        double extraccion = cuenta.getSaldoActual()*0.2;
        cuenta.setSaldoActual(cuenta.getSaldoActual()-extraccion);
        System.out.println("Se ha retirado $"+extraccion+" de la cuenta");
        System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());
    }
    public void consultarSaldo(CuentaBancaria cuenta)
    {
        System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());
    }
    public void consultarDatos(CuentaBancaria cuenta)
    {
        System.out.println("Numero de Cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("D.N.I: "+cuenta.getDniCliente());
        System.out.println("Su saldo actual es de $"+cuenta.getSaldoActual());
    }
}
