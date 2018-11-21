
import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author asecadmin
 */
public class OrderForm extends javax.swing.JFrame {

    //Arraylist for storing the total of orders
    ArrayList<Double> total = new ArrayList<Double>();
    //Array for storing details to be stored in Mycart Page
    ArrayList<String> orderDetails = new ArrayList<String>();

    /**
     * Creates new form OrderForm
     */
    public OrderForm() {
        initComponents();
        /*adds background color to page as tan*/
        Color color = new Color(240, 234, 190);
        getContentPane().setBackground(new Color(240, 234, 190));

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Backward = new javax.swing.JButton();
        Forward = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        RunningTotal = new javax.swing.JLabel();
        TotalField = new javax.swing.JTextField();
        OK = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setTitle("Create Order");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setText("Cheese");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 100, 153, -1));
        jTextField1.getAccessibleContext().setAccessibleName("Cheese");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Pizza");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 80, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Side Item");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, -1, -1));

        jTextField2.setText("Pepperoni");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 139, 153, -1));
        jTextField2.getAccessibleContext().setAccessibleName("Pepperoni");

        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 168, 940, 10));

        jTextField3.setText("Wings");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 215, 153, -1));
        jTextField3.getAccessibleContext().setAccessibleName("Wings");

        jTextField4.setText("Chicken Strips");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 254, 153, -1));
        jTextField4.getAccessibleContext().setAccessibleName("Chicken Strip");

        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 940, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Dessert");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 296, -1, -1));

        jTextField5.setText("Apple Turnover");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 316, 153, -1));
        jTextField5.getAccessibleContext().setAccessibleName("Apple Turnover");

        jTextField6.setText("Cinnamon Sticks");
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 355, 153, -1));
        jTextField6.getAccessibleContext().setAccessibleName("Cinnamon Sticks");

        Backward.setText("Backward");
        Backward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackwardActionPerformed(evt);
            }
        });
        getContentPane().add(Backward, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, -1));

        Forward.setText("Forward");
        Forward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForwardActionPerformed(evt);
            }
        });
        getContentPane().add(Forward, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, -1, -1));

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 215, -1, -1));

        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, -1, -1));

        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 316, -1, -1));

        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 355, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 139, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 215, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 254, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 316, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 355, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "6 Piece", "8 Piece", "12 Piece", "24 Piece" }));
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 215, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "4 Piece", "6 Piece", "10 Piece" }));
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 254, -1, -1));

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "4 Piece", "6 Piece", "8 Piece" }));
        getContentPane().add(jComboBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 355, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Honey BBQ", "Mesquite BBQ", "Mild", "Hot", "" }));
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza clip.PNG"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 74));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "6\" Personal Pan $4.00", "8\" Small $6.00", "12\" Medium $8.00", "18\" Large $12.00", "20\" X-Large $20.00" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 100, -1, -1));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "6\" Personal Pan $4.00", "8\" Small $6.00", "12\" Medium $8.00", "18\" Large $12.00", "20\" X-Large $20.00" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 139, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizza clip.PNG"))); // NOI18N
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 950, 153));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 10));

        RunningTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RunningTotal.setText("Current Total");
        getContentPane().add(RunningTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        TotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 80, 32));

        OK.setText("Submit");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });
        getContentPane().add(OK, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 940, 10));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 940, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackwardActionPerformed
        LandingPage pp = new LandingPage();
        pp.setVisible(true);
        this.dispose();
        /* This backward button takes the user back to the landing page and closes the current window.
         */

    }//GEN-LAST:event_BackwardActionPerformed

    private void ForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForwardActionPerformed
        MyCart lp = new MyCart();
        lp.orderDetails = orderDetails;
         orderDetails.remove("None");
        lp.OrderSummaryBox.setText(String.join(" ", orderDetails.toString()));
        lp.setVisible(true);
        this.dispose();
        /*this code closes the frame as you progress*/
 /* this forward button takes the user to the my cart page.
    it also closes the page when the user moves forward.
         */
    }//GEN-LAST:event_ForwardActionPerformed
        double total_1 = 0; 
         double total_2 = 0; 
          double total_3 = 0; 
           double total_4 = 0; 
            double total_5 = 0; 
            double total_6 = 0; 
            
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
       total_1 = getTotal(jRadioButton1,jTextField1, jComboBox1,jComboBox11);
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      total_1 = getTotal(jRadioButton1,jTextField1, jComboBox1,jComboBox11);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        total_2 = getTotal(jRadioButton2,jTextField2, jComboBox2,jComboBox13);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
      total_1 = getTotal(jRadioButton1,jTextField1, jComboBox1,jComboBox11);
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
        total_2 = getTotal(jRadioButton2,jTextField2, jComboBox2,jComboBox13);
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        // this button will total the items selected on this page//
        double total_sum = total_1 + total_2+total_3+total_4+total_5+total_6;
        TotalField.setText(Double.toString(total_sum));
    }//GEN-LAST:event_OKActionPerformed

    private void TotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalFieldActionPerformed
        // this box will display a running total of items selected on this page.
    }//GEN-LAST:event_TotalFieldActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        total_2 = getTotal(jRadioButton2,jTextField2, jComboBox2,jComboBox13);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        total_3 = getTotal(jRadioButton3,jTextField3, jComboBox3,jComboBox9);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        total_4 = getTotal(jRadioButton4,jTextField4, jComboBox4,jComboBox8);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        total_5 = getTotal(jRadioButton5,jTextField5, jComboBox5,jComboBox7);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        total_6 = getTotal(jRadioButton6,jTextField6, jComboBox6,jComboBox12);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    //Method to calculate total cost and assign the selected item to an arraylist of all items selected
    private double getTotal(JRadioButton jRadioButton1,JTextField jTextField, JComboBox jComboBox1,JComboBox jComboBox2){
      int box1; double box2; double total_form =0;
        Pattern pattern = Pattern.compile("[^$]+[0-9]+\\.*[0-9]*");
        if(jRadioButton1.isSelected()){
        String x = (String) jComboBox1.getSelectedItem();
        String y = (String) jComboBox2.getSelectedItem();
      
        if (y.equalsIgnoreCase("None")) {
            y = "0";
        } else {
            Matcher m = pattern.matcher(y);
            while (m.find()) {
                y = m.group();
            }
        }
        try {            
            box1 = Integer.parseInt(x);
            box2 = Double.parseDouble(y);
            total_form = box1 * box2;
        } catch (Exception e) {
            System.out.println("Error "+ e);
        }        
        System.out.println("Current Total is "+total_form);
        orderDetails.add(jTextField.getText()+x+ jComboBox2.getSelectedItem());
        }
        else{
            System.out.println("Combobox/radioBtn diselected");
            orderDetails.remove(jComboBox2.getSelectedItem().toString());
        }
        return total_form;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        MyCart nf = new MyCart();
        nf.setVisible(true);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backward;
    private javax.swing.JButton Forward;
    private javax.swing.JButton OK;
    private javax.swing.JLabel RunningTotal;
    private javax.swing.JTextField TotalField;
    private javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    public javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
