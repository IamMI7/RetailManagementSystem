package Jframes;

import Classes.User;
import Jframes.AdminDashboard;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
    public class AdminManageUser extends javax.swing.JFrame {

    boolean checkEmpty = false;
    private DefaultTableModel tm;
    boolean checknum = false;
    public AdminManageUser() {
        initComponents();
        displayallproductmanagerinfo();
        displayallsupplierinfo();
        IDTextField.setText("Search by User ID");
        UserIDTextField2.setEditable(false);
        UsernameTextField.setEditable(false);
        ContactTextField.setEditable(false);
        EmailTextField.setEditable(false);
        StatusComboBox.setEditable(false);
        UserTypeTextField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserIDTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        UserTypeTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ContactTextField = new javax.swing.JTextField();
        EditButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        StatusComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        NewUserBUtton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        IDTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductManagerTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(252, 118, 106));
        jLabel1.setText("Status");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 80, 20));

        jLabel4.setForeground(new java.awt.Color(252, 118, 106));
        jLabel4.setText("User ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 20));

        UserIDTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(UserIDTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, 30));

        jLabel5.setForeground(new java.awt.Color(252, 118, 106));
        jLabel5.setText("Username");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, 20));

        UsernameTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 220, 30));

        jLabel6.setForeground(new java.awt.Color(252, 118, 106));
        jLabel6.setText("User Type");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 20));

        UserTypeTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(UserTypeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 220, 30));

        jLabel7.setForeground(new java.awt.Color(252, 118, 106));
        jLabel7.setText("Contact NO");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 80, 20));

        ContactTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(ContactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 220, 30));

        EditButton.setForeground(new java.awt.Color(51, 255, 51));
        EditButton.setText("EDIT");
        EditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditButtonMouseClicked(evt);
            }
        });
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });
        jPanel4.add(EditButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 110, 40));

        SaveButton.setForeground(new java.awt.Color(255, 51, 51));
        SaveButton.setText("SAVE");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        jPanel4.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 110, 40));

        jLabel8.setForeground(new java.awt.Color(252, 118, 106));
        jLabel8.setText("Email Address");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 80, 20));

        EmailTextField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 220, 30));

        StatusComboBox.setBackground(new java.awt.Color(255, 255, 255));
        StatusComboBox.setForeground(new java.awt.Color(252, 118, 106));
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        jPanel4.add(StatusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 170, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 640, 200));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(252, 118, 106));
        jLabel2.setText("User Management");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, 30));

        NewUserBUtton.setForeground(new java.awt.Color(51, 255, 153));
        NewUserBUtton.setText("ADD USER");
        NewUserBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewUserBUttonActionPerformed(evt);
            }
        });
        jPanel2.add(NewUserBUtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 110, 40));

        CancelButton.setText("CANEL");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 100, 40));

        SearchButton.setText("SEARCH");
        SearchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchButtonMouseClicked(evt);
            }
        });
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 40));

        IDTextField.setBackground(new java.awt.Color(255, 255, 255));
        IDTextField.setForeground(new java.awt.Color(0, 0, 0));
        IDTextField.setBorder(null);
        IDTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDTextFieldMouseClicked(evt);
            }
        });
        jPanel2.add(IDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 240, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(252, 118, 106));
        jLabel3.setText("Create new users or update existing users. ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 290, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 270, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductManagerTable.setBackground(new java.awt.Color(255, 255, 255));
        ProductManagerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Username", "Contact", "Email", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductManagerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductManagerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductManagerTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1140, 480));

        jTabbedPane1.addTab("Product Manager", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SupplierTable.setBackground(new java.awt.Color(255, 255, 255));
        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Username", "Contact", "Email", "Roll", "Status"
            }
        ));
        jScrollPane2.setViewportView(SupplierTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 12, 1130, 490));

        jTabbedPane1.addTab("Supplier", jPanel3);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 1140, 540));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewUserBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewUserBUttonActionPerformed
        RegisterForm RF = new RegisterForm();
        RF.setVisible(true);
        clearTable();
        displaydataontable();
    }//GEN-LAST:event_NewUserBUttonActionPerformed

    private void EditButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditButtonMouseClicked
        
    }//GEN-LAST:event_EditButtonMouseClicked

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        UsernameTextField.setEditable(true);
        ContactTextField.setEditable(true);
        EmailTextField.setEditable(true);
        StatusComboBox.setEditable(true);
        StatusComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_EditButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        User UC = new User();
        String id = UC.getUserID();
        String pst = UC.getUserRole();
        String username = UC.getUsername();
        String email = UC.getEmailAddress();
        int icno = UC.getICNO();
        int contact = UC.getContactNo();
        String password = UC.getPassword();
        AdminDashboard adm = new AdminDashboard(pst,id,username,email,contact,password,icno);
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SearchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchButtonMouseClicked

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        String query = IDTextField.getText(); 
        filter(query);
        displaydataontable();
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        int newcontactno = Integer.parseInt(ContactTextField.getText());
        String newemail = EmailTextField.getText();
        String newstatus = (String)StatusComboBox.getSelectedItem();
        String newname = UsernameTextField.getText();

        emptyValidation();
        onlynum();
        
        if(checkEmpty == true && checknum == true){
            if(UserIDTextField2.getText().startsWith("PM")){
            try{
                FileInputStream fstream = new FileInputStream("ProductManager.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                String line = "";
                StringBuilder data = new StringBuilder();
                String dbuserid, dbusername,dbuseremail,dbstatus,dbrole,dbpassword;
                int dbcontact,dbicno;
                while ((line = br.readLine()) != null) { //if there is data in text file
                String values[] = line.split(","); //read every values between coma in a row and put into string array
                dbuserid = values[0];
                dbusername = values[1];
                dbicno = Integer.parseInt(values[2]);
                dbpassword = values[3];
                dbcontact = Integer.parseInt(values[4]);
                dbuseremail = values[5];
                dbrole = values[6];
                dbstatus = values[7];
                if (values.length>0) { //if array is not empty
                    if (values[0].equals(UserIDTextField2.getText())) { //if the first data in array (id) is equal to  id in text field
                        String dataRow = dbuserid +","+ newname +","+ dbicno +","+ dbpassword +
                        ","+ newcontactno +","+ newemail +","+ dbrole +","+ newstatus +",";
                        data.append(dataRow); //make edit to this line
                        data.append("\n"); //put a new line
                    }
                    else {
                        data.append(line); //write remaining data from other users
                        data.append("\n"); //put a new line
                    }
                }
                fstream.close();
                br.close();
                FileWriter fw = new FileWriter("ProductManager.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data.toString()); //write the entire data in String Builder to text file
                bw.close(); //close buffered writer
                fw.close(); //close file writer
                
                JOptionPane.showMessageDialog(null, "User Profile is updated.");
                
                }
            }
            catch(FileNotFoundException e)
            {
            } catch (IOException ex) {
               
            }
        }
        else{
            try{
                FileInputStream fstream = new FileInputStream("Supplier.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                String line = "";
                StringBuilder data = new StringBuilder();
                String dbuserid, dbusername,dbuseremail,dbstatus,dbrole,dbpassword;
                int dbcontact,dbicno;
                while ((line = br.readLine()) != null) { //if there is data in text file
                String values[] = line.split(","); //read every values between coma in a row and put into string array
                dbuserid = values[0];
                dbusername = values[1];
                dbicno = Integer.parseInt(values[2]);
                dbpassword = values[3];
                dbcontact = Integer.parseInt(values[4]);
                dbuseremail = values[5];
                dbrole = values[6];
                dbstatus = values[7];
                if (values.length>0) { //if array is not empty
                    if(values[0].equals(UserIDTextField2.getText())) { //if the first data in array (id) is equal to  id in text field
                        String dataRow = dbuserid +","+ newname +","+ dbicno +","+ dbpassword +
                        ","+ newcontactno +","+ newemail +","+ dbrole +","+ newstatus +",";
                        data.append(dataRow); //make edit to this line
                        data.append("\n"); //put a new line
                    }
                    else {
                        data.append(line); //write remaining data from other users
                        data.append("\n"); //put a new line
                    }
                }
                fstream.close();
                br.close();
                FileWriter fw = new FileWriter("Supplier.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(data.toString()); //write the entire data in String Builder to text file
                bw.close(); //close buffered writer
                fw.close(); //close file writer
                
                JOptionPane.showMessageDialog(null, "User Profile is updated.");
                
                }
            }
            catch(FileNotFoundException e)
            {
            } catch (IOException ex) {
               
            }
        }
         }
        returnnoteditable();
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void ProductManagerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductManagerTableMouseClicked
        tm = (DefaultTableModel)ProductManagerTable.getModel();
        int selectedRowIndex = ProductManagerTable.getSelectedRow();
        
        UserIDTextField2.setText((String)ProductManagerTable.getValueAt(selectedRowIndex,0));
        UsernameTextField.setText((String)ProductManagerTable.getValueAt(selectedRowIndex,1));
        ContactTextField.setText((String)ProductManagerTable.getValueAt(selectedRowIndex,2));
        EmailTextField.setText((String)ProductManagerTable.getValueAt(selectedRowIndex,3));
        UserTypeTextField.setText((String)ProductManagerTable.getValueAt(selectedRowIndex,4));  
    }//GEN-LAST:event_ProductManagerTableMouseClicked

    private void IDTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDTextFieldMouseClicked
        IDTextField.setText("");
    }//GEN-LAST:event_IDTextFieldMouseClicked

    /**
     * @param args the command line arguments
     */
    
    private void returnnoteditable(){
        UserIDTextField2.setEditable(false);
        UsernameTextField.setEditable(false);
        ContactTextField.setEditable(false);
        EmailTextField.setEditable(false);
        StatusComboBox.setEditable(false);
        UserTypeTextField.setEditable(false);
    }
    
    private void clearTable(){
         tm = (DefaultTableModel)ProductManagerTable.getModel();
         tm.setRowCount(0);  
    }
    
    private void filter(String query){                                                                     //filter result from table.
       tm = (DefaultTableModel)ProductManagerTable.getModel();
       TableRowSorter<DefaultTableModel> querysort = new TableRowSorter<DefaultTableModel>(tm);
       ProductManagerTable.setRowSorter(querysort);
       querysort.setRowFilter(RowFilter.regexFilter(query));
    }
    
    public void displaydataontable(){
        if(IDTextField.getText().startsWith("PM")){
            try
        {
            tm = (DefaultTableModel) ProductManagerTable.getModel();                                                                                   //use this table to display data
            BufferedReader br = new BufferedReader(new FileReader("ProductManager.txt"));                                                              //read data from text file
            String line = "";
            while ((line = br.readLine()) != null) {     
                String[] data = line.split(",");                                                                                                       //check text file got data or not
                String[] nani = {data[0],data[1],data[4],data[5],data[6],data[7]};
                tm.addRow(nani);                                                                                                                       //add each line of data from text file to new row in table
            }
            br.close();                                                                                                                                //finish load data close reader
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        }
        else if(IDTextField.getText().startsWith("SU")){
            try
        {
            tm = (DefaultTableModel) SupplierTable.getModel();                                                                                   //use this table to display data
            BufferedReader br = new BufferedReader(new FileReader("Supplier.txt"));                                                             //read data from text file
            String line = "";
            while ((line = br.readLine()) != null) {     
                System.out.println(line);
                String[] data = line.split(",");                                                                                                   //check text file got data or not
                String[] nani = {data[0],data[1],data[4],data[5],data[6],data[7]};
                tm.addRow(nani);                                                                                                                   //add each line of data from text file to new row in table
            }
            br.close();                                                                                                                            //finish load data close reader
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        }
    }  
    
    public boolean emptyValidation(){
        checkEmpty = true;
        if(ContactTextField.getText() == null && EmailTextField.getText() == null && StatusComboBox.getSelectedItem() == null){
            checkEmpty = false;
            return false;
        }
        return true;
    }
        
    public boolean onlynum(){
        try{
            Integer.parseInt(ContactTextField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please make sure your Contact Number is number");
            checknum = false;
            return false;
        }
        return true;  
    }
    
    private void displayallsupplierinfo(){
        try{
            tm = (DefaultTableModel) SupplierTable.getModel(); //use this table to display data
            BufferedReader br = new BufferedReader(new FileReader("Supplier.txt")); //read course from text file
            String line = "";
            while ((line = br.readLine()) != null) { //check text file got data or not
                tm.addRow(line.split(",")); //add each line of data from text file to new row in table
            }
            br.close(); //finish load data close reader  
            }
            catch(FileNotFoundException e)
            {
            } catch (IOException ex) {
               
            }
    }
    
    private void displayallproductmanagerinfo(){
        try{
            tm = (DefaultTableModel) ProductManagerTable.getModel(); //use this table to display data
            BufferedReader br = new BufferedReader(new FileReader("ProductManager.txt")); //read course from text file
            String line = "";
            while ((line = br.readLine()) != null) { //check text file got data or not
                tm.addRow(line.split(",")); //add each line of data from text file to new row in table
            }
            br.close(); //finish load data close reader  
            }
            catch(FileNotFoundException e)
            {
            } catch (IOException ex) {
               
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField ContactTextField;
    private javax.swing.JButton EditButton;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JButton NewUserBUtton;
    private javax.swing.JTable ProductManagerTable;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JTextField UserIDTextField2;
    private javax.swing.JTextField UserTypeTextField;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

}