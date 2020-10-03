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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author anees
 */
public class Member extends javax.swing.JFrame {

    public Member() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        male.setSelected(true);
        MemberTable.getTableHeader().setFont(new Font("Comic Sans MS",Font.BOLD,14));
        MemberTable.getTableHeader().setOpaque(false);
        MemberTable.getTableHeader().setBackground(new Color(153,153,255));
        MemberTable.getTableHeader().setForeground(new Color(102,102,255));
        filltrainer();
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
        Phno = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        Age = new javax.swing.JTextField();
        Tr_name = new javax.swing.JComboBox<>();
        Next = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Filter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MemberTable = new javax.swing.JTable();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        close = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Gym Member");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(299, 41, 160, 34);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(49, 133, 24, 21);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(49, 189, 44, 21);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Phone number:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(49, 259, 97, 21);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(49, 317, 42, 21);

        ID.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel1.add(ID);
        ID.setBounds(91, 131, 95, 29);

        Name.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Name);
        Name.setBounds(103, 187, 159, 29);

        Phno.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        Phno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PhnoKeyTyped(evt);
            }
        });
        jPanel1.add(Phno);
        Phno.setBounds(156, 257, 158, 28);

        Email.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Email);
        Email.setBounds(109, 314, 184, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Date of Birth:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 133, 100, 21);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Age:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(480, 189, 31, 21);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Gender:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(480, 259, 54, 21);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("Trainer Name:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(480, 317, 101, 21);

        dob.setDateFormatString("yyyy-MM-dd");
        dob.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(dob);
        dob.setBounds(598, 131, 172, 29);

        Age.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Age);
        Age.setBounds(520, 190, 107, 29);

        Tr_name.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jPanel1.add(Tr_name);
        Tr_name.setBounds(599, 312, 161, 30);

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
        Next.setBounds(660, 20, 110, 40);

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
        Add.setBounds(160, 360, 90, 41);

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
        Update.setBounds(270, 360, 130, 38);

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
        Delete.setBounds(420, 360, 130, 40);

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
        View.setBounds(30, 360, 110, 40);

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
        Back.setBounds(20, 10, 110, 50);

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
        Filter.setBounds(560, 360, 110, 40);

        MemberTable.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        MemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone number", "Email", "DOB", "Age", "Gender", "Trainer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MemberTable.getTableHeader().setReorderingAllowed(false);
        MemberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MemberTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MemberTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 430, 760, 250);

        male.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        male.setText("Male");
        jPanel1.add(male);
        male.setBounds(540, 260, 57, 30);

        female.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        female.setText("Female");
        jPanel1.add(female);
        female.setBounds(610, 260, 73, 29);

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
        close.setBounds(680, 360, 110, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group-fitness-studio-best-gym-chelmsford.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 796, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        String t=ID.getText();
        try{
        Connection con=MyConnection.getConnection();
        String sql="delete from members where mbr_id='"+t+"' ";
         PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ps.execute();
             JOptionPane.showMessageDialog(this, "Members Details Deleted");
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed

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

    private void NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseEntered
        Next.setBackground(new Color(102,102,255));
        Next.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_NextMouseEntered

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

    private void NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseExited
        Next.setBackground(new Color(153,153,255));
        Next.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_NextMouseExited

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        Equipment form= new Equipment();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_NextActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        String id=ID.getText();
        String name=Name.getText();
        String phone=Phno.getText();
        String email=Email.getText();
        String gen="Male";
        if(female.isSelected()){
            gen="Female";
        }
        String age=Age.getText();
        String tr_name=(String)Tr_name.getSelectedItem();
       
        if(verifyText()){
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(dob.getDate());
            add a=new add();
            a.members('i',id,name,phone,email,bdate,age,gen,tr_name);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        try {
            Connection con=MyConnection.getConnection();
            Statement st = con.createStatement();
            String mbr="select * from gym.members";
            ResultSet rs=st.executeQuery(mbr);
            MemberTable.setModel(DbUtils.resultSetToTableModel(rs)); 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_ViewActionPerformed

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back.setBackground(new Color(102,102,255));
        Back.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back.setBackground(new Color(153,153,255));
        Back.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_BackMouseExited

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Trainer form= new Trainer();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void ViewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseEntered
        View.setBackground(new Color(102,102,255));
        View.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_ViewMouseEntered

    private void ViewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMouseExited
     View.setBackground(new Color(153,153,255));
     View.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_ViewMouseExited

    private void FilterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseEntered
       Filter.setBackground(new Color(102,102,255));
       Filter.setForeground(new Color(153,153,255));
    }//GEN-LAST:event_FilterMouseEntered

    private void FilterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FilterMouseExited
     Filter.setBackground(new Color(153,153,255));
     Filter.setForeground(new Color(102,102,255));
    }//GEN-LAST:event_FilterMouseExited

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        Filtermember form= new Filtermember();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_FilterActionPerformed

    private void MemberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MemberTableMouseClicked
        Connection con=MyConnection.getConnection();
        int row=MemberTable.getSelectedRow();
        String tab=MemberTable.getModel().getValueAt(row,0).toString();

        try {

            String sql="SELECT * FROM `gym`.`members` where `mbr_id`="+tab+"";
            PreparedStatement ps;
            ps=con.prepareStatement(sql);
            ResultSet rs;
            rs=ps.executeQuery();
            if(rs.next()){
                String id=rs.getString("mbr_id");
                String name=rs.getString("mbr_name");
                String phno=rs.getString("mbr_phno");
                String email=rs.getString("mbr_email");
                Date date=rs.getDate("mbr_dob");
                String age=rs.getString("mbr_age");
                String gender=rs.getString("mbr_gen");
                String trname=rs.getString("tr_name");
                ID.setText(""+id);
                Name.setText(name);
                Phno.setText(phno);
                Email.setText(email);
                dob.setDate(date);
                Age.setText(age);
                if(gender.equals("Male")){
                    male.setSelected(true);
                }
                else{
                    female.setSelected(true);
                }
                Tr_name.setSelectedItem(trname);
                ps.close();
                rs.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_MemberTableMouseClicked

    private void PhnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhnoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_PhnoKeyTyped

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            String t=ID.getText();
            Connection con=MyConnection.getConnection();
            String sql="UPDATE `gym`.`members` SET `mbr_id` = ?,`mbr_name` = ?,`mbr_phno` = ?,`mbr_email` = ?,mbr_dob=?,`mbr_age` = ?,`mbr_gen` = ?,`tr_name` = ? WHERE `mbr_id` ='"+t+"'";
            PreparedStatement ps;
            ps=con.prepareStatement(sql);
            String gen="Male";
            if(female.isSelected()){
            gen="Female";
            }
            String trname=(String)Tr_name.getSelectedItem();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateFormat.format(dob.getDate());
            ps.setString(1, ID.getText());
            ps.setString(2, Name.getText());
            ps.setString(3, Phno.getText());
            ps.setString(4, Email.getText());
            ps.setString(5, bdate);
            ps.setString(6, Age.getText());
            ps.setString(7, gen);
            ps.setString(8, trname);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Member Details Updated");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

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
       else if(Age.getText().equals("1-14")){
           JOptionPane.showMessageDialog(null, "Age cannot be less than 15");
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
              Tr_name.addItem(trname);
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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Member().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Age;
    private javax.swing.JButton Back;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Filter;
    private javax.swing.JTextField ID;
    public static javax.swing.JTable MemberTable;
    private javax.swing.JTextField Name;
    private javax.swing.JButton Next;
    private javax.swing.JTextField Phno;
    private javax.swing.JComboBox<String> Tr_name;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JButton close;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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