package app.store;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class LogIn extends javax.swing.JFrame {

    public LogIn() {
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
        UserName = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        FP = new javax.swing.JButton();
        LogIn = new javax.swing.JButton();
        NA = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserName.setBackground(new java.awt.Color(255, 255, 255));
        UserName.setBorder(null);
        UserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameActionPerformed(evt);
            }
        });
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 290, 20));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 290, -1));

        FP.setBackground(new java.awt.Color(0, 0, 0));
        FP.setFont(new java.awt.Font("Caveat", 1, 14)); // NOI18N
        FP.setForeground(java.awt.Color.white);
        FP.setText("Forgot Password?");
        FP.setBorder(null);
        FP.setBorderPainted(false);
        FP.setContentAreaFilled(false);
        FP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FPMouseExited(evt);
            }
        });
        FP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPActionPerformed(evt);
            }
        });
        jPanel1.add(FP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 100, -1));

        LogIn.setBackground(new java.awt.Color(0, 0, 0));
        LogIn.setFont(new java.awt.Font("Caveat", 1, 24)); // NOI18N
        LogIn.setForeground(java.awt.Color.white);
        LogIn.setText("Log in");
        LogIn.setBorder(null);
        LogIn.setBorderPainted(false);
        LogIn.setContentAreaFilled(false);
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });
        jPanel1.add(LogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 70, 30));

        NA.setBackground(new java.awt.Color(0, 0, 0));
        NA.setFont(new java.awt.Font("Caveat", 1, 14)); // NOI18N
        NA.setForeground(java.awt.Color.white);
        NA.setText("New Account");
        NA.setBorder(null);
        NA.setBorderPainted(false);
        NA.setContentAreaFilled(false);
        NA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NAMouseExited(evt);
            }
        });
        NA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAActionPerformed(evt);
            }
        });
        jPanel1.add(NA, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 100, 20));

        jCheckBox1.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setFont(new java.awt.Font("Caveat", 1, 24)); // NOI18N
        jCheckBox1.setForeground(java.awt.Color.white);
        jCheckBox1.setText(" Remember Me");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 150, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/a.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 260, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/b.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 260, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/LogIn.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameActionPerformed

    }//GEN-LAST:event_UserNameActionPerformed

    private void FPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPActionPerformed
        close();
        new PasswordReset().setVisible(true);
    }//GEN-LAST:event_FPActionPerformed

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        String username = UserName.getText();
        char[] passwordChars = Password.getPassword();
        String password = new String(passwordChars);

        if (validateLogin(username, password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            close();
        } else {
            JOptionPane.showMessageDialog(this, "Login failed. Please try again.");
            UserName.setText("");
            Password.setText("");
        }

    }

    private boolean validateLogin(String username, String password) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/user_data";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

            String query = "SELECT * FROM user WHERE useremail=? AND userpassword=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            boolean isValid = resultSet.next();

            resultSet.close();
            preparedStatement.close();
            connection.close();

            if (isValid) {
                new Home().setVisible(true);

            }

            return isValid;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

    }//GEN-LAST:event_LogInActionPerformed

    private void NAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAActionPerformed
        close();
        new Registration().setVisible(true);
    }//GEN-LAST:event_NAActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void FPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FPMouseEntered
        FP.setText("<html><u>Forgot Password?</u></html>");
    }//GEN-LAST:event_FPMouseEntered

    private void FPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FPMouseExited
        FP.setText("Forgot Password?");
    }//GEN-LAST:event_FPMouseExited

    private void NAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAMouseEntered
        NA.setText("<html><u>New Account</u></html>");
    }//GEN-LAST:event_NAMouseEntered

    private void NAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NAMouseExited
        NA.setText("New Account");
    }//GEN-LAST:event_NAMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FP;
    private javax.swing.JButton LogIn;
    private javax.swing.JButton NA;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
