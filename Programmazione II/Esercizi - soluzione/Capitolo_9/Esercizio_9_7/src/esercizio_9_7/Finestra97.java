/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_9_7;

/**
 *
 * @author paolo
 */
public class Finestra97 extends javax.swing.JFrame {

    /**
     * Creates new form Finestra97
     */
    public Finestra97() {
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

        BottoneSx = new javax.swing.JButton();
        Etichetta = new javax.swing.JLabel();
        BottoneDx = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BottoneSx.setText("Sinistra");
        BottoneSx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneSxActionPerformed(evt);
            }
        });
        getContentPane().add(BottoneSx, java.awt.BorderLayout.PAGE_START);

        Etichetta.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        Etichetta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Etichetta.setText("Clicca un bottone per vedere l'effetto");
        getContentPane().add(Etichetta, java.awt.BorderLayout.CENTER);

        BottoneDx.setText("Destra");
        BottoneDx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneDxActionPerformed(evt);
            }
        });
        getContentPane().add(BottoneDx, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottoneSxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneSxActionPerformed
        Etichetta.setText(BottoneSx.getText());
    }//GEN-LAST:event_BottoneSxActionPerformed

    private void BottoneDxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneDxActionPerformed
        Etichetta.setText(BottoneDx.getText());
    }//GEN-LAST:event_BottoneDxActionPerformed

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
            java.util.logging.Logger.getLogger(Finestra97.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra97.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra97.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra97.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra97().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottoneDx;
    private javax.swing.JButton BottoneSx;
    private javax.swing.JLabel Etichetta;
    // End of variables declaration//GEN-END:variables
}