/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControlerEditora;
import Model.EditoraBEAN;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guilherme Costa
 */
public class EditoraView extends javax.swing.JFrame {

    /**
     * Creates new form EditoraView
     */
    private List<EditoraBEAN> ListaEditoraBEANs;

    private ControlerEditora controlerEditora = new ControlerEditora();
    private Integer cadastroOuAtualiza = 0;

    public EditoraView() {
        initComponents();
        ativaCampos(true);
        updateTabela();
        btnAlterar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txNome = new javax.swing.JTextField();
        txTelefone = new JFormattedTextField();
        txEmail = new javax.swing.JTextField();
        txEndereco = new javax.swing.JTextField();
        ckbAtivo = new javax.swing.JCheckBox();
        txBuscar = new javax.swing.JTextField();
        ckbInativos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(550, 650));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txNome.setText("Nome");
        txNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txNomeFocusLost(evt);
            }
        });
        txNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeActionPerformed(evt);
            }
        });

        txTelefone.setText("Telefone");
        txTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txTelefoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txTelefoneFocusLost(evt);
            }
        });
        txTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txTelefoneActionPerformed(evt);
            }
        });

        txEmail.setText("Email");
        txEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txEmailFocusLost(evt);
            }
        });
        txEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEmailActionPerformed(evt);
            }
        });

        txEndereco.setText("Endereço");
        txEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txEnderecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txEnderecoFocusLost(evt);
            }
        });
        txEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEnderecoActionPerformed(evt);
            }
        });

        ckbAtivo.setSelected(true);
        ckbAtivo.setText("Ativo");

        txBuscar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txBuscarCaretUpdate(evt);
            }
        });

        ckbInativos.setText("Inativos");
        ckbInativos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ckbInativosStateChanged(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ckbAtivo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txEndereco)
                            .addComponent(txTelefone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ckbInativos))
                            .addComponent(btnVoltar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbAtivo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbInativos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeActionPerformed

    private void txTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txTelefoneActionPerformed

    private void txEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEmailActionPerformed

    private void txEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEnderecoActionPerformed

    private void txBuscarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txBuscarCaretUpdate
        updateTabela();
    }//GEN-LAST:event_txBuscarCaretUpdate

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        ativaCampos(false);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            if (verificaCampos()) {
                ativaCampos(true);

                EditoraBEAN autor = new EditoraBEAN();
                autor.setNome_Editora(txNome.getText());
                autor.setAtivo_Editora(ckbAtivo.isSelected());
                autor.setEmail_Editora(txEmail.getText());
                autor.setEndereço_Editora(txEndereco.getText());
                autor.setTelefone_Editora(txTelefone.getText());
                if (cadastroOuAtualiza == 0) {
                    controlerEditora.addEditora(autor);
                } else {
                    autor.setIdEditora(Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString()));
                    controlerEditora.updateEditora(autor);
                    cadastroOuAtualiza = 0;
                }
                updateTabela();
                iniciaCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos Corretamente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Preencha todos os Campos Corretamente");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ativaCampos(true);
        iniciaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txNomeFocusLost
        if (txNome.getText().equals("")) {
            txNome.setText("Nome");
        }
    }//GEN-LAST:event_txNomeFocusLost

    private void txNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txNomeFocusGained
        if (txNome.getText().equals("Nome")) {
            txNome.setText("");
        }
    }//GEN-LAST:event_txNomeFocusGained

    private void txTelefoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txTelefoneFocusGained
        if (txTelefone.getText().equals("Telefone")) {
            txTelefone.setText("");
        }
    }//GEN-LAST:event_txTelefoneFocusGained

    private void txTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txTelefoneFocusLost
        if (txTelefone.getText().equals("")) {
            txTelefone.setText("Telefone");
        }
    }//GEN-LAST:event_txTelefoneFocusLost

    private void txEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txEmailFocusGained
        if (txEmail.getText().equals("Email")) {
            txEmail.setText("");
        }
    }//GEN-LAST:event_txEmailFocusGained

    private void txEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txEmailFocusLost
        if (txEmail.getText().equals("")) {
            txEmail.setText("Email");
        }
    }//GEN-LAST:event_txEmailFocusLost

    private void txEnderecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txEnderecoFocusGained
        if (txEndereco.getText().equals("Endereço")) {
            txEndereco.setText("");
        }
    }//GEN-LAST:event_txEnderecoFocusGained

    private void txEnderecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txEnderecoFocusLost
        if (txEndereco.getText().equals("")) {
            txEndereco.setText("Endereço");
        }
    }//GEN-LAST:event_txEnderecoFocusLost

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_jTable1FocusGained

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        ativaCampos(false);
        btnAlterar.setEnabled(false);
        cadastroOuAtualiza = 1;
        txNome.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1).toString());
        ckbAtivo.setSelected(Boolean.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 2).toString()));
        txTelefone.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 3).toString());
        txEndereco.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4).toString());
        txEmail.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5).toString());

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void ckbInativosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbInativosStateChanged
        updateTabela();
    }//GEN-LAST:event_ckbInativosStateChanged

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Principal frame = new Principal();
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(EditoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditoraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditoraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox ckbAtivo;
    private javax.swing.JCheckBox ckbInativos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txBuscar;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables

    private void updateTabela() {
        String buscar = txBuscar.getText();

        if (ckbInativos.isSelected()) {
            if (buscar.isEmpty()) {
                ListaEditoraBEANs = new ControlerEditora().listaEditoras();
            } else {
                ListaEditoraBEANs = new ArrayList<>();
                ListaEditoraBEANs.addAll(new ControlerEditora().findByNome(buscar));
            }

        } else {
            if (buscar.isEmpty()) {
                ListaEditoraBEANs = new ControlerEditora().listaEditorasAtivos();
            } else {
                ListaEditoraBEANs = new ArrayList<>();
                ListaEditoraBEANs = new ControlerEditora().findByNomeAndAtivo(buscar);
            }

        }
        DefaultTableModel model = new DefaultTableModel(null, new String[]{"ID", "Nome Editora", "Status", "telefone", "Endereço", "Email"});
        try {
            jTable1.setModel(model);
            String[] dados = new String[9];
            for (EditoraBEAN a : ListaEditoraBEANs) {
                dados[0] = String.valueOf(a.getIdEditora());
                dados[1] = a.getNome_Editora();
                dados[2] = a.getAtivo_Editora().toString();
                dados[3] = a.getTelefone_Editora();
                dados[4] = a.getEndereço_Editora();
                dados[5] = a.getEmail_Editora();
                model.addRow(dados);
            }
        } catch (Exception ex) {

        }
    }

    private void ativaCampos(Boolean ativa) {
        btnNovo.setEnabled(ativa);

        btnCancelar.setEnabled(!ativa);
        btnConfirmar.setEnabled(!ativa);

        txEmail.setEnabled(!ativa);
        txEndereco.setEnabled(!ativa);
        txNome.setEnabled(!ativa);
        txTelefone.setEnabled(!ativa);
        txNome.setEnabled(!ativa);

        txBuscar.setEnabled(ativa);

        ckbAtivo.setEnabled(!ativa);
    }

    public boolean verificaCampos() {
        if (txNome.getText().equals("Nome") || txTelefone.getText().equals("Telefone")
                || txEmail.getText().equals("Email") || txEndereco.getText().equals("Endereço")) {
            return false;
        }
        return true;
    }

    private void iniciaCampos() {
        txEmail.setText("Email");
        txEndereco.setText("Endereço");
        txNome.setText("Nome");
        txTelefone.setText("Telefone");
    }

    public static Timestamp convert_StringToDate(String dataStr) {
        Timestamp data = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(format.parse(dataStr));
            data = new Timestamp(calendar.getTimeInMillis());
            //data = format.parse(dataStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return data;
    }

    private String dateToString(Date data) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");

        String reportDate = df.format(data);

        return reportDate;
    }
}
