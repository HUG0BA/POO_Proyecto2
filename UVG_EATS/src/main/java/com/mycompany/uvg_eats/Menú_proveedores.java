/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.uvg_eats;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clases.FoodCourtUVG;


/**
 *
 * @author Fercho
 */
public class Menú_proveedores extends JFrame {
    
    private JPanel agregarProductoPanel, eliminarProductoPanel;
    private JTextField idProductoField, nombreProductoField, detallesProductoField, costoProductoField, idEliminarProductoField;
    private JCheckBox disponibleCheckBox;
    /**
     * Creates new form Menú_proveedores
     */
    public Menú_proveedores() {
        initComponents();
        postInitComponents();
        setupAgregarProductoPanel();
        setupEliminarProductoPanel();
        
        agregarProductoPanel.setBounds(100, 100, 300, 200);
        eliminarProductoPanel.setBounds(100, 100, 300, 200);
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
        btn1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl2 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));

        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl1.setText("¡Bienvenido al menú de proveedores!");

        btn1.setText("Aceptar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Agregar producto", "2. Eliminar producto", "3. Modificar disponibilidad del restaurante" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl2.setText("Elige la acción deseada:");

        btn2.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn2)
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void postInitComponents(){
        setupAgregarProductoPanel();
        
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
    }
    
    private void setupAgregarProductoPanel(){
        agregarProductoPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        agregarProductoPanel.setBorder(BorderFactory.createTitledBorder("Agregar Producto: "));
        agregarProductoPanel.setBackground(Color.CYAN);
        
        
        agregarProductoPanel.add(new JLabel("ID del producto: "));
        idProductoField = new JTextField(10);
        idProductoField.setFont(new Font("SansSerif", Font.PLAIN, 8));
        agregarProductoPanel.add(idProductoField);
        
        agregarProductoPanel.add(new JLabel("Nombre: "));
        nombreProductoField = new JTextField (10);
        nombreProductoField.setFont(new Font("SansSerif", Font.PLAIN, 8));
        agregarProductoPanel.add(nombreProductoField);
        
        agregarProductoPanel.add(new JLabel("Detalles: "));
        detallesProductoField = new JTextField(10);
        detallesProductoField.setFont(new Font("SansSerif", Font.PLAIN, 8));
        agregarProductoPanel.add(detallesProductoField);
        
        agregarProductoPanel.add(new JLabel("Costo: "));
        costoProductoField = new JTextField(10);
        costoProductoField.setFont(new Font("SansSerif", Font.PLAIN, 8));
        agregarProductoPanel.add(costoProductoField);
        
        disponibleCheckBox = new JCheckBox("Disponible");
        agregarProductoPanel.add(new JLabel("Disponible: "));
        agregarProductoPanel.add(disponibleCheckBox);
        
        JButton agregarButton = new JButton ("Agregar");
        agregarButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               agregarProductomp();
           } 
        });
        agregarProductoPanel.add(agregarButton);
        
        agregarProductoPanel.setVisible(false);
        
        getContentPane().add(agregarProductoPanel, BorderLayout.CENTER);
        
    }
    private void setupEliminarProductoPanel(){
        eliminarProductoPanel = new JPanel();
        eliminarProductoPanel.setBorder(BorderFactory.createTitledBorder("Eliminar producto: "));
        eliminarProductoPanel.setBackground(Color.ORANGE);
        
        eliminarProductoPanel.add(new JLabel("ID del producto a eliminar: "));
        idEliminarProductoField = new JTextField(10);
        eliminarProductoPanel.add(idEliminarProductoField);
        
        JButton eliminarButton = new JButton("Eliminar");
        eliminarButton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              try {
                  int idProducto = Integer.parseInt(idEliminarProductoField.getText());
                  FoodCourtUVG.getInstance().eliminarProducto(idProducto);
                  JOptionPane.showMessageDialog(Menú_proveedores.this, "Producto eliminado exitosamente.");
              }catch (NumberFormatException ex){
                  JOptionPane.showMessageDialog(Menú_proveedores.this, "Por favor, ingrese un valor numérico.");
              }catch (Exception ex) {
                  JOptionPane.showMessageDialog(Menú_proveedores.this, "Error al eliminar el producto" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
              }
          }  
        });
        eliminarProductoPanel.add(eliminarButton);
        eliminarProductoPanel.setVisible(false);
        getContentPane().add(eliminarProductoPanel, BorderLayout.CENTER);
    }
    private void aceptarActionPerformed(ActionEvent evt) {
        System.out.println("El botón aceptar fue presionado.");
        int selectedIndex = jComboBox1.getSelectedIndex();
        if (selectedIndex == 0) {
            System.out.println("Mostrando formulario");
            mostrarFormularioAgregarProducto();
        }else if (selectedIndex == 1) {
            mostrarFormularioEliminarProducto();
        }
    }
    
    private void mostrarFormularioAgregarProducto(){
        agregarProductoPanel.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void mostrarFormularioEliminarProducto(){
        agregarProductoPanel.setVisible(false);
        eliminarProductoPanel.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void salirActionPerformed(ActionEvent evt) {
        System.exit(0);
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    private void agregarProductomp() {
        try {
            int idProducto = Integer.parseInt(idProductoField.getText());
            String titulo = nombreProductoField.getText();
            String detalles = detallesProductoField.getText();
            double costo = Double.parseDouble(costoProductoField.getText());
            boolean disponible = disponibleCheckBox.isSelected();
            
            FoodCourtUVG.getInstance().agregarProducto(idProducto, titulo, detalles, costo, disponible);
            
            JOptionPane.showMessageDialog(this, "Producto agregado exitosamente");
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce valores válidos.");
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al agregar el producto: " + e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(Menú_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menú_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menú_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menú_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menú_proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    // End of variables declaration//GEN-END:variables
}
