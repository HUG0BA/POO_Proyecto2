/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uvg_eats;

import javax.swing.JOptionPane;
import clases.*;

/**
 *
 * @author javie
 */
public class Menu_Repartidor extends javax.swing.JFrame {
    String[] pedidosMenu;
    String[] infoPedidosMenu;
    String[] indexPedidos;
    
    /**
     * Creates new form Menu_Repartidor
     */
    public Menu_Repartidor() {
        initComponents();
        labelPedido.setVisible(false);
        cBoxPedidos.setVisible(false);
        btnAceptar.setVisible(false);
        txtAreaPedidos.setVisible(false);
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        cBoxOpcion = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        labelPedido = new javax.swing.JLabel();
        cBoxPedidos = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPedidos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl1.setText("¡Bienvenido al menú de repartidor!");

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl2.setText("Elige la opción deseada.");

        cBoxOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar opción", "Buscar pedidos disponibles", "Cancelar pedido", "Mostrar pedidos entregados" }));
        cBoxOpcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxOpcionActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar pedido");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        labelPedido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelPedido.setText("Pedidos disponibles");

        cBoxPedidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar opción", "Buscar pedidos disponibles", "Cancelar pedido", "Mostrar pedidos entregados" }));
        cBoxPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPedidosActionPerformed(evt);
            }
        });

        txtAreaPedidos.setEditable(false);
        txtAreaPedidos.setColumns(20);
        txtAreaPedidos.setRows(5);
        jScrollPane2.setViewportView(txtAreaPedidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl2)
                    .addComponent(labelPedido))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cBoxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cBoxPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lbl1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(cBoxOpcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPedido)
                    .addComponent(cBoxPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try{
            int idPedido = Integer.parseInt(indexPedidos[cBoxPedidos.getSelectedIndex()]);
            FoodCourtUVG.getInstance().asignarRepartidor(idPedido);
            JOptionPane.showMessageDialog(null,"Pedido asignado", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }catch(Exception e){

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cBoxOpcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxOpcionActionPerformed
        int index = cBoxOpcion.getSelectedIndex();
        
        switch(index){
            case 1:
                try{
                    if(FoodCourtUVG.getInstance().isRepartidorAOcupado()){
                        JOptionPane.showMessageDialog(null,"¡Solo puede repardir un producto a la vez!", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        if(pedidosMenu != null || infoPedidosMenu != null){
                            pedidosMenu = null;
                            infoPedidosMenu = null;
                        }
                        pedidosMenu = FoodCourtUVG.getInstance().obtenerPedidosMenu();
                        infoPedidosMenu = FoodCourtUVG.getInstance().obtenerInfoPedidosMenu();
                        cBoxPedidos.setModel(new javax.swing.DefaultComboBoxModel(pedidosMenu));
                        indexPedidos = new String[pedidosMenu.length];
                        int i = 0;
                        for(String s : pedidosMenu){
                            String requiredString = s.substring(s.indexOf("¡") + 1, s.indexOf("!"));
                            indexPedidos[i] = requiredString;
                            i++;
                        }
                        
                        txtAreaPedidos.setVisible(true);
                        labelPedido.setVisible(true);
                        cBoxPedidos.setVisible(true);
                        btnAceptar.setVisible(true);
                    }
                }catch(Exception e){
                    
                }
                
                
                break;
            
            case 2:
                try{
                    if(FoodCourtUVG.getInstance().isRepartidorAOcupado()){
                        FoodCourtUVG.getInstance().cancelarRepartidor();
                        JOptionPane.showMessageDialog(null,"¡Pedido cancelado!", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"¡No tiene ningún encargo que cancelar!", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(Exception e){
                    
                }
                labelPedido.setVisible(false);
                cBoxPedidos.setVisible(false);
                btnAceptar.setVisible(false);
                
                
                break;
                
            case 3:
                try{
                    String text = FoodCourtUVG.getInstance().mostrarPedidosEntregadosRepartidor();
                    txtAreaPedidos.setText(text);
                }catch(Exception e){
                    
                }
                txtAreaPedidos.setVisible(true);
                labelPedido.setVisible(false);
                cBoxPedidos.setVisible(false);
                btnAceptar.setVisible(false);
                
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Seleccione una opción por favor", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }//GEN-LAST:event_cBoxOpcionActionPerformed

    private void cBoxPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPedidosActionPerformed
        int index = cBoxPedidos.getSelectedIndex();
        txtAreaPedidos.setText(infoPedidosMenu[index]);
    }//GEN-LAST:event_cBoxPedidosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Repartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cBoxOpcion;
    private javax.swing.JComboBox<String> cBoxPedidos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelPedido;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JTextArea txtAreaPedidos;
    // End of variables declaration//GEN-END:variables
}
