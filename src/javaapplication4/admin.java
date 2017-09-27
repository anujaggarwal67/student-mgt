
package javaapplication4;


import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;



public class admin extends javax.swing.JFrame {

   String s,d;
    public admin() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        parent = new javax.swing.JTextField();
        percentage = new javax.swing.JTextField();
        branch = new javax.swing.JComboBox<String>();
        rollno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        image = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dob = new com.toedter.calendar.JDateChooser();
        doa = new com.toedter.calendar.JDateChooser();
        dobc2 = new com.toedter.calendar.JDateChooser();
        leet = new javax.swing.JComboBox<String>();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 760));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/logo.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1370, 170);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Details");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(610, 170, 220, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 240, 140, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Guardian Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 300, 140, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOB");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 360, 140, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 420, 140, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pre.  Percentage");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 480, 140, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date Of last Qualification");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 480, 170, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date of Admission");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 550, 140, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Alloted Roll No.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 550, 140, 20);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name);
        name.setBounds(200, 240, 180, 30);

        parent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parentActionPerformed(evt);
            }
        });
        getContentPane().add(parent);
        parent.setBounds(200, 300, 180, 30);
        getContentPane().add(percentage);
        percentage.setBounds(200, 480, 180, 30);

        branch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSE", "ECE", "BIOTECH", "MECH" }));
        branch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchActionPerformed(evt);
            }
        });
        getContentPane().add(branch);
        branch.setBounds(200, 420, 180, 30);

        rollno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollnoActionPerformed(evt);
            }
        });
        getContentPane().add(rollno);
        rollno.setBounds(740, 550, 190, 30);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 630, 270, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sex ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(550, 420, 160, 20);

        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        sex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexActionPerformed(evt);
            }
        });
        getContentPane().add(sex);
        sex.setBounds(740, 420, 100, 30);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(900, 630, 270, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Address");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(550, 240, 130, 20);

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(740, 240, 190, 80);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Phone");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(550, 360, 130, 20);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone);
        phone.setBounds(740, 360, 190, 30);

        jScrollPane2.setViewportView(image);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1040, 300, 190, 230);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Choose File");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(1040, 560, 190, 25);

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
        jButton4.setBounds(150, 630, 270, 30);

        dob.setDateFormatString("dd MMM yyyy");
        getContentPane().add(dob);
        dob.setBounds(201, 360, 180, 30);

        doa.setDateFormatString("dd MMM yyyy");
        getContentPane().add(doa);
        doa.setBounds(200, 550, 180, 30);

        dobc2.setDateFormatString("dd MMM yyyy");
        getContentPane().add(dobc2);
        dobc2.setBounds(740, 480, 190, 30);

        leet.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Yes" }));
        leet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leetActionPerformed(evt);
            }
        });
        getContentPane().add(leet);
        leet.setBounds(1110, 220, 100, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Leet");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(1040, 220, 70, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication4/K3sGwa.jpg"))); // NOI18N
        jLabel11.setText("swx");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void parentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parentActionPerformed
        
    }//GEN-LAST:event_parentActionPerformed

    private void branchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchActionPerformed
      
    }//GEN-LAST:event_branchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try
       { 
       
        if(name.getText().equals("") || parent.getText().equals("") || percentage.getText().equals("") || rollno.getText().equals("") || phone.getText().equals("") || address.getText().equals("") || dob.getDate().equals(""))
           
       {
           JOptionPane.showMessageDialog(null, "please fill all the fields  ","Error",JOptionPane.ERROR_MESSAGE);
       }
      String perc=percentage.getText();
       Integer per=new Integer(perc);
       String phon=phone.getText();
       long pho=Long.valueOf(phon);
       if(per >100 || per<0)
       {
           
           JOptionPane.showMessageDialog(null, "please enter the percentage correctly ","Error",JOptionPane.ERROR_MESSAGE);
       }
     else if(pho>9999999999L || pho<1000000000L)
      {
         JOptionPane.showMessageDialog(null, "please ente the phone correctly ","Error",JOptionPane.ERROR_MESSAGE);
      }
        
       else{
        
        int p = JOptionPane.showConfirmDialog(null,"Do you really want to continue","Confirmation",JOptionPane.YES_NO_OPTION);
        int p1=5;
        if(p==0){ 
        
        
        try{
           Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("Divers loaded successfully");
           Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "root");
		   System.out.println("Connection established successfully");
           Statement state = con.createStatement();
          ResultSet ps1=state.executeQuery("select * from uietregister");
           while(ps1.next())
           {
               if(rollno.getText().equals(ps1.getString(9)))
                   
                   
               {
                   System.out.println("alk");
                     p1 = JOptionPane.showConfirmDialog(null," This rollno is used before so Do you really want to continue","Confirmation",JOptionPane.YES_NO_OPTION);
                   
               }
           }
            if(p1==5 || p1==0){
            PreparedStatement ps=con.prepareStatement("insert into images(image,rollno)values(?,?) ");
             InputStream is=new FileInputStream(new File(s));
             ps.setBinaryStream(1, is,is.available());
             ps.setString(2, rollno.getText());
             ps.executeUpdate();
             
              String leet1 = leet.getSelectedItem().toString();
             
              
              if (leet1=="No"){
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
             d = sdf1.format(doa.getDate());
            
             System.out.println(d);
             }
             
             else
             {
             SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy");
             String solo = sdf1.format(doa.getDate());
             int b = Integer.parseInt(solo);
             d = Integer.toString(b-1);
             System.out.println(d);
            }
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy");
             String dob1 = sdf2.format(dob.getDate());
             
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MMM-yyyy");
             String d2 = sdf1.format(doa.getDate());
             
             SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMM-yyyy");
             String d4 = sdf3.format(dobc2.getDate());
       
           String sql = "insert into uietregister values ('"
       + name.getText() + "','" + sex.getSelectedItem().toString()+ "','" + parent.getText() + "','" + dob1 + "','" + branch.getSelectedItem().toString() + "','" + percentage.getText() + "','" + d4 + "','" + d2  + "','" + rollno.getText() + "','" + phone.getText() + "','" + address.getText()  + "','" + d +"','" + leet1 + "')";
           state.execute(sql);
		   JOptionPane.showMessageDialog(null, "Record added Successfully","Hurray",JOptionPane.PLAIN_MESSAGE);
                   
		   
                   System.out.println("Statement executed successfully");
           state.close();
           con.close();}
		}
        
        catch (NullPointerException ee){
            JOptionPane.showMessageDialog(null, "You Have incomplete Details \nTry Again... ","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        catch (Exception e) {
           System.out.print(e);
        }
        
        
        }
       }}
       catch (NumberFormatException num)
       {
          JOptionPane.showMessageDialog(null, "please enter all the fields correctly ","Error",JOptionPane.ERROR_MESSAGE);
       }
        catch (NullPointerException ee){
            JOptionPane.showMessageDialog(null, "please enter all the fields correctly ","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexActionPerformed
        
    }//GEN-LAST:event_sexActionPerformed

    private void rollnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollnoActionPerformed
        
    }//GEN-LAST:event_rollnoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        name.setText(null);
        parent.setText(null);
        phone.setText(null);
        percentage.setText(null);
        rollno.setText(null);
        address.setText(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser file=new JFileChooser();
       file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter =new FileNameExtensionFilter("*.Images", "jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result=file.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION)
        {
            File selectedFile=file.getSelectedFile();
            String path=selectedFile.getAbsolutePath();
            image.setIcon(ResizeImage(path));
            s=path;
           
        }
        else if(result==JFileChooser.CANCEL_OPTION)
        {
            System.out.println("no file select");
        }    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      close();
      administration back=new administration();
      back.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void leetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leetActionPerformed
       
    }//GEN-LAST:event_leetActionPerformed
 
    
    public ImageIcon ResizeImage(String ImagePath)
  {
      ImageIcon myimage=new ImageIcon(ImagePath);
      Image img=myimage.getImage();
      Image newImg=img.getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH );
      ImageIcon image1=new ImageIcon(newImg);
      return image1; 
  }
   
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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JComboBox<String> branch;
    private com.toedter.calendar.JDateChooser doa;
    private com.toedter.calendar.JDateChooser dob;
    private com.toedter.calendar.JDateChooser dobc2;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> leet;
    private javax.swing.JTextField name;
    private javax.swing.JTextField parent;
    private javax.swing.JTextField percentage;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField rollno;
    private javax.swing.JComboBox sex;
    // End of variables declaration//GEN-END:variables
 public void close(){

WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

}
 
 public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date){
    if(date != null) {
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
    return null;
}

}
