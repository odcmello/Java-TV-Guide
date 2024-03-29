/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Main.globalVariablesLists;
import Model.Canal;
import Model.Intervalo;
import View.Resources.ButtonColumn;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Otávio
 */
public class guiaHorariosVer extends javax.swing.JPanel {

    /**
     * Creates new form guiaHorariosVer
     */
    public guiaHorariosVer() {
        Action delete = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                int modelRow = Integer.valueOf(e.getActionCommand());
                String programaNome = jTable1.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),0).toString();
                Integer numeroCanal = Integer.valueOf(jTable1.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),1).toString());
                LocalDate data = LocalDate.parse(jTable1.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),2).toString());
                LocalTime inicio = LocalTime.parse(jTable1.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),3).toString());
                LocalTime fim = LocalTime.parse(jTable1.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),4).toString());
                ((DefaultTableModel) jTable1.getModel()).removeRow(modelRow);
                if(Control.intervaloController.removerIntervalo(programaNome,numeroCanal,data,inicio,fim)){
                    JOptionPane.showMessageDialog(null, "Programa removido com sucesso da grade de horários.");
                } else {
                    JOptionPane.showMessageDialog(null, "Programa não pôde ser removido da grade de horários.");
                }             
            }
        };
        initComponents();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (Intervalo i : globalVariablesLists.intervalosTV) {
            model.addRow(new Object[]{i.getProgramaPassando().getNome(), i.getCanalPassando().getNumeroCanal(), i.getData(), i.getInicio(), i.getFim(), "Remover"});
        }
        ButtonColumn buttonColumn = new ButtonColumn(jTable1, delete, 5);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Programa", "Numero do Canal", "Data", "Hora de Inicio", "Hora de Fim", " "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Guia de Horarios Programação");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jButton1.setText("Adicionar Programa na Programação");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 325, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        guiaHorariosAdd guiaAdd = new guiaHorariosAdd();
        frame.setContentPane(guiaAdd);
        frame.setSize(frame.getWidth(), 300);
        frame.invalidate();
        frame.validate();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
