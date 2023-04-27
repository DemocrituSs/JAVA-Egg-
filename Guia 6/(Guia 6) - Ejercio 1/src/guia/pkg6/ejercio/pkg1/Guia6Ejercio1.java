
package guia.pkg6.ejercio.pkg1;

import Entidad.Libro;
import java.util.Scanner;

public class Guia6Ejercio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese: ISBN| nombre del libro | autor | cant de páginas");
        //Libro Libro_1 = new Libro(leer.nextInt(),leer.nextLine(),leer.nextLine(),leer.nextInt());
        Libro estudio_escarlata = new Libro(38,"Estudio en escarlata","Conan Doyle",140);
        Libro Libro_1 = new Libro();
        Libro_1.crearLibro();
        Libro_1.mostrar_info();
        
    }  
}
