/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xristos
 */
public class CustomerTable extends javax.swing.JFrame {

    /**
     * Creates new form CustomerTable
     */
    public CustomerTable() {
        initComponents();
        setLocationRelativeTo(null) ; //set window to center of screen
        table_update();
    }

    
    Connection con;
    PreparedStatement pst;
    
    public void table_update(){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
              pst = con.prepareStatement("select * from customer");
              ResultSet Rs = pst.executeQuery();
              
              ResultSetMetaData rd = Rs.getMetaData();
              c = rd.getColumnCount();
              DefaultTableModel df = (DefaultTableModel)TableCustomer.getModel();
              df.setRowCount(0);
              
              while(Rs.next())
              {
                  Vector v2 = new Vector();
                  
                  for(int i=1; i<=c; i++)
                  {
                      v2.add(Rs.getString("username"));
                      v2.add(Rs.getString("fullname"));
                      v2.add(Rs.getString("phone"));
                      v2.add(Rs.getString("address"));
                  }
                  
                  df.addRow(v2);
                  
              }
              
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        usernamelabel = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        fullnamelabel = new javax.swing.JLabel();
        fullnametext = new javax.swing.JTextField();
        phonelabel = new javax.swing.JLabel();
        phonetext = new javax.swing.JTextField();
        addresslabel = new javax.swing.JLabel();
        addresstext = new javax.swing.JTextField();
        editbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        exit_icon = new javax.swing.JLabel();
        minimize_icon = new javax.swing.JLabel();
        backicon = new javax.swing.JLabel();
        backtext = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCustomer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        usernamelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernamelabel.setForeground(new java.awt.Color(255, 255, 255));
        usernamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernamelabel.setText("Username:");

        usernametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextActionPerformed(evt);
            }
        });

        fullnamelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fullnamelabel.setForeground(new java.awt.Color(255, 255, 255));
        fullnamelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fullnamelabel.setText("Fullname:");

        phonelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phonelabel.setForeground(new java.awt.Color(255, 255, 255));
        phonelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phonelabel.setText("Phone Number:");

        addresslabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addresslabel.setForeground(new java.awt.Color(255, 255, 255));
        addresslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addresslabel.setText("Address:");

        addresstext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstextActionPerformed(evt);
            }
        });

        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addresstext, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addresslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(phonelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(fullnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usernametext)
                                    .addComponent(fullnametext)
                                    .addComponent(phonetext, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fullnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fullnametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phonelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addresstext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101))
        );

        exit_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exit.png"))); // NOI18N
        exit_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_iconMouseClicked(evt);
            }
        });

        minimize_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimize.png"))); // NOI18N
        minimize_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_iconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize_iconMouseEntered(evt);
            }
        });

        backicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        backicon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backicon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backiconMouseClicked(evt);
            }
        });
        backicon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backiconKeyPressed(evt);
            }
        });

        backtext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backtext.setForeground(new java.awt.Color(255, 255, 255));
        backtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backtext.setText("Back");
        backtext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backtext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtextMouseClicked(evt);
            }
        });
        backtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backtextKeyPressed(evt);
            }
        });

        TableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Fullname", "Phone Number", "Address"
            }
        ));
        TableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCustomer);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(backicon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backtext, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(minimize_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backtext, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_iconMouseClicked
        System.exit(0);  //system exit
    }//GEN-LAST:event_exit_iconMouseClicked

    private void minimize_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_iconMouseClicked
        this.setState(CustomerLogin.ICONIFIED); //minimize window
    }//GEN-LAST:event_minimize_iconMouseClicked

    private void minimize_iconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_iconMouseEntered

    }//GEN-LAST:event_minimize_iconMouseEntered

    private void backiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backiconMouseClicked
        MenuEmployee lf = new MenuEmployee();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backiconMouseClicked

    private void backiconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backiconKeyPressed

    }//GEN-LAST:event_backiconKeyPressed

    private void backtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtextMouseClicked
        MenuEmployee lf = new MenuEmployee();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backtextMouseClicked

    private void backtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backtextKeyPressed

    }//GEN-LAST:event_backtextKeyPressed

    private void usernametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametextActionPerformed

    private void addresstextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstextActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        DefaultTableModel d1 = (DefaultTableModel)TableCustomer.getModel();

        int selectIndex = TableCustomer.getSelectedRow();

        try {
            
            String name = usernametext.getText();
            String fullname = fullnametext.getText();
            String phone = phonetext.getText();
            String address = addresstext.getText();
           

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");

            pst = con.prepareStatement("update customer set fullname=?,phone=?,address=? where username = ?");

            pst.setString(1, fullname);
            pst.setString(2, phone);
            pst.setString(3, address);
            pst.setString(4, name);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Customer Information Updated");

            table_update();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
         DefaultTableModel d1 = (DefaultTableModel)TableCustomer.getModel();

        int selectIndex = TableCustomer.getSelectedRow();

        String name = d1.getValueAt(selectIndex, 0).toString();

        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Delete the Customer?","Warning",JOptionPane.YES_NO_CANCEL_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION){

            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");

                pst = con.prepareStatement("delete from customer where name=?");

                pst.setString(1, name);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Customer Deleted");
                table_update();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CustomerTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{

        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void TableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCustomerMouseClicked
        DefaultTableModel d1 = (DefaultTableModel)TableCustomer.getModel();

        int selectIndex = TableCustomer.getSelectedRow();

        usernametext.setText(d1.getValueAt(selectIndex, 0).toString());
        fullnametext.setText(d1.getValueAt(selectIndex, 1).toString());
        phonetext.setText(d1.getValueAt(selectIndex, 2).toString());
        addresstext.setText(d1.getValueAt(selectIndex, 3).toString());
    }//GEN-LAST:event_TableCustomerMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCustomer;
    private javax.swing.JLabel addresslabel;
    private javax.swing.JTextField addresstext;
    private javax.swing.JLabel backicon;
    private javax.swing.JLabel backtext;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel exit_icon;
    private javax.swing.JLabel fullnamelabel;
    private javax.swing.JTextField fullnametext;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize_icon;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JTextField phonetext;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JTextField usernametext;
    // End of variables declaration//GEN-END:variables
}
