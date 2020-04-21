/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.hony.java;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.Calendar;

import javax.swing.JOptionPane;

/**
 *
 * @author Hony
 */
public class AddMembers extends javax.swing.JFrame {

    /**
     * Creates new form AddingMembers
     */
    public AddMembers() {
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

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        checkFee = new javax.swing.JCheckBox();
        dChooserBirthDate = new com.toedter.calendar.JDateChooser();
        txtAddress = new javax.swing.JTextField();
        lblShowMes = new javax.swing.JLabel();
        lblShowMes1 = new javax.swing.JLabel();
        backgroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AddingMembers");
        setMinimumSize(new java.awt.Dimension(400, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LastName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FirstName");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Birth Date");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 70, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 60, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Contact No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Membership fee");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 100, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 80, -1));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 102, 102));
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 80, -1));
        getContentPane().add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 180, 25));

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, 25));

        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactNoKeyReleased(evt);
            }
        });
        getContentPane().add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 180, 25));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 180, 25));

        checkFee.setBackground(new java.awt.Color(255, 204, 204));
        checkFee.setText("Paid");
        getContentPane().add(checkFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 80, 20));
        getContentPane().add(dChooserBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 180, 25));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 180, 25));

        lblShowMes.setBackground(new java.awt.Color(255, 0, 0));
        lblShowMes.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(lblShowMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 100, 20));

        lblShowMes1.setBackground(new java.awt.Color(255, 0, 0));
        lblShowMes1.setForeground(new java.awt.Color(255, 204, 204));
        getContentPane().add(lblShowMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 100, 20));

        backgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/hony/java/backgroundImg.jpg"))); // NOI18N
        getContentPane().add(backgroundImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
          Home home = new Home();
          setVisible(false);
          home.setVisible(true);
                            
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyPressed
      
    }//GEN-LAST:event_txtIdKeyPressed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackMouseClicked

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
         try{
           int i = Integer.parseInt(txtId.getText());
           lblShowMes.setText("");
       }catch(NumberFormatException e){
           lblShowMes.setText("only numbers");
       }
    }//GEN-LAST:event_txtIdKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(checkEmpty() && checkEntry()){
        String sql = "insert into member (first_name,last_name,id,birth_date,contact_no,address,fee,expiremembership_date)values(?,?,?,?,?,?,?,?)";
        String checkBox;
         if(checkFee.isSelected()){
             checkBox = "paid";
         } else{
                checkBox="unpaid";
            }
        
        try(  Connection connection = Connector.connetorDB();
              PreparedStatement pst = connection.prepareStatement(sql);  ){
            
            pst.setString(1,txtFirstName.getText() );
            pst.setString(2,txtLastName.getText() );
            pst.setString(3,txtId.getText());
            pst.setDate(4,new java.sql.Date(dChooserBirthDate.getDate().getTime()));
            // pst.setDate(4,getDate());
            pst.setInt(5,Integer.parseInt(txtContactNo.getText()));
            pst.setString(6,txtAddress.getText() );
            pst.setString(7,checkFee.getText() );
            pst.setString(7,checkBox );
            pst.setDate(8, getExpiryDate());
            if(pst.execute()){
                JOptionPane.showOptionDialog(null,"Member is not added","Failure",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
            }
            else{
                int input = JOptionPane.showOptionDialog(null,"Member is added","Success",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                if(input == JOptionPane.OK_OPTION){
                   clear();
                }
            }
            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
        }
        }else{
            JOptionPane.showOptionDialog(null,"Please fill all the texts in the correct format ","Failure",JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContactNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyReleased
          try{
           int i = Integer.parseInt(txtContactNo.getText());
           lblShowMes1.setText("");
       }catch(NumberFormatException e){
           lblShowMes1.setText("only numbers");
       }
    }//GEN-LAST:event_txtContactNoKeyReleased

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
            java.util.logging.Logger.getLogger(AddMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMembers().setVisible(true);
            }
        });
    }
    
      private void clear() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtId.setText("");
        txtContactNo.setText("");
        dChooserBirthDate.setDate(null);
        txtAddress.setText("");
        checkFee.setSelected(false);
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox checkFee;
    private com.toedter.calendar.JDateChooser dChooserBirthDate;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblShowMes;
    private javax.swing.JLabel lblShowMes1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables

    private Date getExpiryDate() {
     
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        java.util.Date jDate = calendar.getTime();
        return  new java.sql.Date(jDate.getTime());
            
    }

    private boolean checkEmpty() {
          return !"".equals(txtFirstName.getText()) && !"".equals(txtLastName.getText())
                  && !"".equals(txtId.getText()) && !"".equals(txtContactNo.getText())&&
                  !"".equals(txtAddress.getText())  &&dChooserBirthDate.getDate()!= null;
    }
    
    private boolean checkEntry() {
        return "".equals(lblShowMes1.getText())&& "".equals(lblShowMes.getText());
    }
}
