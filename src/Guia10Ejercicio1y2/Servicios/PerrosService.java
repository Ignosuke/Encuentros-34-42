package Guia10Ejercicio1y2.Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerrosService {
    
    private Scanner sc = new Scanner(System.in);
    private ArrayList<String> razas;
    
    public void cargarRazas() {
        razas = new ArrayList<>();
        boolean yes = true;
        
        while (yes) {
            System.out.println("Ingrese una nueva raza de perros: ");
            razas.add(sc.nextLine());
            System.out.println("Desea ingresar otra raza? S/N" );
            yes = sc.nextLine().equalsIgnoreCase("S");
        }
        mostrarRazas();
    }

    public void mostrarRazas() {
        for (String aux : razas) {
            System.out.println(aux);
        }
    }

    public void eliminarRaza() {
        boolean yes = true;
        Iterator<String> it = razas.iterator();

        System.out.println("Ingrese la raza que desea eliminar: ");
        String raza = sc.nextLine();

        while (it.hasNext()) {
            if(it.next().equalsIgnoreCase(raza)) {
                it.remove();
                yes = false;
            }
        }
        if (yes) {
            System.out.println("La raza no se encontró en la lista");
        }
    }
}
