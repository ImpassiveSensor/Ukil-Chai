/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lawyer;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class forgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form forgetPassword
     */
    int flag = 0;
    public forgetPassword(int n) {
        initComponents();
        flag = n;
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
        submit = new javax.swing.JLabel();
        IDD = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cross = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 153, 153));
        submit.setText("Submit");
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        jPanel1.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        IDD.setBackground(new java.awt.Color(204, 255, 255));
        IDD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IDD.setText("Type your Email here");
        IDD.setBorder(null);
        IDD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDDMouseClicked(evt);
            }
        });
        IDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDDActionPerformed(evt);
            }
        });
        jPanel1.add(IDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 610, 32));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 630, 10));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Email address : ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        cross.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cross.setForeground(new java.awt.Color(255, 102, 102));
        cross.setText("X");
        cross.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossMouseClicked(evt);
            }
        });
        jPanel1.add(cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 19, 20, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IDDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDDMouseClicked
        // TODO add your handling code here:
        IDD.setText("");
    }//GEN-LAST:event_IDDMouseClicked

    private void IDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDDActionPerformed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
        // TODO add your handling code here:
        String s = IDD.getText();
         JOptionPane.showMessageDialog(null,"Check your Inbox");
        try{
        javaMail.sendMail(s, flag);
        }catch(Exception e){
            e.printStackTrace();
        }
        this.setVisible(false);
        new welcome().setVisible(true);
    }//GEN-LAST:event_submitMouseClicked

    private void crossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new welcome().setVisible(true);
    }//GEN-LAST:event_crossMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(forgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgetPassword(3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDD;
    private javax.swing.JLabel cross;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel submit;
    // End of variables declaration//GEN-END:variables
}
