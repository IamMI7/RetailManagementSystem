package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import java.io.IOException;
/**
 *
 * @author user
 */
public class Product {
    private String ProductName;
    private String ProductID;
    private double ProductPrice;
    private String ProductDesc;
    private int ProductStock;
    private String Supplier;
    private String ProductCategory;
    private String ProductCategoryID;
    private String ProductCategoryName;
    File f = new File("ProductData.txt"); 
    File fcat = new File("ProductCategoryData.txt");

    
public String getProductID(){
    return ProductID;
}

public void setProductID(String PID){
    this.ProductID = PID;
}
public String getSupplier(){
    return Supplier;
}
public void setSupplier(String PSupplier){
    this.Supplier = PSupplier;
}
public String getProductName(){
    return ProductName;
}
public void setProductName(String PName){
    this.ProductName = PName;
}
public String getProductDesc(){
    return ProductDesc;
}
public void setProductDesc(String PDesc){
    this.ProductDesc = PDesc;
}
public double getProductPrice(){
    return ProductPrice;
}
public void setProductPrice(double PPrice){
    this.ProductPrice = PPrice;
}
public String getProductCategory(){
    return ProductCategory;
}
public void setProductCategory(String PCat){
    this.ProductCategory = PCat;
}
public int  getProductStock(){
    return ProductStock;
}
public void setProductStock(int PS){
    this.ProductStock = PS;
}

    
public void addNewProduct(){
    
    try{
        
        FileOutputStream ff = new FileOutputStream(f, true);
        PrintWriter pw = new PrintWriter(ff);
        
        String AddProduct = "";
        AddProduct += this.getProductID() + ",";
        AddProduct += this.getProductName() + ",";
        AddProduct += this.getProductPrice() + ",";
        AddProduct += this.getProductCategory() + ",";
        AddProduct += this.getProductDesc() + ",";
        AddProduct += this.getProductStock() + ",";
        AddProduct += this.getSupplier();
        
        
        pw.println(AddProduct);
        pw.flush();
        pw.close();
        ff.close();
        System.out.println("Successfully Added new Product");
    }
    catch (FileNotFoundException ex){
        System.out.println("Please Fill in all TextBoxes");
    }
    catch (IOException ex){
        System.out.println(ex.toString());
    }
}
public String getCategoryID(){
    return ProductCategoryID;
}
public void setCategoryID(String PCID){
    this.ProductCategoryID = PCID;
}
public String getCategoryName(){
    return ProductCategoryName;
}
public void setCategoryName(String PCN){
    this.ProductCategoryName = PCN;
}
public void addNewCategory(){
    
    try(PrintWriter out = new PrintWriter(new FileOutputStream(fcat, true))){
        
        String AddCategory = "";
        AddCategory += this.getCategoryID() + ",";
        AddCategory += this.getCategoryName();
        
        out.println(AddCategory);
        out.close();
        JOptionPane.showMessageDialog(null,"Category successfully added");
    }
    catch (FileNotFoundException ex){
        JOptionPane.showMessageDialog(null,"Category cannot be added");
    }

}

}
    
        

