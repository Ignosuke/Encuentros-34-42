package Guia10Ejercicio1y2.Main;

import Guia10Ejercicio1y2.Servicios.PerrosService;

public class Main {
    public static void main(String[] args) {
        PerrosService ps = new PerrosService();
        ps.cargarRazas();
        ps.eliminarRaza();
        ps.mostrarRazas();
    }
}
