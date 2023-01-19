/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkgfinal.project.oop;

import java.awt.Insets;
import java.util.ArrayList;

/**
 *
 * @author HP-PC
 */
public class loginPage extends javax.swing.JFrame {
    /**
     * Creates new form loginPage
     */
    
//    public static User[] dummy = main.user();
    public loginPage() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        Enter = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 223));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>Welcome Back!");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 118, 228, 93));

        jSeparator2.setForeground(new java.awt.Color(200, 234, 166));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 234, 166), 5));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 221, 70, 4));

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(199, 242, 164), 10, true));
        jPanel5.setMaximumSize(new java.awt.Dimension(344, 259));
        jPanel5.setMinimumSize(new java.awt.Dimension(344, 259));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Email Address");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        email.setBackground(new java.awt.Color(252, 252, 252));
        email.setToolTipText("");
        email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, 35));
        email.setMargin(new Insets(0, 6, 0, 0));

        password.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 280, 35));
        password.setMargin(new Insets(0, 6, 0, 0));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 278, 344, 210));

        Enter.setBackground(new java.awt.Color(182, 227, 136));
        Enter.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Enter.setForeground(new java.awt.Color(255, 255, 255));
        Enter.setText("Sign In");
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
        jPanel1.add(Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 223, 48));

        warning.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warning.setText("Wrong Credentials!");
        warning.setPreferredSize(new java.awt.Dimension(230, 32));
        warning.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                warningComponentHidden(evt);
            }
        });
        jPanel1.add(warning, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 610, 220, -1));
        warning.setVisible(false);

        jButton1.setBackground(new java.awt.Color(255, 255, 223));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void EnterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EnterMouseClicked

    }//GEN-LAST:event_EnterMouseClicked

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        int count = 0;
        String emailAddr = email.getText();
        String pwd = new String(password.getPassword());
        if(main.validateUser(main.users, emailAddr, pwd) == true) {
            warning.setVisible(false);
            hitungBMR frm = new hitungBMR();
            frm.setVisible(true);
            dispose();
        } else {
            warning.setVisible(true);
            System.out.println(emailAddr);
            System.out.println(pwd);
        }
    }//GEN-LAST:event_EnterActionPerformed

    private void warningComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_warningComponentHidden
        // TODO add your handling code here:
        warning.setVisible(false);
    }//GEN-LAST:event_warningComponentHidden

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        welcomePage frm = new welcomePage();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
