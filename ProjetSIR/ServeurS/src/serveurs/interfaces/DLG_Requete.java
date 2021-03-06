/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurs.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import serveurs.Schema_global;
import serveurs.arbre_requetes.Arbre;

/**
 *
 * @author yv965015
 */
public class DLG_Requete extends javax.swing.JFrame {
    Schema_global Schemag;
    ArrayList<String> l_tables;
    ArrayList<String> l_attributs;
    ArrayList<String> l_cond;
    /**
     * Creates new form DLG_Requete
     */
    public DLG_Requete() {
        initComponents();
        initialiserCB();
        l_attributs=new ArrayList<String>();
        l_tables=new ArrayList<String>();
        l_cond=new ArrayList<String>();
    }
    public void initialiserCB()
    {
        Schemag=new Schema_global();
        ArrayList<String> l_tab_temp=new ArrayList(Arrays.asList(Schemag.get_liste_nom_tables()));
        this.cb_tables.removeAllItems();
        this.cb_att1.removeAllItems();
        this.cb_att2.removeAllItems();
        this.cb_attributs.removeAllItems();
        this.ta_from.setText("");
        this.ta_select.setText("");
        this.ta_where.setText("");
        
        this.cb_att1.setSelectedIndex(-1);
        this.cb_att2.setSelectedIndex(-1);
        this.cb_attributs.setSelectedIndex(-1);

        for(int i=0;i<l_tab_temp.size();i++)
        {
            this.cb_tables.addItem(l_tab_temp.get(i));
        }
        this.cb_att2.addItem("valeur");
        this.cb_tables.setSelectedIndex(-1);
        
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        pan_select = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_tables = new javax.swing.JComboBox<>();
        ajouter_table_button = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_select = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cb_attributs = new javax.swing.JComboBox<>();
        ajouter_attribut_button = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_from = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cb_att1 = new javax.swing.JComboBox<>();
        cb_condition = new javax.swing.JComboBox<>();
        cb_att2 = new javax.swing.JComboBox<>();
        ajouter_condition_button = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta_where = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        valider_button = new javax.swing.JButton();
        quitter_button = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        reset_button = new javax.swing.JButton();

        setTitle("Creation requete");
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pan_select.setLayout(new java.awt.GridLayout(4, 2));

        jPanel1.setLayout(new java.awt.GridLayout(1, 4));

        jLabel1.setText("Tables");
        jPanel1.add(jLabel1);

        jPanel1.add(cb_tables);

        ajouter_table_button.setText("Ajouter");
        ajouter_table_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ajouter_table_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(ajouter_table_button);

        pan_select.add(jPanel1);

        jPanel5.setLayout(new java.awt.GridLayout(1, 2));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("SELECT");
        jPanel5.add(jLabel4);

        ta_select.setColumns(20);
        ta_select.setForeground(new java.awt.Color(0, 0, 0));
        ta_select.setRows(5);
        ta_select.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_select.setEnabled(false);
        jScrollPane4.setViewportView(ta_select);

        jPanel5.add(jScrollPane4);

        pan_select.add(jPanel5);

        jPanel2.setLayout(new java.awt.GridLayout(1, 4));

        jLabel2.setText("Attributs");
        jPanel2.add(jLabel2);

        jPanel2.add(cb_attributs);

        ajouter_attribut_button.setText("Ajouter");
        ajouter_attribut_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ajouter_attribut_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(ajouter_attribut_button);

        pan_select.add(jPanel2);

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("FROM");
        jPanel4.add(jLabel6);

        ta_from.setColumns(20);
        ta_from.setForeground(new java.awt.Color(0, 0, 0));
        ta_from.setRows(5);
        ta_from.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_from.setEnabled(false);
        jScrollPane6.setViewportView(ta_from);

        jPanel4.add(jScrollPane6);

        pan_select.add(jPanel4);

        jPanel3.setLayout(new java.awt.GridLayout(1, 6));

        jLabel3.setText("Conditions");
        jPanel3.add(jLabel3);

        cb_att1.setToolTipText("");
        jPanel3.add(cb_att1);

        cb_condition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<>", ">", ">=", "<", "<=" }));
        jPanel3.add(cb_condition);

        jPanel3.add(cb_att2);

        ajouter_condition_button.setText("Ajouter");
        ajouter_condition_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ajouter_condition_buttonActionPerformed(evt);
            }
        });
        jPanel3.add(ajouter_condition_button);

        pan_select.add(jPanel3);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("WHERE");
        jPanel6.add(jLabel5);

        ta_where.setColumns(20);
        ta_where.setRows(5);
        ta_where.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        ta_where.setEnabled(false);
        jScrollPane5.setViewportView(ta_where);

        jPanel6.add(jScrollPane5);

        pan_select.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        valider_button.setText("Valider");
        valider_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                valider_buttonActionPerformed(evt);
            }
        });
        jPanel7.add(valider_button);

        quitter_button.setText("Quitter");
        quitter_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                quitter_buttonActionPerformed(evt);
            }
        });
        jPanel7.add(quitter_button);

        pan_select.add(jPanel7);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        reset_button.setText("Réinitialiser");
        reset_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                reset_buttonActionPerformed(evt);
            }
        });
        jPanel8.add(reset_button);

        pan_select.add(jPanel8);

        jTabbedPane2.addTab("Select", pan_select);

        getContentPane().add(jTabbedPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitter_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitter_buttonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_quitter_buttonActionPerformed

    private void reset_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_buttonActionPerformed
        this.initialiserCB();
    }//GEN-LAST:event_reset_buttonActionPerformed

    private void ajouter_table_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_table_buttonActionPerformed
        if(cb_tables.getSelectedIndex()!=-1)
        {
            String table=(String)cb_tables.getSelectedItem();
            ArrayList<String> l_att_temp=new ArrayList(Arrays.asList(Schemag.get_liste_attributs_table(table)));
            cb_tables.removeItem(table);
            l_tables.add(table);
            if(ta_from.getText().length()!=0)
            {
                ta_from.append(", ");
            }    
            ta_from.append(table);
            for(int i=0;i<l_att_temp.size();i++)
            {
                cb_attributs.addItem(table+"."+l_att_temp.get(i));
                cb_att1.addItem(table+"."+l_att_temp.get(i));
                cb_att2.addItem(table+"."+l_att_temp.get(i));
            }
            
        }
        else
        {
            JOptionPane jop = new JOptionPane();    	
            jop.showMessageDialog(null, "Vous n'avez rien sélectionné", "Erreur", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_ajouter_table_buttonActionPerformed

    private void ajouter_attribut_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_attribut_buttonActionPerformed
        if(cb_attributs.getSelectedIndex()!=-1)
        {
            String attribut=(String)cb_attributs.getSelectedItem();
            cb_attributs.removeItem(attribut);
            l_attributs.add(attribut);
            if(ta_select.getText().length()!=0)
            {
                ta_select.append(", ");
            }    
            ta_select.append(attribut);
        }
        else
        {
            JOptionPane jop = new JOptionPane();    	
            jop.showMessageDialog(null, "Vous n'avez rien sélectionné", "Erreur", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_ajouter_attribut_buttonActionPerformed

    private void ajouter_condition_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouter_condition_buttonActionPerformed
        if(cb_att1.getSelectedIndex()!=-1&&cb_att2.getSelectedIndex()!=-1&&cb_condition.getSelectedIndex()!=-1)
        {
            String att1=(String)cb_att1.getSelectedItem();
            String att2=(String)cb_att2.getSelectedItem();
            String signe=(String)cb_condition.getSelectedItem();
             String cond="";
            if(att2.equals("valeur"))
            {
                JOptionPane jop2 = new JOptionPane();
                att2 = jop2.showInputDialog(null,"Valeur ?", JOptionPane.QUESTION_MESSAGE);
                cond="C;"+att1+";"+signe+";"+att2;
            }
            else
            {
                if(!(att1.split("\\.")[0].equals(att2.split("\\.")[0])))
                {
                    cond="J"+";"+att1+";"+signe+";"+att2;
                }
                else
                    cond="C"+";"+att1+";"+signe+";"+att2;
            }
            if(ta_where.getText().length()!=0)
            {
                ta_where.append(", ");
            }
            ta_where.append(att1+signe+att2);
            l_cond.add(cond);
            
            
        }
        else
        {
            JOptionPane jop = new JOptionPane();    	
            jop.showMessageDialog(null, "Vous n'avez rien sélectionné", "Erreur", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }//GEN-LAST:event_ajouter_condition_buttonActionPerformed

    private void valider_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_valider_buttonActionPerformed
    {//GEN-HEADEREND:event_valider_buttonActionPerformed
        Arbre arbre = new Arbre(l_attributs,l_cond);
        this.setVisible(false);
    }//GEN-LAST:event_valider_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(DLG_Requete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DLG_Requete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DLG_Requete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DLG_Requete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DLG_Requete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouter_attribut_button;
    private javax.swing.JButton ajouter_condition_button;
    private javax.swing.JButton ajouter_table_button;
    private javax.swing.JComboBox<String> cb_att1;
    private javax.swing.JComboBox<String> cb_att2;
    private javax.swing.JComboBox<String> cb_attributs;
    private javax.swing.JComboBox<String> cb_condition;
    private javax.swing.JComboBox<String> cb_tables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel pan_select;
    private javax.swing.JButton quitter_button;
    private javax.swing.JButton reset_button;
    private javax.swing.JTextArea ta_from;
    private javax.swing.JTextArea ta_select;
    private javax.swing.JTextArea ta_where;
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables
}
