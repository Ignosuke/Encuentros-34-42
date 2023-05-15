package Guia10Ejercicio6.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    private HashMap<String, Double> tienda = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void introducirElementos() {
        boolean yes = true;
        String nombre;
        Double precio;
        while (yes) {
            System.out.println("Ingrese nombre del producto: ");
            nombre = sc.nextLine();
            System.out.println("Ingrese precio del producto: ");
            precio = sc.nextDouble();
            sc.nextLine();

            tienda.put(nombre, precio);

            System.out.println("Desea ingresar más productos? S/N");
            yes = sc.nextLine().equalsIgnoreCase("S");
        }
    }

    public void modificarPrecio() {
        String nombre;
        Double precioNuevo;
        System.out.println("Ingrese nombre del producto a actualizar: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese nuevo precio del producto: ");
        precioNuevo = sc.nextDouble();
        sc.nextLine();
        if (tienda.containsKey(nombre)) {
            tienda.replace(nombre, precioNuevo);
        }
    }

    public void eliminarProducto() {
        String nombre;
        System.out.println("Ingrese nombre del producto a eliminar: ");
        nombre = sc.nextLine();
        tienda.remove(nombre);
    }

    public void mostrarProductos() {
        for (Map.Entry<String,Double> entry : tienda.entrySet()) {
            System.out.print("Producto: " + entry.getKey());
            System.out.println(" Precio: " + entry.getValue());
        }
    }

    public void menu() {
        boolean yes = true;
        int op;
        while (yes) {
            System.out.println("""
                1: Introducir productos
                2: Modificar precio
                3: Eliminar producto
                4: Mostrar productos
                5: Salir
                """);
                System.out.print("Que operación desea realizar? ");
                op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    introducirElementos();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    yes = false;
                    break;
                default:
                    System.out.println("La opción ingresada no es correcta.");
            }
        }
        System.out.println("Gracias por elegirnos!");
        System.out.println("COTO, yo te CONOZCO!");
    }
}