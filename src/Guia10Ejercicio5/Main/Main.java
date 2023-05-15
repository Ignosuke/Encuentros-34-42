package Guia10Ejercicio5.Main;

import Guia10Ejercicio5.Servicios.PaisesService;

public class Main {
    public static void main(String[] args) {
        PaisesService ps = new PaisesService();
        ps.cargarPaises();
        ps.ordenarPaises();
        ps.eliminarPais();
    }
}