package clases;
import clases.Factura;

import java.util.List;

public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Factura> historialFacturas;

    public Cliente(int id, String nombre, String direccion, String telefono,  List<Factura> historialFacturas) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.historialFacturas = historialFacturas;
    }

    //metodos get y set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Factura> getHistorialFacturas() {
        return historialFacturas;
    }

    public void setHistorialFacturas(List<Factura> historialFacturas) {
        this.historialFacturas = historialFacturas;
    }

    //metodos
    public void agregarMetodoDePago(String paymentMethod) {
        System.out.println("Método de pago agregado: " + paymentMethod);
    }

    public Factura realizarCompra(Vehiculo vehiculo, Concesionario concesionario) {
        // Calcular el monto total con impuestos
        double montoTotal = vehiculo.calcularPrecioFinal();

        // Crear la factura
        Factura factura = new Factura(historialFacturas.size() + 1, this, vehiculo, montoTotal, new java.util.Date());

        // Agregar la factura al historial de facturas
        historialFacturas.add(factura);

        // Realizar la venta del vehículo
        vehiculo.vender();

        // Devolver la factura
        return factura;
    }

    public List<Factura> consultarFacturas() {
        return historialFacturas;
    }
}
