/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsir.interfaces;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import projetsir.bd_globale;

/**
 *
 * @author yv965015
 */
public class DLG_Frag_Horizontale extends javax.swing.JFrame
{
    bd_globale bdg;
    ArrayList<String> fragments;
    String temp;
    /**
     * Creates new form DLG_Frag_Horizontale
     */
    public DLG_Frag_Horizontale()
    {
        initComponents();
        bdg=new bd_globale();
        String[] l_tables=bdg.get_liste_nom_tables();
        cb_tables.removeAllItems();
        fragments=new ArrayList();
        temp="";
        for (String l_table : l_tables)
        {
            cb_tables.addItem(l_table);
        }
       
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

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_tables = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        cb_comp_att = new javax.swing.JComboBox<>();
        cb_comp_signe = new javax.swing.JComboBox<>();
        cb_comp_att2 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        reinit_button = new javax.swing.JButton();
        ajouter_button = new javax.swing.JButton();
        Valider_frag_button = new javax.swing.JButton();
        resume_frag_h = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        annuler_button = new javax.swing.JButton();
        valider_button = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        jPanel5.setLayout(new java.awt.GridLayout(3, 1));

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tables");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel1);

        cb_tables.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cb_tablesActionPerformed(evt);
            }
        });
        jPanel2.add(cb_tables);

        jPanel5.add(jPanel2);

        jPanel4.setLayout(new java.awt.GridLayout(1, 3));

        jPanel4.add(cb_comp_att);

        cb_comp_signe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">", "<=", ">=", "<>" }));
        cb_comp_signe.setSelectedIndex(-1);
        jPanel4.add(cb_comp_signe);

        cb_comp_att2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "valeur" }));
        cb_comp_att2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cb_comp_att2ActionPerformed(evt);
            }
        });
        jPanel4.add(cb_comp_att2);

        jPanel5.add(jPanel4);

        jPanel7.setLayout(new java.awt.GridLayout(1, 3));

        reinit_button.setText("Reinitialiser fragment");
        jPanel7.add(reinit_button);

        ajouter_button.setText("Ajouter condition dans fragment");
        ajouter_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ajouter_buttonActionPerformed(evt);
            }
        });
        jPanel7.add(ajouter_button);

        Valider_frag_button.setText("Valider fragment");
        Valider_frag_button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                Valider_frag_buttonActionPerformed(evt);
            }
        });
        jPanel7.add(Valider_frag_button);

        jPanel5.add(jPanel7);

        jPanel1.add(jPanel5);

        javax.swing.GroupLayout resume_frag_hLayout = new javax.swing.GroupLayout(resume_frag_h);
        resume_frag_h.setLayout(resume_frag_hLayout);
        resume_frag_hLayout.setHorizontalGroup(
            resume_frag_hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 792, Short.MAX_VALUE)
        );
        resume_frag_hLayout.setVerticalGroup(
            resume_frag_hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jPanel1.add(resume_frag_h);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.GridLayout());

        annuler_button.setText("Annuler");
        jPanel8.add(annuler_button);

        valider_button.setText("Valider");
        jPanel8.add(valider_button);

        getContentPane().add(jPanel8, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Valider_frag_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_Valider_frag_buttonActionPerformed
    {//GEN-HEADEREND:event_Valider_frag_buttonActionPerformed
       if(temp!="")
       {
           this.fragments.add(temp);
           temp="";
       }
        if(this.fragments.size()>0)
        {
            this.resume_frag_h.removeAll();
            GridLayout gd=new GridLayout(this.fragments.size(),2);
            this.resume_frag_h.setLayout(gd);
            for(int i=0;i<this.fragments.size();i++)
            {
                JLabel lab=new JLabel();
                String nom="Fragment "+i;
                lab.setText(nom);
                this.resume_frag_h.add(lab);
                JTextField tf=new JTextField();
                tf.setEnabled(false);
                String text="";
                String[] split1=this.fragments.get(i).split("@");
                for(int k=0;k<split1.length;k++)
                {
                    String[] split=split1[k].split(";");
                    for(int j=0;j<split.length;j++)
                    {
                        if(j==0)
                        {
                            text+=split[j]+".";
                        }
                        else
                            text+=split[j]+" ";
                    }
                    if(k!=split1.length-1)
                        text+=" AND ";
                }
                tf.setText(text);
                this.resume_frag_h.add(tf);
                
            }
             this.setSize(this.getWidth()+1, this.getHeight()+1);
        this.setSize(this.getWidth()-1, this.getHeight()-1);
        }
        
    }//GEN-LAST:event_Valider_frag_buttonActionPerformed

    private void cb_tablesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cb_tablesActionPerformed
    {//GEN-HEADEREND:event_cb_tablesActionPerformed
        if(cb_tables.getSelectedIndex()!=-1)
        {
            String table=cb_tables.getSelectedItem().toString();
            String[] l_atts=bdg.get_liste_attributs_table(table);
            this.cb_comp_att.removeAllItems();
            for(String l_att : l_atts)
            {
                this.cb_comp_att.addItem(l_att);
            }
        }
    }//GEN-LAST:event_cb_tablesActionPerformed

    private void cb_comp_att2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cb_comp_att2ActionPerformed
    {//GEN-HEADEREND:event_cb_comp_att2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_comp_att2ActionPerformed

    private void ajouter_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ajouter_buttonActionPerformed
    {//GEN-HEADEREND:event_ajouter_buttonActionPerformed
        int valInt=-1;
        String table,att="";
        String valS="";
        
        if(this.cb_comp_att.getSelectedIndex()!=-1)
        {
            if(this.cb_comp_signe.getSelectedIndex()!=-1)
            {
                if(this.cb_comp_att2.getSelectedIndex()!=-1)
                {
                    table=this.cb_tables.getSelectedItem().toString();
                    att=this.cb_comp_att.getSelectedItem().toString();
                    System.out.println(bdg.get_type_attribut(table, att));
                    String[] split=bdg.get_type_attribut(table, att).split("\\(");
                    String val="";
                    boolean continuer=true;
                    String mes="Valeur (entier)?";
                    if(split[0].equals("NUMBER"))
                    {
                        JOptionPane jop2 = new JOptionPane();
                        while(continuer&&valInt<0)
                        {
                            val = jop2.showInputDialog(null,mes, JOptionPane.QUESTION_MESSAGE);
                            if(val!=null)
                            {
                                try{
                                    valInt=Integer.parseInt(val);
                                    temp+=(table+";"+att+";"+this.cb_comp_signe.getSelectedItem().toString()+";"+valInt+"@");
                                }catch(NumberFormatException e)
                                {
                                    mes="Valeur ? Merci de mettre un entier positif !";
                                }
                                 mes="Valeur ? Merci de mettre un entier positif !";
                            }
                            else
                            {
                                continuer=false;
                            }
                                
                        }
                    }
                    else
                    {
                        JOptionPane jop2 = new JOptionPane();
                         while(continuer)
                        {
                            val = jop2.showInputDialog(null,mes, JOptionPane.QUESTION_MESSAGE);
                            if(val!=null)
                            {
                                valS = jop2.showInputDialog(null,"Valeur (chaine de caractère)?", JOptionPane.QUESTION_MESSAGE);
                                temp+=(table+";"+att+";"+this.cb_comp_signe.getSelectedItem().toString()+";"+valS+"@");
                                continuer=false;
                            }
                            else
                                mes="Valeurs ? Merci de mettre une chaine valable!";
                        }
                      
                    }
                }
            }
        }
    }//GEN-LAST:event_ajouter_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DLG_Frag_Horizontale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DLG_Frag_Horizontale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(DLG_Frag_Horizontale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DLG_Frag_Horizontale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new DLG_Frag_Horizontale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Valider_frag_button;
    private javax.swing.JButton ajouter_button;
    private javax.swing.JButton annuler_button;
    private javax.swing.JComboBox<String> cb_comp_att;
    private javax.swing.JComboBox<String> cb_comp_att2;
    private javax.swing.JComboBox<String> cb_comp_signe;
    private javax.swing.JComboBox<String> cb_tables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton reinit_button;
    private javax.swing.JPanel resume_frag_h;
    private javax.swing.JButton valider_button;
    // End of variables declaration//GEN-END:variables
}
