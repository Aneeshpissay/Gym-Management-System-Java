/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gym;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anees
 */
public class Homepage extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Homepage() {
        initComponents();
        HomeTable.getTableHeader().setFont(new Font("Comic Sans MS",Font.BOLD,14));
        HomeTable.getTableHeader().setOpaque(false);
        HomeTable.getTableHeader().setBackground(new Color(153,153,255));
        HomeTable.getTableHeader().setForeground(new Color(102,102,255));
        this.setLocationRelativeTo(null);
    }
    Card c=new Card();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Trainer = new javax.swing.JButton();
        Member = new javax.swing.JButton();
        Product = new javax.swing.JButton();
        Equipment = new javax.swing.JButton();
        Package = new javax.swing.JButton();
        Payment = new javax.swing.JButton();
        Card = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HomeTable = new javax.swing.JTable();
        View = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(861, 532));
        jPanel1.setLayout(null);

        Trainer.setBackground(new java.awt.Color(153, 153, 255));
        Trainer.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Trainer.setForeground(new java.awt.Color(102, 102, 255));
        Trainer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-personal-trainer-30.png"))); // NOI18N
        Trainer.setText("Trainer");
        Trainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TrainerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TrainerMouseExited(evt);
            }
        });
        Trainer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainerActionPerformed(evt);
            }
        });
        jPanel1.add(Trainer);
        Trainer.setBounds(60, 30, 120, 50);

        Member.setBackground(new java.awt.Color(153, 153, 255));
        Member.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Member.setForeground(new java.awt.Color(102, 102, 255));
        Member.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-member-30.png"))); // NOI18N
        Member.setText("Member");
        Member.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MemberMouseExited(evt);
            }
        });
        Member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemberActionPerformed(evt);
            }
        });
        jPanel1.add(Member);
        Member.setBounds(270, 30, 120, 50);

        Product.setBackground(new java.awt.Color(153, 153, 255));
        Product.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Product.setForeground(new java.awt.Color(102, 102, 255));
        Product.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-protein-supplement-30.png"))); // NOI18N
        Product.setText("Product");
        Product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ProductMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ProductMouseExited(evt);
            }
        });
        Product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductActionPerformed(evt);
            }
        });
        jPanel1.add(Product);
        Product.setBounds(650, 30, 120, 50);

        Equipment.setBackground(new java.awt.Color(153, 153, 255));
        Equipment.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Equipment.setForeground(new java.awt.Color(102, 102, 255));
        Equipment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-dumbbell-30.png"))); // NOI18N
        Equipment.setText("Equipment");
        Equipment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EquipmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EquipmentMouseExited(evt);
            }
        });
        Equipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EquipmentActionPerformed(evt);
            }
        });
        jPanel1.add(Equipment);
        Equipment.setBounds(460, 30, 133, 50);

        Package.setBackground(new java.awt.Color(153, 153, 255));
        Package.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Package.setForeground(new java.awt.Color(102, 102, 255));
        Package.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-package-30.png"))); // NOI18N
        Package.setText("Package");
        Package.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PackageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PackageMouseExited(evt);
            }
        });
        Package.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PackageActionPerformed(evt);
            }
        });
        jPanel1.add(Package);
        Package.setBounds(80, 540, 120, 50);

        Payment.setBackground(new java.awt.Color(153, 153, 255));
        Payment.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Payment.setForeground(new java.awt.Color(102, 102, 255));
        Payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-card-payment-30.png"))); // NOI18N
        Payment.setText("Payment");
        Payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaymentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaymentMouseExited(evt);
            }
        });
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        jPanel1.add(Payment);
        Payment.setBounds(250, 540, 130, 50);

        Card.setBackground(new java.awt.Color(153, 153, 255));
        Card.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Card.setForeground(new java.awt.Color(102, 102, 255));
        Card.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-membership-card-30.png"))); // NOI18N
        Card.setText("Generate Card");
        Card.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CardMouseExited(evt);
            }
        });
        Card.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardActionPerformed(evt);
            }
        });
        jPanel1.add(Card);
        Card.setBounds(450, 540, 200, 50);

        HomeTable.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        HomeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Member ID", "Member Name ", "Trainer Name", "Package Plan", "Payment Date", "Payment Amount", "Valid Upto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HomeTable.getTableHeader().setReorderingAllowed(false);
        HomeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HomeTable);
        if (HomeTable.getColumnModel().getColumnCount() > 0) {
            HomeTable.getColumnModel().getColumn(0).setResizable(false);
            HomeTable.getColumnModel().getColumn(1).setResizable(false);
            HomeTable.getColumnModel().getColumn(2).setResizable(false);
            HomeTable.getColumnModel().getColumn(5).setResizable(false);
            HomeTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 102, 900, 430);

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
        View.setBounds(810, 30, 120, 50);

        Logout.setBackground(new java.awt.Color(153, 153, 255));
        Logout.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(102, 102, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-logout-30.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        jPanel1.add(Logout);
        Logout.setBounds(740, 540, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3rd-july-19-1024x444.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 990, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemberActionPerformed
        Member form= new Member();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_MemberActionPerformed

    private void EquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EquipmentActionPerformed
        Equipment form= new Equipment();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_EquipmentActionPerformed

    private void ProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductActionPerformed
        Product form= new Product();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_ProductActionPerformed

    private void TrainerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainerMouseEntered
         Trainer.setBackground(new Color(102,102,255));
         Trainer.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_TrainerMouseEntered

    private void TrainerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainerMouseExited
         Trainer.setBackground(new Color(153,153,255));
         Trainer.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_TrainerMouseExited

    private void MemberMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberMouseEntered
         Member.setBackground(new Color(102,102,255));
         Member.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_MemberMouseEntered

    private void MemberMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberMouseExited
         Member.setBackground(new Color(153,153,255));
         Member.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_MemberMouseExited

    private void EquipmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquipmentMouseEntered
        Equipment.setBackground(new Color(102,102,255));
        Equipment.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_EquipmentMouseEntered

    private void EquipmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EquipmentMouseExited
        Equipment.setBackground(new Color(153,153,255));
        Equipment.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_EquipmentMouseExited

    private void ProductMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseEntered
        Product.setBackground(new Color(102,102,255));
        Product.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_ProductMouseEntered

    private void PackageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PackageMouseEntered
      Package.setBackground(new Color(102,102,255));
      Package.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_PackageMouseEntered

    private void PackageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PackageMouseExited
       Package.setBackground(new Color(153,153,255));
       Package.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_PackageMouseExited

    private void PaymentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMouseEntered
        Payment.setBackground(new Color(102,102,255));
        Payment.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_PaymentMouseEntered

    private void PaymentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymentMouseExited
       Payment.setBackground(new Color(153,153,255));
       Payment.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_PaymentMouseExited

    private void CardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardMouseEntered
       Card.setBackground(new Color(102,102,255));
       Card.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_CardMouseEntered

    private void CardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardMouseExited
       Card.setBackground(new Color(153,153,255));
       Card.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_CardMouseExited

    private void ProductMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMouseExited
       Product.setBackground(new Color(153,153,255));
       Product.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_ProductMouseExited

    private void TrainerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainerActionPerformed
        Trainer form= new Trainer();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_TrainerActionPerformed

    private void PackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PackageActionPerformed
        Package form= new Package();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_PackageActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
        Payment form= new Payment();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_PaymentActionPerformed

    private void CardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardActionPerformed
        int row=HomeTable.getSelectedRow();
        TableModel model=HomeTable.getModel();
        String id=model.getValueAt(row,0).toString();
        String mbrname=model.getValueAt(row,1).toString();
        String trname=model.getValueAt(row,2).toString();
        String plan=model.getValueAt(row,3).toString();
        String Date=model.getValueAt(row, 4).toString();
        String Vu=model.getValueAt(row,6).toString();
        c.setVisible(true);
        c.pack();
        c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        c.ID.setText(id);
        c.Name.setText(mbrname);
        c.trname.setText(trname);
        c.plan.setText(plan);
        c.date.setText(Date);
        c.v.setText(Vu);
    }//GEN-LAST:event_CardActionPerformed

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
            String main="select * from v_home";
            ResultSet rs=st.executeQuery(main);
            HomeTable.setModel(DbUtils.resultSetToTableModel(rs)); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void HomeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeTableMouseClicked
        
    }//GEN-LAST:event_HomeTableMouseClicked

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
       Logout.setBackground(new Color(102,102,255));
       Logout.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Logout.setBackground(new Color(153,153,255));
        Logout.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_LogoutMouseExited

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login form=new Login();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Homepage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Card;
    private javax.swing.JButton Equipment;
    public static javax.swing.JTable HomeTable;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Member;
    private javax.swing.JButton Package;
    private javax.swing.JButton Payment;
    private javax.swing.JButton Product;
    private javax.swing.JButton Trainer;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}