
package Servicio;

import Entidad.PardeNumeros;

public class PardeNumerosService {
    public void mostrarValores(PardeNumeros par)
    {
        System.out.println("num1="+par.getNumero_1());
        System.out.println("num2="+par.getNumero_2());
    }
    public double devolverMayor(PardeNumeros par)
    {
        if(par.getNumero_1()>=par.getNumero_2())
        {
            //System.out.println("El mayor número es: "+par.getNumero_1());
            return par.getNumero_1();
        }
        else
        {
            //System.out.println("El mayor número es: "+par.getNumero_2());
            return par.getNumero_2();
        }
    }
    public double devolverMenor(PardeNumeros par)
    {
        if(par.getNumero_1()>=par.getNumero_2())
        {
            //System.out.println("El mayor número es: "+par.getNumero_1());
            return par.getNumero_2();
        }
        else
        {
            //System.out.println("El mayor número es: "+par.getNumero_2());
            return par.getNumero_1();
        }
    }
    public double calcularPotencia(PardeNumeros par)
    {

        long base =Math.round(devolverMayor(par));
        long exponente=Math.round(devolverMenor(par));
        double potencia=Math.pow(base,exponente);
        return potencia;
    }
    public double calculaRaiz(PardeNumeros par)
    {
        double menor =devolverMenor(par);
        menor=Math.abs(menor);
        return Math.sqrt(menor);
    }
}
