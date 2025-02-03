package clases;
import interfaces.Vendible;
import exceptions.VehiculoInvalidoException;

public abstract class Vehiculo implements Vendible {
    private String marca;
    private String modelo;
    private int year;
    private double precio;

    public Vehiculo(String marca, String modelo, int year, double precio) {
        if (precio < 0) {
            throw new VehiculoInvalidoException("El precio del vehículo no puede ser negativo.");
        }
        if (year > 2025 || year < 1886) {  // Considerando que los vehículos no pueden ser del futuro o antes de 1886
            throw new VehiculoInvalidoException("El año del vehículo es inválido.");
        }

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
