package pkgfinal.project.oop;

import java.awt.Color;
import java.awt.Insets;

public class Frame3 extends javax.swing.JFrame {
    Float BMRValue;
    int exercisePlan = 0, weightPlan = 0;
    // create new form frame3

    public Frame3() {
        initComponents();
    }
    

    
    //note: Do NOT modify this code, content is generated by form editor
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JToggleButton();
        b3 = new javax.swing.JToggleButton();
        b2 = new javax.swing.JToggleButton();
        b4 = new javax.swing.JToggleButton();
        b5 = new javax.swing.JToggleButton();
        weightPlans = new javax.swing.JComboBox<>();
        Enter = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        explainTitle = new javax.swing.JLabel();
        explain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 223));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setBackground(new java.awt.Color(225, 255, 177));
        buttonGroup1.add(b1);
        b1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Never Exercise.png"))); // NOI18N
        b1.setSelected(true);
        b1.setActionCommand("<html>Little / Never Exercise");
        b1.setBorder(null);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 134, 72));

        b3.setBackground(new java.awt.Color(225, 255, 177));
        buttonGroup1.add(b3);
        b3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Moderate Exercise.png"))); // NOI18N
        b3.setBorder(null);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 130, 72));

        b2.setBackground(new java.awt.Color(225, 255, 177));
        buttonGroup1.add(b2);
        b2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b2.setText("<html>Light Exercise");
        b2.setBorder(null);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 130, 72));

        b4.setBackground(new java.awt.Color(225, 255, 177));
        buttonGroup1.add(b4);
        b4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b4.setText("<html>Hard Exercise");
        b4.setBorder(null);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 130, 70));

        b5.setBackground(new java.awt.Color(225, 255, 177));
        buttonGroup1.add(b5);
        b5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Extreme Exercise.png"))); // NOI18N
        b5.setBorder(null);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 140, 72));

        weightPlans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Extreme Weight Loss", "Weight Loss", "Mild Weight Loss", "Maintain Weight", "Mild Weight Gain", "Weight Gain", "Fast Weight Gain" }));
        weightPlans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightPlansActionPerformed(evt);
            }
        });
        jPanel1.add(weightPlans, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 284, 34));

        Enter.setBackground(new java.awt.Color(182, 227, 136));
        Enter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Enter.setForeground(new java.awt.Color(255, 255, 255));
        Enter.setText("Next");
        Enter.setBorder(null);
        Enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EnterMouseClicked(evt);
            }
        });
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        jPanel1.add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 223, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Exercise Rate");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 308, 93));

        jSeparator2.setForeground(new java.awt.Color(200, 234, 166));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 234, 166), 5));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dumbell.png"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 34, 107, 107));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel3.setText("<html>Select Your");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 44, 100, 90));

        jButton1.setBackground(new java.awt.Color(182, 227, 136));
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(182, 227, 136), 10, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 230, 60));

        explainTitle.setBackground(new java.awt.Color(150, 150, 150));
        explainTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        explainTitle.setForeground(new java.awt.Color(150, 150, 150));
        explainTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(explainTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 570, 290, 30));

        explain.setBackground(new java.awt.Color(150, 150, 150));
        explain.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        explain.setForeground(new java.awt.Color(150, 150, 150));
        explain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(explain, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 330, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

    }//GEN-LAST:event_b5ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

    }//GEN-LAST:event_b4ActionPerformed

    private void EnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterMouseClicked

    }//GEN-LAST:event_EnterMouseClicked

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        Frame4 frm4 = new Frame4();
        exercisePlan = getExercisePlan();
        weightPlan = getWeightPlan();
        frm4.exercisePlan = getExercisePlan();
        frm4.weightPlan = getWeightPlan();
        Float caloryNeed = main.calculateCalory(BMRValue, weightPlan, exercisePlan);
        frm4.hasil.setText(Float.toString(caloryNeed));
        frm4.setVisible(true);
        frm4.caloryNeed = caloryNeed;
        dispose();
    }//GEN-LAST:event_EnterActionPerformed

    private void weightPlansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightPlansActionPerformed

    }//GEN-LAST:event_weightPlansActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        // TODO add your handling code here:
        explainTitle.setText("Little / No Exercise");
        explainTitle.setVisible(true);
        explain.setText("<html>For a person who does a little to no exercise</html>");
        explain.setVisible(true);

    }//GEN-LAST:event_b1MouseEntered

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        // TODO add your handling code here:
        explainTitle.setText("Light Exercise");
        explainTitle.setVisible(true);
        explain.setText("<html>For a slightly active person who performs light exercise 1-3 days a week</html>");
        explain.setVisible(true);
    }//GEN-LAST:event_b2MouseEntered

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        // TODO add your handling code here:
        explainTitle.setText("Moderate Exercise");
        explainTitle.setVisible(true);
        explain.setText("<html>For a moderately active person who performs moderate exercise 3-5 days a week</html>");
        explain.setVisible(true);

    }//GEN-LAST:event_b3MouseEntered

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        // TODO add your handling code here:
        explainTitle.setText("Hard Exercise");
        explainTitle.setVisible(true);
        explain.setText("<html>For a very active person who performs hard exercise 6-7 days a week</html>");
        explain.setVisible(true);

    }//GEN-LAST:event_b4MouseEntered

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
        // TODO add your handling code here:
        explainTitle.setText("Extreme Exercise");
        explainTitle.setVisible(true);
        explain.setText("<html>For an extra active person who either has a physically demanding job or has a particularly challenging exercise routine</html>");
        explain.setVisible(true);

    }//GEN-LAST:event_b5MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //create and display form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }
    
    public int getExercisePlan() {
        if(b1.isSelected()) return 1;
        else if(b2.isSelected()) return 2;
        else if(b3.isSelected()) return 3;
        else if(b4.isSelected()) return 4;
        else if(b5.isSelected()) return 5;
        else return 0;
    }
    
    public int getWeightPlan() {
        int idx = weightPlans.getSelectedIndex();
        if(idx == 0) return 1;
        else if(idx == 1) return 2;
        else if(idx == 2) return 3;
        else if(idx == 3) return 4;
        else if(idx == 4) return 5;
        else if(idx == 5) return 6;
        else if(idx == 6) return 7;
        else return 0;
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JToggleButton b1;
    private javax.swing.JToggleButton b2;
    private javax.swing.JToggleButton b3;
    private javax.swing.JToggleButton b4;
    private javax.swing.JToggleButton b5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel explain;
    private javax.swing.JLabel explainTitle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JComboBox<String> weightPlans;
    // End of variables declaration//GEN-END:variables
}
