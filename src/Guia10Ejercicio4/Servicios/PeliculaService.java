package Guia10Ejercicio4.Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import Guia10Ejercicio4.Entidades.Pelicula;

public class PeliculaService {
    
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public void cargarPeliculas() {
        boolean yes = true;
        String titulo, director;
        double duracion;
        System.out.println("\n====================================\n");
        while (yes) {
            System.out.println("Ingrese titulo de la pelicula: ");
            titulo = sc.nextLine();
            System.out.println("Ingrese director de la pelicula: ");
            director = sc.nextLine();
            System.out.println("Ingrese duracion de la pelicula en hs: ");
            duracion = sc.nextDouble();
            listaPeliculas.add(new Pelicula(titulo, director, duracion));
            sc.nextLine();

            System.out.println();
            System.out.println("Desea agregar más peliculas? S/N");
            yes = sc.nextLine().equalsIgnoreCase("S");
        }
        System.out.println("\n====================================\n");
    }

    public void mostrarPeliculas() {
        System.out.println("Lista de películas: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n====================================\n");

    }

    public void mostrarMasDe1Hora() {
        System.out.println("Lista de películas de 1 hora o más: ");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() >= 1) {
                System.out.println(pelicula.toString());
            }
        }
        System.out.println("\n====================================\n");

    }

    public void mostrarDuracionAscendente() {
        Collections.sort(listaPeliculas, Pelicula.compararDuracion);
        System.out.println("Peliculas ordenadas en orden ascendente de duración: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n====================================\n");

    }

    public void mostrarDuracionDescendente() {
        Collections.sort(listaPeliculas, Pelicula.compararDuracion);
        Collections.reverse(listaPeliculas);
        System.out.println("Peliculas ordenadas en orden descendente de duración: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n====================================\n");

    }

    public void mostrarPorTitulo() {
        Collections.sort(listaPeliculas, Pelicula.compararTitulo);
        System.out.println("Peliculas ordenadas en orden alfabético por titulo: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n====================================\n");

    }

    public void mostrarPorDirector() {
        Collections.sort(listaPeliculas, Pelicula.compararDirector);
        System.out.println("Peliculas ordenadas en orden alfabético por director: ");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("\n====================================\n");

    }
}
