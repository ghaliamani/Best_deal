/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BestDeal.GUI;

import BestDeal.DAO.ClientDAO;
import BestDeal.entities.Client;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author hamdi
 */
public class FrameAjoutClient extends javax.swing.JFrame {

    /**
     * Creates new form FrameAjoutClient
     */
    public FrameAjoutClient() {
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

        Pan_Ajout = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TF_CIN = new javax.swing.JTextField();
        TF_Nom = new javax.swing.JTextField();
        TF_Prenom = new javax.swing.JTextField();
        TF_Email = new javax.swing.JTextField();
        TF_Adresse = new javax.swing.JTextField();
        TF_Postal = new javax.swing.JTextField();
        TF_Ville = new javax.swing.JTextField();
        BT_Ajout = new javax.swing.JButton();
        BT_Quitter = new javax.swing.JButton();
        PF_Mdp = new javax.swing.JPasswordField();
        PF_Cmdp = new javax.swing.JPasswordField();
        TF_DateNaissance = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pan_Ajout.setBackground(new java.awt.Color(153, 153, 255));
        Pan_Ajout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Inscription");

        jLabel2.setText("CIN");

        jLabel3.setText("Nom");

        jLabel4.setText("Prenom");

        jLabel5.setText("Email");

        jLabel6.setText("Mot de passe");

        jLabel7.setText("Confirmation mot de passe");

        jLabel8.setText("Adresse");

        jLabel9.setText("Code postal");

        jLabel10.setText("Ville");

        jLabel11.setText("Date de naissance");

        TF_CIN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TF_CIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_CINActionPerformed(evt);
            }
        });

        TF_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_EmailActionPerformed(evt);
            }
        });

        TF_Postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_PostalActionPerformed(evt);
            }
        });

        TF_Ville.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF_VilleActionPerformed(evt);
            }
        });

        BT_Ajout.setText("Ajouter");
        BT_Ajout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AjoutActionPerformed(evt);
            }
        });

        BT_Quitter.setText("Quitter");
        BT_Quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_QuitterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pan_AjoutLayout = new javax.swing.GroupLayout(Pan_Ajout);
        Pan_Ajout.setLayout(Pan_AjoutLayout);
        Pan_AjoutLayout.setHorizontalGroup(
            Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_AjoutLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pan_AjoutLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TF_CIN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_AjoutLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TF_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_AjoutLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TF_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_AjoutLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pan_AjoutLayout.createSequentialGroup()
                        .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_AjoutLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(207, 207, 207)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PF_Mdp, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(PF_Cmdp, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(TF_Adresse, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(TF_Postal, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(TF_Ville, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(TF_DateNaissance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pan_AjoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_Ajout)
                .addGap(107, 107, 107)
                .addComponent(BT_Quitter)
                .addGap(197, 197, 197))
            .addGroup(Pan_AjoutLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pan_AjoutLayout.setVerticalGroup(
            Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pan_AjoutLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_CIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TF_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(PF_Mdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PF_Cmdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TF_Adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TF_Postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TF_Ville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(TF_DateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(Pan_AjoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Quitter)
                    .addComponent(BT_Ajout))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pan_Ajout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pan_Ajout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TF_VilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_VilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_VilleActionPerformed

    private void TF_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_EmailActionPerformed

    private void TF_PostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_PostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_PostalActionPerformed

    private void BT_QuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_QuitterActionPerformed
        dispose();
    }//GEN-LAST:event_BT_QuitterActionPerformed

    private void TF_CINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF_CINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF_CINActionPerformed

    private void BT_AjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AjoutActionPerformed
        // TODO add your handling code here:
        Client cl = new Client();
        ClientDAO cdao = new ClientDAO();
        boolean b = false;
        String regexp = "[0-9]*";
        Pattern pat = Pattern.compile(regexp);
        String cin = TF_CIN.getText();
        Matcher match = pat.matcher(cin);
        String nom = TF_Nom.getText();
        String prenom = TF_Prenom.getText();
        String email = TF_Email.getText();
        String mdp = PF_Mdp.getText();
        String cmdp = PF_Cmdp.getText();
        String adresse = TF_Adresse.getText();
        String ville = TF_Ville.getText();
        String codepostal = TF_Postal.getText();
        Date datenaiss = TF_DateNaissance.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        if ((cin.length() != 8) || (!match.find())) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setCin_Client(Integer.parseInt(cin));
            b = true;
        }

        regexp = "[a-zA-Z]+";
        pat = Pattern.compile(regexp);
        match = pat.matcher(nom);

        if ((nom.length() > 30) || (!match.find())) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setNom_Client(nom);
            b = true;
        }

        match = pat.matcher(prenom);

        if ((prenom.length() > 30) || (!match.find())) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setPrenom_Client(prenom);
            b = true;
        }

        regexp = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]+";
        pat = Pattern.compile(regexp);
        match = pat.matcher(email);

        if (!match.find()) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setEmail_Client(email);
            b = true;
        }

        regexp = "[a-zA-Z0-9]+";
        pat = Pattern.compile(regexp);
        match = pat.matcher(mdp);

        if ((!match.find()) && (mdp.length() < 8)) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setMot_De_Passe_Client(mdp);
            b = true;
        }

        match = pat.matcher(cmdp);

        regexp = "[a-zA-Z0-9]+";
        pat = Pattern.compile(regexp);
        match = pat.matcher(adresse);

        if (!match.find()) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setAdresse_Client(adresse);
            b = true;
        }

        regexp = "[0-9]+";
        pat = Pattern.compile(regexp);
        match = pat.matcher(codepostal);

        if (!match.find()) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setCode_Postal_Client(Integer.parseInt(codepostal));
            b = true;
        }

        regexp = "[a-zA-Z]+";
        pat = Pattern.compile(regexp);
        match = pat.matcher(ville);

        if (!match.find()) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setVille_Client(ville);
            b = true;
        }

        if (datenaiss == null) {
            JOptionPane.showMessageDialog(rootPane, "Erreur de saisie");
            b = false;
        } else {
            cl.setDate_Naissance_Client(datenaiss);
            b = true;
        }
        System.out.println(cl);
        if (b == true) {
            cdao.insertClient(cl);
        } else {

            JOptionPane.showMessageDialog(rootPane, "Verfier vos champs");
        }
    }//GEN-LAST:event_BT_AjoutActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAjoutClient.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrameAjoutClient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Ajout;
    private javax.swing.JButton BT_Quitter;
    private javax.swing.JPasswordField PF_Cmdp;
    private javax.swing.JPasswordField PF_Mdp;
    private javax.swing.JPanel Pan_Ajout;
    private javax.swing.JTextField TF_Adresse;
    private javax.swing.JTextField TF_CIN;
    private org.jdesktop.swingx.JXDatePicker TF_DateNaissance;
    private javax.swing.JTextField TF_Email;
    private javax.swing.JTextField TF_Nom;
    private javax.swing.JTextField TF_Postal;
    private javax.swing.JTextField TF_Prenom;
    private javax.swing.JTextField TF_Ville;
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
    // End of variables declaration//GEN-END:variables
}
