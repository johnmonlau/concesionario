package clases;

import java.util.List;
import java.util.ArrayList;

public class Concesionario {
    private List<Vehiculo> inventario;
    private String nombre;
    private String direccion;
    private String CIF;

    //constructor
    public Concesionario(String nombre, String direccion, String CIF) {
        this.inventario = new ArrayList<>();
        this.nombre = nombre;
        this.direccion = direccion;
        this.CIF = CIF;
    }

    //funcion agregar
    public void agregarVehiculo(Vehiculo vehiculo) {
        inventario.add(vehiculo);
        System.out.println("Vehiculo agregado: " + vehiculo);
    }

    //funcion eliminar
    public void eliminarVehiculo(Vehiculo vehiculo) {
        if(inventario.remove(vehiculo)) {
            System.out.println("Vehiculo eliminado: " + vehiculo);
        }else{
            System.out.println("El vehiculo: " + vehiculo + " no se ha encontrado en el inventario.");
        }
    }

    //buscar vehiculos por marca
    public List<Vehiculo> buscarVehiculosPorMarca(String marca) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Vehiculo vehiculo : inventario) {
            if(vehiculo.getMarca().equalsIgnoreCase(marca)) {
                resultado.add(vehiculo);
            }
        }

        return resultado;
    }

    //mostrar el inventario
    public void mostrarInventario() {
        if(inventario.isEmpty()) {
            System.out.println("El inventario esta vacio");
        }else{
            System.out.println("El inventario de " + nombre + ": ");
            for (Vehiculo vehiculo : inventario) {
                System.out.println(vehiculo);
            }
        }
    }

    //mostrar todos los vehiculos
    public void mostrarVehiculosTotales(){
        if(inventario.isEmpty()) {
            System.out.println("No hay vehículos disponibles");
        }else{
            System.out.println("Todos los vehiculos en inventario: ");
            for (Vehiculo vehiculo : inventario) {
                System.out.println(vehiculo);
            }
        }
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public List<Vehiculo> getInventario() {
        return inventario;
    }

    public void setInventario(List<Vehiculo> inventario) {
        this.inventario = inventario;
    }
}
