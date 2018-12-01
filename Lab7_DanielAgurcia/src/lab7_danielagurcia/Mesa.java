package lab7_danielagurcia;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Mesa {

    private JProgressBar mesa;
    ArrayList<Clientes> lista_sentados = new ArrayList();
    JLabel estado;

    public Mesa() {
    }

    public Mesa(JProgressBar mesa, JLabel estado) {
        this.mesa = mesa;
        this.estado = estado;
    }

    public JProgressBar getMesa() {
        return mesa;
    }

    public void setMesa(JProgressBar mesa) {
        this.mesa = mesa;
    }

    public ArrayList<Clientes> getLista_sentados() {
        return lista_sentados;
    }

    public void setLista_sentados(ArrayList<Clientes> lista_sentados) {
        this.lista_sentados = lista_sentados;
    }

    public JLabel getEstado() {
        return estado;
    }

    public void setEstado(JLabel estado) {
        this.estado = estado;
    }

}
