import clases.*;
import exceptions.*;
import clases.subclases.Electrico;
import clases.subclases.Gasolina;
import clases.subclases.Hibrido;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear el cliente
        Cliente cliente = new Cliente(1, "Sergio Joel Iker", "Calle Muñaño", "666778899", new ArrayList<>());

        // Crear el concesionario
        Concesionario concesionario = new Concesionario("Concesionario Diddy", "Calle Peru", "CIF12345");

        // Crear los 3 tipos de coches
        Vehiculo cocheGasolina = new Gasolina("Toyota", "Corolla", 2025, 20000.0, true, true);
        Vehiculo cocheHibrido = new Hibrido("Honda", "Insight", 2024, 24000.0, 500);
        Vehiculo cocheElectrico = new Electrico("Tesla", "Model S", 2024, 50000.0, 500, 12);

        // Agregar vehículos al concesionario
        concesionario.agregarVehiculo(cocheGasolina);
        concesionario.agregarVehiculo(cocheHibrido);
        concesionario.agregarVehiculo(cocheElectrico);

        // Crear el scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Menú interactivo
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar inventario de vehículos");
            System.out.println("2. Comprar un vehículo");
            System.out.println("3. Ver historial de facturas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        // Mostrar el inventario del concesionario
                        concesionario.mostrarInventario();
                        break;

                    case 2:
                        // Comprar un vehículo
                        System.out.println("Seleccione el vehículo a comprar:");
                        System.out.println("1. " + cocheGasolina.getMarca() + " " + cocheGasolina.getModelo());
                        System.out.println("2. " + cocheHibrido.getMarca() + " " + cocheHibrido.getModelo());
                        System.out.println("3. " + cocheElectrico.getMarca() + " " + cocheElectrico.getModelo());
                        System.out.print("Seleccione una opción: ");
                        int eleccion = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer

                        Vehiculo vehiculoSeleccionado = null;
                        if (eleccion == 1) {
                            vehiculoSeleccionado = cocheGasolina;
                        } else if (eleccion == 2) {
                            vehiculoSeleccionado = cocheHibrido;
                        } else if (eleccion == 3) {
                            vehiculoSeleccionado = cocheElectrico;
                        }

                        if (vehiculoSeleccionado != null) {
                            // Realizar la compra
                            Factura factura = cliente.realizarCompra(vehiculoSeleccionado, concesionario);
                            System.out.println("\nFactura generada:");
                            System.out.println(factura);
                        } else {
                            System.out.println("Opción inválida.");
                        }
                        break;

                    case 3:
                        // Ver historial de facturas del cliente
                        System.out.println("\nHistorial de facturas del cliente:");
                        for (Factura factura : cliente.consultarFacturas()) {
                            System.out.println(factura);
                        }
                        break;

                    case 4:
                        // Salir
                        System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
                        break;

                    default:
                        throw new EntradaInvalidaException("Opción inválida. Por favor, seleccione una opción del 1 al 4.");
                }
            } catch (EntradaInvalidaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar el buffer
            }
        } while (opcion != 4);

        scanner.close();
    }
}