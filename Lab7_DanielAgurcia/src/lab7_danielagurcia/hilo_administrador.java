package lab7_danielagurcia;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import javax.swing.JProgressBar;

public class hilo_administrador extends Thread {

    private Mesa mesa_1;
    private Mesa mesa_2;
    private Mesa mesa_3;
    private Mesa mesa_4;
    private boolean avance;
    private boolean vive;
    private ArrayList<Clientes> lista_clientes;

    public hilo_administrador(Mesa mesa_1, Mesa mesa_2, Mesa mesa_3, Mesa mesa_4, boolean avance, boolean vive, ArrayList<Clientes> lista_clientes) {
        this.mesa_1 = mesa_1;
        this.mesa_2 = mesa_2;
        this.mesa_3 = mesa_3;
        this.mesa_4 = mesa_4;
        this.avance = avance;
        this.vive = vive;
        this.lista_clientes = lista_clientes;
    }

    public boolean isAvance() {
        return avance;
    }

    public void setAvance(boolean avance) {
        this.avance = avance;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avance) {
                int clientes_pasados = 0;
                if (mesa_1.getLista_sentados().size() < 4) {
                    mesa_1.getLista_sentados().add(lista_clientes.get(clientes_pasados));
                    mesa_1.getMesa().setValue(mesa_1.getMesa().getValue() + 1);
                    mesa_1.getEstado().setText("Esperando");
                    clientes_pasados++;
                } else if (mesa_2.getLista_sentados().size() < 4) {
                    mesa_2.getLista_sentados().add(lista_clientes.get(clientes_pasados));
                    mesa_2.getMesa().setValue(mesa_2.getMesa().getValue() + 1);
                    mesa_2.getEstado().setText("Esperando");
                    clientes_pasados++;
                } else if (mesa_3.getLista_sentados().size() < 4) {
                    mesa_3.getLista_sentados().add(lista_clientes.get(clientes_pasados));
                    mesa_3.getMesa().setValue(mesa_3.getMesa().getValue() + 1);
                    mesa_3.getEstado().setText("Esperando");
                    clientes_pasados++;
                } else if (mesa_4.getLista_sentados().size() < 4) {
                    mesa_4.getLista_sentados().add(lista_clientes.get(clientes_pasados));
                    mesa_4.getMesa().setValue(mesa_4.getMesa().getValue() + 1);
                    mesa_4.getEstado().setText("Esperando");
                    clientes_pasados++;
                }
                if (mesa_1.getLista_sentados().size() == 4) {
                    
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
