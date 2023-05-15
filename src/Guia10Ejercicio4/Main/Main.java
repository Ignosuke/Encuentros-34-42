package Guia10Ejercicio4.Main;

import Guia10Ejercicio4.Servicios.PeliculaService;

public class Main {
    public static void main(String[] args) {
        PeliculaService ps = new PeliculaService();
        ps.cargarPeliculas();
        ps.mostrarPeliculas();
        ps.mostrarDuracionAscendente();
        ps.mostrarDuracionDescendente();
        ps.mostrarMasDe1Hora();
        ps.mostrarPorDirector();
        ps.mostrarPorTitulo();
    }
}