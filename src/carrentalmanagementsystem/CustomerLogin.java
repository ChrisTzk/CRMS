/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalmanagementsystem;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Xristos
 */
public class CustomerLogin extends javax.swing.JFrame {

    /**
     * Creates new form CustomerLogin
     */
    public CustomerLogin() {
        initComponents();
        
        setLocationRelativeTo(null) ; //set window to center of screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        login_logo = new javax.swing.JLabel();
        exit_icon = new javax.swing.JLabel();
        minimize_icon = new javax.swing.JLabel();
        user_icon = new javax.swing.JLabel();
        key_icon = new javax.swing.JLabel();
        username_text = new javax.swing.JTextField();
        username_label = new javax.swing.JLabel();
        password_field = new javax.swing.JPasswordField();
        password_label = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();
        adduser_icon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backicon = new javax.swing.JLabel();
        bactext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        login_label.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        login_label.setForeground(new java.awt.Color(255, 255, 255));
        login_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_label.setText("Login");
        login_label.setMaximumSize(new java.awt.Dimension(391, 300));

        login_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login (5).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(login_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        user_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (1).png"))); // NOI18N
        user_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        key_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        key_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/key.png"))); // NOI18N
        key_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        username_text.setForeground(new java.awt.Color(153, 153, 153));
        username_text.setText("username");
        username_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_textFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_textFocusLost(evt);
            }
        });
        username_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_textActionPerformed(evt);
            }
        });

        username_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        username_label.setForeground(new java.awt.Color(255, 255, 255));
        username_label.setText("Username:");

        password_field.setForeground(new java.awt.Color(153, 153, 153));
        password_field.setText("password");
        password_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_fieldFocusLost(evt);
            }
        });
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        password_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_fieldKeyPressed(evt);
            }
        });

        password_label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_label.setForeground(new java.awt.Color(255, 255, 255));
        password_label.setText("Password:");

        login_button.setText("Login");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        adduser_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adduser_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-user.png"))); // NOI18N
        adduser_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adduser_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adduser_iconMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create New Account");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
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

        bactext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bactext.setForeground(new java.awt.Color(255, 255, 255));
        bactext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bactext.setText("Back");
        bactext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bactext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bactextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(user_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(key_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(username_text)
                                        .addComponent(password_field, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                        .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(adduser_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))
                        .addGap(32, 32, 32)
                        .addComponent(backicon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bactext, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(161, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(minimize_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exit_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minimize_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171)
                        .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_text, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(user_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(key_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bactext, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backicon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adduser_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void username_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_textActionPerformed

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_fieldActionPerformed

    private void username_textFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_textFocusGained
        // clear the textfield on focus if the text is "username"
        if(username_text.getText().trim().toLowerCase().equals("username"))
        {
            username_text.setText("");
            username_text.setForeground(Color.black);
        }
        
    }//GEN-LAST:event_username_textFocusGained

    private void username_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_textFocusLost
        // if the text field is equal to "username" or empty, set the "username" text
        //in the empty field on focus lost event
        if(username_text.getText().trim().equals("") || username_text.getText().trim().toLowerCase().equals("username"))
        {
            username_text.setText("username");
            username_text.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_username_textFocusLost

    private void password_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_fieldFocusGained
        //clear the password field on focus if text is "password"
        String pass = String.valueOf(password_field.getPassword());
        
        if(pass.trim().toLowerCase().equals("password"))
        {
            password_field.setText("");
            password_field.setForeground(Color.black);
        }
    }//GEN-LAST:event_password_fieldFocusGained

    private void password_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_fieldFocusLost
        // if the password field is equal to password or empty, set the "password" text
        //in the empty field on focus lost event
         String pass = String.valueOf(password_field.getPassword());
        
        if(pass.trim().equals("") || pass.trim().toLowerCase().equals("password"))
        {
            password_field.setText("password");
            password_field.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_password_fieldFocusLost

    private void adduser_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduser_iconMouseClicked
        CustomerRegister form = new CustomerRegister();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        //close the current form(login form)
        this.dispose();
    }//GEN-LAST:event_adduser_iconMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        CustomerRegister form = new CustomerRegister();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        //close the current form(login form)
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        PreparedStatement st;
        ResultSet rs;
        
        //get the username & password
        String username = username_text.getText();
        String password = String.valueOf(password_field.getPassword());
        
        //create a selecy query to check if username and password exist in the database
        String query = "SELECT * FROM `customer` WHERE `username` = ? AND `password` = ?";
        
        //show a message if username or password fields are empty
        if(username.trim().equals("username"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username",2);
        }
        else if(password.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password",2);
        }
        else
        {
            try {
            st = CarRentalManagementSystem.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next()){
                //show a new form
                SelectStore form = new SelectStore();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                //close the current form(login form)
                this.dispose();
            }else
            {
                //error message
                JOptionPane.showMessageDialog(null,"Invalid Username / Password","Login Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }      
    }//GEN-LAST:event_login_buttonActionPerformed

    private void password_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_fieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           PreparedStatement st;
           ResultSet rs;
        
        //get the username & password
        String username = username_text.getText();
        String password = String.valueOf(password_field.getPassword());
        
        //create a selecy query to check if username and password exist in the database
        String query = "SELECT * FROM `customer` WHERE `username` = ? AND `password` = ?";
        
        //show a message if username or password fields are empty
        if(username.trim().equals("username"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username",2);
        }
        else if(password.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password",2);
        }
        else
        {
            try {
            st = CarRentalManagementSystem.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next()){
                //show a new form
                SelectStore form = new SelectStore();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                //close the current form(login form)
                this.dispose();
            }else
            {
                //error message
                JOptionPane.showMessageDialog(null,"Invalid Username / Password","Login Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        
            }
        }
    }
    }//GEN-LAST:event_password_fieldKeyPressed

    private void backiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backiconMouseClicked
        CustomerOrEmplyee lf = new CustomerOrEmplyee();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backiconMouseClicked

    private void bactextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bactextMouseClicked
        CustomerOrEmplyee lf = new CustomerOrEmplyee();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_bactextMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adduser_icon;
    private javax.swing.JLabel backicon;
    private javax.swing.JLabel bactext;
    private javax.swing.JLabel exit_icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel key_icon;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel login_logo;
    private javax.swing.JLabel minimize_icon;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel user_icon;
    private javax.swing.JLabel username_label;
    private javax.swing.JTextField username_text;
    // End of variables declaration//GEN-END:variables
}
