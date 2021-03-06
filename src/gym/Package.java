/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anees
 */
public class Package extends javax.swing.JFrame {

    /**
     * Creates new form Package
     */
    public Package() {
        initComponents();
        fillmember();
        filltrainer();
        PackageTable.getTableHeader().setFont(new Font("Comic Sans MS",Font.BOLD,14));
        PackageTable.getTableHeader().setOpaque(false);
        PackageTable.getTableHeader().setBackground(new Color(153,153,255));
        PackageTable.getTableHeader().setForeground(new Color(102,102,255));
        this.setLocationRelativeTo(null);
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
        ID = new javax.swing.JTextField();
        Level = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        Mbrname = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        PackageTable = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Plan = new javax.swing.JComboBox<>();
        Trnrname = new javax.swing.JComboBox<>();
        Next = new javax.swing.JButton();
        View = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Gym Packages");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(271, 21, 170, 34);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(45, 86, 24, 21);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Plan:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(45, 143, 32, 21);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Level:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(45, 200, 50, 21);

        ID.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID);
        ID.setBounds(107, 83, 94, 30);

        Level.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 1", "Level 2", "Level 3" }));
        jPanel1.add(Level);
        Level.setBounds(107, 197, 111, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Amount:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(439, 86, 55, 21);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Trainer name:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(440, 210, 97, 21);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Member name:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 150, 100, 21);

        Amount.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmountActionPerformed(evt);
            }
        });
        jPanel1.add(Amount);
        Amount.setBounds(523, 83, 140, 30);

        Mbrname.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Mbrname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MbrnameActionPerformed(evt);
            }
        });
        jPanel1.add(Mbrname);
        Mbrname.setBounds(560, 150, 150, 30);

        PackageTable.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        PackageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Plan", "Level", "Amount", "Member name", "Trainer name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PackageTable.getTableHeader().setReorderingAllowed(false);
        PackageTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PackageTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PackageTable);
        if (PackageTable.getColumnModel().getColumnCount() > 0) {
            PackageTable.getColumnModel().getColumn(0).setResizable(false);
            PackageTable.getColumnModel().getColumn(1).setResizable(false);
            PackageTable.getColumnModel().getColumn(2).setResizable(false);
            PackageTable.getColumnModel().getColumn(3).setResizable(false);
            PackageTable.getColumnModel().getColumn(4).setResizable(false);
            PackageTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 310, 710, 369);

        Add.setBackground(new java.awt.Color(153, 153, 255));
        Add.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(102, 102, 255));
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-24.png"))); // NOI18N
        Add.setText("ADD");
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add);
        Add.setBounds(150, 260, 100, 34);

        Update.setBackground(new java.awt.Color(153, 153, 255));
        Update.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(102, 102, 255));
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-update-30.png"))); // NOI18N
        Update.setText("UPDATE");
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update);
        Update.setBounds(270, 260, 130, 37);

        Delete.setBackground(new java.awt.Color(153, 153, 255));
        Delete.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(102, 102, 255));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-30.png"))); // NOI18N
        Delete.setText("DELETE");
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete);
        Delete.setBounds(420, 260, 130, 41);

        Back.setBackground(new java.awt.Color(153, 153, 255));
        Back.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Back.setForeground(new java.awt.Color(102, 102, 255));
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-30.png"))); // NOI18N
        Back.setText("BACK");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(10, 10, 110, 42);

        Plan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Plan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monthly", "Quaterly", "Half-Yearly", "Yearly" }));
        jPanel1.add(Plan);
        Plan.setBounds(100, 140, 120, 30);

        Trnrname.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Trnrname);
        Trnrname.setBounds(550, 210, 160, 30);

        Next.setBackground(new java.awt.Color(153, 153, 255));
        Next.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Next.setForeground(new java.awt.Color(102, 102, 255));
        Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-next-page-30.png"))); // NOI18N
        Next.setText("NEXT");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextMouseExited(evt);
            }
        });
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        jPanel1.add(Next);
        Next.setBounds(622, 10, 110, 42);

        View.setBackground(new java.awt.Color(153, 153, 255));
        View.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        View.setForeground(new java.awt.Color(102, 102, 255));
        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-view-30.png"))); // NOI18N
        View.setText("VIEW");
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ViewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ViewMouseExited(evt);
            }
        });
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View);
        View.setBounds(22, 260, 110, 37);

        close.setBackground(new java.awt.Color(153, 153, 255));
        close.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        close.setForeground(new java.awt.Color(102, 102, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-close-window-30.png"))); // NOI18N
        close.setText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close);
        close.setBounds(570, 260, 110, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cheltenham-Facilities-5.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 890, 706);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed

    }//GEN-LAST:event_IDActionPerformed

    private void AmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AmountActionPerformed

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(new Color(102,102,255));
        Add.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(new Color(153,153,255));
        Add.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_AddMouseExited

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
        Update.setBackground(new Color(102,102,255));
        Update.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_UpdateMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        Update.setBackground(new Color(153,153,255));
        Update.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_UpdateMouseExited

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        Delete.setBackground(new Color(102,102,255));
        Delete.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete.setBackground(new Color(153,153,255));
        Delete.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_DeleteMouseExited

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String t=ID.getText();
        try{
        Connection con=MyConnection.getConnection();
        String sql="delete from package where pack_id='"+t+"' ";
         PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ps.execute();
             JOptionPane.showMessageDialog(this, "Package Details Deleted");
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setBackground(new Color(102,102,255));
        Back.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setBackground(new Color(153,153,255));
        Back.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_BackMouseExited

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Product form= new Product();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        String id=ID.getText();
        String plan=(String)Plan.getSelectedItem();
        String level=(String)Level.getSelectedItem();
        String amt=Amount.getText();
        String mbrname=(String)Mbrname.getSelectedItem();
        String trnrname=(String)Trnrname.getSelectedItem();
        if(verifyText()){
        add a=new add();
        a.pack('i',id,plan,level,amt,mbrname,trnrname);
    }
    }//GEN-LAST:event_AddActionPerformed

    public boolean verifyText(){
       if(ID.getText().equals("")||Amount.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "One or More fields is empty");
           return false;
       }
        else{
           return true;
       }
    }
    private void filltrainer(){
        try {
            Connection con=MyConnection.getConnection();
            PreparedStatement ps;
            ps=con.prepareStatement("SELECT * FROM `trainer`");
            ResultSet rs=ps.executeQuery(); 
            while(rs.next()){
              String trname=rs.getString("tr_name");
              Trnrname.addItem(trname);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
     private void fillmember(){
        try {
            Connection con=MyConnection.getConnection();
            PreparedStatement ps;
            ps=con.prepareStatement("SELECT * FROM `members`");
            ResultSet rs=ps.executeQuery(); 
            while(rs.next()){
              String mbrname=rs.getString("mbr_name");
              Mbrname.addItem(mbrname);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
    private void NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseEntered
       Next.setBackground(new Color(102,102,255));
       Next.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_NextMouseEntered

    private void NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseExited
      Next.setBackground(new Color(153,153,255));
      Next.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_NextMouseExited

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        Payment form= new Payment();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_NextActionPerformed

    private void ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseEntered
        View.setBackground(new Color(102,102,255));
        View.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_ViewMouseEntered

    private void ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseExited
        View.setBackground(new Color(153,153,255));
        View.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_ViewMouseExited

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        try {
            Connection con=MyConnection.getConnection();
            Statement st = con.createStatement();
            String pack="select * from package";
            ResultSet rs=st.executeQuery(pack);
            PackageTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void PackageTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PackageTableMouseClicked
         try {
            Connection con=MyConnection.getConnection();
            int row=PackageTable.getSelectedRow();
            String tab=(PackageTable.getModel().getValueAt(row,0).toString());
            String sql="SELECT * FROM gym.package where pack_id='"+tab+"'";
            
            PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ResultSet rs;
            rs=ps.executeQuery();
            if(rs.next()){
                String id=rs.getString("pack_id");
                ID.setText(id);
                String plan=rs.getString("pack_plan");
                Plan.setSelectedItem(plan);
                String level=rs.getString("pack_level");
                Level.setSelectedItem(level);
                String amount=rs.getString("pack_amt");
                Amount.setText(amount);
                String mbrname=rs.getString("mbr_name");
                Mbrname.setSelectedItem(mbrname);
                String trname=rs.getString("tr_name");
                Trnrname.setSelectedItem(trname);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_PackageTableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            String t=ID.getText();
            Connection con=MyConnection.getConnection();
            String sql="UPDATE `gym`.`package` SET `pack_id` =?, `pack_plan` = ?, `pack_level` = ?, `pack_amt` = ?, `mbr_name` = ?, `tr_name` = ? WHERE `pack_id` ='"+t+"'";
            PreparedStatement ps;
            ps=con.prepareStatement(sql);

            String plan=(String) Plan.getSelectedItem();
            String level=(String) Level.getSelectedItem();
            String mbrname=(String) Mbrname.getSelectedItem();
            String trname=(String) Trnrname.getSelectedItem();
            ps.setString(1, ID.getText());
            ps.setString(2, plan);
            ps.setString(3, level);
            ps.setString(4, Amount.getText());
            ps.setString(5, mbrname);
            ps.setString(6, trname);
            ps.execute();
   
            JOptionPane.showMessageDialog(null, "Package Details Updated");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void MbrnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MbrnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MbrnameActionPerformed

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(102,102,255));
        close.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(153,153,255));
        close.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_closeMouseExited

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        Login form= new Login();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Package().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Amount;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> Level;
    private javax.swing.JComboBox<String> Mbrname;
    private javax.swing.JButton Next;
    private javax.swing.JTable PackageTable;
    private javax.swing.JComboBox<String> Plan;
    private javax.swing.JComboBox<String> Trnrname;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
