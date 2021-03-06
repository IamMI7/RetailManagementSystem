/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframes;

import Classes.ProductManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class EditCatalogueFrame extends javax.swing.JFrame{
    

    /**
     * Creates new form EditCatalogueFrame
     */
    public EditCatalogueFrame() {
        initComponents();
        
        CatalogueID();
        checkID();
        clearCatalogueTable();
        displayCatalogueTable();
        setLocationRelativeTo(null);
        
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ECAddProductComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ECProductName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CatalogueTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ECProductPrice = new javax.swing.JTextField();
        ECProductCategory = new javax.swing.JTextField();
        ECProductStock = new javax.swing.JTextField();
        CatAddButton = new javax.swing.JButton();
        CatRemoveButton = new javax.swing.JButton();
        CatGenerate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 246, 245));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(252, 118, 106));
        jLabel10.setText("Edit Catalogue");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(252, 118, 106));
        jLabel11.setText("ProductID:");

        ECAddProductComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ECAddProductComboBoxItemStateChanged(evt);
            }
        });
        ECAddProductComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ECAddProductComboBoxMouseClicked(evt);
            }
        });
        ECAddProductComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECAddProductComboBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(252, 118, 106));
        jLabel12.setText("ProductName:");

        ECProductName.setEditable(false);
        ECProductName.setBackground(new java.awt.Color(204, 204, 204));
        ECProductName.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        ECProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECProductNameActionPerformed(evt);
            }
        });

        CatalogueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "ProductName", "ProductPrice", "ProductCategory", "Stock"
            }
        ));
        jScrollPane1.setViewportView(CatalogueTable);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(252, 118, 106));
        jLabel13.setText("ProductPrice:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(252, 118, 106));
        jLabel14.setText("ProductCategory:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(252, 118, 106));
        jLabel15.setText("Stock:");

        ECProductPrice.setEditable(false);
        ECProductPrice.setBackground(new java.awt.Color(204, 204, 204));
        ECProductPrice.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        ECProductPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECProductPriceActionPerformed(evt);
            }
        });

        ECProductCategory.setEditable(false);
        ECProductCategory.setBackground(new java.awt.Color(204, 204, 204));
        ECProductCategory.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        ECProductCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECProductCategoryActionPerformed(evt);
            }
        });

        ECProductStock.setEditable(false);
        ECProductStock.setBackground(new java.awt.Color(204, 204, 204));
        ECProductStock.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        ECProductStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECProductStockActionPerformed(evt);
            }
        });

        CatAddButton.setText("Add");
        CatAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatAddButtonActionPerformed(evt);
            }
        });

        CatRemoveButton.setText("Remove");
        CatRemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatRemoveButtonActionPerformed(evt);
            }
        });

        CatGenerate.setText("Generate");
        CatGenerate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatGenerateMouseClicked(evt);
            }
        });
        CatGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatGenerateActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicturesIcons/icons8_back_32px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ECProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(ECProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ECProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(ECProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CatRemoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CatAddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(ECAddProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(CatGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ECAddProductComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ECProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ECProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatRemoveButton))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ECProductStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ECProductCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CatAddButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ECProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECProductNameActionPerformed
 
    }//GEN-LAST:event_ECProductNameActionPerformed

    private void ECAddProductComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ECAddProductComboBoxMouseClicked

    }//GEN-LAST:event_ECAddProductComboBoxMouseClicked

    private void ECAddProductComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ECAddProductComboBoxItemStateChanged
        checkID();
    }//GEN-LAST:event_ECAddProductComboBoxItemStateChanged

    private void ECAddProductComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECAddProductComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ECAddProductComboBoxActionPerformed

    private void ECProductPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECProductPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ECProductPriceActionPerformed

    private void ECProductCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECProductCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ECProductCategoryActionPerformed

    private void ECProductStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECProductStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ECProductStockActionPerformed

    private void CatRemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatRemoveButtonActionPerformed
        String filePath = "Catalogue.txt";
        String removeTerm = ECAddProductComboBox.getSelectedItem().toString();
        
        removeCat(filePath, removeTerm);
    }//GEN-LAST:event_CatRemoveButtonActionPerformed

    private void CatAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatAddButtonActionPerformed
    try{
        FileWriter fw = new FileWriter("Catalogue.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
            
        String ID = ECAddProductComboBox.getSelectedItem().toString();
        String Name = ECProductName.getText();
        String Price = ECProductPrice.getText();
        String Category = ECProductCategory.getText();
        String Stock = ECProductStock.getText();
            
        bw.write(ID + "," + Name + "," + Price + "," + Category + "," + Stock);
        bw.newLine();
        bw.close();
        fw.close();
        clearCatalogueTable();
        displayCatalogueTable();
    }
    catch(FileNotFoundException e)
    {
    }
    catch (IOException ex)
    {
    }
    }//GEN-LAST:event_CatAddButtonActionPerformed

    private void CatGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatGenerateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatGenerateActionPerformed

    private void CatGenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatGenerateMouseClicked
        MessageFormat header = new MessageFormat("Catalogue");
        MessageFormat footer = new MessageFormat("");
        try{
            CatalogueTable.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print", e.getMessage());
        }
    }//GEN-LAST:event_CatGenerateMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ProductManager PM = new ProductManager();
        String id = PM.getUserID();
        PMDashboard PMD = new PMDashboard(id);
        PMD.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    

    private void CatalogueID(){
    DefaultComboBoxModel AddProductModel = new DefaultComboBoxModel();
    String ProductItemPath = ("ProductData.txt");
    File ProductItemFile = new File(ProductItemPath);
    try (Scanner in = new Scanner(ProductItemFile)){
        in.useDelimiter("[,\n]");
        while (in.hasNextLine()) {
            String ID;
            ID = in.next();
            in.next();
            in.next();
            in.next();
            in.next();
            in.next();
            in.next();
            in.nextLine();
            AddProductModel.addElement(ID);
            ECAddProductComboBox.setModel(AddProductModel);
        }
    in.close();
    } catch (FileNotFoundException ex){
        JOptionPane.showMessageDialog(null,"File Path not Found.");
    }
}
    
    private void checkID(){
        String checkfile = "ProductData.txt";
        File file = new File (checkfile);
        String currentitem = ECAddProductComboBox.getSelectedItem().toString();
        try (Scanner sc = new Scanner(file))
        {
            sc.useDelimiter(",");
            while (sc.hasNextLine()){
                String ID = "";
                String Name = "";
                String Price = "";
                String Category = "";
                String Stock = "";
                ID = sc.next();
                Name = sc.next();
                Price = sc.next();
                sc.next();
                Category = sc.next();
                sc.next();
                Stock = sc.next();
                sc.nextLine();
                if (ID.equals(currentitem))
                {
                    ECProductName.setText(Name);
                    ECProductPrice.setText(Price);
                    ECProductStock.setText(Stock);
                    ECProductCategory.setText(Category);
                }
            }
            sc.close();
        }
        catch (Exception e)
        {
            
        }
    }
    
    void displayCatalogueTable(){
        DefaultTableModel model = (DefaultTableModel)CatalogueTable.getModel();
        String line;
        BufferedReader r;
        try{
            File f = new File("Catalogue.txt");
            r = new BufferedReader(new FileReader(f));
            while((line = r.readLine()) != null)
            {
                model.addRow(line.split(","));
            }
            r.close();
        }catch(Exception e){
            System.out.println(e);
    }
      
    }
    
    void clearCatalogueTable(){
    DefaultTableModel CatTableModel = (DefaultTableModel)CatalogueTable.getModel();
    CatTableModel.setRowCount(0);
    }
    
    private void removeCat(String filePath, String removeTerm){
    String tempFile = "TempCatalogue.txt";
    File oldFile = new File(filePath);
    File newFile = new File(tempFile);
    String ID = ""; String Name = ""; String Price = ""; String Cat = ""; String Stock  = "";
    try
    {
        FileWriter fw = new FileWriter(tempFile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        Scanner sc = new Scanner(oldFile);
            
        sc.useDelimiter(",");
            
        while(sc.hasNext())
        {
            ID = sc.next();
            Name = sc.next();
            Price = sc.next();
            Cat = sc.next();
            Stock = sc.nextLine();
            if (!ID.equals(removeTerm))
            {
                pw.println(ID + "," + Name + "," + Price + "," + Cat + Stock);
            }
        }
        pw.flush();
        pw.close();
        bw.close();
        fw.close();
        sc.close();
        oldFile.delete();
        newFile.renameTo(new File("Catalogue.txt"));
        JOptionPane.showMessageDialog(null,"Product Removed");
        clearCatalogueTable();
        displayCatalogueTable();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CatAddButton;
    private javax.swing.JButton CatGenerate;
    private javax.swing.JButton CatRemoveButton;
    private javax.swing.JTable CatalogueTable;
    private javax.swing.JComboBox<String> ECAddProductComboBox;
    private javax.swing.JTextField ECProductCategory;
    private javax.swing.JTextField ECProductName;
    private javax.swing.JTextField ECProductPrice;
    private javax.swing.JTextField ECProductStock;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
