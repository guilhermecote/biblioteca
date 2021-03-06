/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControlerCliente;
import Model.ClienteBEAN;
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
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form ClienteView
     */
    private List<ClienteBEAN> ListaClienteBEANs;

    private ControlerCliente controlerCliente = new ControlerCliente();
    private Integer cadastroOuAtualiza = 0;

    public ClienteView() {
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
        txCpf = new javax.swing.JTextField();
        txRg = new javax.swing.JTextField();
        txNascimento = new JFormattedTextField();
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

        txCpf.setText("CPF");
        txCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txCpfFocusLost(evt);
            }
        });
        txCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCpfActionPerformed(evt);
            }
        });

        txRg.setText("RG");
        txRg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txRgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txRgFocusLost(evt);
            }
        });
        txRg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txRgActionPerformed(evt);
            }
        });

        txNascimento.setText("Data de Nascimento (dd/MM/AAA)");
        txNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txNascimentoFocusLost(evt);
            }
        });
        txNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNascimentoActionPerformed(evt);
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

        btnVoltar.setText("voltar");
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
                            .addComponent(txNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txRg)
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
                .addGap(29, 29, 29)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txRg, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckbAtivo))
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

    private void txCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCpfActionPerformed

    private void txRgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txRgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txRgActionPerformed

    private void txNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNascimentoActionPerformed

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

                ClienteBEAN autor = new ClienteBEAN();
                autor.setNome_Clientes(txNome.getText());
                autor.setAtivo(ckbAtivo.isSelected());
                autor.setCPF_Clientes(txCpf.getText());
                autor.setData_de_Nas(new Date());
                autor.setEmail_Clientes(txEmail.getText());
                autor.setRG_Clientes(txRg.getText());
                autor.setEndereço_Clientes(txEndereco.getText());
                autor.setTelefone_Clientes(txTelefone.getText());
                autor.setData_de_Nas(convert_StringToDate(txNascimento.getText()));
                if (cadastroOuAtualiza == 0) {
                    controlerCliente.addCliente(autor);
                } else {
                    autor.setIdClientes(Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0).toString()));
                    controlerCliente.updateCliente(autor);
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

    private void txCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCpfFocusGained
        if (txCpf.getText().equals("CPF")) {
            txCpf.setText("");
        }
    }//GEN-LAST:event_txCpfFocusGained

    private void txCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txCpfFocusLost
        if (txCpf.getText().equals("")) {
            txCpf.setText("CPF");
        }
    }//GEN-LAST:event_txCpfFocusLost

    private void txRgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txRgFocusGained
        if (txRg.getText().equals("RG")) {
            txRg.setText("");
        }
    }//GEN-LAST:event_txRgFocusGained

    private void txRgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txRgFocusLost
        if (txRg.getText().equals("")) {
            txRg.setText("RG");
        }
    }//GEN-LAST:event_txRgFocusLost

    private void txNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txNascimentoFocusGained
        if (txNascimento.getText().equals("Data de Nascimento (dd/MM/AAA)")) {
            txNascimento.setText("");
        }
    }//GEN-LAST:event_txNascimentoFocusGained

    private void txNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txNascimentoFocusLost
        if (txNascimento.getText().equals("")) {
            txNascimento.setText("Data de Nascimento (dd/MM/AAA)");
        }
    }//GEN-LAST:event_txNascimentoFocusLost

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
        txCpf.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 4).toString());
        txRg.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 5).toString());
        txEndereco.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 6).toString());
        txEmail.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 7).toString());
        txNascimento.setText(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 8).toString());

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void ckbInativosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ckbInativosStateChanged
        updateTabela();
    }//GEN-LAST:event_ckbInativosStateChanged

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Principal frame = new Principal();
        frame.setVisible(true);
        this.dispose();        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
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
    private javax.swing.JTextField txCpf;
    private javax.swing.JTextField txEmail;
    private javax.swing.JTextField txEndereco;
    private javax.swing.JTextField txNascimento;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txRg;
    private javax.swing.JTextField txTelefone;
    // End of variables declaration//GEN-END:variables

    private void updateTabela() {
        String buscar = txBuscar.getText();

        if (ckbInativos.isSelected()) {
            if (buscar.isEmpty()) {
                ListaClienteBEANs = new ControlerCliente().listaClientes();
            } else {
                ListaClienteBEANs = new ArrayList<>();
                ListaClienteBEANs.addAll(new ControlerCliente().findByNome(buscar));
            }

        } else {
            if (buscar.isEmpty()) {
                ListaClienteBEANs = new ControlerCliente().listaClienteesAtivos();
            } else {
                ListaClienteBEANs = new ArrayList<>();
                ListaClienteBEANs = new ControlerCliente().findByNomeAndAtivo(buscar);
            }

        }
        DefaultTableModel model = new DefaultTableModel(null, new String[]{"ID", "Nome Cliente", "Status", "telefone", "CPF", "RG", "Endereço", "Email", "data_de_nas"});
        try {
            jTable1.setModel(model);
            String[] dados = new String[9];
            for (ClienteBEAN a : ListaClienteBEANs) {
                dados[0] = String.valueOf(a.getIdClientes());
                dados[1] = a.getNome_Clientes();
                dados[2] = a.getAtivo().toString();
                dados[3] = a.getTelefone_Clientes();
                dados[4] = a.getCPF_Clientes();
                dados[5] = a.getRG_Clientes();
                dados[6] = a.getEndereço_Clientes();
                dados[7] = a.getEmail_Clientes();
                dados[8] = dateToString(a.getData_de_Nas());
                model.addRow(dados);
            }
        } catch (Exception ex) {

        }
    }

    private void ativaCampos(Boolean ativa) {
        btnNovo.setEnabled(ativa);

        btnCancelar.setEnabled(!ativa);
        btnConfirmar.setEnabled(!ativa);

        txCpf.setEnabled(!ativa);
        txEmail.setEnabled(!ativa);
        txEndereco.setEnabled(!ativa);
        txNome.setEnabled(!ativa);
        txRg.setEnabled(!ativa);
        txTelefone.setEnabled(!ativa);
        txNascimento.setEnabled(!ativa);
        txNome.setEnabled(!ativa);

        txBuscar.setEnabled(ativa);

        ckbAtivo.setEnabled(!ativa);
    }

    public boolean verificaCampos() {
        if (txNome.getText().equals("Nome") || txTelefone.getText().equals("Telefone")
                || txEmail.getText().equals("Email") || txEndereco.getText().equals("Endereço")
                || txCpf.getText().equals("CPF") || txRg.getText().equals("RG") || txNascimento.getText().equals("Data de Nascimento")) {
            return false;
        }
        return true;
    }

    private void iniciaCampos() {
        txCpf.setText("CPF");
        txEmail.setText("Email");
        txEndereco.setText("Endereço");
        txNome.setText("Nome");
        txRg.setText("RG");
        txTelefone.setText("Telefone");
        txNascimento.setText("Data de Nascimento (dd/MM/AAA)");
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
