/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package premiereintgraphique_maugeais;

/**
 *
 * @author thoma
 */
public class fenetreIntGraphique extends javax.swing.JFrame {

    /**
     * Creates new form fenetreIntGraphique
     */
    public fenetreIntGraphique() {
        initComponents();
        Message_Bienvenue.setText("Bonjour et bienvenue");
        Réponse_aff.setVisible(false);
        affrep.setVisible(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Message_Bienvenue = new javax.swing.JLabel();
        Validation_prénom = new javax.swing.JButton();
        Réponse = new javax.swing.JTextField();
        Consigne = new javax.swing.JLabel();
        Réponse_aff = new javax.swing.JLabel();
        affrep = new javax.swing.JLabel();
        QuestSal = new javax.swing.JLabel();
        repsalaire = new javax.swing.JTextField();
        salaireUp = new javax.swing.JToggleButton();
        SalaireUp = new javax.swing.JLabel();
        Infos = new javax.swing.JLabel();
        AffInfos = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Message_Bienvenue.setText("Bienvenue");

        Validation_prénom.setText("Valider");
        Validation_prénom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Validation_prénomActionPerformed(evt);
            }
        });

        Réponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RéponseActionPerformed(evt);
            }
        });

        Consigne.setText("Entrez votre Prénom :");

        Réponse_aff.setText("Votre prénom :");

        affrep.setText("Prénom");

        QuestSal.setBackground(new java.awt.Color(0, 0, 0));
        QuestSal.setText("Votre Salaire:");

        repsalaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repsalaireActionPerformed(evt);
            }
        });

        salaireUp.setBackground(new java.awt.Color(0, 153, 0));
        salaireUp.setText("Augmenter le salaire");
        salaireUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaireUpActionPerformed(evt);
            }
        });

        AffInfos.setBackground(new java.awt.Color(255, 51, 51));
        AffInfos.setText("Afficher les informations");
        AffInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AffInfosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(QuestSal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(repsalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(salaireUp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(Message_Bienvenue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Consigne)
                        .addGap(66, 66, 66)
                        .addComponent(Réponse, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Validation_prénom))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Réponse_aff)
                        .addGap(18, 18, 18)
                        .addComponent(affrep, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(SalaireUp, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Infos, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AffInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Message_Bienvenue)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consigne)
                    .addComponent(Réponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Validation_prénom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Réponse_aff)
                    .addComponent(affrep))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuestSal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repsalaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaireUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalaireUp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Infos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(AffInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Validation_prénomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Validation_prénomActionPerformed
        // TODO add your handling code here:
        String a = Réponse.getText();
        Réponse_aff.setVisible(true);
        affrep.setVisible(true);     
        affrep.setText(a);
    }//GEN-LAST:event_Validation_prénomActionPerformed

    private void RéponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RéponseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RéponseActionPerformed

    private void repsalaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repsalaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_repsalaireActionPerformed

    private void salaireUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaireUpActionPerformed
        // TODO add your handling code here:
        String sal = repsalaire.getText();
        int sal_int = Integer.parseInt(sal);
        sal_int = sal_int * 2;
        SalaireUp.setText("Votre nouveau salaire: "+sal_int+"€");
    }//GEN-LAST:event_salaireUpActionPerformed

    private void AffInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AffInfosActionPerformed
        // TODO add your handling code here:
        String a = Réponse.getText();
        String sal = repsalaire.getText();
        int sal_int = Integer.parseInt(sal);
        sal_int = sal_int * 2;
        Infos.setText("Vous vous appellez : "+ a+ "Votre salaire est de:     "+ sal+ "Votre nouveau salaire est de:     "+ sal_int);
        
        
    }//GEN-LAST:event_AffInfosActionPerformed

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
            java.util.logging.Logger.getLogger(fenetreIntGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreIntGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreIntGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreIntGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreIntGraphique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AffInfos;
    private javax.swing.JLabel Consigne;
    private javax.swing.JLabel Infos;
    private javax.swing.JLabel Message_Bienvenue;
    private javax.swing.JLabel QuestSal;
    private javax.swing.JTextField Réponse;
    private javax.swing.JLabel Réponse_aff;
    private javax.swing.JLabel SalaireUp;
    private javax.swing.JButton Validation_prénom;
    private javax.swing.JLabel affrep;
    private javax.swing.JTextField repsalaire;
    private javax.swing.JToggleButton salaireUp;
    // End of variables declaration//GEN-END:variables
}
