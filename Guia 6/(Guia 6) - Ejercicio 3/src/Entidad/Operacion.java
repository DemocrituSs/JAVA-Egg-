
package Entidad;

import java.util.Scanner;

public class Operacion {
    private float num1;
    private float num2;

    public Operacion() {
    }

    public Operacion(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //Getter
    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }
    //Setter

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    //otro métodos
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        this.num1=leer.nextFloat();
        System.out.println("Ingrese el segundo número");
        this.num2=leer.nextFloat();
    }
    public float Suma(){
        return num1+num2;
    }
    public float Resta(){
        return num1-num2;
    }
    public float multiplicar(){
        if(num1==0 || num2==0){
            System.out.println("se multiplicó por cero");
            return 0;
        } else{
            return num1*num2;
        }
    }
    public float dividir(){
        if(num1==0 || num2==0){
            System.out.println("se divide por cero");
            return 0;
        } else{
            return num1/num2;
        }
    }
    
}
