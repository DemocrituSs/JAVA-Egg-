package guia.pkg5.ejercicio.pkg3;

import java.util.Scanner;

public class Guia5Ejercicio3 {

    public static void main(String[] args) {
        /* Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int[] vector = new int[N];
        //llenamos el vector de nùmero aleatorios
        for(int i=0;i<N;i++){
            //int variable_aleatoria = (int) (Math.random() * (1000));
            //vector[i]=variable_aleatoria;
            System.out.println("Ingrese un nùmero de 1 a 5 cifras");
            int elemento=leer.nextInt();
            vector[i]=elemento;
        }
        //el còdigo
        int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0;
        int[] contadores = new int[5];
        for(int i=0;i<5;i++){
            contadores[i]=0;
        }
        for(int i=0;i<N;i++){
            int cantidad_digitos=cant_digitos(vector[i]);
            switch(cantidad_digitos){
                case 1:
                    contadores[0]++;
                    cont1++;
                    break;
                case 2:
                    contadores[1]++;
                    cont2++;
                    break;
                case 3:
                    contadores[2]++;
                    cont3++;
                    break;
                case 4:
                    contadores[3]++;
                    cont4++;
                    break;
                case 5:
                    contadores[4]++;
                    cont5++;
                    break;
            }
        }
        System.out.println("En total hay "+cont1+" nùmeros de 1 dìgito");
        System.out.println("En total hay "+cont2+" nùmeros de 2 dìgitos");
        System.out.println("En total hay "+cont3+" nùmeros de 3 dìgitos");
        System.out.println("En total hay "+cont4+" nùmeros de 4 dìgitos");
        System.out.println("En total hay "+cont5+" nùmeros de 5 dìgitos");
        System.out.println("--------------------------------------------");
        for(int i=0;i<5;i++){
            System.out.println("En total hay "+contadores[i]+" nùmeros con "+(i+1)+" cifras");
        }
        System.out.println("--------------------------------------------");
        for(int i=0;i<N;i++){
            System.out.print("-"+vector[i]);
        }
        System.out.println("");
    }
    public static int cant_digitos(int num){
        /*Esta funciòn devuelve la cantidad de dìgitos de un nùmero*/
        int cantidad=0;
        int div=1;
        if (num==0){
            return 1;
        }
        while((num/div)>=1){
            cantidad++;
            div=div*10;
        }
        return cantidad;
    }
}

