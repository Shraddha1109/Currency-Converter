

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHRADDHA
 */
public class NewJFrame1 extends javax.swing.JFrame {

double INDIAN_RUPEES=100.63;
double US_DOLLAR=1.53;
double CANADIAN_DOLLAR=2.03;
double BRAZILLAN_REAL=5.86;
double NIGERIAN_NIARA=302.96;
double INDONESIAN_RUPIAH=20746.75;

        
    public NewJFrame1() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcmbcurrency1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcmbcurrency2 = new javax.swing.JComboBox<>();
        jbtnConvert = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jlblConvert = new javax.swing.JLabel();
        jbtnexit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtxtConvert = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHRADDHA\\Pictures\\c2.jpg")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHRADDHA\\Pictures\\c4.jpg")); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\SHRADDHA\\Pictures\\c7.jpg")); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Choose From Country & Currency ");

        jcmbcurrency1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcmbcurrency1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one", "LONDON & BRITISH_POUND" }));
        jcmbcurrency1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcmbcurrency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbcurrency1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Enter Amount  ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Choose  Country &  Currency To Be  Converted   ");

        jcmbcurrency2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcmbcurrency2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one", "INDIA & INDIAN_RUPEES", "USA & US_DOLLAR", "CANADA & CANADIAN_DOLLAR", "BRAZIL & BRAZILLAN_REAL", "INDONESIA & INDONESIAN_RUPIAH", " ", " " }));
        jcmbcurrency2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcmbcurrency2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbcurrency2ActionPerformed(evt);
            }
        });

        jbtnConvert.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jbtnConvert.setText("CONVERT");
        jbtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnConvertActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Converted Amount is: ");

        jlblConvert.setBackground(new java.awt.Color(255, 255, 255));
        jlblConvert.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jlblConvert.setForeground(new java.awt.Color(0, 0, 153));
        jlblConvert.setText("                      ");
        jlblConvert.setAutoscrolls(true);
        jlblConvert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnexit.setBackground(new java.awt.Color(255, 255, 255));
        jbtnexit.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jbtnexit.setText("EXIT");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        jbtnReset.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtxtConvert.setBackground(new java.awt.Color(51, 255, 255));
        jtxtConvert.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jtxtConvert.setForeground(new java.awt.Color(255, 255, 255));
        jtxtConvert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jbtnConvert))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(jbtnReset)
                                        .addGap(58, 58, 58)
                                        .addComponent(jbtnexit))
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jcmbcurrency1, javax.swing.GroupLayout.Alignment.LEADING, 0, 292, Short.MAX_VALUE)
                                    .addComponent(jtxtConvert, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcmbcurrency2, 0, 1, Short.MAX_VALUE))))))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcmbcurrency1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcmbcurrency2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(jbtnConvert)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jlblConvert))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnexit)
                            .addComponent(jbtnReset)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
   System.exit(0);    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
  jtxtConvert.setText(null); 
  jlblConvert.setText(null); 
   jcmbcurrency1.setSelectedIndex(0);
    jcmbcurrency2.setSelectedIndex(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      new NewJFrame().setVisible(true);
this.setVisible(false);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnConvertActionPerformed
     double British_Pound =Double.parseDouble(jtxtConvert.getText());
     if (jcmbcurrency2.getSelectedItem().equals("INDIA & INDIAN_RUPEES"));
     {
         String Newframe2=String.format("RS %2f ", British_Pound*INDIAN_RUPEES);
         jlblConvert.setText(Newframe2);
     }
         if (jcmbcurrency2.getSelectedItem().equals("USA & US_DOLLAR"))
     {
         String Newframe2=String.format("$ %2f ", British_Pound*US_DOLLAR);
         jlblConvert.setText(Newframe2);
    }  
     if (jcmbcurrency2.getSelectedItem().equals("CANADA & CANADIAN_DOLLAR" ))
     {
         String Newframe2=String.format("C$ %2f ", British_Pound*CANADIAN_DOLLAR);
         jlblConvert.setText(Newframe2);
    }                                           
   if (jcmbcurrency2.getSelectedItem().equals("BRAZIL & BRAZILLAN_REAL"))
     {
         String Newframe2=String.format("BRA %2f ", British_Pound*BRAZILLAN_REAL);
         jlblConvert.setText(Newframe2);
    }
     

     if (jcmbcurrency2.getSelectedItem().equals("INDONESIA & INDONESIAN_RUPIAH"))
     {
         String Newframe2=String.format("INR %2f ", British_Pound*INDONESIAN_RUPIAH);
         jlblConvert.setText(Newframe2);
    }   


    }//GEN-LAST:event_jbtnConvertActionPerformed

    private void jcmbcurrency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbcurrency1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbcurrency1ActionPerformed

    private void jcmbcurrency2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbcurrency2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbcurrency2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnConvert;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JComboBox<String> jcmbcurrency1;
    private javax.swing.JComboBox<String> jcmbcurrency2;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JTextField jtxtConvert;
    // End of variables declaration//GEN-END:variables
}
