
package lab6p2_brandonhernandez;

import java.awt.Color;
import java.util.ArrayList;

public class Carro {
    private String marca;
    private String modelo;
    private String tipo;
    private Color color;
    private double precio;
    private ArrayList<String> mejoras = new ArrayList();
    private String pais;
    private String añoF;
    private ArrayList<Partes> partes = new ArrayList();

    public Carro() {
    }

    public Carro(String marca, String modelo, String tipo, Color color, double precio, String pais, String añoF) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.precio = precio;
        this.pais = pais;
        this.añoF = añoF;
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    public void setMejoras(ArrayList<String> mejoras) {
        this.mejoras = mejoras;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAñoF() {
        return añoF;
    }

    public void setAñoF(String añoF) {
        this.añoF = añoF;
    }

    public ArrayList<Partes> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Partes> partes) {
        this.partes = partes;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nTipo: " + tipo + "\nColor: " + color + "\nPrecio: " + precio + "\nMejoras: " + mejoras + "\nPais: " + pais + "\nAño de fabricacion: " + añoF + "\nPartes instaladas: " + partes;
    }
    
    
}
