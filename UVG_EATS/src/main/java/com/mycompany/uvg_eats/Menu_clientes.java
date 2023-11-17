/*ea
/**
 *
 * @author ferna
 */
package com.mycompany.uvg_eats;

import javax.swing.JOptionPane;

public class Menu_clientes extends javax.swing.JFrame {

    /**
     * Creates new form Menu_clientes
     */
    public Menu_clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbl1MC = new javax.swing.JLabel();
        cBoxOpcion = new javax.swing.JComboBox<>();
        jLbl2MC = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLbl1MC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLbl1MC.setText("Bienvenido al Menu Clientes");

        cBoxOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1. Solicitar pedido inmediato" }));
        cBoxOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxOpcionActionPerformed(evt);
            }
        });

        jLbl2MC.setText("Eliga la opcion que desea ejecutar");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLbl1MC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(26, 26, 26)
                        .addComponent(btnSalir))
                    .addComponent(jLbl2MC))
                .addGap(26, 26, 26)
                .addComponent(cBoxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLbl1MC, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbl2MC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int opcion = cBoxOpcion.getSelectedIndex();
        
        switch (opcion){
            case 0: 
                JOptionPane.showMessageDialog(this, "Por favor, seleccione una opcion valida.", "Seleccion Invalida", JOptionPane.ERROR_MESSAGE);
                break;
            case 1: //solicitar pedido inmediato
                SubMenuClientes1 subMenu = new SubMenuClientes1();
                subMenu.setVisible(true);
                this.setVisible(false);
                break;
            case 2: //Cancelar pedido
                // Codigo para cancelar el pedido
                break;
            case 3: //Confirmar entrega del pedido
                SubMenuClientes2 subMenu2 = new SubMenuClientes2();
                subMenu2.setVisible(true);
                this.setVisible(false);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Opcion no reconocida.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cBoxOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxOpcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxOpcionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Menu_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cBoxOpcion;
    private javax.swing.JLabel jLbl1MC;
    private javax.swing.JLabel jLbl2MC;
    // End of variables declaration//GEN-END:variables
}
