
package app.store;

public class Introduction extends javax.swing.JFrame {

    public Introduction() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Skip = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Skip.setText("Skip");
        Skip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SkipActionPerformed(evt);
            }
        });
        jPanel1.add(Skip, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Group 11.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 719, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 719, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SkipActionPerformed
        LogIn jf = new LogIn();
        jf.show();
        dispose();

    }//GEN-LAST:event_SkipActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Introduction().setVisible(true);
            }
        });
        LogIn jf = new LogIn();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(80);
            }
        } catch (Exception e) {
        }
        new LogIn().setVisible(false);
        jf.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Skip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
