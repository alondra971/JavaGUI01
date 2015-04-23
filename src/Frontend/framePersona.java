/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frontend;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LUIS MILLER
 */
public class framePersona extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public framePersona() {
      initComponents();
      
    modelo = new DefaultTableModel ();
    modelo.addColumn("Apellido");
    modelo.addColumn("Nombre");
    modelo.addColumn("DNI");
    modelo.addColumn("Telefono");
    modelo.addColumn("Direccion");
    
    this.tablePersona.setModel(modelo);
    
    }
 /* private void bloquearcontroles() {
      
    TextApe.setEnabled(false);
    Texnombre.setEnabled(false);
    TextDNI.setEnabled(false);
    TextTelefono.setEnabled(false);
    TextDireccion.setEnabled(false);
    BnNuevo.setEnabled(false);
    BnGuardar.setEnabled(false);
    DatosPersonales.setEnabled(false);
    BnGuardar.setEnabled(false);
    BnNuevo.setEnabled(true);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatosPersonales = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TextDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TextApe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextDireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Texnombre = new javax.swing.JTextField();
        Tabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablePersona = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        BnNuevo = new javax.swing.JButton();
        BnGuardar = new javax.swing.JButton();
        BnCancelar = new javax.swing.JButton();
        Opciones = new javax.swing.JPanel();
        BnEditar = new javax.swing.JButton();
        BnEliminar = new javax.swing.JButton();
        BnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Personales"));
        DatosPersonales.setLayout(null);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("  Apellidos:");
        DatosPersonales.add(jLabel4);
        jLabel4.setBounds(0, 20, 100, 20);

        TextDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDNIActionPerformed(evt);
            }
        });
        DatosPersonales.add(TextDNI);
        TextDNI.setBounds(100, 100, 100, 25);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("  D.N.I:");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DatosPersonales.add(jLabel1);
        jLabel1.setBounds(0, 100, 100, 20);

        TextApe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextApeActionPerformed(evt);
            }
        });
        DatosPersonales.add(TextApe);
        TextApe.setBounds(100, 20, 100, 25);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telefono");
        DatosPersonales.add(jLabel5);
        jLabel5.setBounds(0, 140, 100, 20);

        TextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefonoActionPerformed(evt);
            }
        });
        DatosPersonales.add(TextTelefono);
        TextTelefono.setBounds(100, 140, 100, 25);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Direccion");
        DatosPersonales.add(jLabel3);
        jLabel3.setBounds(0, 180, 100, 20);

        TextDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDireccionActionPerformed(evt);
            }
        });
        DatosPersonales.add(TextDireccion);
        TextDireccion.setBounds(100, 180, 100, 25);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LUIS MILLER\\Pictures\\senin_modo.jpg")); // NOI18N
        DatosPersonales.add(jButton1);
        jButton1.setBounds(250, 10, 150, 190);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Nombre");
        DatosPersonales.add(jLabel8);
        jLabel8.setBounds(0, 60, 100, 20);

        Texnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexnombreActionPerformed(evt);
            }
        });
        DatosPersonales.add(Texnombre);
        Texnombre.setBounds(100, 60, 100, 25);

        getContentPane().add(DatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 200));

        Tabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));
        Tabla.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Tabla.add(jScrollPane1);
        jScrollPane1.setBounds(10, 340, 378, 120);

        tablePersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablePersona);

        Tabla.add(jScrollPane2);
        jScrollPane2.setBounds(0, 10, 390, 100);

        getContentPane().add(Tabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 390, 110));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opcion"));
        jPanel3.setLayout(null);

        BnNuevo.setText("Nuevo");
        BnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnNuevoActionPerformed(evt);
            }
        });
        jPanel3.add(BnNuevo);
        BnNuevo.setBounds(6, 16, 63, 23);

        BnGuardar.setText("Guardar");
        BnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(BnGuardar);
        BnGuardar.setBounds(165, 16, 71, 23);

        BnCancelar.setText("Cancelar");
        BnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(BnCancelar);
        BnCancelar.setBounds(309, 16, 75, 23);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        Opciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        Opciones.setLayout(null);

        BnEditar.setText("Editar");
        Opciones.add(BnEditar);
        BnEditar.setBounds(20, 30, 61, 23);

        BnEliminar.setText("Eliminar");
        BnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnEliminarActionPerformed(evt);
            }
        });
        Opciones.add(BnEliminar);
        BnEliminar.setBounds(90, 30, 69, 23);

        BnSalir.setText("Salir");
        BnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnSalirActionPerformed(evt);
            }
        });
        Opciones.add(BnSalir);
        BnSalir.setBounds(320, 30, 53, 23);

        getContentPane().add(Opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDNIActionPerformed
        // TODO add your handling code here:
        TextDNI.transferFocus();
    }//GEN-LAST:event_TextDNIActionPerformed

    private void TextApeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextApeActionPerformed
        // TODO add your handling code here:
        TextApe.transferFocus();
    }//GEN-LAST:event_TextApeActionPerformed

    private void TextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDireccionActionPerformed
        // TODO add your handling code here:
        TextDireccion.transferFocus();
    }//GEN-LAST:event_TextDireccionActionPerformed

    private void BnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnNuevoActionPerformed
        // TODO add your handling code here:
       limpiarcontroles ();
    }//GEN-LAST:event_BnNuevoActionPerformed

    private void BnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnCancelarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_BnCancelarActionPerformed

    private void BnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnEliminarActionPerformed
        // TODO add your handling code here:
        
     int filaseleccionada = tablePersona.getSelectedRow();
     if(filaseleccionada>=0){
         modelo.removeRow(filaseleccionada);
     }
     else {
         JOptionPane.showMessageDialog(null, "Tabla vacia o no seleciono ninguna fila", "Error", JOptionPane.WARNING_MESSAGE, null);
     }
    }//GEN-LAST:event_BnEliminarActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        limpiarcontroles();
        colorcontroles ();
    }//GEN-LAST:event_formWindowOpened

    private void BnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnGuardarActionPerformed
        // TODO add your handling code here:
        String [] datos = new String [5];
        datos[0]=TextApe.getText();
        TextApe.setText(null);
        datos[1]=Texnombre.getText();
        Texnombre.setText(null);
        datos[2]=TextDNI.getText();
        TextDNI.setText(null);
        datos[3]=TextTelefono.getText();
        TextTelefono.setText(null);
        datos[4]=TextDireccion.getText();
        TextDireccion.setText(null);
        
        modelo.addRow(datos);
    }//GEN-LAST:event_BnGuardarActionPerformed

    private void TexnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexnombreActionPerformed
        // TODO add your handling code here:
        Texnombre.transferFocus();
    }//GEN-LAST:event_TexnombreActionPerformed

    private void TextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefonoActionPerformed
        // TODO add your handling code here:
        TextTelefono.transferFocus();
    }//GEN-LAST:event_TextTelefonoActionPerformed

    private void BnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(framePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BnCancelar;
    private javax.swing.JButton BnEditar;
    private javax.swing.JButton BnEliminar;
    private javax.swing.JButton BnGuardar;
    private javax.swing.JButton BnNuevo;
    private javax.swing.JButton BnSalir;
    private javax.swing.JPanel DatosPersonales;
    private javax.swing.JPanel Opciones;
    private javax.swing.JPanel Tabla;
    private javax.swing.JTextField Texnombre;
    private javax.swing.JTextField TextApe;
    private javax.swing.JTextField TextDNI;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablePersona;
    // End of variables declaration//GEN-END:variables

    private void limpiarcontroles() {
    
    this.TextApe.setText("");
    this.Texnombre.setText("");
    this.TextDNI.setText("");
    this.TextTelefono.setText("");
    this.TextDireccion.setText("");
    }

    private void colorcontroles() {
    
    this.TextApe.setBackground(Color.red);
    this.Texnombre.setBackground(Color.red);
    this.TextDNI.setBackground(Color.red);
    this.TextTelefono.setBackground(Color.red);
    this.TextDireccion.setBackground(Color.red);
    }

    

   /* private void desbloquearcontroles() {
     
    TextApe.setEnabled(true);
    Texnombre.setEnabled(true);
    TextDNI.setEnabled(true);
    TextTelefono.setEnabled(true);
    TextDireccion.setEnabled(true);
    BnNuevo.setEnabled(false);
    BnGuardar.setEnabled(true);
    }*/
}
