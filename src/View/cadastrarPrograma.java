package View;

import View.Resources.programValidations;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class cadastrarPrograma extends javax.swing.JPanel {

    public cadastrarPrograma() {
        initComponents();        
        group = new ButtonGroup();
        jRadioButton1.setActionCommand("Livre");
        jRadioButton2.setActionCommand("+10 Anos");
        jRadioButton3.setActionCommand("+12 Anos");
        jRadioButton4.setActionCommand("+14 Anos");
        jRadioButton5.setActionCommand("+16 Anos");
        jRadioButton6.setActionCommand("+18 Anos");
        group.add(jRadioButton1);
        group.add(jRadioButton2);
        group.add(jRadioButton3);
        group.add(jRadioButton4);
        group.add(jRadioButton5);
        group.add(jRadioButton6);
        group.setSelected(jRadioButton1.getModel(), true);
        updateState();
    }

    protected void updateState() {
        boolean enabled = ComboBoxTipoPrograma.getSelectedItem().equals("Série");        
        jTextFieldNumeroTemporada.setEnabled(enabled);
        jTextFieldNumeroEpisodios.setEnabled(enabled);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ComboBoxTipoPrograma = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldNomePrograma = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxGeneroPrograma = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdioma = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDiretor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAnoPrograma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldDuracaoPrograma = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldDistribuidora = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListElenco = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldElenco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        buttonAdicionarPrograma = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaSinopse = new javax.swing.JTextArea();
        jButtonCadastrarPrograma = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNumeroTemporada = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNumeroEpisodios = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Cadastrar Novo Programa");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        ComboBoxTipoPrograma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Filme", "Série", "Outro" }));
        ComboBoxTipoPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoProgramaActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo");

        jLabel3.setText("Nome do Programa");

        jRadioButton1.setText("Livre");

        jRadioButton2.setText("+10 Anos");

        jRadioButton3.setText("+12 Anos");

        jRadioButton4.setText("+14 Anos");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("+16 Anos");

        jRadioButton6.setText("+18 Anos");

        jLabel4.setText("Classificação Indicativa");

        jComboBoxGeneroPrograma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aventura", "Ação", "Comédia", "Documentário", "Drama", "Faroeste", "Fantasia", "Ficção", "Guerra", "Musical", "Policial", "Romance", "Suspense", "Terror", "Outro" }));

        jLabel5.setText("Gênero");

        jLabel6.setText("Idioma");

        jLabel7.setText("Diretor");

        jLabel8.setText("Ano");

        jLabel9.setText("Duração (minutos)");

        jLabel10.setText("Distribuidora");

        jListElenco.setEnabled(false);
        jScrollPane1.setViewportView(jListElenco);

        jLabel11.setText("Elenco");

        jLabel12.setText("Nome do Ator");

        buttonAdicionarPrograma.setText("Adicionar");
        buttonAdicionarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarProgramaActionPerformed(evt);
            }
        });

        jTextAreaSinopse.setColumns(20);
        jTextAreaSinopse.setRows(5);
        jScrollPane2.setViewportView(jTextAreaSinopse);

        jButtonCadastrarPrograma.setText("Cadastrar Programa");
        jButtonCadastrarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProgramaActionPerformed(evt);
            }
        });

        jLabel14.setText("Sinopse");

        jTextFieldNumeroTemporada.setEnabled(false);

        jLabel13.setText("Número de Temporadas");

        jTextFieldNumeroEpisodios.setEnabled(false);

        jLabel15.setText("Número Total de Episódios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNumeroTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNumeroEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldAnoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDuracaoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboBoxTipoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textFieldNomePrograma))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldDistribuidora, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxGeneroPrograma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel7)
                                                .addGap(3, 3, 3)
                                                .addComponent(jTextFieldDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(11, 11, 11))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2))))
                        .addGap(38, 38, 38)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 243, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldElenco, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonAdicionarPrograma)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jButtonCadastrarPrograma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxTipoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(textFieldNomePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGeneroPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAnoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldDuracaoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldDistribuidora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldNumeroTemporada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldNumeroEpisodios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldElenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(buttonAdicionarPrograma))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(43, 43, 43)))
                .addComponent(jButtonCadastrarPrograma)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxTipoProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoProgramaActionPerformed
        // TODO add your handling code here:
        updateState();
    }//GEN-LAST:event_ComboBoxTipoProgramaActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButtonCadastrarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProgramaActionPerformed
        programValidations validations = new programValidations();
        String ano, nome, classificacao, idioma, genero, diretor, duracao, distribuidora, temp, episo, sinopse;
        ArrayList<String> atores = new ArrayList();

        ano = jTextFieldAnoPrograma.getText();
        nome = textFieldNomePrograma.getText();
        classificacao = group.getSelection().getActionCommand();
        idioma = jTextFieldIdioma.getText();
        genero = jComboBoxGeneroPrograma.getSelectedItem().toString();
        diretor = jTextFieldDiretor.getText();
        duracao = jTextFieldDuracaoPrograma.getText();
        distribuidora = jTextFieldDistribuidora.getText();
        temp = jTextFieldNumeroTemporada.getText();
        episo = jTextFieldNumeroEpisodios.getText();
        sinopse = jTextAreaSinopse.getText();

        for (int i = 0; i < jListElenco.getModel().getSize(); i++) {
            atores.add((jListElenco.getModel().getElementAt(i)).toString());
        }

        ArrayList<String> checkUp = new ArrayList(Arrays.asList(nome, idioma, diretor, distribuidora, ano, duracao));
        
        if (validations.checkFilled(checkUp)) {
            checkUp = new ArrayList(Arrays.asList(idioma, diretor, distribuidora));
            if (validations.checkIfString(checkUp)) {
                checkUp = new ArrayList(Arrays.asList(ano, duracao));
                if (validations.checkIfNumber(checkUp)) {
                    if (ComboBoxTipoPrograma.getSelectedItem().equals("Série")) {                         
                        checkUp = new ArrayList(Arrays.asList(temp, episo));
                        if (validations.checkIfNumber(checkUp)) {
                            Control.serieController series = new Control.serieController();
                            series.inserirPrograma(ano, nome, classificacao, idioma, genero, diretor, duracao, distribuidora, temp, episo, sinopse, atores);
                            JOptionPane.showMessageDialog(null, "Série inserida com sucesso");
                        } else {
                            JOptionPane.showMessageDialog(null, "As temporadas e o número de episodios devem ser valores inteiros positivos.");
                        }
                    } else {
                        if (ComboBoxTipoPrograma.getSelectedItem().equals("Outro")) {
                            Control.outroController outros = new Control.outroController();
                            outros.inserirPrograma(ano, nome, classificacao, idioma, genero, diretor, duracao, distribuidora, sinopse, atores);
                            JOptionPane.showMessageDialog(null, "Programa variado inserido com sucesso");
                        } else {
                            Control.filmeController outros = new Control.filmeController();
                            outros.inserirPrograma(ano, nome, classificacao, idioma, genero, diretor, duracao, distribuidora, sinopse, atores);
                            JOptionPane.showMessageDialog(null, "Filme inserido com sucesso");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Duração e anos devem ser números inteiros positivos.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Nome do diretor, nome da distribuidora e Idioma devem conter somente letras.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, digite valores de input válidos.");
        }

    }//GEN-LAST:event_jButtonCadastrarProgramaActionPerformed

    private void buttonAdicionarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarProgramaActionPerformed
        programValidations validations = new programValidations();
        ArrayList<String> checkUp = new ArrayList(Arrays.asList(jTextFieldElenco.getText()));
        if (validations.checkIfString(checkUp)) {
            DefaultListModel model = new DefaultListModel();
            for (int i = 0; i < jListElenco.getModel().getSize(); i++) {
                model.addElement(jListElenco.getModel().getElementAt(i));
            }
            model.addElement(jTextFieldElenco.getText());
            jListElenco.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "O nome de um ator só deve conter letras.");
        }
    }//GEN-LAST:event_buttonAdicionarProgramaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxTipoPrograma;
    private javax.swing.JButton buttonAdicionarPrograma;
    private javax.swing.JButton jButtonCadastrarPrograma;
    private javax.swing.JComboBox jComboBoxGeneroPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListElenco;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaSinopse;
    private javax.swing.JTextField jTextFieldAnoPrograma;
    private javax.swing.JTextField jTextFieldDiretor;
    private javax.swing.JTextField jTextFieldDistribuidora;
    private javax.swing.JTextField jTextFieldDuracaoPrograma;
    private javax.swing.JTextField jTextFieldElenco;
    private javax.swing.JTextField jTextFieldIdioma;
    private javax.swing.JTextField jTextFieldNumeroEpisodios;
    private javax.swing.JTextField jTextFieldNumeroTemporada;
    private javax.swing.JTextField textFieldNomePrograma;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup group;
}
