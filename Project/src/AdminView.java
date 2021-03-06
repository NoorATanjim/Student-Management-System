
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AdminView extends javax.swing.JFrame {
    private ResultSet result;
    private Statement ss;
    private Connection c;
    private PreparedStatement ps;
    /**
     * Creates new form AdminView
     */
    public AdminView() throws ClassNotFoundException, SQLException {
        initComponents();
        //show_list();
        fetch();
    }
   /* public ArrayList<students> studentList() throws ClassNotFoundException, SQLException
    {
        ArrayList<students> studentList = new ArrayList();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information_system","Fahmid","aurnobfm1");
            String query ="select * from students_information";
            ss=c.createStatement();
            result = ss.executeQuery(query); 
            students list;
            while(result.next())
            {
                list = new students(result.getString("id"),result.getString("name"),result.getString("department"),result.getString("cgpa"));
                studentList.add(list);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return studentList;
    }
    public void show_list() throws ClassNotFoundException, SQLException
    {
        ArrayList<students> list = studentList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[4];
        for(int i=0; i<list.size(); i++)
        {
            row[0]= list.get(i).getid();
            row[1]= list.get(i).getname();
            row[2]= list.get(i).getdepartment();
            row[3]= list.get(i).getcgpa();
            model.addRow(row);
        }
 
    }*/
    public void fetch() throws SQLException, ClassNotFoundException
    {
        try{
             Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information_system","root","");
            String query ="select id,name,department,year,semester,cgpa from students_information";
            ss=c.createStatement();
            result = ss.executeQuery(query); 
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    //DefaultTableModel dm;
    
    //private void search()
   // {
       //// String query =("select id from students_information where id '"+jTextField1.getText()+"%'");
        //setTable();
        //TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
        //jTable1.setRowSorter(tr);
        //tr.setRowFilter(RowFilter.regexFilter(query));
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        addnew = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Student Information System");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 10, 510, 50);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText(" Student Id:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 70, 130, 30);

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(140, 70, 310, 30);

        jButton1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 70, 120, 30);

        addnew.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        addnew.setForeground(new java.awt.Color(0, 0, 120));
        addnew.setText("Add New");
        addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewActionPerformed(evt);
            }
        });
        getContentPane().add(addnew);
        addnew.setBounds(780, 70, 120, 30);

        jButton3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 70, 79, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Department", "Year", "Semester", "CGPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 130, 870, 510);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background light blue.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 920, 680);

        setBounds(0, 0, 937, 726);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
             Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information_system","root","");
            //String query ="select * from students_information where id = ?";
            ss=c.createStatement();
            //result = ss.executeQuery(query); 
           // jTable1.setModel(DbUtils.resultSetToTableModel(result));
            ps = c.prepareStatement("select id,name,department,year,semester,cgpa from students_information where id = ?");
            ps.setString(1, String.valueOf(jTextField1.getText()));
            result = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
            ps.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        /*try{
             Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information_system","Fahmid","aurnobfm1");
            //String query ="select * from students_information where id = ?";
            ss=c.createStatement();
            //result = ss.executeQuery(query); 
           // jTable1.setModel(DbUtils.resultSetToTableModel(result));
            ps = c.prepareStatement("select id,name,department,cgpa from students_information where id = ?");
            ps.setString(1, String.valueOf(jTextField1.getText()));
            result = ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(result));
            ps.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }*/
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText(null);
        try {
            fetch();
        } catch (SQLException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            StudentIndividualInformation inf = new StudentIndividualInformation();
            inf.setVisible(true);
            this.dispose();
            
            int index = jTable1.getSelectedRow();
            TableModel model = jTable1.getModel();
            String id = model.getValueAt(index, 0).toString();
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information_system","root","");
            String query ="select * from students_information where id = '"+id+"'";
            ss=c.createStatement();
            result = ss.executeQuery(query);
            while(result.next())
            {
                inf.name.setText(result.getString("name"));
                inf.fathersname.setText(result.getString("fathers_name"));
                inf.mothersname.setText(result.getString("mothers_name"));
                inf.dob.setText(result.getString("date_of_birth"));
                inf.bloodgrp.setText(result.getString("blood_group"));
                inf.gender.setText(result.getString("gender"));
                inf.mobile.setText(result.getString("mobile_number"));
                inf.email.setText(result.getString("email"));
                inf.address.setText(result.getString("address"));
                inf.department.setText(result.getString("department"));
                inf.id.setText(result.getString("id"));
                inf.year.setText(result.getString("year"));
                inf.semester.setText(result.getString("semester"));
                inf.cgpa.setText(result.getString("cgpa"));
               /* byte[] img = result.getBytes("images");
                //ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH));
                ImageIcon imageIcon = new ImageIcon(img);
                Image im = imageIcon.getImage();
                Image myimg = im.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myimg);
                img1.setIcon(newImage);*/
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewActionPerformed
        StudentInformationRegistrationPage streg = new StudentInformationRegistrationPage();
        streg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addnewActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminView().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    public int getWidth() { return super.getWidth(); }
    public int getHeight() { return super.getHeight(); }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addnew;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
