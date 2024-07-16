package app.store;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame implements NewInterface {

    public Registration() {
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
        jButton1 = new javax.swing.JButton();
        Birth_Day = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        ConfirmPassword = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Signin.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 210, 50));

        Birth_Day.setBackground(new java.awt.Color(255, 255, 255));
        Birth_Day.setBorder(null);
        Birth_Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Birth_DayActionPerformed(evt);
            }
        });
        jPanel1.add(Birth_Day, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 290, 20));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setBorder(null);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 290, 30));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 290, 20));

        ConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        ConfirmPassword.setBorder(null);
        ConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 290, 30));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 290, 30));

        Mobile.setBackground(new java.awt.Color(255, 255, 255));
        Mobile.setBorder(null);
        jPanel1.add(Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 290, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Group 7.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Birth_DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Birth_DayActionPerformed

    }//GEN-LAST:event_Birth_DayActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed

    }//GEN-LAST:event_NameActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed

    }//GEN-LAST:event_EmailActionPerformed

    private void ConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordActionPerformed
 
    }//GEN-LAST:event_ConfirmPasswordActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String name = Name.getText();
            String email = Email.getText();
            String password = Password.getText();
            String birthDay = Birth_Day.getText();
            String mobile = Mobile.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user_data", "root", "");
            PreparedStatement ps = con.prepareStatement("insert into user(useremail,username,userpassword,userbirthday,usermobile)values(?,?,?,?,?)");

            ps.setString(1, email);
            ps.setString(2, name);
            ps.setString(3, password);
            ps.setString(4, birthDay);
            ps.setString(5, mobile);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "SignIn Successfully");

        } catch (Exception ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);

        }
        close();
        new LogIn().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Birth_Day;
    private javax.swing.JTextField ConfirmPassword;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
