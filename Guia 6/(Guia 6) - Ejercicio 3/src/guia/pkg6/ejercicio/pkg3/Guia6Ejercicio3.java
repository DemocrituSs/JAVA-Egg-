package guia.pkg6.ejercicio.pkg3;
import Entidad.Operacion;
public class Guia6Ejercicio3 {

    public static void main(String[] args) {
        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.println("Suma= "+op.Suma());
        System.out.println("Resta= "+op.Resta());
        System.out.println("Multiplicación= "+op.multiplicar());
        System.out.println("División= "+op.dividir());
    }
    
}
