/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_danielagurcia;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Agurcia
 */
public class LA_EXCEPCION extends javax.swing.JFrame {

    public LA_EXCEPCION() {
        initComponents();
        admin_clientes ac = new admin_clientes("./clientes.txt");
        ac.cargarArchivo();
        ArrayList<Clientes> lista_clientes_recurrentes = ac.getlista_clientes();
        Mesa mesa_1 = new Mesa();
        Mesa mesa_2 = new Mesa();
        Mesa mesa_3 = new Mesa();
        Mesa mesa_4 = new Mesa();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_listaClientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pb_mesa2 = new javax.swing.JProgressBar();
        pb_mesa1 = new javax.swing.JProgressBar();
        pb_mesa4 = new javax.swing.JProgressBar();
        pb_mesa3 = new javax.swing.JProgressBar();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_hora = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pb_tiempocomer = new javax.swing.JProgressBar();
        pb_tiempoespera = new javax.swing.JProgressBar();
        pb_tiempocomida = new javax.swing.JProgressBar();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jl_listaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 142, 516));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Lista Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Mesa 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Mesa 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 334, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Mesa 3");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 80, 30));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Mesa 4");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        pb_mesa2.setBackground(new java.awt.Color(153, 0, 0));
        pb_mesa2.setMaximum(4);
        getContentPane().add(pb_mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 230, 40));

        pb_mesa1.setBackground(new java.awt.Color(0, 0, 153));
        pb_mesa1.setMaximum(4);
        getContentPane().add(pb_mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 220, 40));

        pb_mesa4.setBackground(new java.awt.Color(0, 153, 0));
        pb_mesa4.setMaximum(4);
        getContentPane().add(pb_mesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 230, 40));

        pb_mesa3.setBackground(new java.awt.Color(204, 204, 0));
        pb_mesa3.setMaximum(4);
        getContentPane().add(pb_mesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, 220, 40));

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setText("Horas Abierto");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jl_hora.setText("00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jl_hora)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jl_hora, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 120, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setText("Bar la Excepcion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 250, 80));

        jButton1.setText("Abrir");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 68, -1, -1));
        getContentPane().add(pb_tiempocomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 95, 31));
        getContentPane().add(pb_tiempoespera, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 90, 30));
        getContentPane().add(pb_tiempocomida, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        hilo_hora h = new hilo_hora(jl_hora);
        Thread HH = new Thread(h);
        HH.start();
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LA_EXCEPCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LA_EXCEPCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LA_EXCEPCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LA_EXCEPCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LA_EXCEPCION().setVisible(true);
            }
        });
    }
    ArrayList<Mesa> mesas = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jl_hora;
    private javax.swing.JList<String> jl_listaClientes;
    private javax.swing.JProgressBar pb_mesa1;
    private javax.swing.JProgressBar pb_mesa2;
    private javax.swing.JProgressBar pb_mesa3;
    private javax.swing.JProgressBar pb_mesa4;
    private javax.swing.JProgressBar pb_tiempocomer;
    private javax.swing.JProgressBar pb_tiempocomida;
    private javax.swing.JProgressBar pb_tiempoespera;
    // End of variables declaration//GEN-END:variables
}
