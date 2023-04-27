
package Entidad;

public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int area(){
        return base*altura;
    }
    public int perimetro(){
        return 2*base+2*altura;
    }
    public void dibujar(){
        for(int i=0; i<altura;i++)
        {
            for(int j=0;j<base;j++){
                if(i==0 || i==altura-1 || j==0 || j==base-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
