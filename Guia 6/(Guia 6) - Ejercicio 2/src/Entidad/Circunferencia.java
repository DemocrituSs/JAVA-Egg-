package Entidad;

import java.util.Scanner;

public class Circunferencia {
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio de la circunferencia");
        this.radio=leer.nextFloat();
    }
    public double area(){
        double area=Math.PI*Math.pow(radio,2);
        return area;
    }
    public double Perimetro(){
        double perimetro=2*Math.PI*radio;
        return perimetro;
    }
    public void mostrar(){
        System.out.println("Radio: "+radio);
        System.out.println("Área: "+this.area());
        System.out.println("Perímetro: "+this.Perimetro());
    }
}
