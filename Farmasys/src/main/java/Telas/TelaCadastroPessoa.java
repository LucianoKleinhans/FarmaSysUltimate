/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Luciano
 */
public class TelaCadastroPessoa extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroPessoa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NovoLoginFuncionario = new javax.swing.JDialog();
        InsiraNomeLogin = new javax.swing.JLabel();
        NomeLogin = new javax.swing.JTextField();
        InsiraSenhaLogin = new javax.swing.JLabel();
        SenhaLogin = new javax.swing.JPasswordField();
        Cancelar = new javax.swing.JButton();
        Salvar2 = new javax.swing.JButton();
        jTextTelefone = new javax.swing.JTextField();
        jTextNumero = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        Endereco = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Complemento = new javax.swing.JLabel();
        Bairro = new javax.swing.JLabel();
        Salvar = new javax.swing.JButton();
        jTextComplemento = new javax.swing.JTextField();
        Sair = new javax.swing.JButton();
        RuaAvenida = new javax.swing.JLabel();
        jComboBoxSelecionarTipoPessoa = new javax.swing.JComboBox<>();
        Nome = new javax.swing.JLabel();
        jTextCEP = new javax.swing.JTextField();
        jTextNome = new javax.swing.JTextField();
        jTextRuaAvenida = new javax.swing.JTextField();
        jTextCPF = new javax.swing.JTextField();
        CEP = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        Telefone = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();

        InsiraNomeLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsiraNomeLogin.setText("Insira o nome para login");

        InsiraSenhaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InsiraSenhaLogin.setText("Insira a senha do login");

        Cancelar.setText("Cancelar");

        Salvar2.setText("Salvar");
        Salvar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NovoLoginFuncionarioLayout = new javax.swing.GroupLayout(NovoLoginFuncionario.getContentPane());
        NovoLoginFuncionario.getContentPane().setLayout(NovoLoginFuncionarioLayout);
        NovoLoginFuncionarioLayout.setHorizontalGroup(
            NovoLoginFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NovoLoginFuncionarioLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(NovoLoginFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(NovoLoginFuncionarioLayout.createSequentialGroup()
                        .addComponent(Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salvar2))
                    .addComponent(InsiraSenhaLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(NomeLogin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InsiraNomeLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SenhaLogin, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(50, 50, 50))
        );
        NovoLoginFuncionarioLayout.setVerticalGroup(
            NovoLoginFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NovoLoginFuncionarioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(InsiraNomeLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InsiraSenhaLogin)
                .addGap(18, 18, 18)
                .addComponent(SenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(NovoLoginFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar2)
                    .addComponent(Cancelar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de pessoa");
        setResizable(false);

        jTextNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNumeroActionPerformed(evt);
            }
        });

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        Endereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Endereco.setText("Endereço");
        Endereco.setToolTipText("");

        Email.setText("E-mail");

        Complemento.setText("Complemento");

        Bairro.setText("Bairro");

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        RuaAvenida.setText("Rua/Avenida");

        jComboBoxSelecionarTipoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Funcionário" }));
        jComboBoxSelecionarTipoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecionarTipoPessoaActionPerformed(evt);
            }
        });

        Nome.setText("Nome ");

        jTextRuaAvenida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRuaAvenidaActionPerformed(evt);
            }
        });

        jTextCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCPFActionPerformed(evt);
            }
        });

        CEP.setText("CEP");

        CPF.setText("CPF");

        Telefone.setText("Telefone");

        Numero.setText("Número");

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
                        .addComponent(jComboBoxSelecionarTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Endereco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Sair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salvar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextCEP))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bairro)
                                .addGap(149, 149, 149)
                                .addComponent(CEP)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Numero)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(Endereco)
                .addGap(18, 18, 18)
                .addComponent(RuaAvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextRuaAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bairro)
                    .addComponent(CEP)
                    .addComponent(Numero))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        dispose();
    }//GEN-LAST:event_SalvarActionPerformed

    private void jTextRuaAvenidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRuaAvenidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRuaAvenidaActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNumeroActionPerformed

    private void jTextCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCPFActionPerformed

    private void Salvar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Salvar2ActionPerformed

    private void jComboBoxSelecionarTipoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarTipoPessoaActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Complemento;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Endereco;
    private javax.swing.JLabel InsiraNomeLogin;
    private javax.swing.JLabel InsiraSenhaLogin;
    private javax.swing.JLabel Nome;
    private javax.swing.JTextField NomeLogin;
    private javax.swing.JDialog NovoLoginFuncionario;
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel RuaAvenida;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton Salvar2;
    private javax.swing.JPasswordField SenhaLogin;
    private javax.swing.JLabel Telefone;
    private javax.swing.JComboBox<String> jComboBoxSelecionarTipoPessoa;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCEP;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextComplemento;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextRuaAvenida;
    private javax.swing.JTextField jTextTelefone;
    // End of variables declaration//GEN-END:variables
}