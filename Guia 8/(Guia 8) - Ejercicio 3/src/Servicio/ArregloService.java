
package Servicio;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {
    public void inicializarA(double[] A)
    {
        Random rand = new Random();
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(100); // genera un número aleatorio entre 0 y 99
        }
    }
    public void mostrar(double[] A)
    {
        for(int i=0;i<A.length;i++)
        {
            System.out.print("["+A[i]+"]");
        }
        System.out.println("");
    }
    public void ordenar(double[] A)
    {
        Arrays.sort(A);
        mostrar(A);
        double[] Acopia=A;
        for(int i=A.length-1;i>=0;i--)
        {
            A[A.length-1-i]=Acopia[i];
        }
    }
    public void inicializarB(double[] A,double[] B)
    {
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 10, 20,0.5);
    }
}
