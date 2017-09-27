
package javaapplication4;

import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistTable extends javax.swing.JFrame {
String s2,s3;
   
    public RegistTable(String s,String s1) {
         s2=s;
         s3=s1;
        initComponents();
        jDesktopPane1.setVisible(false);
        jDesktopPane2.setVisible(false);
        
           try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    
                     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");

             Statement  stmt = con.createStatement();
          
	  ResultSet rs = stmt.executeQuery("Select * from uietregister where yearofadmission='"+s+"' and branch='"+s1+"'");
            while(rs.next())
            {
                String str[]={rs.getString(9),rs.getString(1)};
                 DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

    model.addRow(str);
            }
        }
          catch (Exception ex)

        {

            System.out.println(ex);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel32 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1365, 767));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/logo.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 180);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        jDesktopPane1.add(jLabel3);
        jLabel3.setBounds(140, 90, 280, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone");
        jDesktopPane1.add(jLabel5);
        jLabel5.setBounds(140, 350, 130, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date of Last Qual.");
        jDesktopPane1.add(jLabel6);
        jLabel6.setBounds(140, 440, 140, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Roll No.");
        jDesktopPane1.add(jLabel7);
        jLabel7.setBounds(140, 50, 100, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address");
        jDesktopPane1.add(jLabel8);
        jLabel8.setBounds(140, 300, 270, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sex");
        jDesktopPane1.add(jLabel9);
        jLabel9.setBounds(140, 250, 90, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LEET");
        jDesktopPane1.add(jLabel10);
        jLabel10.setBounds(340, 50, 50, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Pre.  Percentage");
        jDesktopPane1.add(jLabel12);
        jLabel12.setBounds(140, 480, 140, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date of Admission");
        jDesktopPane1.add(jLabel13);
        jLabel13.setBounds(140, 390, 140, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DOB");
        jDesktopPane1.add(jLabel14);
        jLabel14.setBounds(140, 210, 120, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Branch");
        jDesktopPane1.add(jLabel15);
        jLabel15.setBounds(140, 170, 90, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Guardian Name");
        jDesktopPane1.add(jLabel16);
        jLabel16.setBounds(140, 130, 280, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Roll No.");
        jDesktopPane1.add(jLabel11);
        jLabel11.setBounds(10, 50, 100, 20);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Name");
        jDesktopPane1.add(jLabel17);
        jLabel17.setBounds(10, 90, 80, 20);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Guardian Name");
        jDesktopPane1.add(jLabel18);
        jLabel18.setBounds(10, 130, 120, 20);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Branch");
        jDesktopPane1.add(jLabel19);
        jLabel19.setBounds(10, 170, 140, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("DOB");
        jDesktopPane1.add(jLabel20);
        jLabel20.setBounds(10, 210, 80, 20);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Sex");
        jDesktopPane1.add(jLabel21);
        jLabel21.setBounds(10, 250, 40, 25);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Address");
        jDesktopPane1.add(jLabel22);
        jLabel22.setBounds(10, 300, 70, 20);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Phone");
        jDesktopPane1.add(jLabel23);
        jLabel23.setBounds(10, 350, 130, 20);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Date of Admission");
        jDesktopPane1.add(jLabel24);
        jLabel24.setBounds(10, 390, 100, 30);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Date of Last Qual.");
        jDesktopPane1.add(jLabel25);
        jLabel25.setBounds(10, 440, 120, 20);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Pre.  Percentage");
        jDesktopPane1.add(jLabel26);
        jLabel26.setBounds(10, 480, 140, 20);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("LEET");
        jDesktopPane1.add(jLabel27);
        jLabel27.setBounds(250, 50, 50, 20);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("image");
        jDesktopPane1.add(jLabel28);
        jLabel28.setBounds(290, 170, 100, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/studentDetails.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jDesktopPane1.add(jLabel4);
        jLabel4.setBounds(0, 0, 430, 510);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(820, 190, 430, 510);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Roll No.");
        jDesktopPane2.add(jLabel32);
        jLabel32.setBounds(140, 50, 100, 20);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Roll No.");
        jDesktopPane2.add(jLabel41);
        jLabel41.setBounds(10, 50, 100, 20);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Name");
        jDesktopPane2.add(jLabel42);
        jLabel42.setBounds(10, 90, 80, 20);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Guardian Name");
        jDesktopPane2.add(jLabel43);
        jLabel43.setBounds(10, 130, 120, 20);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Branch");
        jDesktopPane2.add(jLabel44);
        jLabel44.setBounds(10, 170, 140, 20);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("DOB");
        jDesktopPane2.add(jLabel45);
        jLabel45.setBounds(10, 210, 80, 20);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Sex");
        jDesktopPane2.add(jLabel46);
        jLabel46.setBounds(10, 250, 40, 25);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Address");
        jDesktopPane2.add(jLabel47);
        jLabel47.setBounds(10, 300, 70, 20);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Phone");
        jDesktopPane2.add(jLabel48);
        jLabel48.setBounds(10, 350, 130, 20);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Date of Admission");
        jDesktopPane2.add(jLabel49);
        jLabel49.setBounds(10, 390, 100, 30);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Date of Last Qual.");
        jDesktopPane2.add(jLabel50);
        jLabel50.setBounds(10, 430, 120, 20);

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Pre.  Percentage");
        jDesktopPane2.add(jLabel51);
        jLabel51.setBounds(10, 470, 140, 20);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("LEET");
        jDesktopPane2.add(jLabel52);
        jLabel52.setBounds(250, 50, 50, 20);

        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.add(jLabel53);
        jLabel53.setBounds(290, 170, 100, 120);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jTextField1);
        jTextField1.setBounds(140, 90, 280, 30);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jTextField2);
        jTextField2.setBounds(140, 130, 280, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSE", "ECE", "BIOTECH", "MECHANICAL" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jComboBox1);
        jComboBox1.setBounds(140, 170, 130, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));
        jDesktopPane2.add(jComboBox2);
        jComboBox2.setBounds(140, 260, 110, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jDesktopPane2.add(jScrollPane2);
        jScrollPane2.setBounds(140, 300, 260, 40);
        jDesktopPane2.add(jTextField3);
        jTextField3.setBounds(140, 350, 190, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jTextField4);
        jTextField4.setBounds(140, 470, 160, 30);

        jButton5.setBackground(new java.awt.Color(0, 102, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("submit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane2.add(jButton5);
        jButton5.setBounds(310, 470, 110, 23);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.add(jLabel29);
        jLabel29.setBounds(140, 210, 150, 30);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.add(jLabel30);
        jLabel30.setBounds(140, 390, 140, 30);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.add(jLabel31);
        jLabel31.setBounds(140, 430, 160, 30);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane2.add(jLabel33);
        jLabel33.setBounds(320, 50, 70, 30);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/studentDetails.png"))); // NOI18N
        jLabel54.setText("jLabel4");
        jDesktopPane2.add(jLabel54);
        jLabel54.setBounds(0, 0, 430, 510);

        getContentPane().add(jDesktopPane2);
        jDesktopPane2.setBounds(820, 190, 430, 510);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roll No", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 200, 410, 510);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 330, 260, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 400, 260, 30);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Edit");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(500, 470, 260, 30);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(500, 550, 260, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/K3sGwa.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          int column = 0;
       int row = jTable2.getSelectedRow();
       if(row<0)
       {
           JOptionPane.showMessageDialog(null, "please select a row to edit ","Error",JOptionPane.ERROR_MESSAGE);
       }
  else{
        String value = jTable2.getModel().getValueAt(row, column).toString();
        jDesktopPane1.setVisible(false);
         try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    
                     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");

             Statement  stmt = con.createStatement();
          
	  ResultSet rs = stmt.executeQuery("Select * from uietregister where rollno='"+value+"'");
            if(rs.next())
            {
                String str1[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)};
                jTextField1.setText(str1[0]);
                jLabel32.setText(str1[8]);
                jTextField2.setText(str1[2]);
                jComboBox1.setSelectedItem(str1[4]);
                jLabel29.setText(str1[3]); 
                jComboBox2.setSelectedItem(str1[1]);
                jTextArea1.setText(str1[10]);
                jTextField3.setText(str1[9]);
                jLabel30.setText(str1[7]); 
                jLabel31.setText(str1[6]);
                jTextField4.setText(str1[5]);
                jLabel33.setText(str1[12]);
            }
             //ResultSet rs1 = stmt.executeQuery("Select * from images where rollno='"+value+"'");
            //if(rs.next())
            //{
             //  jLabel28.set;
            //}
   
   Statement  stmt1 = con.createStatement();
          
	  ResultSet rs1 = stmt1.executeQuery("Select * from images where rollno='"+value+"'");
          if (rs1.next())
          {
              BufferedImage im1 = ImageIO.read(rs1.getBinaryStream(1));
              im1 =linearResizeBi(im1,100, 120);
              ImageIcon image2 = new ImageIcon(im1);
              jLabel53.setIcon(image2);
              
          }
          
          
        }
          catch (Exception ex)

        {

            System.out.println(ex);

        }
        jDesktopPane2.setVisible(true);
       }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int column = 0;
       int row = jTable2.getSelectedRow();
       if(row<0)
       {
           JOptionPane.showMessageDialog(null, "please select a row to view ","Error",JOptionPane.ERROR_MESSAGE);
       }
       else
       {
        String value = jTable2.getModel().getValueAt(row, column).toString();
        
         try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    
                     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");

             Statement  stmt = con.createStatement();
          
	  ResultSet rs = stmt.executeQuery("Select * from uietregister where rollno='"+value+"'");
            if(rs.next())
            {
                String str1[]={rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13)};
                jLabel3.setText(str1[0]);
                jLabel7.setText(str1[8]);
                jLabel16.setText(str1[2]);
                jLabel15.setText(str1[4]);
                jLabel14.setText(str1[3]);
                jLabel9.setText(str1[1]);
                jLabel8.setText(str1[10]);
                jLabel5.setText(str1[9]);
                jLabel13.setText(str1[7]);
                jLabel6.setText(str1[6]);
                jLabel12.setText(str1[5]);
                jLabel10.setText(str1[12]);
            }
             //ResultSet rs1 = stmt.executeQuery("Select * from images where rollno='"+value+"'");
            //if(rs.next())
            //{
             //  jLabel28.set;
            //}
   
   Statement  stmt1 = con.createStatement();
          
	  ResultSet rs1 = stmt1.executeQuery("Select * from images where rollno='"+value+"'");
          if (rs1.next())
          {
              BufferedImage im = ImageIO.read(rs1.getBinaryStream(1));
              im =linearResizeBi(im,100, 120);
              ImageIcon image1 = new ImageIcon(im);
              jLabel28.setIcon(image1);
              
          }
          
          
        }
          catch (Exception ex)

        {

            System.out.println(ex);

        }
        jDesktopPane1.setVisible(true);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        int column = 0;
       int row = jTable2.getSelectedRow();
        if(row<0)
       {
           JOptionPane.showMessageDialog(null, "please select a row to delete ","Error",JOptionPane.ERROR_MESSAGE);
       }
  else{
        int p = JOptionPane.showConfirmDialog(null,"Do you really want to continue","Confirmation",JOptionPane.YES_NO_OPTION);
        
        if(p==0){ 
         
        String value = jTable2.getModel().getValueAt(row, column).toString();
        
         try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    
                     Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");

             Statement  stmt = con.createStatement();
          
	  ResultSet rs = stmt.executeQuery("delete uietregister where rollno='"+value+"'");
           
             //ResultSet rs1 = stmt.executeQuery("Select * from images where rollno='"+value+"'");
            //if(rs.next())
            //{
             //  jLabel28.set;
            //}
   
   
          
	  ResultSet rs5 = stmt.executeQuery("delete images where rollno='"+value+"'");
       
        
        }
          catch (Exception ex)

        {

            System.out.println(ex);

        }
        }
         this.setVisible(false);
         new RegistTable(s2,s3).setVisible(true);
        }
        
  
  
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int column = 0;
       int row = jTable2.getSelectedRow();
        String value = jTable2.getModel().getValueAt(row, column).toString();
    try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("Divers loaded successfully");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
		   System.out.println("Connection established successfully");
           /*Statement state = con.createStatement();
            PreparedStatement ps=con.prepareStatement("insert into images(image,rollno)values(?,?) ");
             InputStream is=new FileInputStream(new File(s));
             ps.setBinaryStream(1, is,is.available());
             ps.setString(2, rollno.getText());
             ps.executeUpdate();*/
             
             /* String leet1 = jComboBox3.getSelectedItem().toString();
             String d;
              
              if (leet1=="No"){
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
             
             d = sdf1.format(jDateChooser2.getDate());
            
             System.out.println(d);
             }
             
             else
             {
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
             String solo = sdf1.format(jDateChooser2.getDate());
             int b = Integer.parseInt(solo);
             d = Integer.toString(b-1);
             System.out.println(d);
            }
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
             String dob1 = sdf2.format(jDateChooser1.getDate());
             
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
             String d2 = sdf1.format(jDateChooser2.getDate());
             
             SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMM-yyyy");
             String d4 = sdf3.format(jDateChooser3.getDate());*/
                   String updateTableSQL = "update uietregister set name=?, sex=?, parentname=?, branch=?, prepercentage=? , phone=? , address=?  where rollno=?";
                    System.out.println("al;kjf");
                   PreparedStatement preparedStatement = con.prepareStatement(updateTableSQL);
preparedStatement.setString(1, jTextField1.getText());
preparedStatement.setString(2,jComboBox2.getSelectedItem().toString() );
preparedStatement.setString(3,jTextField2.getText() );
preparedStatement.setString(4,jComboBox1.getSelectedItem().toString() );
preparedStatement.setString(5,jTextField4.getText() );
preparedStatement.setString(6,jTextField3.getText() );
preparedStatement.setString(7,jTextArea1.getText() );
preparedStatement.setString(8,value );
// execute insert SQL stetement
preparedStatement.executeUpdate();
      /* Statement state=con.createStatement();
           String sql = "update uietregister set name='"
       + jTextField1.getText() + "' and sex='" + jComboBox2.getSelectedItem().toString()+ "' and parentname='" + jTextField2.getText() + "'  and branch='" + jComboBox1.getSelectedItem().toString() + "' and prepercentage='" + jTextField4.getText() + "' and  phone='" + jTextField3.getText() + "' and address='" + jTextArea1.getText()  + "'  where rollno='"+value+"'";
           state.execute(sql);*/
		   JOptionPane.showMessageDialog(null, "Record added Successfully","Hurray",JOptionPane.PLAIN_MESSAGE);
                   
		   
                   System.out.println("Statement executed successfully");
           
           con.close();
		}
        
        catch (NullPointerException ee){
            JOptionPane.showMessageDialog(null, "You Have incomplete Details \nTry Again... ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch (Exception e) {
           System.out.print(e);
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        close();
        new administration().setVisible(true);
       
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    static public BufferedImage linearResizeBi(BufferedImage origin, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height ,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = resizedImage.createGraphics();
        float xScale = (float)width / origin.getWidth();
        float yScale = (float)height / origin.getHeight();
        AffineTransform at = AffineTransform.getScaleInstance(xScale,yScale);
        g.drawRenderedImage(origin,at);
        g.dispose();
        return resizedImage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    public void close(){

WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

}

   
}
