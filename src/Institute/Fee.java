

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Institute;


import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Hp
 */
public class Fee extends javax.swing.JFrame {

    /**
     * Creates new form Fee
     */
    public Fee() {
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
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        fees = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        Button1 = new javax.swing.JButton();
        resetbutton = new javax.swing.JButton();
        sid = new javax.swing.JTextField();
        getbtn = new javax.swing.JButton();
        updtbtn = new javax.swing.JButton();
        dltbtn = new javax.swing.JButton();
        updtbtn1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        aml = new javax.swing.JTextField();
        jdate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fee management");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 528));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Student name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Father's name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Class");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Fee amount");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Student ID");

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        fname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        cname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cname.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnameActionPerformed(evt);
            }
        });

        fees.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fees.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        fees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        Button1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button1.setText("Reciept");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        resetbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetbutton.setText("Reset");
        resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbuttonActionPerformed(evt);
            }
        });

        sid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        sid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sidActionPerformed(evt);
            }
        });

        getbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getbtn.setText("Get values");
        getbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getbtnActionPerformed(evt);
            }
        });

        updtbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updtbtn.setText("Update");
        updtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtbtnActionPerformed(evt);
            }
        });

        dltbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dltbtn.setText("Delete");
        dltbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltbtnActionPerformed(evt);
            }
        });

        updtbtn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updtbtn1.setText("Show records");
        updtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtbtn1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Print ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Amount left");

        aml.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        aml.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        aml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amlActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(getbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dltbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updtbtn1)))
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(sid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fees, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(fname)
                                    .addComponent(cname)
                                    .addComponent(aml, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1099, 1099, 1099))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updtbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dltbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void cnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnameActionPerformed

    private void feesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:

        area.setText(area.getText() + "*********************************************************************************************\n");
        area.setText(area.getText() + "*                                     Fee Reciept system                                     *\n");
        area.setText(area.getText() + "*                         National Institute of Electronics and information technology       *\n");
        area.setText(area.getText() + "**********************************************************************************************\n");
        Date obj = new Date();
        String date = obj.toString();

        area.setText(area.getText() + "  \n" + date + "\n\n");
        area.setText(area.getText() + "  Registration ID  :" + sid.getText() + "\n");
        area.setText(area.getText() + "  Student name  :" + name.getText() + "\n");
        area.setText(area.getText() + "  Father name  :" + fname.getText() + "\n");
        area.setText(area.getText() + "  Class  :" + cname.getText() + "\n");
        area.setText(area.getText() + "  Fee amount  :" + fees.getText() + "\n");
        area.setText(area.getText() + "  Fee left  :" + aml.getText() + "\n\n\n");
        
        area.setText(area.getText() + "\t                                                                            Signature");


       int anss= JOptionPane.showConfirmDialog(null, "Are you sure to record data");
        if (anss == JOptionPane.YES_OPTION)

        {
        try {
            Class.forName("java.sql.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/institute", "root", "123");


            PreparedStatement pst = con.prepareStatement("insert into fee values(?,?,?,?,?,?,?)");

            pst.setString(1, sid.getText());
            pst.setString(2, name.getText());
            pst.setString(3, (fname.getText()));
            pst.setString(4, cname.getText());
            pst.setInt(5, Integer.parseInt(fees.getText()));
             SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
               String date1=sdf.format(jdate.getDate());
               pst.setString(6, date1);
             pst.setString(7, (aml.getText()));
                
             
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Record added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        else  if (anss == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Record not added");
        }
 if(anss == JOptionPane.CANCEL_OPTION){
             JOptionPane.showMessageDialog(null, "Operation cancel ");
         }
        

        
       

        

    }//GEN-LAST:event_Button1ActionPerformed

    private void resetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbuttonActionPerformed
        // TODO add your handling code here:


        area.setText("");
        sid.setText("");
        name.setText("");
        fname.setText("");
        cname.setText("");
        fees.setText("");
        jdate.setCalendar(null);
        aml.setText("");
       
    }//GEN-LAST:event_resetbuttonActionPerformed

    private void getbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getbtnActionPerformed
        // TODO add your handling code here:
         Feerecord fe =new Feerecord();
        
        ResultSet rs= null;
        
        
        String c ="class";
        String f ="fee";
        rs =fe.find(sid.getText());
        try{
            if(rs.next()){
                name.setText(rs.getString("student_name"));
                fname.setText(rs.getString("father_name"));
                cname.setText(rs.getString("class"));
                fees.setText(rs.getString("Amount"));
                
            }else{
                JOptionPane.showMessageDialog(null, "No Data For this ID");
            }
        
        
    }
        catch(Exception e)
        {
            
        }
    }
        public class Feerecord
        {
       
            Connection con =null;
        ResultSet rs=null;
        PreparedStatement ps =null;
        public ResultSet find(String s){
        try{
            con =DriverManager.getConnection("jdbc:mysql://localhost/Institute","root","123");
       ps =con.prepareStatement("select* from fee where student_id=?");
       ps.setString(1, s);
       rs =ps.executeQuery();
       
        
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
         return rs;
        }
      
        
        
    }//GEN-LAST:event_getbtnActionPerformed

    private void updtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtbtnActionPerformed
        // TODO add your handling code here:
        int ans = JOptionPane.showConfirmDialog(null, "Are you sure want to update fee record");
        if(ans == JOptionPane.YES_OPTION);
        {

            try{
                Class.forName("java.sql.Driver");

      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Institute","root","123");
      PreparedStatement pst = con.prepareStatement("update fee set student_name=?, father_name=?, class=?, amount=? where student_id=? ");
         
          pst.setString(1,name.getText());
        pst.setString(2,fname.getText());
        
        pst.setString(3, cname.getText());
        pst.setString(4, fees.getText());
       pst.setString(5, sid.getText());
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Record updated successfully");
            }
        
        catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
        }
        } 
        if (ans==JOptionPane.NO_OPTION){
                   JOptionPane.showMessageDialog(null, "Record not update");

        }
         if(ans == JOptionPane.CANCEL_OPTION){
             JOptionPane.showMessageDialog(null, "Operation cancel ");
         }
        
    }//GEN-LAST:event_updtbtnActionPerformed

    private void dltbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltbtnActionPerformed
        // TODO add your handling code here:
        
         int ans = JOptionPane.showConfirmDialog(null, "Are you sure want to delete record");
        if(ans == JOptionPane.YES_OPTION);
        {

            try{
                Class.forName("java.sql.Driver");

      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Institute","root","123");
             PreparedStatement pst = con.prepareStatement("delete from fee where student_id= ?");
             pst.setString(1,sid.getText());
             pst.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record deleted successfully");
             
        sid.setText("");
        name.setText("");
        fname.setText("");
        cname.setText("");
        fees.setText("");
        
            }
            
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            
       
            }
        if (ans==JOptionPane.NO_OPTION){
                   JOptionPane.showMessageDialog(null, "Record not update");

        }
         if(ans == JOptionPane.CANCEL_OPTION){
             JOptionPane.showMessageDialog(null, "Operation cancel ");
         }
        
    }//GEN-LAST:event_dltbtnActionPerformed

    private void sidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sidActionPerformed

    private void updtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtbtn1ActionPerformed
        // TODO add your handling code here:
        FeeTable ft =new FeeTable();
        ft.setVisible(true);
        
        
    }//GEN-LAST:event_updtbtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      try{
            
            area.print();
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void amlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amlActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Fee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JTextField aml;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField cname;
    private javax.swing.JButton dltbtn;
    private javax.swing.JTextField fees;
    private javax.swing.JTextField fname;
    private javax.swing.JButton getbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JTextField name;
    private javax.swing.JButton resetbutton;
    private javax.swing.JTextField sid;
    private javax.swing.JButton updtbtn;
    private javax.swing.JButton updtbtn1;
    // End of variables declaration//GEN-END:variables
}
