
package gym;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class add {
    public void trainer(char operation,String id,String name,String type,String phno,String email,String dob,String age,String gender,String level){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i'){
            try {
                ps=con.prepareStatement("INSERT INTO `gym`.`trainer`(tr_id,`tr_name`,`tr_type`,`tr_phno`,`tr_email`,`tr_dob`,`tr_age`,`tr_gen`,`tr_level`)VALUES(?,?,?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, type);
                ps.setString(4, phno);
                ps.setString(5, email);
                ps.setString(6, dob);
                ps.setString(7, age);
                ps.setString(8, gender);
                ps.setString(9, level);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Trainer Added");
                }
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null,ex);
            }
            
        }
    }
    
    public void members(char operation,String id,String name,String phno,String email,String dob,String age,String gender,String tr_name){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i'){
            try {
                ps=con.prepareStatement("INSERT INTO `gym`.`members`(mbr_id,`mbr_name`,`mbr_phno`,`mbr_email`,`mbr_dob`,`mbr_age`,`mbr_gen`,`tr_name`)VALUES(?,?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, phno);
                ps.setString(4, email);
                ps.setString(5, dob);
                ps.setString(6, age);
                ps.setString(7, gender);
                ps.setString(8, tr_name);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Member Added");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
            
        }
    }
    
    public void equipment(char operation,String id,String name, String type, String mbr_name){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i'){
            try {
                ps=con.prepareStatement("INSERT INTO `equipment`(eq_id,`eq_name`, `eq_type`, `mbr_name`) VALUES (?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, type);
                ps.setString(4, mbr_name);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Equipment Added");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
            
        }
    }
    public void product(char operation,String id,String name, String type, String qty, String price, String mbr_name){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i'){
            try {
                ps=con.prepareStatement("INSERT INTO product(prod_id,`prod_name`,`prod_type`,`prod_quantity`,`prod_price`,`mbr_name`) VALUES (?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, type);
                ps.setString(4, qty);
                ps.setString(5, price);
                ps.setString(6, mbr_name);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Product Added");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
            
        }
    }
    public void pack(char operation,String id,String plan, String level, String amt, String mbr_name,String tr_name){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i'){
            try {
                ps=con.prepareStatement("INSERT INTO `package`(pack_id,`pack_plan`,`pack_level`,`pack_amt`,`mbr_name`,`tr_name`)VALUES(?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, plan);
                ps.setString(3, level);
                ps.setString(4,amt);
                ps.setString(5, mbr_name);
                ps.setString(6, tr_name);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Package Added");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
            
        }
    }
    public void payment(char operation,String id,String pay_date,String prod_price,String pack_amt,String totamt,String validity,String mbr_name){
        Connection con=MyConnection.getConnection();
        PreparedStatement ps;
        if(operation=='i'){
            try {
                ps=con.prepareStatement("INSERT INTO `gym`.`payment` (pay_id,`pay_date`,`prod_price`,`pack_amt`,tot_amt,`valid_upto`,`mbr_name`)VALUES(?,?,?,?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, pay_date);
                ps.setString(3, prod_price);
                ps.setString(4, pack_amt);
                ps.setString(5, totamt);
                ps.setString(6, validity);
                ps.setString(7, mbr_name);
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"New Payment Added");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,ex);
            }
            
        }
    }
}


