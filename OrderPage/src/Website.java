import java.awt.Toolkit;
import java.awt.Color;



//author D.Jackson, L.Alexander, D.Davis, J.Copeland

public class Website extends javax.swing.JFrame {

    /**
     * Creates new form Website
     */
    public Website() {
        initComponents();
         /*adds background color to page as tan*/
        Color color = new Color(240,234,190);
        getContentPane().setBackground(new Color(240,234,190));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Go = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        WebPic = new javax.swing.JLabel();
        WebsiteField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Website");

        Go.setText("Go");
        Go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoActionPerformed(evt);
            }
        });

        jLabel1.setText("Site");

        WebPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flowers.PNG"))); // NOI18N

        WebsiteField.setText("https://www.jaddpizza.com");
        WebsiteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WebsiteFieldActionPerformed(evt);
            }
        });
        WebsiteField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                WebsiteFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(WebPic)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WebsiteField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Go)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Go)
                    .addComponent(jLabel1)
                    .addComponent(WebsiteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 163, 163)
                .addComponent(WebPic)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoActionPerformed
        LandingPage pp = new LandingPage();
        pp.setVisible(true);
       Go.setEnabled(true);
                this.dispose(); //this allows the go button to progress to the next page.// 
                //Need to add functionality to lock out go button until the website is entered into the address bar//
    }//GEN-LAST:event_GoActionPerformed

    private void WebsiteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WebsiteFieldActionPerformed
  WebsiteField.setEnabled(true);  
  WebsiteField.setEnabled(false);  
      
        // TODO add your handling code here:will be where the user enters the website in.
    }//GEN-LAST:event_WebsiteFieldActionPerformed

    private void WebsiteFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WebsiteFieldKeyTyped
     
    }//GEN-LAST:event_WebsiteFieldKeyTyped

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
            java.util.logging.Logger.getLogger(Website.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Website.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Website.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Website.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Website().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Go;
    private javax.swing.JLabel WebPic;
    private javax.swing.JFormattedTextField WebsiteField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}