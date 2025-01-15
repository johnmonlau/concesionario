import clases.*;
import clases.subclases.Gasolina;
import clases.subclases.Hibrido;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Crear el cliente
        Cliente cliente = new Cliente(1, "Sergio Joel Iker", "Calle muñaño", "666778899", new ArrayList<>());

        //Crear el concesionario
        Concesionario concesionario = new Concesionario("Concesionario Diddy", "Calle Peru", "CIF12345");

        //Crear los 3 tipos de coches
        Vehiculo cocheGasolina = new Gasolina("Toyota", "Corolla", 2025,  20000.0, true, true);
        Vehiculo cocheHibrido = new Hibrido("Honda", "Insight", 2024, 24000.0, );
    }
}