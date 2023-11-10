/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uvg_eats;

import clases.FoodCourtUVG;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/**
 *
 * @author javie
 */
public class SubMenuInicioSesion extends javax.swing.JFrame {
    String[] restaurantes;
    //Menu_Usuario menuPadre;
    /**
     * Creates new form Menu_Usuario
     */
    public SubMenuInicioSesion() {
        initComponents();
        
    }
    
    public void setRestaurantesDeMenu(String[] restaurantes){
        if(this.restaurantes != null){
            this.restaurantes = null;
        }
        
        this.restaurantes = restaurantes;
        
        String[] array = FoodCourtUVG.getInstance().mostrarRestaurantesParaMenu().split(";");
        for(String cosa : restaurantes){
            System.out.println(cosa);
        }
    }
    
    /*public void setMenuPadre(Menu_Usuario menuPadre){
        this.menuPadre = menuPadre;
    }*/
    
    /*public SubMenuUsuario1(){
        initComponents();
    }*/

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
        btn_aceptar = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        cBoxTUsuario = new javax.swing.JComboBox<>();
        lbl7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl1.setText("Ingrese sus datos para crear su usuario");

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl2.setText("ID");

        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        btn2.setText("Salir");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        cBoxTUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1. Cliente", "2. Repartidor", "3. Proveedor" }));
        cBoxTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxTUsuarioActionPerformed(evt);
            }
        });

        lbl7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl7.setText("Tipo de usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(cBoxTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_aceptar)
                        .addGap(84, 84, 84)
                        .addComponent(btn2)
                        .addGap(153, 153, 153))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl7)
                    .addComponent(cBoxTUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(btn2))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        if(cBoxTUsuario.getSelectedIndex() == -1 || cBoxTUsuario.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Seleccione un tipo de usuario para iniciar sesión", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(txt_id.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Todos los campos deben estar llenos para continuar", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int id = -1;
            try{
                id = Integer.parseInt(txt_id.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Asegúre que id se un valor numérico entero", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
            }
            
            try{
                System.out.println((cBoxTUsuario.getSelectedIndex()) + "  HIIIIII");
                String mensaje = FoodCourtUVG.getInstance().iniciarUsuario(id, (cBoxTUsuario.getSelectedIndex()));
                System.out.println(mensaje);
                if(mensaje.contains("No se ha encontrado ningún usuario con el id")){
                    JOptionPane.showMessageDialog(null,mensaje, "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                }
                else if(mensaje.equals("")){
                    JOptionPane.showMessageDialog(null,"Aún no se ha ingresado ningún usuario", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null,mensaje, "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                    try{
                        if((cBoxTUsuario.getSelectedIndex()) == 1){
                            Menu_clientes menu_cliente = new Menu_clientes();
                            menu_cliente.setVisible(true);
                            dispose();
                        }else if((cBoxTUsuario.getSelectedIndex()) == 2){

                        }else if(cBoxTUsuario.getSelectedIndex() == 3){
                            if(FoodCourtUVG.getInstance().getIdRestProveedor() == -1){
                                JOptionPane.showMessageDialog(null,"Ha ocurrido un error tratando de seleccionar el restaurante del proveedor", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                            }else{
                                FoodCourtUVG.getInstance().iniciarRest(FoodCourtUVG.getInstance().getIdRestProveedor());
                                Menú_proveedores menu_proveedor = new Menú_proveedores();
                                menu_proveedor.setVisible(true);
                                dispose();
                            }
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString(), "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error tratando de realizar la operación. Error: " + e.toString(), "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void cBoxTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxTUsuarioActionPerformed
        
        
               
               
        
    }//GEN-LAST:event_cBoxTUsuarioActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        dispose();
    }//GEN-LAST:event_btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(SubMenuInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubMenuInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubMenuInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubMenuInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubMenuInicioSesion().setVisible(true);
                
            }
        });
    }
    
    //@Override
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JComboBox<String> cBoxTUsuario;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl7;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
