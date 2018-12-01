package lab7_danielagurcia;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class hilo_administrador extends Thread {

    private Mesa mesa_1;
    private Mesa mesa_2;
    private Mesa mesa_3;
    private Mesa mesa_4;
    private boolean avance;
    private boolean vive;
    private ArrayList<Clientes> lista_clientes;
    private ArrayList<Alimento> lista_alimentos;

    public hilo_administrador(Mesa mesa_1, Mesa mesa_2, Mesa mesa_3, Mesa mesa_4, boolean avance, boolean vive, ArrayList<Clientes> lista_clientes, ArrayList<Alimento> lista_alimentos) {
        this.mesa_1 = mesa_1;
        this.mesa_2 = mesa_2;
        this.mesa_3 = mesa_3;
        this.mesa_4 = mesa_4;
        this.avance = avance;
        this.vive = vive;
        this.lista_clientes = lista_clientes;
        this.lista_alimentos = lista_alimentos;
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
    String menu = "1)Hamburguesa\n"
            + "2)Sandwiches\n"
            + "3)Boneless\n"
            + "4)Almuerzo Normal\n"
            + "5)Nachos\n"
            + "6)Alitas\n"
            + "7)Baleada Normal\n"
            + "8)Baleada con todo\n"
            + "9)Gringas\n"
            + "10)Bebidas\n"
            + "11)Excepcion a en Rocas";

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
                if (mesa_1.getLista_sentados().size() == 4 && mesa_1.getEstado().getText().equals("Esperando")) {
                    mesa_1.getEstado().setText("Ordenando");
                    int tiempoprep = 0;
                    int tiempocomidas = 0;
                    for (int i = 1; i <= mesa_1.getLista_sentados().size(); i++) {
                        String tiempo = JOptionPane.showInputDialog(null, "Que quiere ordenar Cliente " + i + "\n" + menu);
                        int temp = Integer.parseInt(tiempo);
                        switch (temp) {
                            case 1:
                                tiempocomidas += 20;
                                break;
                            case 2:
                                tiempocomidas += 15;
                                break;
                            case 3:
                                tiempocomidas += 12;
                                break;
                            case 4:
                                tiempocomidas += 25;
                                break;
                            case 5:
                                tiempocomidas += 20;
                                break;
                            case 6:
                                tiempocomidas += 20;
                                break;
                            case 7:
                                tiempocomidas += 15;
                                break;
                            case 8:
                                tiempocomidas += 20;
                                break;
                            case 9:
                                tiempocomidas += 17;
                                break;
                            case 10:
                                tiempocomidas += 0;
                                break;
                            case 11:
                                tiempocomidas += 0;
                                break;
                        }
                    }
                    
                }
                if (mesa_2.getLista_sentados().size() == 4 && mesa_2.getEstado().getText().equals("Esperando")) {
                    mesa_2.getEstado().setText("Ordenando");
                    for (int i = 1; i <= mesa_2.getLista_sentados().size(); i++) {
                        JOptionPane.showInputDialog(null, "Que quiere ordenar Cliente " + i + "\n" + menu);
                    }
                }
                if (mesa_3.getLista_sentados().size() == 4 && mesa_3.getEstado().getText().equals("Esperando")) {
                    mesa_3.getEstado().setText("Ordenando");
                    for (int i = 1; i <= mesa_3.getLista_sentados().size(); i++) {
                        JOptionPane.showInputDialog(null, "Que quiere ordenar Cliente " + i + "\n" + menu);
                    }
                }
                if (mesa_4.getLista_sentados().size() == 4 && mesa_4.getEstado().getText().equals("Esperando")) {
                    mesa_4.getEstado().setText("Ordenando");
                    for (int i = 1; i <= mesa_4.getLista_sentados().size(); i++) {
                        JOptionPane.showInputDialog(null, "Que quiere ordenar Cliente " + i + "\n" + menu);
                    }
                }
                if (mesa_1.getEstado().getText().equals("Ordenando")) {
                    mesa_1.getEstado().setText("Preparando alimentos");
                    mesa_1.getMesa().setValue(0);
                }
                if (mesa_2.getEstado().getText().equals("Ordenando")) {
                    mesa_2.getEstado().setText("Preparando alimentos");
                    mesa_2.getMesa().setValue(0);
                }
                if (mesa_3.getEstado().getText().equals("Ordenando")) {
                    mesa_3.getEstado().setText("Preparando alimentos");
                    mesa_3.getMesa().setValue(0);
                }
                if (mesa_4.getEstado().getText().equals("Ordenando")) {
                    mesa_4.getEstado().setText("Preparando alimentos");
                    mesa_4.getMesa().setValue(0);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

}
