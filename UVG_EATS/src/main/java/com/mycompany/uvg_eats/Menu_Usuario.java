/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uvg_eats;
import clases.*;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author javie
 */
public class Menu_Usuario extends javax.swing.JFrame {

    //FoodCourtUVG food;
    int index = -1;
    /**
     * Creates new form Menu_Usuario
     */
    public Menu_Usuario() {
        //food = new FoodCourtUVG();
        initComponents();
        this.getContentPane().setBackground(Color.green);
        labelTitulo.setVisible(false);
        txtPaneInfo.setVisible(false);
    }

    public String[] getRestaurantesArray(){
        String[] vacio = {"Aún no se han ingresado restaurantes"};
        try{
            if(!FoodCourtUVG.getInstance().existeRestaurantes()) return vacio;
        }catch(Exception e){
            
        }
        
        /*String[] array = FoodCourtUVG.getInstance().mostrarRestaurantesParaMenu().split(";");
        for(String cosa : array){
            System.out.println(cosa);
        }*/
        String[] restaurantes;
        try{
            restaurantes = FoodCourtUVG.getInstance().mostrarRestaurantesParaMenu().split(";");
            return restaurantes;
        }catch(Exception e){
            
        }
        
        return null;
    }
    
    public String[] getRestaurantesIndex(){
        String[] vacio = {"Aún no se han ingresado restaurantes"};
        try{
            if(!FoodCourtUVG.getInstance().existeRestaurantes()) return vacio;
        }catch(Exception e){
            
        }
        
        /*String[] array = FoodCourtUVG.getInstance().mostrarRestaurantesParaMenu().split(";");
        for(String cosa : array){
            System.out.println(cosa);
        }*/
        String[] restaurantes;
        try{
            restaurantes = FoodCourtUVG.getInstance().obtenerIndexRestaurantesMenu().split(";");
            return restaurantes;
        }catch(Exception e){
            
        }
        
        return null;
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
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        comboBoxUsuario = new javax.swing.JComboBox<>();
        scroll_pane_text = new javax.swing.JScrollPane();
        txtPaneInfo = new javax.swing.JTextPane();
        labelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl1.setText("¡Bienvenido al menú de FoodCourtUVG!");

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl2.setText("Elige la acción deseada:");

        btn1.setText("Aceptar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("Salir");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        comboBoxUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar Usuario", "Iniciar Sesión", "Mostrar Clientes", "Mostrar Repartidores", "Mostrar proveedores", "Agregar Restaurante", "Mostrar Restaurante", "Guardar Usuarios", "Guardar Restaurantes" }));
        comboBoxUsuario.setToolTipText("");
        comboBoxUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxUsuarioActionPerformed(evt);
            }
        });

        scroll_pane_text.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll_pane_text.setViewportView(txtPaneInfo);

        labelTitulo.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoUVG.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scroll_pane_text, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btn1)
                                            .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(comboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(comboBoxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(scroll_pane_text, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        switch (index){
            case 0:
                labelTitulo.setVisible(false);
                txtPaneInfo.setVisible(false);
                SubMenuUsuario1 subClientes1 = new SubMenuUsuario1();
                //subClientes1.setMenuPadre(this);
                subClientes1.setVisible(true);
                subClientes1.setRestaurantesDeMenu(getRestaurantesArray(), getRestaurantesIndex());
                //this.setVisible(false);
                break;
            case 1:
                labelTitulo.setVisible(false);
                txtPaneInfo.setVisible(false);
                SubMenuInicioSesion menuSesion = new SubMenuInicioSesion();
                menuSesion.setVisible(true);
                break;
            case 2:
                labelTitulo.setText("Clientes regitrados");
                try{
                    txtPaneInfo.setText(FoodCourtUVG.getInstance().mostrarClientes());
                }catch(Exception e){
                    
                }
                
                labelTitulo.setVisible(true);
                txtPaneInfo.setVisible(true);
                break;
            case 3:
                labelTitulo.setText("Repartidores regitrados");
                try{
                   txtPaneInfo.setText(FoodCourtUVG.getInstance().mostrarRepartidores()); 
                }catch(Exception e){
                    
                }
                
                labelTitulo.setVisible(true);
                txtPaneInfo.setVisible(true);
                break;
            case 4:
                labelTitulo.setText("Proveedores regitrados");
                try{
                    txtPaneInfo.setText(FoodCourtUVG.getInstance().mostrarProveedores());
                }catch(Exception e){
                    
                }
                
                labelTitulo.setVisible(true);
                txtPaneInfo.setVisible(true);
                break;
            case 5:
                labelTitulo.setVisible(false);
                txtPaneInfo.setVisible(false);
                SubMenuRestaurante subRestaurante = new SubMenuRestaurante();
                subRestaurante.setVisible(true);
                break;
            case 6:
                labelTitulo.setText("Restaurantes regitrados");
                try{
                    txtPaneInfo.setText(FoodCourtUVG.getInstance().mostrarRestaurantes());
                }catch(Exception e){
                    
                }
                
                labelTitulo.setVisible(true);
                txtPaneInfo.setVisible(true);
                break;
            case 7:
                try{
                   boolean exito = FoodCourtUVG.getInstance().guardarUsuarios();
                   if(exito){
                       JOptionPane.showMessageDialog(null,"Usuarios guardados exitosamente", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                   }else{
                       JOptionPane.showMessageDialog(null,"Asegúrese de ingresar usuarios antes de realizar la operación", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                   }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al guardar los usuarios. Error: " + e.toString(), "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                }
                
                break;
                
            case 8:
                try{
                   boolean exito = FoodCourtUVG.getInstance().guardarRestaurantes(); 
                   if(exito){
                       JOptionPane.showMessageDialog(null,"Restaurantes guardados exitosamente", "¡Exito!", JOptionPane.INFORMATION_MESSAGE);
                   }else{
                       JOptionPane.showMessageDialog(null,"Asegúrese de ingresar restaurantes antes de realizar la operación", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                   }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al guardar los restaurantes. Error: " + e.toString(), "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                }
                
                break;
            default:
                JOptionPane.showMessageDialog(null,"Ingrese una opción válida", "¡Alerta!", JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void comboBoxUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxUsuarioActionPerformed
        index = comboBoxUsuario.getSelectedIndex();
        
        
    }//GEN-LAST:event_comboBoxUsuarioActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox<String> comboBoxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JScrollPane scroll_pane_text;
    private javax.swing.JTextPane txtPaneInfo;
    // End of variables declaration//GEN-END:variables
}
