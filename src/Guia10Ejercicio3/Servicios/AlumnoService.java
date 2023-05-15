package Guia10Ejercicio3.Servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Guia10Ejercicio3.Entidades.Alumno;

public class AlumnoService {
    
    private Scanner sc = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public void crearAlumno() {
        ArrayList<Integer> aux = new ArrayList<>();

        System.out.println("Ingrese nombre del alumno: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese nota 1: ");
        aux.add(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese nota 2: ");
        aux.add(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese nota 3: ");
        aux.add(sc.nextInt());
        sc.nextLine();
        alumnos.add(new Alumno(nombre, aux));
    }

    public void cargarAlumnos() {
        boolean yes = true;
        while (yes) {
            crearAlumno();
            System.out.println("Desea cargar más alumnos? S/N");
            yes = sc.nextLine().equalsIgnoreCase("S");
        }
    }

    public void calcularNotaF() {
        System.out.println("Ingrese nombre del alumno para calcular su nota final: ");
        String nombre = sc.nextLine();
        double notaF = 0;
        boolean yes = true;
        Iterator<Alumno> it = alumnos.iterator();

        outer:while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                yes = false;

                for (Integer notas : aux.getNotas()) {
                    notaF += notas;
                }

                notaF /= aux.getNotas().size();
                
                break outer;
            }
        }
        if (yes) {
            System.out.println("No se encontró el alumno");
        } else {
            System.out.println("La nota final del alumno: " + nombre + " es: " + notaF);
        }
    }

}