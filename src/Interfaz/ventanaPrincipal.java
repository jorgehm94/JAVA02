/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.Container;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author alumno
 */
public class ventanaPrincipal extends javax.swing.JFrame {
    
    GregorianCalendar fecha = new GregorianCalendar(1994, 8, 26);

    public ventanaPrincipal() {
       
        initComponents();
         jMenuItem1.setEnabled(false);  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBienvenida1 = new Interfaz.panelBienvenida();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(java.awt.Color.orange);

        panelBienvenida1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setText("Jorge Herrera Molina");

        jLabel3.setText("Sergio Ruiz Romero");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Programa de gestión con diseño grafico");

        javax.swing.GroupLayout panelBienvenida1Layout = new javax.swing.GroupLayout(panelBienvenida1);
        panelBienvenida1.setLayout(panelBienvenida1Layout);
        panelBienvenida1Layout.setHorizontalGroup(
            panelBienvenida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenida1Layout.createSequentialGroup()
                .addGroup(panelBienvenida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBienvenida1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelBienvenida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(panelBienvenida1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelBienvenida1Layout.setVerticalGroup(
            panelBienvenida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenida1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(5, 5, 5))
        );

        jMenuBar2.setBackground(new java.awt.Color(102, 0, 0));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu2.setText("Menu");

        jMenuItem1.setText("Bienvenida");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator2);

        jMenuItem3.setText("Dar de alta");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator4);

        jMenuItem4.setText("Visualizar datos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBienvenida1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBienvenida1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        panelAlta panelAlta1 = new Interfaz.panelAlta();
        
        // Activar el boton de VisualizarDatos
        jMenuItem4.setEnabled(true);
         
         // Desactivar el boton de Dar de alta
         jMenuItem3.setEnabled(false);  
         
         // Activar el boton de Bienvenida
         jMenuItem1.setEnabled(true); 
         
        // Activar panel
        this.setContentPane(panelAlta1);
        this.pack();
        //********************************
        
        //this.jMenuItem3.setVisible(false);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       // Desactivar el boton de VisualizarDatos
        jMenuItem4.setEnabled(false);
         
         // Activar el boton de Dar de alta
         jMenuItem3.setEnabled(true);  
         
         // Activar el boton de Bienvenida
         jMenuItem1.setEnabled(true); 
         
        this.setContentPane(new panelVisualizar());
        this.pack();
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       // Activar el boton de VisualizarDatos
        jMenuItem4.setEnabled(true);
         
         // Activar el boton de Dar de alta
         jMenuItem3.setEnabled(true);  
         
         // Desactivar el boton de Bienvenida
         jMenuItem1.setEnabled(false); 
        this.setContentPane(panelBienvenida1);
        this.pack();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private Interfaz.panelBienvenida panelBienvenida1;
    // End of variables declaration//GEN-END:variables
}
