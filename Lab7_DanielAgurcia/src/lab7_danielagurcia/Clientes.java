package lab7_danielagurcia;

import java.io.Serializable;

public class Clientes implements Serializable {

    String nombre;
    String tarjeta;
    int billetera;
    String recibo;
    int unitec;
    private static final long serialVersionUID = 777L;

    public Clientes() {
    }

    public Clientes(String nombre, String tarjeta, int billetera, String recibo, int unitec) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.billetera = billetera;
        this.recibo = recibo;
        this.unitec = unitec;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public int getBilletera() {
        return billetera;
    }

    public void setBilletera(int billetera) {
        this.billetera = billetera;
    }

    public String getRecibo() {
        return recibo;
    }

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    public int getUnitec() {
        return unitec;
    }

    public void setUnitec(int unitec) {
        this.unitec = unitec;
    }

    @Override
    public String toString() {
        return nombre + "Presupuesto: " + billetera + "   " + tarjeta + "  " + unitec;
    }

}
