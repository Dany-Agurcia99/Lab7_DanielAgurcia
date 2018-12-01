package lab7_danielagurcia;

import java.io.Serializable;

public class Alimento implements Serializable {

    String nombre;
    int tiempo;
    int precio;
    int cantidad;
    private static final long serialVersionUID = 778L;

    public Alimento() {
    }

    public Alimento(String nombre, int tiempo, int precio, int cantidad) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + " tiempo: " + tiempo + " precio: " + precio + " cantidad: " + cantidad;
    }

}
