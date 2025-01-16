package clases.subclases;

import clases.Vehiculo;

public class Hibrido extends Vehiculo {
    private int autonomiaBateria;

    public Hibrido(String marca, String modelo, int year, Double precio, int autonomiaBateria) {
        super(marca, modelo, year, precio);
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autonomía de batería: " + autonomiaBateria + " km";
    }

    @Override
    public double obtenerPrecio() {
        return getPrecio();
    }

    @Override
    public double calcularPrecioFinal(){
        double precioFinal = getPrecio();
        double impuestos = precioFinal  * 0.21;
        return precioFinal + impuestos;
    }

    @Override
    public void vender(){
        System.out.println("Vendiendose el vehículo hibrido: " + getModelo() + " por un precio final de " + calcularPrecioFinal() + " euros.");
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Autonomia de: " + autonomiaBateria + " kWh");
    }
}
