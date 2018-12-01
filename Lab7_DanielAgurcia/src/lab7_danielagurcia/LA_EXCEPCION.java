package lab7_danielagurcia;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel Agurcia
 */
public class LA_EXCEPCION extends javax.swing.JFrame {

    public LA_EXCEPCION() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        ventana_crear = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_billetera = new javax.swing.JTextField();
        tf_tarjeta = new javax.swing.JTextField();
        jb_agregar = new javax.swing.JButton();
        rb_unitec = new javax.swing.JRadioButton();
        ventana_inventario = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jb_listarali = new javax.swing.JButton();
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
        jb_crear_cliente = new javax.swing.JButton();
        jb_eliminar_cliente = new javax.swing.JButton();
        jb_listar = new javax.swing.JButton();
        jl_mesa1 = new javax.swing.JLabel();
        jl_mesa2 = new javax.swing.JLabel();
        jl_mesa3 = new javax.swing.JLabel();
        jl_mesa4 = new javax.swing.JLabel();
        jb_inventario = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel3.setText("nombre");

        jLabel10.setText("billetera");

        jLabel11.setText("tarjeta");

        jLabel12.setText("Unitec");

        jb_agregar.setText("agregar");
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_crearLayout = new javax.swing.GroupLayout(ventana_crear.getContentPane());
        ventana_crear.getContentPane().setLayout(ventana_crearLayout);
        ventana_crearLayout.setHorizontalGroup(
            ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_crearLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_crearLayout.createSequentialGroup()
                        .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(tf_nombre)
                            .addComponent(tf_billetera)))
                    .addGroup(ventana_crearLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_agregar)
                            .addComponent(rb_unitec))))
                .addGap(19, 19, 19))
        );
        ventana_crearLayout.setVerticalGroup(
            ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_crearLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_billetera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventana_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rb_unitec))
                .addGap(18, 18, 18)
                .addComponent(jb_agregar)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alimento", "Tiempo", "Costo", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jb_listarali.setText("Listar");
        jb_listarali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_listaraliMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ventana_inventarioLayout = new javax.swing.GroupLayout(ventana_inventario.getContentPane());
        ventana_inventario.getContentPane().setLayout(ventana_inventarioLayout);
        ventana_inventarioLayout.setHorizontalGroup(
            ventana_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_inventarioLayout.createSequentialGroup()
                .addGroup(ventana_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventana_inventarioLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventana_inventarioLayout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(jb_listarali)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        ventana_inventarioLayout.setVerticalGroup(
            ventana_inventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventana_inventarioLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jb_listarali)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_listaClientes.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_listaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 240, 490));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Lista Clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Mesa 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("Mesa 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setText("Mesa 3");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 320, 80, 30));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setText("Mesa 4");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 330, -1, 20));

        pb_mesa2.setBackground(new java.awt.Color(153, 0, 0));
        pb_mesa2.setMaximum(4);
        getContentPane().add(pb_mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 230, 40));

        pb_mesa1.setBackground(new java.awt.Color(0, 0, 153));
        pb_mesa1.setForeground(new java.awt.Color(0, 0, 0));
        pb_mesa1.setMaximum(4);
        pb_mesa1.setString("\"\"");
        getContentPane().add(pb_mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 220, 40));

        pb_mesa4.setBackground(new java.awt.Color(0, 153, 0));
        pb_mesa4.setMaximum(4);
        getContentPane().add(pb_mesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 230, 40));

        pb_mesa3.setBackground(new java.awt.Color(204, 204, 0));
        pb_mesa3.setMaximum(4);
        getContentPane().add(pb_mesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 220, 40));

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

        jb_crear_cliente.setText("Crear Cliente");
        jb_crear_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crear_clienteMouseClicked(evt);
            }
        });
        getContentPane().add(jb_crear_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, 30));

        jb_eliminar_cliente.setText("Eliminar");
        jb_eliminar_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_eliminar_clienteMouseClicked(evt);
            }
        });
        getContentPane().add(jb_eliminar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 120, 30));

        jb_listar.setText("Listar Clientes");
        jb_listar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_listarMouseClicked(evt);
            }
        });
        getContentPane().add(jb_listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 110, 30));
        getContentPane().add(jl_mesa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, -1, -1));
        getContentPane().add(jl_mesa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));
        getContentPane().add(jl_mesa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, -1, -1));
        getContentPane().add(jl_mesa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, -1, -1));

        jb_inventario.setText("Inventario");
        jb_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_inventarioMouseClicked(evt);
            }
        });
        getContentPane().add(jb_inventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        hilo_hora h = new hilo_hora(jl_hora);
        Thread HH = new Thread(h);
        HH.start();
        Mesa mesa_1 = new Mesa(pb_mesa1, jl_mesa1);
        Mesa mesa_2 = new Mesa(pb_mesa2, jl_mesa2);
        Mesa mesa_3 = new Mesa(pb_mesa3, jl_mesa3);
        Mesa mesa_4 = new Mesa(pb_mesa4, jl_mesa4);
        ac.cargarArchivo();
        aa.cargarArchivo();
        ArrayList<Alimento> lista_ali = aa.getLista_alimentos();
        ArrayList<Clientes> lista_clientes_recurrentes = ac.getlista_clientes();
        hilo_administrador HA = new hilo_administrador(mesa_1, mesa_2, mesa_3, mesa_4, true, true, lista_clientes_recurrentes, lista_ali);
        HA.start();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        int unitec = 0;
        if (rb_unitec.isSelected()) {
            unitec = 1;
        }
        Clientes c = new Clientes(tf_nombre.getText(), tf_tarjeta.getText(), Integer.parseInt(tf_billetera.getText()), "", unitec);
        admin_clientes ac = new admin_clientes("./clientes.txt");
        ac.cargarArchivo();
        ac.setCliente(c);
        ac.escribirArchivo();
        tf_billetera.setText("");
        tf_nombre.setText("");
        tf_tarjeta.setText("");
        rb_unitec.setSelected(false);
    }//GEN-LAST:event_jb_agregarMouseClicked

    private void jb_crear_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crear_clienteMouseClicked
        ventana_crear.setModal(true);
        ventana_crear.pack();
        ventana_crear.setLocationRelativeTo(this);
        ventana_crear.setVisible(true);
    }//GEN-LAST:event_jb_crear_clienteMouseClicked

    private void jb_listarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_listarMouseClicked
        DefaultListModel modelolista = new DefaultListModel();
        ac.cargarArchivo();
        for (Clientes temp : ac.getlista_clientes()) {
            modelolista.addElement(temp);
        }
        jl_listaClientes.setModel(modelolista);
    }//GEN-LAST:event_jb_listarMouseClicked

    private void jb_eliminar_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_eliminar_clienteMouseClicked
        if (jl_listaClientes.getSelectedIndex() >= 0) {
            DefaultListModel modelolista = (DefaultListModel) jl_listaClientes.getModel();
            Clientes c = (Clientes) modelolista.getElementAt(jl_listaClientes.getSelectedIndex());
            ac.getlista_clientes().remove(c);
            modelolista.remove(jl_listaClientes.getSelectedIndex());
            jl_listaClientes.setModel(modelolista);
            ac.escribirArchivo();
            ac.cargarArchivo();
        }
    }//GEN-LAST:event_jb_eliminar_clienteMouseClicked

    private void jb_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_inventarioMouseClicked
        ventana_inventario.setModal(true);
        ventana_inventario.pack();
        ventana_inventario.setLocationRelativeTo(this);
        ventana_inventario.setVisible(true);
    }//GEN-LAST:event_jb_inventarioMouseClicked

    private void jb_listaraliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_listaraliMouseClicked
        aa.cargarArchivo();
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Alimento", "Tiempo", "Costo", "Cantidad"
                }
        ));
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (int i = 0; i < aa.getLista_alimentos().size(); i++) {
            Object[] row = {aa.getLista_alimentos().get(i).getNombre(), aa.getLista_alimentos().get(i).getTiempo(), aa.getLista_alimentos().get(i).getPrecio(), aa.getLista_alimentos().get(i).getCantidad()};
            modelo.addRow(row);
        }
        tabla.setModel(modelo);
    }//GEN-LAST:event_jb_listaraliMouseClicked

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
    admin_clientes ac = new admin_clientes("./clientes.txt");
    admin_alimento aa = new admin_alimento("./tablaAlimentos");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JButton jb_crear_cliente;
    private javax.swing.JButton jb_eliminar_cliente;
    private javax.swing.JButton jb_inventario;
    private javax.swing.JButton jb_listar;
    private javax.swing.JButton jb_listarali;
    private javax.swing.JLabel jl_hora;
    private javax.swing.JList<String> jl_listaClientes;
    private javax.swing.JLabel jl_mesa1;
    private javax.swing.JLabel jl_mesa2;
    private javax.swing.JLabel jl_mesa3;
    private javax.swing.JLabel jl_mesa4;
    private javax.swing.JProgressBar pb_mesa1;
    private javax.swing.JProgressBar pb_mesa2;
    private javax.swing.JProgressBar pb_mesa3;
    private javax.swing.JProgressBar pb_mesa4;
    private javax.swing.JRadioButton rb_unitec;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tf_billetera;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_tarjeta;
    private javax.swing.JDialog ventana_crear;
    private javax.swing.JDialog ventana_inventario;
    // End of variables declaration//GEN-END:variables
}
