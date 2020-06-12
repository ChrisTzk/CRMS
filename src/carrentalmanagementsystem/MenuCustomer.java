/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrentalmanagementsystem;
import javax.swing.JFrame;
/**
 *
 * @author Xristos
 */
public class MenuCustomer extends javax.swing.JFrame {

    /**
     * Creates new form MenuCustomer
     */
    public MenuCustomer() {
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
        menu_label = new javax.swing.JLabel();
        menu_logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit_icon = new javax.swing.JLabel();
        minimize_icon = new javax.swing.JLabel();
        findcar_icon = new javax.swing.JLabel();
        car_icon = new javax.swing.JLabel();
        fundcar_text = new javax.swing.JLabel();
        car_text = new javax.swing.JLabel();
        backicon = new javax.swing.JLabel();
        backtext = new javax.swing.JLabel();
        rent_icon = new javax.swing.JLabel();
        return_icon = new javax.swing.JLabel();
        rent_text = new javax.swing.JLabel();
        return_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        menu_label.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        menu_label.setForeground(new java.awt.Color(255, 255, 255));
        menu_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_label.setText("Menu");
        menu_label.setMaximumSize(new java.awt.Dimension(391, 300));

        menu_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/number (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(154, 154, 154)
                .addComponent(menu_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
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

        findcar_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        findcar_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car (7).png"))); // NOI18N
        findcar_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        findcar_icon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        findcar_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                findcar_iconMouseClicked(evt);
            }
        });

        car_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/car (6).png"))); // NOI18N
        car_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        car_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car_iconMouseClicked(evt);
            }
        });

        fundcar_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fundcar_text.setForeground(new java.awt.Color(255, 255, 255));
        fundcar_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fundcar_text.setText("Find Your Car");
        fundcar_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fundcar_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fundcar_textMouseClicked(evt);
            }
        });

        car_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        car_text.setForeground(new java.awt.Color(255, 255, 255));
        car_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        car_text.setText("Cars");
        car_text.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        car_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                car_textMouseClicked(evt);
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

        rent_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rent_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/signs.png"))); // NOI18N
        rent_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        return_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buildings.png"))); // NOI18N
        return_icon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rent_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rent_text.setForeground(new java.awt.Color(255, 255, 255));
        rent_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rent_text.setText("Rent A Car");
        rent_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        return_text.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        return_text.setForeground(new java.awt.Color(255, 255, 255));
        return_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return_text.setText("Return A Car");
        return_text.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fundcar_text, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(findcar_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rent_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rent_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(car_text, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(car_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(return_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(return_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(backicon, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backtext, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(minimize_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(car_icon, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(findcar_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fundcar_text, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_text, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rent_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(return_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rent_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(return_text, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(backicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backtext, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void findcar_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_findcar_iconMouseClicked
        FindYourCar lf = new FindYourCar();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_findcar_iconMouseClicked

    private void fundcar_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fundcar_textMouseClicked
        
    }//GEN-LAST:event_fundcar_textMouseClicked

    private void backiconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backiconMouseClicked
        SelectStore lf = new SelectStore();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backiconMouseClicked

    private void backiconKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backiconKeyPressed

    }//GEN-LAST:event_backiconKeyPressed

    private void backtextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtextMouseClicked
        SelectStore lf = new SelectStore();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backtextMouseClicked

    private void backtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backtextKeyPressed

    }//GEN-LAST:event_backtextKeyPressed

    private void car_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car_iconMouseClicked
        CarsTableCustomer lf = new CarsTableCustomer();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_car_iconMouseClicked

    private void car_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_car_textMouseClicked
        CarsTableCustomer lf = new CarsTableCustomer();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_car_textMouseClicked

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
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backicon;
    private javax.swing.JLabel backtext;
    private javax.swing.JLabel car_icon;
    private javax.swing.JLabel car_text;
    private javax.swing.JLabel exit_icon;
    private javax.swing.JLabel findcar_icon;
    private javax.swing.JLabel fundcar_text;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel menu_label;
    private javax.swing.JLabel menu_logo;
    private javax.swing.JLabel minimize_icon;
    private javax.swing.JLabel rent_icon;
    private javax.swing.JLabel rent_text;
    private javax.swing.JLabel return_icon;
    private javax.swing.JLabel return_text;
    // End of variables declaration//GEN-END:variables
}
