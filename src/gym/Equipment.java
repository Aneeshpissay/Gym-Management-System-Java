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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anees
 */
public class Equipment extends javax.swing.JFrame {

    /**
     * Creates new form Equipment
     */
    public Equipment() {
        initComponents();
        fillmember();
        EquipmentTable.getTableHeader().setFont(new Font("Comic Sans MS",Font.BOLD,14));
        EquipmentTable.getTableHeader().setOpaque(false);
        EquipmentTable.getTableHeader().setBackground(new Color(153,153,255));
        EquipmentTable.getTableHeader().setForeground(new Color(102,102,255));
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
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Type = new javax.swing.JComboBox<>();
        Membername = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        EquipmentTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        Filter = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Gym Equipments");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(311, 11, 185, 34);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(46, 91, 24, 21);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(46, 146, 44, 23);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Type:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(46, 211, 39, 21);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Member Name:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(46, 266, 104, 21);

        ID.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(ID);
        ID.setBounds(88, 88, 143, 31);

        Name.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Name);
        Name.setBounds(100, 143, 143, 32);

        Type.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aerobics", "Calisthenics", "Weightlifting", "Cardio" }));
        jPanel1.add(Type);
        Type.setBounds(103, 209, 140, 28);

        Membername.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Membername);
        Membername.setBounds(168, 264, 120, 29);

        EquipmentTable.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        EquipmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Member name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EquipmentTable.getTableHeader().setReorderingAllowed(false);
        EquipmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EquipmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EquipmentTable);
        if (EquipmentTable.getColumnModel().getColumnCount() > 0) {
            EquipmentTable.getColumnModel().getColumn(0).setResizable(false);
            EquipmentTable.getColumnModel().getColumn(1).setResizable(false);
            EquipmentTable.getColumnModel().getColumn(2).setResizable(false);
            EquipmentTable.getColumnModel().getColumn(3).setResizable(false);
            EquipmentTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(320, 100, 452, 402);

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
        Add.setBounds(170, 334, 90, 40);

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
        Update.setBounds(30, 410, 130, 37);

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
        Delete.setBounds(170, 410, 130, 41);

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
        View.setBounds(40, 333, 110, 40);

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
        Next.setBounds(672, 20, 110, 42);

        Filter.setBackground(new java.awt.Color(153, 153, 255));
        Filter.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Filter.setForeground(new java.awt.Color(102, 102, 255));
        Filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-filter-30.png"))); // NOI18N
        Filter.setText("Filter");
        Filter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FilterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FilterMouseExited(evt);
            }
        });
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });
        jPanel1.add(Filter);
        Filter.setBounds(40, 470, 110, 40);

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
        close.setBounds(170, 470, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stretched-795-553-692040.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 990, 553);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String t=ID.getText();
        try{
        Connection con=MyConnection.getConnection();
        String sql="delete from equipment where eq_id='"+t+"' ";
         PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ps.execute();
             JOptionPane.showMessageDialog(this, "Equipment Details Deleted");
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Member form= new Member();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
       Add.setBackground(new Color(102,102,255));
       Add.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_AddMouseEntered

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
       Update.setBackground(new Color(102,102,255));
       Update.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_UpdateMouseEntered

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
       Delete.setBackground(new Color(102,102,255));
       Delete.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_DeleteMouseEntered

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setBackground(new Color(102,102,255));
        Back.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_BackMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(new Color(153,153,255));
        Add.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_AddMouseExited

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        Update.setBackground(new Color(153,153,255));
        Update.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_UpdateMouseExited

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete.setBackground(new Color(153,153,255));
        Delete.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_DeleteMouseExited

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setBackground(new Color(153,153,255));
        Back.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_BackMouseExited

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

    String id=ID.getText();
    String name=Name.getText();
    String type=(String)Type.getSelectedItem();
    String mbr_name=(String)Membername.getSelectedItem();
    if(verifyText()){
        add a=new add();
        a.equipment('i',id,name,type,mbr_name);
    }
    }//GEN-LAST:event_AddActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
       try {
            Connection con=MyConnection.getConnection();
            Statement st = con.createStatement();
            String mbr="SELECT * FROM gym.equipment";
            ResultSet rs=st.executeQuery(mbr);
            EquipmentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ViewActionPerformed

    
    private void NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseEntered
       Next.setBackground(new Color(102,102,255));
      Next.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_NextMouseEntered

    private void NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseExited
      Next.setBackground(new Color(153,153,255));
      Next.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_NextMouseExited

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        Product form=new Product();
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

    private void EquipmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquipmentTableMouseClicked
         try {
            Connection con=MyConnection.getConnection();
            int row=EquipmentTable.getSelectedRow();
            String tab=(EquipmentTable.getModel().getValueAt(row,0).toString());
            String sql="SELECT * FROM gym.equipment where eq_id='"+tab+"'";
            
            PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ResultSet rs;
            rs=ps.executeQuery();
            if(rs.next()){
                String id=rs.getString("eq_id");
                ID.setText(id);
                String name=rs.getString("eq_name");
                Name.setText(name);
                String type=rs.getString("eq_type");
                Type.setSelectedItem(type);
                String mbrname=rs.getString("mbr_name");
                Membername.setSelectedItem(mbrname);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_EquipmentTableMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            String t=ID.getText();
            Connection con=MyConnection.getConnection();
            String sql="UPDATE `gym`.`equipment` SET `eq_id` = ?,`eq_name` = ?,`eq_type` = ?,`mbr_name`=? WHERE `eq_id` = '"+t+"'";
            PreparedStatement ps;
            ps=con.prepareStatement(sql);
            String type=(String)Type.getSelectedItem();
            String mbrname=(String)Membername.getSelectedItem();
            ps.setString(1, ID.getText());
            ps.setString(2, Name.getText());
            ps.setString(3, type);
            ps.setString(4, mbrname);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Equipment Details Updated");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseEntered
        Filter.setBackground(new Color(102,102,255));
        Filter.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_FilterMouseEntered

    private void FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseExited
        Filter.setBackground(new Color(153,153,255));
        Filter.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_FilterMouseExited

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        FilterEquipment form= new FilterEquipment();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_FilterActionPerformed

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
    
    public boolean verifyText(){
       if(Name.getText().equals("")) {
           JOptionPane.showMessageDialog(null, "One or More fields is empty");
           return false;
       }
        else{
           return true;
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
              Membername.addItem(mbrname);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
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
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Equipment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    public static javax.swing.JTable EquipmentTable;
    private javax.swing.JButton Filter;
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> Membername;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Next;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
