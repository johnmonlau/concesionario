package clases.subclases;

import clases.Vehiculo;

public class Gasolina extends Vehiculo {
    private boolean emisionesC02;
    private boolean esTurbo;

    public Gasolina(String marca, String modelo, int year, Double precio, boolean emisionesC02, boolean esTurbo) {
        super(marca, modelo, year, precio);
        this.emisionesC02 = emisionesC02;
        this.esTurbo = esTurbo;
    }

    public boolean getEmisionesC02() {
        return emisionesC02;
    }

    public void setEmisionesC02(boolean emisionesC02) {
        this.emisionesC02 = emisionesC02;
    }

    public boolean getEsTurbo() {
        return esTurbo;
    }

    public void setEsTurbo(boolean esTurbo) {
        this.esTurbo = esTurbo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Emisiones CO2: " + (emisionesC02 ? "Sí" : "No") + ", ¿Tiene Turbo?: " + (esTurbo ? "Sí" : "No");
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
        System.out.println("Vendiendose el vehículo de gasolina: " + getModelo() + " por un precio final de " + calcularPrecioFinal() + " euros.");
    }

    @Override
    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Emisiones C02: " + (emisionesC02 ? "Si" : "No"));
        System.out.println("¿Tiene turbo?: " + (esTurbo ? "Si" : "No"));
    }
}
