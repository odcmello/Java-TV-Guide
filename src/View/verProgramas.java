package View;

import View.Resources.ButtonColumn;
import Main.globalVariablesLists;
import Model.Filme;
import Model.Outro;
import Model.Serie;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class verProgramas extends javax.swing.JPanel {

    public verProgramas() {
        initComponents();                
        
        Action deleteFilme = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                int modelRow = Integer.valueOf(e.getActionCommand());
                Integer idFilme = Integer.valueOf(jTableFilme.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),0).toString());
                ((DefaultTableModel) jTableFilme.getModel()).removeRow(modelRow);                
                
                if(Control.filmeController.removerFilme(idFilme)){
                        JOptionPane.showMessageDialog(null, "filme removido com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao remover");
                }             
            }  
        };
          
        Action deleteSerie = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                int modelRow = Integer.valueOf(e.getActionCommand());
                Integer idSerie = Integer.valueOf(jTableSerie.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),0).toString());
                ((DefaultTableModel) jTableSerie.getModel()).removeRow(modelRow);                
                
                if(Control.serieController.removerSerie(idSerie)){
                        JOptionPane.showMessageDialog(null, "serie removida com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao remover");
                }             
            }  
        };
        
        
        Action deleteOutros = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                int modelRow = Integer.valueOf(e.getActionCommand());
                Integer idOutro = Integer.valueOf(jTableOutros.getModel().getValueAt(Integer.valueOf(e.getActionCommand()),0).toString());
                ((DefaultTableModel) jTableOutros.getModel()).removeRow(modelRow);                
                
                if(Control.outroController.removerOutros(idOutro)){
                        JOptionPane.showMessageDialog(null, "programa removido com sucesso.");
                }else{
                    JOptionPane.showMessageDialog(null, "Houve um erro ao remover");
                }             
            }  
        };
        
        
        Action telaFilmes = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
               DetalhesFilme d = new DetalhesFilme(null,true);
               d.setVisible(true);
            }
        };
        
        
        Action telaSerie = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
               DetalhesSerie d = new DetalhesSerie(null,true);
               d.setVisible(true);
            }
        };
        
        
        Action telaOutro = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
               DetalhesOutro d = new DetalhesOutro(null,true);
               d.setVisible(true);
            }
        };
        
                
        DefaultTableModel modelfilme = (DefaultTableModel) jTableFilme.getModel();
        DefaultTableModel modelserie = (DefaultTableModel) jTableSerie.getModel();
        DefaultTableModel modelOutro = (DefaultTableModel) jTableOutros.getModel();
        
        for (Filme f : globalVariablesLists.filmesTV){
            modelfilme.addRow(new Object[]{f.getIdPrograma(),f.getNome(),"Remover","Ver Detalhes"});
        }
        
        for (Serie s : globalVariablesLists.seriesTV){
            modelserie.addRow(new Object[]{s.getIdPrograma(),s.getNome(),s.getTemporada(),s.getNumeroEpisodios(),"Remover","Ver Detalhes"});
        }
        
        for (Outro o : globalVariablesLists.outrosTV){
            modelOutro.addRow(new Object[]{o.getIdPrograma(),o.getNome(),"Remover","Ver Detalhes"});
        }
        
        ButtonColumn excluirFilme = new ButtonColumn(jTableFilme, deleteFilme, 2);
        excluirFilme.setMnemonic(KeyEvent.VK_D);
        
        ButtonColumn excluirSerie = new ButtonColumn(jTableSerie, deleteSerie, 4);
        excluirSerie.setMnemonic(KeyEvent.VK_D);
        
        ButtonColumn excluirOutro = new ButtonColumn(jTableOutros, deleteOutros, 2);
        excluirOutro.setMnemonic(KeyEvent.VK_D);
        
        // botoes ver mais                        
        
        ButtonColumn detalhesFilme = new ButtonColumn(jTableFilme,telaFilmes, 3);
        detalhesFilme.setMnemonic(KeyEvent.VK_D);
        
        ButtonColumn detalhesSerie = new ButtonColumn(jTableSerie, telaSerie, 5);
        detalhesSerie.setMnemonic(KeyEvent.VK_D);
        
        ButtonColumn detalhesOutro = new ButtonColumn(jTableOutros, telaOutro, 3);
        detalhesOutro.setMnemonic(KeyEvent.VK_D);
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NomeDaSerie = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFilme = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSerie = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOutros = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Visualizar Canais Disponíveis");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTableFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero do filme", "Nome do Filme", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableFilme);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Visualizar Programas Disponíveis");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Filmes");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Séries");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTableSerie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero da Serie", "Nome da Serie", "Temporadas", "Numero de Epsodios", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableSerie);
        if (jTableSerie.getColumnModel().getColumnCount() > 0) {
            jTableSerie.getColumnModel().getColumn(0).setResizable(false);
            jTableSerie.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Outros");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTableOutros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero Programa", "Nome do Programa", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableOutros);

        javax.swing.GroupLayout NomeDaSerieLayout = new javax.swing.GroupLayout(NomeDaSerie);
        NomeDaSerie.setLayout(NomeDaSerieLayout);
        NomeDaSerieLayout.setHorizontalGroup(
            NomeDaSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(NomeDaSerieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NomeDaSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addGroup(NomeDaSerieLayout.createSequentialGroup()
                        .addGroup(NomeDaSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        NomeDaSerieLayout.setVerticalGroup(
            NomeDaSerieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NomeDaSerieLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(NomeDaSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(NomeDaSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NomeDaSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableFilme;
    private javax.swing.JTable jTableOutros;
    private javax.swing.JTable jTableSerie;
    // End of variables declaration//GEN-END:variables
}
