
package Entidad;

import java.util.Scanner;
public class Libro {
    int ISBN;
    String titulo;
    String Autor;
    int num_paginas;
    //Constructores
    public Libro() {
    }
    public Libro(int ISBN, String titulo, String Autor, int num_paginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.Autor = Autor;
        this.num_paginas = num_paginas;
    }
    //Setter
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNum_paginas(int num_paginas) {
        this.num_paginas = num_paginas;
    }
    
    public void crearLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro");
        String nombre_libro = leer.nextLine();
        titulo=nombre_libro;
        System.out.println("Ingrese el nombre del autor");
        String autor = leer.nextLine();
        Autor=autor;
        System.out.println("Ingrese la cantidad de páginas");
        int cant = leer.nextInt();
        num_paginas = cant;
        System.out.println("Ingrese el ISBN");
        int isbn = leer.nextInt();
        ISBN = isbn;
    }
    public void mostrar_info(){
        System.out.println("Titulo: "+titulo);
        System.out.println("ISBN: "+ISBN);
        System.out.println("Autor: "+Autor);
        System.out.println("Nùmero de pàginas: "+num_paginas);
    }
}
