package lab6p2_brandonhernandez;

public class Partes {
    private String marca;
    private String clas;
    private double precio;

    public Partes() {
    }

    public Partes(String marca, String clas, double precio) {
        this.marca = marca;
        this.clas = clas;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nClasificacion: " + clas + "\nPrecio: " + precio;
    }
    
    
}
