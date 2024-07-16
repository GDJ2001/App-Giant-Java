
package app.store;

public class Startpage extends javax.swing.JFrame {

    public Startpage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress = new javax.swing.JLabel();
        Bar = new javax.swing.JProgressBar();
        ShowStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        progress.setText("0%");
        getContentPane().add(progress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 235, -1, 10));
        getContentPane().add(Bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 230, 730, 30));

        ShowStatus.setForeground(new java.awt.Color(0, 0, 255));
        ShowStatus.setText("Starting...");
        getContentPane().add(ShowStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/store/RES/Start page.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 250));

        setSize(new java.awt.Dimension(704, 249));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        Startpage sc = new Startpage();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sc.setVisible(true);
            }
        });
        Introduction n = new Introduction();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                sc.Bar.setValue(i);
                sc.progress.setText(Integer.toString(i) + "%");
                if (i == 10) {
                    sc.ShowStatus.setText("Scanning Files.");
                }
                if (i == 20) {
                    sc.ShowStatus.setText("Scanning Files..");
                }
                if (i == 30) {
                    sc.ShowStatus.setText("Scanning Files...");
                }
                if (i == 40) {
                    sc.ShowStatus.setText("loading Files.");
                }
                if (i == 50) {
                    sc.ShowStatus.setText("loading Files..");
                }
                if (i == 60) {
                    sc.ShowStatus.setText("loading Files...");
                }
                if (i == 70) {
                    sc.ShowStatus.setText("Connecting Database.");
                }
                if (i == 80) {
                    sc.ShowStatus.setText("Connecting Database..");
                }
                if (i == 90) {
                    sc.ShowStatus.setText("Connecting Database...");
                }
                if (i == 95) {
                    sc.ShowStatus.setText("Launching Application.");
                }

            }
        } catch (Exception e) {
        }
        new Startpage().setVisible(false);
        n.setVisible(true);
        sc.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Bar;
    private javax.swing.JLabel ShowStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel progress;
    // End of variables declaration//GEN-END:variables
}
