
package view;

import Class.Pedidos;
import Class.PedidoEspecial;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FormViewMenu extends javax.swing.JFrame {

    private ArrayList<Pedidos> listaPedidos;

   
    public FormViewMenu() {
        initComponents();
        setSize(730, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        listaPedidos = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtEntrada = new javax.swing.JTextField();
        jTxtPrato = new javax.swing.JTextField();
        jTxtSobremesa = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jBEnviarCozinha = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Garçom");
        getContentPane().setLayout(null);

        jLabel1.setText("Entrada:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 80, 80, 16);

        jLabel2.setText("Prato Principal:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 140, 130, 16);

        jLabel3.setText("Sobremesa:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 200, 70, 16);

        jTxtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(jTxtEntrada);
        jTxtEntrada.setBounds(140, 100, 266, 30);
        getContentPane().add(jTxtPrato);
        jTxtPrato.setBounds(140, 160, 266, 30);
        getContentPane().add(jTxtSobremesa);
        jTxtSobremesa.setBounds(140, 220, 266, 30);

        jToggleButton1.setText("Confirmar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(260, 290, 160, 23);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 6, 0, 0);

        jBEnviarCozinha.setText("Enviar Para Cozinha");
        jBEnviarCozinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEnviarCozinhaActionPerformed(evt);
            }
        });
        getContentPane().add(jBEnviarCozinha);
        jBEnviarCozinha.setBounds(260, 320, 160, 23);

        jLabel5.setText("Entradas: Raviolli ou Salada");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(436, 80, 260, 16);

        jLabel6.setText("Prato Principal: Lasanha ou Espaguete");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(426, 140, 280, 16);

        jLabel7.setText("Sobremesa: Tiramisu ou Palha italiana ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(426, 200, 280, 16);

        jLabel8.setText("Preço: R$20,00 reais");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(461, 223, 200, 16);

        jLabel9.setText("Preço: R$45,00 reais");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(459, 163, 180, 16);

        jLabel10.setText("Preço: R$10,00 reais");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(459, 103, 150, 16);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/VITELLI (1).png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-600, -260, 1350, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtEntradaActionPerformed
        
    }//GEN-LAST:event_jTxtEntradaActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
       PedidoEspecial pedido = new PedidoEspecial();
    pedido.setEntrada(jTxtEntrada.getText());
    pedido.setPratoPrincipal(jTxtPrato.getText());
    pedido.setSobremesa(jTxtSobremesa.getText());

    listaPedidos.add(pedido); // Adiciona o pedido atual à lista de pedidos
        JOptionPane.showMessageDialog(this, "Pedido adicionado. Clique em 'Enviar Para Cozinha' quando terminar.");
    try {
        JOptionPane.showMessageDialog(null, pedido.Salvar());
    } catch (IOException ex) {
        Logger.getLogger(FormViewMenu.class.getName()).log(Level.SEVERE, null, ex);
    }

    jTxtEntrada.setText("");
    jTxtPrato.setText("");
    jTxtSobremesa.setText("");
        
    pedido.gerarNota();

    FormViewCozinha cozinha = new FormViewCozinha();
    cozinha.receberDadosDaFormViewMenu(jTxtEntrada.getText(), jTxtPrato.getText(), jTxtSobremesa.getText());
    

    
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jBEnviarCozinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEnviarCozinhaActionPerformed
        FormViewCozinha cozinha = new FormViewCozinha();

        for (Pedidos pedido : listaPedidos) {
            cozinha.receberDadosDaFormViewMenu(pedido.getEntrada(), pedido.getPratoPrincipal(), pedido.getSobremesa());
        }

        cozinha.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jBEnviarCozinhaActionPerformed

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
            java.util.logging.Logger.getLogger(FormViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormViewMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormViewMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEnviarCozinha;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField jTxtEntrada;
    private javax.swing.JTextField jTxtPrato;
    private javax.swing.JTextField jTxtSobremesa;
    // End of variables declaration//GEN-END:variables
}
