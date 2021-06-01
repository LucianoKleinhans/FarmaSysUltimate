/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.Endereco;
import Entidades.Pessoa;
import dao.Dao;

/**
 *
 * @author Luciano
 */
public class TelaCadastroPessoa extends javax.swing.JFrame {
    
    //conexão com o bancco
    Dao dao = new Dao();
    TelaNovoLogin frame = new TelaNovoLogin();
    
    private Object o;
    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroPessoa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextNome = new javax.swing.JTextField();
        jTextCPF = new javax.swing.JTextField();
        jTextTelefone = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jTextRuaAvenida = new javax.swing.JTextField();
        jTextBairro = new javax.swing.JTextField();
        jTextCEP = new javax.swing.JTextField();
        jTextNumero = new javax.swing.JTextField();
        jTextComplemento = new javax.swing.JTextField();
        Sair = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        Nome = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        Telefone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Endereco = new javax.swing.JLabel();
        RuaAvenida = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        Complemento = new javax.swing.JLabel();
        Cidade = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jComboBoxSelecionarEstado = new javax.swing.JComboBox<>();
        Cidade1 = new javax.swing.JLabel();
        jComboBoxSelecionarTipoPessoa = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de pessoa");
        setResizable(false);

        jTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeActionPerformed(evt);
            }
        });

        jTextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCPFActionPerformed(evt);
            }
        });

        jTextTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefoneActionPerformed(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        jTextRuaAvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRuaAvenidaActionPerformed(evt);
            }
        });

        jTextBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBairroActionPerformed(evt);
            }
        });

        jTextCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCEPActionPerformed(evt);
            }
        });

        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jTextComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextComplementoActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Nome.setText("Nome ");

        CPF.setText("CPF");

        Telefone.setText("Telefone");

        Email.setText("E-mail");

        Endereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Endereco.setText("Endereço");
        Endereco.setToolTipText("");

        RuaAvenida.setText("Rua/Avenida");

        Bairro.setText("Bairro");

        CEP.setText("CEP");

        Numero.setText("Número");

        Complemento.setText("Complemento");

        Cidade.setText("Cidade");

        jTextCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCidadeActionPerformed(evt);
            }
        });

        jComboBoxSelecionarEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        jComboBoxSelecionarEstado.setSelectedIndex(11);
        jComboBoxSelecionarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecionarEstadoActionPerformed(evt);
            }
        });

        Cidade1.setText("Estado");

        jComboBoxSelecionarTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionário" }));
        jComboBoxSelecionarTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecionarTipoPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(127, 127, 127)
                                .addComponent(Telefone)))
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Email)
                                .addGap(266, 266, 266))
                            .addComponent(jTextEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSelecionarTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(Endereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CEP)
                            .addComponent(jTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCidade)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cidade)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cidade1)
                            .addComponent(jComboBoxSelecionarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextRuaAvenida, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RuaAvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextComplemento)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome)
                            .addComponent(Complemento))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSelecionarTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CPF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefone)
                            .addComponent(Email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(Endereco)
                .addGap(18, 18, 18)
                .addComponent(RuaAvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextRuaAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Bairro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Numero)
                            .addComponent(CEP)
                            .addComponent(Cidade)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cidade1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSelecionarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Complemento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(Sair))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCPFActionPerformed
    }//GEN-LAST:event_jTextCPFActionPerformed

    private void jTextRuaAvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRuaAvenidaActionPerformed
    }//GEN-LAST:event_jTextRuaAvenidaActionPerformed

    private void jTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeActionPerformed
    }//GEN-LAST:event_jTextNomeActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroActionPerformed
    }//GEN-LAST:event_jTextNumeroActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        
        Pessoa p = new Pessoa();
        Endereco e = new Endereco();
        //set pessoa
        p.setNome(jTextNome.getText());
        p.setTipoPessoa((String) jComboBoxSelecionarTipoPessoa.getSelectedItem());
        p.setCpf(jTextCPF.getText());
        p.setTelefone(jTextTelefone.getText());
        p.setEmail(jTextEmail.getText());
        //set endereço
        //e.setId();
        e.setRuaAvenida(jTextRuaAvenida.getText());
        e.setBairro(jTextBairro.getText());
        e.setNumero(jTextNumero.getText());
        e.setCep(jTextCEP.getText());
        e.setCidade(jTextCidade.getText());
        e.setUf((String) jComboBoxSelecionarEstado.getSelectedItem());
        e.setComplemento(jTextComplemento.getText());
        
        p.setEndereco(e);
        
        p.setLoginFuncionario(frame.getPessoa().getLoginFuncionario());
        p.setSenhaLoginFuncionario(frame.getPessoa().getSenhaLoginFuncionario());
        
        dao.salvar(e,p);//salvar endereco,pessoa        
          
        dispose();//fecha a tela após salvar o cadastro
    }//GEN-LAST:event_SalvarActionPerformed

    private void jTextTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefoneActionPerformed
    }//GEN-LAST:event_jTextTelefoneActionPerformed

    private void jTextBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBairroActionPerformed
    }//GEN-LAST:event_jTextBairroActionPerformed

    private void jTextCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCEPActionPerformed
    }//GEN-LAST:event_jTextCEPActionPerformed

    private void jTextComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextComplementoActionPerformed
    }//GEN-LAST:event_jTextComplementoActionPerformed

    private void jTextCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCidadeActionPerformed
    }//GEN-LAST:event_jTextCidadeActionPerformed

    private void jComboBoxSelecionarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarEstadoActionPerformed
    }//GEN-LAST:event_jComboBoxSelecionarEstadoActionPerformed

    private void jComboBoxSelecionarTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarTipoPessoaActionPerformed
        if(!jComboBoxSelecionarTipoPessoa.getSelectedItem().equals("Funcionário")){
        } else {
            frame.setVisible(true);
            
        }
    }//GEN-LAST:event_jComboBoxSelecionarTipoPessoaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCadastroPessoa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bairro;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Cidade1;
    private javax.swing.JLabel Complemento;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel RuaAvenida;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel Telefone;
    private javax.swing.JComboBox<String> jComboBoxSelecionarEstado;
    private javax.swing.JComboBox<String> jComboBoxSelecionarTipoPessoa;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCEP;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextComplemento;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextRuaAvenida;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}
