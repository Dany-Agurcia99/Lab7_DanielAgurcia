package lab7_danielagurcia;

import javax.swing.JProgressBar;

public class hilo_administrador extends Thread {

    private Mesa mesa_1;
    private Mesa mesa_2;
    private Mesa mesa_3;
    private Mesa mesa_4;
    private boolean avance;
    private boolean vive;

    public hilo_administrador(Mesa mesa_1, Mesa mesa_2, Mesa mesa_3, Mesa mesa_4, boolean avance, boolean vive) {
        this.mesa_1 = mesa_1;
        this.mesa_2 = mesa_2;
        this.mesa_3 = mesa_3;
        this.mesa_4 = mesa_4;
        this.avance = avance;
        this.vive = vive;
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
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
