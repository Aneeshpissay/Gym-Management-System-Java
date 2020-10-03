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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anees
 */
public class Trainer extends javax.swing.JFrame {

    public Trainer() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        male.setSelected(true);
        TrainerTable.getTableHeader().setFont(new Font("Comic Sans MS",Font.BOLD,14));
        TrainerTable.getTableHeader().setOpaque(false);
        TrainerTable.getTableHeader().setBackground(new Color(153,153,255));
        TrainerTable.getTableHeader().setForeground(new Color(102,102,255));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Type = new javax.swing.JComboBox<>();
        Phno = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Level = new javax.swing.JComboBox<>();
        dob = new com.toedter.calendar.JDateChooser();
        Back2 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Next = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TrainerTable = new javax.swing.JTable();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1057, 697));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Gym Trainer");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 30, 160, 34);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(52, 86, 24, 21);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(52, 145, 44, 21);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Type:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 210, 39, 21);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Phone number:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 260, 112, 21);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(52, 320, 42, 21);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(750, 80, 100, 21);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Age:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(750, 130, 31, 21);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Gender:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(750, 180, 54, 21);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Level:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(750, 230, 41, 21);

        ID.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(ID);
        ID.setBounds(90, 80, 217, 30);

        Name.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Name);
        Name.setBounds(106, 147, 201, 30);

        Type.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aerobics", "Calisthenics", "Weightlifting", "Cardio" }));
        jPanel1.add(Type);
        Type.setBounds(100, 210, 140, 30);

        Phno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Phno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhnoKeyTyped(evt);
            }
        });
        jPanel1.add(Phno);
        Phno.setBounds(160, 260, 217, 30);

        Email.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Email);
        Email.setBounds(112, 320, 217, 30);

        Age.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Age);
        Age.setBounds(810, 130, 80, 30);

        Level.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Level 1", "Level 2", "Level 3" }));
        jPanel1.add(Level);
        Level.setBounds(810, 230, 140, 30);

        dob.setDateFormatString("yyyy-MM-dd");
        dob.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(dob);
        dob.setBounds(860, 80, 150, 30);

        Back2.setBackground(new java.awt.Color(153, 153, 255));
        Back2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Back2.setForeground(new java.awt.Color(102, 102, 255));
        Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-arrow-30.png"))); // NOI18N
        Back2.setText("BACK");
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Back2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Back2MouseExited(evt);
            }
        });
        Back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back2ActionPerformed(evt);
            }
        });
        jPanel1.add(Back2);
        Back2.setBounds(20, 10, 110, 50);

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
        Delete.setBounds(740, 370, 130, 37);

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
        Update.setBounds(530, 370, 130, 37);

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
        Add.setBounds(350, 370, 100, 37);

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
        View.setBounds(170, 370, 107, 37);

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
        Next.setBounds(890, 10, 110, 40);

        TrainerTable.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        TrainerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Phone number", "Email", "DOB", "Age", "Gender", "Level", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TrainerTable.getTableHeader().setReorderingAllowed(false);
        TrainerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TrainerTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(22, 420, 1000, 250);

        male.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        male.setText("Male");
        jPanel1.add(male);
        male.setBounds(820, 180, 57, 30);

        female.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        female.setText("Female");
        jPanel1.add(female);
        female.setBounds(890, 180, 80, 29);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exercise-for-your-heart-1030x6.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, -20, 1040, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        String id=ID.getText();
        String name=Name.getText();
        String type=(String) Type.getSelectedItem();
        String phone=Phno.getText();
        String email=Email.getText();
        String age=Age.getText(); 
        String gen="Male";
        if(female.isSelected()){
            gen="Female";
        }
        String level=(String) Level.getSelectedItem();
        
        if(verifyText()){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(dob.getDate());
            add a=new add();
            a.trainer('i',id,name,type,phone,email,bdate,age,gen,level);
        }
        
    }//GEN-LAST:event_AddActionPerformed

    public boolean verifyText(){
       if(ID.getText().equals("")||Name.getText().equals("") || Phno.getText().equals("") ||Email.getText().equals("")||dob.getDate()==null) {
           JOptionPane.showMessageDialog(null, "One or More fields is empty");
           return false;
       }
       else if(dob.getDate().compareTo(new Date() )>0){
           JOptionPane.showMessageDialog(null, "No members from the future are allowed");
           return false;
       }
       else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", Email.getText()))) 
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       else{
           return true;
       }
        
      
   }
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            String t=ID.getText();
            Connection con=MyConnection.getConnection();
            String sql="UPDATE `gym`.`trainer` SET `tr_id` = ?,`tr_name` = ?,`tr_type` = ?,`tr_phno` = ?,`tr_email` = ?,`tr_dob` = ?,`tr_age` = ?,`tr_gen` = ?,`tr_level` = ? WHERE `tr_id` = '"+t+"'";
            PreparedStatement ps;
            ps=con.prepareStatement(sql);
            String gen="Male";
            if(female.isSelected()){
            gen="Female";
            }
            String type=(String) Type.getSelectedItem();
            String level=(String) Level.getSelectedItem();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(dob.getDate());
            ps.setString(1, ID.getText());
            ps.setString(2, Name.getText());
            ps.setString(3, type);
            ps.setString(4, Phno.getText());
            ps.setString(5, Email.getText());
            ps.setString(6, bdate);
            ps.setString(7, Age.getText());
            ps.setString(8, gen);
            ps.setString(9, level);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Trainer Details Updated");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

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

    private void Back2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseEntered
        Back2.setBackground(new Color(102,102,255));
        Back2.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_Back2MouseEntered

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

    private void Back2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseExited
         Back2.setBackground(new Color(153,153,255));
         Back2.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_Back2MouseExited

    private void Back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back2ActionPerformed
        Homepage form= new Homepage();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Back2ActionPerformed

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
            String mbr="select * from gym.trainer";
            ResultSet rs=st.executeQuery(mbr);
            TrainerTable.setModel(DbUtils.resultSetToTableModel(rs)); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
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
       Member form= new Member();
       form.setVisible(true);
       form.pack();
       form.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_NextActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String t=ID.getText();
        try{
        Connection con=MyConnection.getConnection();
        String sql="delete from trainer where tr_id='"+t+"' ";
         PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ps.execute();
             JOptionPane.showMessageDialog(this, "Trainer Details Deleted");
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void TrainerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainerTableMouseClicked
        Connection con=MyConnection.getConnection();
        int row=TrainerTable.getSelectedRow();
        String tab=TrainerTable.getModel().getValueAt(row,0).toString();
        
        try {
            
            String sql="SELECT * FROM `gym`.`trainer` where `tr_id`="+tab+"";
            PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ResultSet rs;
            rs=ps.executeQuery();
            if(rs.next()){
                String id=rs.getString("tr_id");
                String name=rs.getString("tr_name");
                String type=rs.getString("tr_type");
                String phno=rs.getString("tr_phno");
                String email=rs.getString("tr_email");
                Date date=rs.getDate("tr_dob");
                String age=rs.getString("tr_age");
                String Gender=rs.getString("tr_gen");
                String level=rs.getString("tr_level");
            
                ID.setText(""+id);
                Name.setText(name);
                Type.setSelectedItem(type);
                Phno.setText(phno);
                Email.setText(email);
                dob.setDate(date);
                Age.setText(age);
                if(Gender.equals("Male")){
                    male.setSelected(true);
                }
                else{
                    female.setSelected(true);
                }
                Level.setSelectedItem(level);
          
                ps.close();
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_TrainerTableMouseClicked

    private void PhnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhnoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_PhnoKeyTyped

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
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Trainer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Age;
    private javax.swing.JButton Back2;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> Level;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Next;
    private javax.swing.JTextField Phno;
    public static javax.swing.JTable TrainerTable;
    private javax.swing.JComboBox<String> Type;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton male;
    // End of variables declaration//GEN-END:variables
}
