/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg8.ejercicio.pkg3;

import Servicio.ArregloService;

/**
 *
 * @author Adriel
 */
public class Guia8Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArregloService servicio = new ArregloService();
        double A[] = new double[50];
        double B[] = new double[20];
        servicio.inicializarA(A);
        servicio.mostrar(A);
        servicio.ordenar(A);
        servicio.mostrar(A);
        servicio.inicializarB(A, B);
        servicio.mostrar(B);
    }
    
}
