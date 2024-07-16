
package app.store;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


public class ChangeUserData extends javax.swing.JFrame {

    public ChangeUserData() {
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
        Save = new javax.swing.JButton();
        Country = new javax.swing.JTextField();
        Mobile = new javax.swing.JTextField();
        BirthDay = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Save.png"))); // NOI18N
        Save.setBorder(null);
        Save.setBorderPainted(false);
        Save.setContentAreaFilled(false);
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        jPanel1.add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, -1, 70));

        Country.setBackground(new java.awt.Color(255, 255, 255));
        Country.setBorder(null);
        jPanel1.add(Country, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 290, 30));

        Mobile.setBackground(new java.awt.Color(255, 255, 255));
        Mobile.setBorder(null);
        jPanel1.add(Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 290, 20));

        BirthDay.setBackground(new java.awt.Color(255, 255, 255));
        BirthDay.setBorder(null);
        jPanel1.add(BirthDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 290, 30));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setBorder(null);
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 290, 30));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 290, 20));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setBorder(null);
        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 290, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Update.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 499, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        try {
            String email = Email.getText();
            String name = Name.getText();
            String password = Password.getText();
            String birthDay = BirthDay.getText();
            String mobile = Mobile.getText();
            String country = Country.getText();

            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user_data", "root", "")) {
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE user SET username=?, userpassword=?, userbirthday=?, usermobile=?, usercountry=? WHERE useremail=?")) {
                    ps.setString(1, name);
                    ps.setString(2, password);
                    ps.setString(3, birthDay);
                    ps.setString(4, mobile);
                    ps.setString(5, country);
                    ps.setString(6, email);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Update Successfully");
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ChangeUserData.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();
        new Account().setVisible(true);

    }//GEN-LAST:event_SaveActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        try {
            String email = Email.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost/user_data", "root", "")) {
                try (PreparedStatement fetchPs = con.prepareStatement("SELECT * FROM user WHERE useremail=?")) {
                    fetchPs.setString(1, email);
                    try (ResultSet resultSet = fetchPs.executeQuery()) {
                        if (resultSet.next()) {
                            String previousUsername = resultSet.getString("username");
                            String previousPassword = resultSet.getString("userpassword");
                            String previousBirthday = resultSet.getString("userbirthday");
                            String previousMobile = resultSet.getString("usermobile");
                            String previousCountry = resultSet.getString("usercountry");

                            // Set the retrieved values in their respective text fields
                            Name.setText(previousUsername);
                            Password.setText(previousPassword);
                            BirthDay.setText(previousBirthday);
                            Mobile.setText(previousMobile);
                            Country.setText(previousCountry);
                        } else {
                            // Clear all fields if no data found
                            Name.setText("");
                            Password.setText("");
                            BirthDay.setText("");
                            Mobile.setText("");
                            Country.setText("");
                        }
                    }
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ChangeUserData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_EmailActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed

    }//GEN-LAST:event_NameActionPerformed

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped

    }//GEN-LAST:event_EmailKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeUserData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BirthDay;
    private javax.swing.JTextField Country;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Mobile;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
