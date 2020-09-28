
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Asus
 */
public class DB {

    private ResultSet result;
    private Statement ss;
    private Connection c;
    private PreparedStatement ps;
    //private byte[] picture;
    public DB() {
        ;
    }

    public void connection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information_system","root","");
            ss = c.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setinfo(String id, String name, String department, String year, String semester, String cgpa, String fathers_name, String mothers_name, String date_of_birth, String blood_group, String gender, String mobile_number, String email, String address) {
        //this.picture = images;
        
        try {
           // String sq=("insert into students_information VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            String sq = "insert into students_information values('" + id + "','" + name + "','" + department + "','" + year + "','" + semester + "','" + cgpa + "','" + fathers_name + "','" + mothers_name + "','" + date_of_birth + "','" + blood_group + "','" + gender + "','" + mobile_number + "','" + email + "','" + address + "')";

            ss.executeUpdate(sq);
            JOptionPane.showMessageDialog(null, "Submit Successful");
            //getData();
            c.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   // public byte[] getImage(){
            //return picture;
     //   }

    public static void main(String args[]) {
        

    }
}
