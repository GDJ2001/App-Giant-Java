
package app.store;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants;

public class PasswordReset extends javax.swing.JFrame {

    public PasswordReset() {
        initComponents();
    }

    public void close() {

        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Password = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Support = new javax.swing.JButton();
        Email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 280, 20));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 280, 20));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Group 5.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 150, 40));

        Support.setBackground(new java.awt.Color(0, 0, 0));
        Support.setFont(new java.awt.Font("Caveat", 0, 12)); // NOI18N
        Support.setForeground(new java.awt.Color(255, 255, 255));
        Support.setText("Support");
        Support.setBorder(null);
        Support.setBorderPainted(false);
        Support.setContentAreaFilled(false);
        Support.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Support.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Support.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Support.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SupportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SupportMouseExited(evt);
            }
        });
        Support.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupportActionPerformed(evt);
            }
        });
        jPanel1.add(Support, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, 20));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(null);
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 280, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Set Password.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 719, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void SupportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupportActionPerformed

    }//GEN-LAST:event_SupportActionPerformed

    private void SupportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupportMouseExited
        Support.setText("Support");
    }//GEN-LAST:event_SupportMouseExited

    private void SupportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupportMouseEntered
        Support.setText("<html><u>Support</u></html>");
    }//GEN-LAST:event_SupportMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String email = Email.getText();
            String password = Password.getText();

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user_data", "root", "")) 
            {
                try (PreparedStatement ps = con.prepareStatement("UPDATE user SET userpassword=? WHERE useremail=?")) 
                {
                    ps.setString(1, password);
                    ps.setString(2, email);

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Update Successfully");
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(PasswordReset.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        close();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordReset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Password;
    private javax.swing.JButton Support;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
