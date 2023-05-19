
package Entidad;

public class PardeNumeros {
    private double numero_1;
    private double numero_2;

    public PardeNumeros() {
        this.numero_1 = Math.random()*10;
        this.numero_2 = Math.random()*10;
    }

    public PardeNumeros(double numero_1, double numero_2) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
    }
    //Getters

    public double getNumero_1() {
        return numero_1;
    }

    public double getNumero_2() {
        return numero_2;
    }
    //Setters

    public void setNumero_1(double numero_1) {
        this.numero_1 = numero_1;
    }

    public void setNumero_2(double numero_2) {
        this.numero_2 = numero_2;
    }
    
    
}
