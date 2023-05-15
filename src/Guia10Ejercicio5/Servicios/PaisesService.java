package Guia10Ejercicio5.Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisesService {
    private HashSet<String> paises;
    private Scanner sc = new Scanner(System.in);

    public void cargarPaises() {
        paises = new HashSet<>();
        boolean yes = true;
        while (yes) {
            System.out.println("Ingrese un país: ");
            paises.add(sc.nextLine().toUpperCase());
            System.out.println("Desea ingresar más países? S/N");
            yes = sc.nextLine().equalsIgnoreCase("S");
        }
        for (String aux : paises) {
            System.out.println(aux);
        }
    }

    public void ordenarPaises() {
        ArrayList<String> paisesLista = new ArrayList<>(paises);
        Collections.sort(paisesLista);
        System.out.println();
        for (String aux : paisesLista) {
            System.out.println(aux);
        }
    }

    public void eliminarPais() {
        Iterator<String> it = paises.iterator();
        System.out.println();
        System.out.println("Ingrese el país que desea eliminar:");
        String aux = sc.nextLine();
        boolean y = false;
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(aux)) {
                it.remove();
                y = true;
            }
        }
        if (y == false) {
            System.out.println();
            System.out.println("El país no se encuentra en el conjunto");
        }
        ordenarPaises();
    }
}
