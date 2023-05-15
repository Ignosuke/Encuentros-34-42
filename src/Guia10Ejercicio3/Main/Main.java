package Guia10Ejercicio3.Main;

import Guia10Ejercicio3.Servicios.AlumnoService;

public class Main {
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        as.cargarAlumnos();
        as.calcularNotaF();
    }
}
