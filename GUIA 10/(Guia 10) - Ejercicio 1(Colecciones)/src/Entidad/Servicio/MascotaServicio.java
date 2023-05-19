package Entidad.Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Adriel
 */
public class MascotaServicio {

    private Scanner leer;
    private ArrayList<String> Mascotas;
    private Iterator<String> it;

    public MascotaServicio() {
        this.leer = new Scanner(System.in);
        this.Mascotas = new ArrayList();
        this.it = Mascotas.iterator();
    }

    public void CrearMascota() {
        System.out.println("Ingrese la raza del perro");
        String mascota = leer.next();
        Mascotas.add(mascota);
    }

    public void mostrarMascota() {
        System.out.println("-------------------------------------");
        if(Mascotas.size()>0)
        {
           System.out.println("      Lista de las mascotas");
           System.out.println("-------------------------------------");
            for (String raza : Mascotas) {
                System.out.println(raza);
            } 
        }
        else
        {
            System.out.println("La lista se encuentra vacía");
        }
        System.out.println("-------------------------------------");
    }

    public void menuMascota() {

        boolean opcion = true;
        System.out.println("Bienvenido al menu de Mascotas");
        do {
            CrearMascota();
            opcion = verificarSiNo();
        } while (opcion);
        mostrarMascota();
    }

    public boolean verificarSiNo() {
        boolean validar = true;
        do {
            System.out.println("¿Desea ingresar otra mascota?");
            System.out.println("------------S/N-----------");
            String op = leer.next();
            op = op.toLowerCase();
            if (op.equals("s") || op.equals("si")) {
                return true;
            } else if (op.equals("n") || op.equals("no")) {
                return false;
            } else {
                System.out.println("Ingrese una opción válida");
            }
        } while (validar);
        return true;
    }

    public void buscarMascota() {
        System.out.println("Ingrese la raza a buscar: ");
        String buscada = leer.next();
        this.it = Mascotas.iterator();
        boolean ban=true;
        while (it.hasNext()) {
            if (it.next().equals(buscada)) {
                it.remove();
                ban=false;
                break;
            }
        }
        if(ban)
        {
            System.out.println("La mascota ingresada no existe");
        }
        Collections.sort(Mascotas);
        mostrarMascota();
    }
}
