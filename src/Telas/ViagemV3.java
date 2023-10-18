
package Telas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import Telas.classes.Viagem;

/**
 *
 * @author Aluno
 */
public class ViagemV3 extends javax.swing.JFrame {

    /**
     * Creates new form Viagem
     */
    public ViagemV3() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldModeloVeiculo = new javax.swing.JTextField();
        jTextFieldConsumoGasolina = new javax.swing.JTextField();
        jTextFieldConsumoEtanol = new javax.swing.JTextField();
        jTextFieldDistancia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Calculo para custo de viagem");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Modelo do veículo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Média consumo gasolina");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Média consumo etanol");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Distancia a ser percorrida");

        jTextFieldModeloVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jTextFieldConsumoGasolina.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldConsumoGasolina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsumoGasolinaActionPerformed(evt);
            }
        });
        jTextFieldConsumoGasolina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldConsumoGasolinaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldConsumoGasolinaKeyReleased(evt);
            }
        });

        jTextFieldConsumoEtanol.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldConsumoEtanol.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldConsumoEtanolKeyReleased(evt);
            }
        });

        jTextFieldDistancia.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextFieldDistancia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDistanciaKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton2.setText("Calcular");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jButton1)
                        .addGap(143, 143, 143)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDistancia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldConsumoEtanol))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldConsumoGasolina))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldConsumoGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldConsumoEtanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        String modeloVeiculo = jTextFieldModeloVeiculo.getText();
        byte mediaGasolina = Byte.parseByte(jTextFieldConsumoGasolina.getText());
        byte mediaEtanol = Byte.parseByte(jTextFieldConsumoEtanol.getText());
        short distancia = Short.parseShort(jTextFieldDistancia.getText());
        
        Viagem viagem = new Viagem(modeloVeiculo, distancia, mediaGasolina, mediaEtanol);
        
        int qtdLitrosGasolina = viagem.getMediaConsumoGasolina();
        int qtdLitrosAlcool = viagem.calcularQtdeLitrosEtanol();
        
        float totalViagemComGasolina = viagem.calcularCustoComGasolina();
        float totalViagemComAlcool = viagem.calcularCustoComEtanol();
        
        String maisVantajoso = viagem.verificarCombustivelMaisVantajoso(totalViagemComGasolina, totalViagemComAlcool);
        
        String mensagem = "Se utilzar gasolina você precisará de " + qtdLitrosGasolina + " litros " + 
               "para percorrer os " + distancia + "Km. E você irá gastar R$" + Math.round(totalViagemComGasolina)
                + " com o seu " + modeloVeiculo + ".\n"
                + "Se utilzar alcool você precisara de " + qtdLitrosAlcool + " litros " + 
                "para percorrer os " + distancia + "Km. E você irá gastar R$" + Math.round(totalViagemComAlcool)
                + " com o seu " + modeloVeiculo + ".\n"
                + maisVantajoso;        
        JOptionPane.showMessageDialog(rootPane, mensagem);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextFieldModeloVeiculo.setText("");
        jTextFieldConsumoGasolina.setText("");
        jTextFieldConsumoEtanol.setText("");
        jTextFieldDistancia.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldConsumoGasolinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsumoGasolinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsumoGasolinaActionPerformed

    private void jTextFieldConsumoGasolinaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConsumoGasolinaKeyPressed

    }//GEN-LAST:event_jTextFieldConsumoGasolinaKeyPressed

    private void jTextFieldConsumoGasolinaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConsumoGasolinaKeyReleased
        this.onlyNumber(evt, jTextFieldConsumoGasolina);
    }//GEN-LAST:event_jTextFieldConsumoGasolinaKeyReleased

    private void jTextFieldConsumoEtanolKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConsumoEtanolKeyReleased
        this.onlyNumber(evt, jTextFieldConsumoEtanol);
    }//GEN-LAST:event_jTextFieldConsumoEtanolKeyReleased

    private void jTextFieldDistanciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDistanciaKeyPressed
        this.onlyNumber(evt, jTextFieldDistancia);
    }//GEN-LAST:event_jTextFieldDistanciaKeyPressed

    public void onlyNumber(java.awt.event.KeyEvent evt, javax.swing.JTextField txtField) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE  || c == KeyEvent.VK_PERIOD)) {            
            evt.consume();           
            txtField.setText("");
        }
    }
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
            java.util.logging.Logger.getLogger(ViagemV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViagemV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViagemV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViagemV3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViagemV3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldConsumoEtanol;
    private javax.swing.JTextField jTextFieldConsumoGasolina;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldModeloVeiculo;
    // End of variables declaration//GEN-END:variables
}
