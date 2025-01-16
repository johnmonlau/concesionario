package clases;
import interfaces.Vendible;


public abstract class Vehiculo implements Vendible {
    private String marca;
    private String modelo;
    private int year;
    private double precio;

    public Vehiculo(String marca, String modelo, int year, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.precio = precio;
    }

    //metodos get y set
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;

    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles del vehículo:");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio + "€");
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + year + ", Precio: " + precio + "€";
    }

    @Override
    public abstract double obtenerPrecio();

    @Override
    public abstract double calcularPrecioFinal();

    @Override
    public abstract void vender();


}
