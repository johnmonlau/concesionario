package clases;

import clases.Cliente;
import clases.Vehiculo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int idFactura;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double montoTotal;
    private Date fecha;

    public Factura(int idFactura, Cliente cliente, Vehiculo vehiculo, double montoTotal, Date fecha) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.montoTotal = montoTotal;
        this.fecha = fecha;
    }

    //metodos get y set
    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Metodo para generar una factura
    public static Factura generarFactura(Cliente cliente, Vehiculo vehiculo) {
        double montoTotal = vehiculo.calcularPrecioFinal();
        Factura factura = new Factura(1, cliente, vehiculo, montoTotal, new Date());
        return factura;
    }

    public String formatFecha(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return sdf.format(fecha);
    }


    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "Factura{idFactura=" + idFactura +
                ", cliente=" + cliente.getNombre() +
                ", vehiculo=" + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                ", montoTotal=" + montoTotal +
                ", fecha=" + sdf.format(fecha) + "}";
    }

}
