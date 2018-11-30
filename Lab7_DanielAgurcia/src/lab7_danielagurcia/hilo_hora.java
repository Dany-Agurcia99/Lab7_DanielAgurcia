package lab7_danielagurcia;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class hilo_hora implements Runnable {

    private JLabel hora;
    private boolean estado = true;

    public hilo_hora() {
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public hilo_hora(JLabel hora) {
        this.hora = hora;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    @Override
    public void run() {
        int minutos = 0;
        int segundos = 0;
        boolean Vive = true;
        while (Vive) {
            if (hora.getText().equals("16:00")) {
                Vive = false;
                estado = false;
            } else {
                segundos++;
                if (segundos == 59) {
                    segundos = 0;
                    minutos++;
                }
                if (minutos >= 10 && segundos >= 10) {
                    hora.setText(minutos + ":" + segundos);
                } else if (minutos <= 10 && segundos <= 10) {
                    hora.setText("0" + minutos + ":" + "0" + segundos);
                } else if (minutos >= 10 && segundos <= 10) {
                    hora.setText(minutos + ":" + "0" + segundos);
                } else if (minutos <= 10 && segundos >= 10) {
                    hora.setText("0" + minutos + ":" + segundos);
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }
}
