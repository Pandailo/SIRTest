/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurs.interfaces;

/**
 *
 * @author yv965015
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        param_button = new javax.swing.JButton();
        request_button = new javax.swing.JButton();
        quitter_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        param_button.setText("Paramétrer");
        param_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                param_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(param_button);

        request_button.setText("Faire une requête");
        request_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                request_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(request_button);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        quitter_button.setText("Quitter");
        quitter_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quitter_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(quitter_button, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitter_buttonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_quitter_buttonActionPerformed

    private void request_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_request_buttonActionPerformed
        DLG_Requete dlg_r=new DLG_Requete();
        dlg_r.setVisible(true);
    }//GEN-LAST:event_request_buttonActionPerformed

    private void param_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_param_buttonActionPerformed
        Dlg_parametres dlg = new Dlg_parametres();
        dlg.setVisible(true);
    }//GEN-LAST:event_param_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton param_button;
    private javax.swing.JButton quitter_button;
    private javax.swing.JButton request_button;
    // End of variables declaration//GEN-END:variables
}
