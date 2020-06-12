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
public class CarsTable extends javax.swing.JFrame {

    /**
     * Creates new form CarsTable
     */
    public CarsTable() {
        initComponents();
        setLocationRelativeTo(null) ; //set window to center of screen
       
         table_update();
    }
    
    Connection con;
    PreparedStatement pst;

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
        modellabel = new javax.swing.JLabel();
        modeltext = new javax.swing.JTextField();
        enginelabel = new javax.swing.JLabel();
        enginetext = new javax.swing.JTextField();
        passengerslabel = new javax.swing.JLabel();
        passengerstext = new javax.swing.JTextField();
        editbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        typelabel = new javax.swing.JLabel();
        typecombo = new javax.swing.JComboBox<>();
        fuellabel = new javax.swing.JLabel();
        fuelcombo = new javax.swing.JComboBox<>();
        transmissionlabel = new javax.swing.JLabel();
        transmissioncombo = new javax.swing.JComboBox<>();
        pricelabel = new javax.swing.JLabel();
        pricetext = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        exit_icon = new javax.swing.JLabel();
        minimize_icon = new javax.swing.JLabel();
        backicon = new javax.swing.JLabel();
        backtext = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCars = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        modellabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        modellabel.setForeground(new java.awt.Color(255, 255, 255));
        modellabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modellabel.setText("Model:");

        enginelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        enginelabel.setForeground(new java.awt.Color(255, 255, 255));
        enginelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enginelabel.setText("Engine(cc):");

        passengerslabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passengerslabel.setForeground(new java.awt.Color(255, 255, 255));
        passengerslabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passengerslabel.setText("Passengers:");

        passengerstext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerstextActionPerformed(evt);
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

        typelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        typelabel.setForeground(new java.awt.Color(255, 255, 255));
        typelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typelabel.setText("Type:");

        typecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compact", "Intermediate", "SUV", "Luxury", "Mini Bus", "Van" }));

        fuellabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fuellabel.setForeground(new java.awt.Color(255, 255, 255));
        fuellabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fuellabel.setText("Fuel:");

        fuelcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gasoline", "Diesel", "Hybrid" }));

        transmissionlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        transmissionlabel.setForeground(new java.awt.Color(255, 255, 255));
        transmissionlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transmissionlabel.setText("Transmission:");

        transmissioncombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automatic", "Semi-Auto" }));

        pricelabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricelabel.setForeground(new java.awt.Color(255, 255, 255));
        pricelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pricelabel.setText("Price:");

        pricetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricetextActionPerformed(evt);
            }
        });

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/number (3).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(typelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(fuellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fuelcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(transmissionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transmissioncombo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                    .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passengerslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(enginelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(modellabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passengerstext, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(modeltext)
                                        .addComponent(enginetext, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                                .addComponent(addbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeltext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enginelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enginetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passengerslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengerstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fuelcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transmissionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transmissioncombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pricetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
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

        TableCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car ID", "Model", "Engine(cc)", "Passengers", "Type", "Fuel", "Transmission", "Price"
            }
        ));
        TableCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableCars);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
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

    private void passengerstextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerstextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passengerstextActionPerformed

    public void table_update(){
        int c;
        try {
            Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
              pst = con.prepareStatement("select * from cars0");
              ResultSet Rs = pst.executeQuery();
              
              ResultSetMetaData rd = Rs.getMetaData();
              c = rd.getColumnCount();
              DefaultTableModel df = (DefaultTableModel)TableCars.getModel();
              df.setRowCount(0);
              
              while(Rs.next())
              {
                  Vector v2 = new Vector();
                  
                  for(int i=1; i<=c; i++)
                  {
                      
                      v2.add(Rs.getString("model"));
                      v2.add(Rs.getString("engine"));
                      v2.add(Rs.getString("passengers"));
                      v2.add(Rs.getString("type"));
                      v2.add(Rs.getString("fuel"));
                      v2.add(Rs.getString("transmission"));
                      v2.add(Rs.getString("price"));
                      
                  }
                  
                  df.addRow(v2);
                  
              }
              
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    
  
    
    
    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        DefaultTableModel d1 = (DefaultTableModel)TableCars.getModel();
      
        int selectIndex = TableCars.getSelectedRow();
        
        try {
            
            String Model = modeltext.getText();
            String Engine = enginetext.getText();
            String Passengers = passengerstext.getText();
            String type = typecombo.getSelectedItem().toString();
            String fuel = fuelcombo.getSelectedItem().toString();
            String transmission = transmissioncombo.getSelectedItem().toString();     
            String price = pricetext.getText();
        
                    
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
            
            pst = con.prepareStatement("update cars0 set engine=?,passengers=?,type=?,fuel=?,transmission=?,price=? where model = ?");
            
       
            pst.setString(1, Engine);
            pst.setString(2, Passengers);
            pst.setString(3, type);
            pst.setString(4, fuel);
            pst.setString(5, transmission);
            pst.setString(6, price);
           
                 pst.setString(7, Model);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Car Information Updated");
            
            table_update();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editbuttonActionPerformed

     //fuction that checks if the entered CarID already exists in the database
    public boolean checkCarID(String carID)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean carID_exist= false;
        
        String query = "SELECT * FROM `cars0` WHERE `model` = ?";
        
        try {
            st = CarRentalManagementSystem.getConnection().prepareStatement(query);
            st.setString(1, carID);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                carID_exist= true;
                JOptionPane.showMessageDialog(null,"This Car Model is Already in Use, Choose Another One","Car Model Failed",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return carID_exist;
      
    }
    
    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        DefaultTableModel d1 = (DefaultTableModel)TableCars.getModel();
      
        int selectIndex = TableCars.getSelectedRow();
        
        String CarID = d1.getValueAt(selectIndex, 0).toString();
        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to Delete the Car?","Warning",JOptionPane.YES_NO_CANCEL_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION){
            
             try {
                 Class.forName("com.mysql.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost/crms","root","");
                 
                 pst = con.prepareStatement("delete from cars0 where model=?");
                 
                 pst.setString(1, CarID);
                 pst.executeUpdate();
                 
                 JOptionPane.showMessageDialog(this, "Car Deleted");
                 table_update();
                 
                 
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        else{
            
            
            
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    public boolean verifyFields()
    {
        
        String model = modeltext.getText();
        String engine = enginetext.getText();
        String passengers = passengerstext.getText();
        String price = pricetext.getText();
        
       
        //check for empty fields
        if( model.trim().equals("") ||
               engine.trim().equals("") || passengers.trim().equals("") || price.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null,"One or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        else
        {
            return true;
        }
        
    }
    
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

    private void TableCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableCarsMouseClicked
        DefaultTableModel d1 = (DefaultTableModel)TableCars.getModel();

        int selectIndex = TableCars.getSelectedRow();

        
        modeltext.setText(d1.getValueAt(selectIndex, 0).toString());
        enginetext.setText(d1.getValueAt(selectIndex, 1).toString());
        passengerstext.setText(d1.getValueAt(selectIndex, 2).toString());
        typecombo.setSelectedItem(d1.getValueAt(selectIndex, 3).toString());
       fuelcombo.setSelectedItem(d1.getValueAt(selectIndex, 4).toString());
       transmissioncombo.setSelectedItem(d1.getValueAt(selectIndex, 5).toString());
       pricetext.setText(d1.getValueAt(selectIndex, 6).toString());
    }//GEN-LAST:event_TableCarsMouseClicked

    private void pricetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricetextActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        
        String model = modeltext.getText();
        String engine = enginetext.getText();
        String passengers = passengerstext.getText();
        String type = typecombo.getSelectedItem().toString();
        String fuel = fuelcombo.getSelectedItem().toString();
        String transmission = transmissioncombo.getSelectedItem().toString();
        String price = pricetext.getText();
        
        
        if(verifyFields()){
           if(!checkCarID(model)){

            PreparedStatement ps;
            ResultSet st;
            String registerUserQuery = "INSERT INTO `cars0`( `model`, `engine`, `passengers`,`type`, `fuel`, `transmission`, `price`) VALUES (?,?,?,?,?,?,?)";        
        try {
            
            ps = CarRentalManagementSystem.getConnection().prepareStatement(registerUserQuery);
            
            
            ps.setString(1, model);
            ps.setString(2, engine);
            ps.setString(3, passengers);
            ps.setString(4, type);
            ps.setString(5, fuel);
            ps.setString(6, transmission);
            ps.setString(7, price);
           
            
            if(ps.executeUpdate() != 0){
                            JOptionPane.showMessageDialog(null, "Car Has Been Added");
                            
                            table_update();
                            modeltext.setText("");
                            enginetext.setText("");
                            passengerstext.setText("");
                            typecombo.setSelectedIndex(-1);
                            fuelcombo.setSelectedIndex(-1);
                            transmissioncombo.setSelectedIndex(-1);
                            pricetext.setText("");
                        
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Error: Check Your Information");
                        }
            
        } catch (SQLException ex) {
            Logger.getLogger(CarsTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       }
    }//GEN-LAST:event_addbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(CarsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarsTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarsTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableCars;
    private javax.swing.JButton addbutton;
    private javax.swing.JLabel backicon;
    private javax.swing.JLabel backtext;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel enginelabel;
    private javax.swing.JTextField enginetext;
    private javax.swing.JLabel exit_icon;
    private javax.swing.JComboBox<String> fuelcombo;
    private javax.swing.JLabel fuellabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize_icon;
    private javax.swing.JLabel modellabel;
    private javax.swing.JTextField modeltext;
    private javax.swing.JLabel passengerslabel;
    private javax.swing.JTextField passengerstext;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JTextField pricetext;
    private javax.swing.JComboBox<String> transmissioncombo;
    private javax.swing.JLabel transmissionlabel;
    private javax.swing.JComboBox<String> typecombo;
    private javax.swing.JLabel typelabel;
    // End of variables declaration//GEN-END:variables
}
