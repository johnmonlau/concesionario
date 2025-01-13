package clases.subclases;
import clases.Vehiculo;

public class Electrico extends Vehiculo {
    private int autonomia;
    private double tiempoDeCarga;

    public Electrico(String marca, String modelo, int year, double precio, int autonomia, double tiempoDeCarga) {
        super(marca, modelo, year, precio);
        this.autonomia = autonomia;
        this.tiempoDeCarga = tiempoDeCarga;
    }

    //metodos get y set
    public int getAutonomia() {
        return autonomia;
    }
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public double getTiempoDeCarga() {
        return tiempoDeCarga;
    }

    public void setTiempoDeCarga(double tiempoDeCarga) {
        this.tiempoDeCarga = tiempoDeCarga;
    }

    @Override
    public double obtenerPrecio() {
        return getPrecio();
    }

    @Override
    public double calcularPrecioFinal(){
        double precioFinal = getPrecio();
        double impuestos = precioFinal * 0.21;
        return precioFinal + impuestos;
    }

    @Override
    public void vender(){
        System.out.println("Vendiendose el vehiculo eléctrico: " + getModelo() + "por un precio final de " +calcularPrecioFinal() + "euros");
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Autonomia: " + autonomia + "km");
        System.out.println("Tiempo de carga: " + tiempoDeCarga + "horas");
    }

    //funcion para calcular tiempo de carga
    public double calcularTiempoDeCarga(double potenciaCarga){
        double capacidadCarga = 50.0;
        return capacidadCarga / potenciaCarga;
    }
}
