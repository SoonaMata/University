/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_3;

import java.awt.Color;

/**
 *
 * @author paolo
 */
public class Finestra extends javax.swing.JFrame {

    int voltePremuto=0;
    public Finestra() {
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

        Pannello = new javax.swing.JPanel();
        Bottone = new javax.swing.JButton();
        Canvas = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Bottone.setText("Colora");
        Bottone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PannelloLayout = new javax.swing.GroupLayout(Pannello);
        Pannello.setLayout(PannelloLayout);
        PannelloLayout.setHorizontalGroup(
            PannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PannelloLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Bottone, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        PannelloLayout.setVerticalGroup(
            PannelloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PannelloLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(Bottone)
                .addGap(29, 29, 29))
        );

        getContentPane().add(Pannello, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        getContentPane().add(Canvas, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottoneActionPerformed
        voltePremuto++;
        System.out.println("Pulsante premuto "+voltePremuto+ " volte");
        if(voltePremuto%3==0)
            Canvas.setBackground(Color.red);
        else
            Canvas.setBackground(Color.green);
    }//GEN-LAST:event_BottoneActionPerformed

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
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bottone;
    private javax.swing.JPanel Canvas;
    private javax.swing.JPanel Pannello;
    // End of variables declaration//GEN-END:variables
}
