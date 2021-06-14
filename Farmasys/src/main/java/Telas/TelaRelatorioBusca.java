/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Entidades.ItemVenda;
import Entidades.Pessoa;
import Entidades.Venda;

import dao.Dao;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class TelaRelatorioBusca extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorioBusca
     */
    public TelaRelatorioBusca() {
        initComponents();
        carregaLista();
    }
    
    private List <Venda> listaVenda;
    private ItemVenda itemVenda;
    Dao dao = new Dao();
    
    private void carregaLista(){
        listaVenda = dao.listaNative(Venda.class);
        if(jComboBoxSelecionarCodigo.getSelectedItem().equals("Nome cliente")){
            listaVenda = dao.listaNativeNomeVenda(Venda.class,"p.nome ilike '%"+jtPesquisa.getText().toUpperCase()+"%'");
        }else if(jComboBoxSelecionarCodigo.getSelectedItem().equals("Codigo cliente")){
            listaVenda = dao.listaNativeNomeVenda(Venda.class,"p.id = '"+jtPesquisa.getText()+"'");
        }else if(jComboBoxSelecionarCodigo.getSelectedItem().equals("CPF cliente")){
            listaVenda = dao.listaNativeNomeVenda(Venda.class,"p.cpf ilike '%"+jtPesquisa.getText().toUpperCase()+"%'");
        }
        String[] columnNames = new String[]{
            "Codigo de venda","Codigo cliente","Nome cliente","Vr total","Tipo pagamento","Data venda"
        };
        Object[][] data = new Object[listaVenda.size()][columnNames.length];
        for (int i = 0; i < listaVenda.size(); i++) {
            data[i][0] = listaVenda.get(i).getId();
            data[i][1] = listaVenda.get(i).getPessoa().getId();
            data[i][2] = listaVenda.get(i).getPessoa().getNome();
            data[i][3] = listaVenda.get(i).getValorTotal();
            data[i][4] = listaVenda.get(i).getTipoPagamento();
            data[i][5] = listaVenda.get(i).getDataVendaFormatada();
        }
        TabelaBusca.setModel(new DefaultTableModel(data, columnNames));
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxSelecionarCodigo = new javax.swing.JComboBox<>();
        jtPesquisa = new javax.swing.JTextField();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaBusca = new javax.swing.JTable();
        jButtonTelaCadastro = new javax.swing.JButton();
        jButtonTelaRelatorioInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busca de relatório");
        setAutoRequestFocus(false);
        setResizable(false);

        jComboBoxSelecionarCodigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome cliente", "Codigo cliente", "CPF cliente" }));
        jComboBoxSelecionarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelecionarCodigoActionPerformed(evt);
            }
        });

        jtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesquisaActionPerformed(evt);
            }
        });
        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyPressed(evt);
            }
        });

        jButtonSelecionar.setText("Selecionar");
        jButtonSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        TabelaBusca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cod. Venda", "Cod. Cliente", "Nome Cliente", "Cod. Funcionario", "Nome Func", "Data Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaBusca.setToolTipText("");
        jScrollPane1.setViewportView(TabelaBusca);

        jButtonTelaCadastro.setText("Tela Cadastro");
        jButtonTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelaCadastroActionPerformed(evt);
            }
        });

        jButtonTelaRelatorioInfo.setText("Tela Informação");
        jButtonTelaRelatorioInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelaRelatorioInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSelecionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(jComboBoxSelecionarCodigo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonTelaRelatorioInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonTelaCadastro)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxSelecionarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonTelaRelatorioInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTelaCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonSelecionar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSelecionarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelecionarCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSelecionarCodigoActionPerformed

    private void jtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPesquisaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarActionPerformed
        TelaRelatorioInfo frame = new TelaRelatorioInfo();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonSelecionarActionPerformed

    private void jButtonTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelaCadastroActionPerformed
        TelaCadastros frame = new TelaCadastros();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonTelaCadastroActionPerformed

    private void jtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        carregaLista();}       
    }//GEN-LAST:event_jtPesquisaKeyPressed

    private void jButtonTelaRelatorioInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelaRelatorioInfoActionPerformed
        // TODO add your handling code here:
        TelaRelatorioInfo frame = new TelaRelatorioInfo();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonTelaRelatorioInfoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaRelatorioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorioBusca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorioBusca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaBusca;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JButton jButtonTelaCadastro;
    private javax.swing.JButton jButtonTelaRelatorioInfo;
    private javax.swing.JComboBox<String> jComboBoxSelecionarCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtPesquisa;
    // End of variables declaration//GEN-END:variables
}
