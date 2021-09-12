/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lawyer;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

/**
 *
 * @author Asus
 */
public class ClientLogin extends javax.swing.JFrame {

    /**
     * Creates new form ClientLogin
     */
    public ClientLogin() {
        initComponents();
        String l = "D:\\Icon\\backButton.png";
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(l).getImage().getScaledInstance(backing.getWidth(), backing.getHeight(), Image.SCALE_SMOOTH));
        backing.setIcon(imageIcon);
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
        jPanel2 = new javax.swing.JPanel();
        IDD = new javax.swing.JTextField();
        pword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signUp = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        logIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        warn = new javax.swing.JLabel();
        forget = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        backing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(186, 79, 84));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IDD.setBackground(new java.awt.Color(186, 79, 84));
        IDD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDD.setForeground(new java.awt.Color(255, 255, 255));
        IDD.setText("User Name");
        IDD.setBorder(null);
        IDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDDMouseClicked(evt);
            }
        });
        jPanel2.add(IDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 156, 285, 32));

        pword.setBackground(new java.awt.Color(186, 79, 84));
        pword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pword.setForeground(new java.awt.Color(255, 255, 255));
        pword.setText("abcd");
        pword.setBorder(null);
        jPanel2.add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 220, 285, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 254, 310, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 190, 300, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lawyer/icons8-lock-30.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 30, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lawyer/icons8-change-user-30.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 30, 40));

        signUp.setBackground(new java.awt.Color(186, 79, 84));
        signUp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sign Up");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signUpLayout = new javax.swing.GroupLayout(signUp);
        signUp.setLayout(signUpLayout);
        signUpLayout.setHorizontalGroup(
            signUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        signUpLayout.setVerticalGroup(
            signUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 130, 50));

        logIn.setBackground(new java.awt.Color(186, 79, 84));
        logIn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Log In");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout logInLayout = new javax.swing.GroupLayout(logIn);
        logIn.setLayout(logInLayout);
        logInLayout.setHorizontalGroup(
            logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        logInLayout.setVerticalGroup(
            logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 130, 50));

        warn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        warn.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(warn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 330, 30));

        forget.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        forget.setForeground(new java.awt.Color(255, 255, 255));
        forget.setText("Forget Password?");
        forget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetMouseClicked(evt);
            }
        });
        jPanel2.add(forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara Light", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Client Panel");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 210, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 500, 560));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lawyer/aa.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        backing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        backing.setForeground(new java.awt.Color(255, 255, 255));
        backing.setText("X");
        backing.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(backing, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backing, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel7)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backingMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new welcome().setVisible(true);
    }//GEN-LAST:event_backingMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=LawFirm;selectMethod=cursor", "sa", "123456");

            String sql = "Select * from userRegistration where userName=? and passwrd = ?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setString(1, IDD.getText());
                        pst.setString(2, pword.getText());
                        ResultSet rs = pst.executeQuery();
                        String Name = IDD.getText();                        
                        if(rs.next()){

                           this.setVisible(false);
                           new ClientDashboard(IDD.getText()).setVisible(true);
                        }
                        else{
                           warn.setText("Incorrect User name or Password!");
                        }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ClientRegister().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void IDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDDMouseClicked
        // TODO add your handling code here:
        IDD.setText("");
        pword.setText("");
    }//GEN-LAST:event_IDDMouseClicked

    private void forgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new forgetPassword(1).setVisible(true);
    }//GEN-LAST:event_forgetMouseClicked

    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=LawFirm;selectMethod=cursor", "sa", "123456");

            String sql = "Select * from userRegistration where userName=? and passwrd = ?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setString(1, IDD.getText());
                        pst.setString(2, pword.getText());
                        ResultSet rs = pst.executeQuery();
                        String Name = IDD.getText();                        
                        if(rs.next()){

                           this.setVisible(false);
                           new ClientDashboard(IDD.getText()).setVisible(true);
                        }
                        else{
                           warn.setText("Incorrect User name or Password!");
                        }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_logInMouseClicked

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new ClientRegister().setVisible(true);
    }//GEN-LAST:event_signUpMouseClicked

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
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDD;
    private javax.swing.JLabel backing;
    private javax.swing.JLabel forget;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel logIn;
    private javax.swing.JPasswordField pword;
    private javax.swing.JPanel signUp;
    private javax.swing.JLabel warn;
    // End of variables declaration//GEN-END:variables
}
