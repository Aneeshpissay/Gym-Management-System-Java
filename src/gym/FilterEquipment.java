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
 * @author Aneeshpissay
 */
public class FilterEquipment extends javax.swing.JFrame {

    /**
     * Creates new form FilterEquipment
     */
    public FilterEquipment() {
        initComponents();
        filltrainer();
        FET.getTableHeader().setFont(new Font("Comic Sans MS",Font.BOLD,14));
        FET.getTableHeader().setOpaque(false);
        FET.getTableHeader().setBackground(new Color(153,153,255));
        FET.getTableHeader().setForeground(new Color(102,102,255));
        this.setLocationRelativeTo(null);
    }

    private void filltrainer(){
        try {
            Connection con=MyConnection.getConnection();
            PreparedStatement ps;
            ps=con.prepareStatement("SELECT * FROM `members`");
            ResultSet rs=ps.executeQuery(); 
            while(rs.next()){
              String Trname=rs.getString("mbr_name");
              mbrname.addItem(Trname);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mbrname = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        FET = new javax.swing.JTable();
        Filter = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(546, 592));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Filter Equipment Name used by Members");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 20, 370, 26);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Member Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 100, 110, 21);

        mbrname.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(mbrname);
        mbrname.setBounds(210, 100, 110, 27);

        FET.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        FET.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipment ID", "Equipment Name"
            }
        ));
        jScrollPane1.setViewportView(FET);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 510, 180);

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
        Filter.setBounds(350, 90, 110, 40);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseEntered

    }//GEN-LAST:event_FilterMouseEntered

    private void FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseExited

    }//GEN-LAST:event_FilterMouseExited

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setBackground(new Color(102,102,255));
        Back.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setBackground(new Color(153,153,255));
        Back.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_BackMouseExited

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Equipment form= new Equipment();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        try {
            String t=(String)mbrname.getSelectedItem();
            Connection con=MyConnection.getConnection();
            Statement st = con.createStatement();
            String sql="select eq_id,eq_name from equipment where mbr_name='"+t+"'";
            ResultSet rs=st.executeQuery(sql);
            FET.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_FilterActionPerformed

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
            java.util.logging.Logger.getLogger(FilterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FilterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FilterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FilterEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FilterEquipment().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable FET;
    private javax.swing.JButton Filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mbrname;
    // End of variables declaration//GEN-END:variables
}
