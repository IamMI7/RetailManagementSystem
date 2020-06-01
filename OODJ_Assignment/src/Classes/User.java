package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class User {
    private String UserID, UserRole, Username, Password, EmailAddress, Status;
    private int ContactNo, ICNO;
    
    public User(){
    
    }
    
    public User(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }
    
    public User(String UserID, String UserRole, String Username, String Status, String Password, String EmailAddress, int ContactNo, int ICNO){
        this.UserRole = UserRole;
        this.UserID = UserID;
        this.Username = Username;
        this.Password = Password;
        this.EmailAddress = EmailAddress;
        this.ContactNo = ContactNo;
        this.ICNO = ICNO;
        this.Status = Status;
    }
    
    public String getUserID(){
        return UserID;
    }
    
    public void setUserID(String UserID){
        this.UserID = UserID;
    }
    
    public String getUserRole(){
        return UserRole;
    }
    public void setUserRole(String UserRole){
        this.UserRole = UserRole;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public void setUsername(String Username){
        this.Username = Username;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public String getEmailAddress(){
        return EmailAddress;
    }
    
    public void setEmailAddress(String EmailAddress){
        this.EmailAddress = EmailAddress;
    }
    
    public int getContactNo(){
        return ContactNo;
    }
    
    public void setContactNo(int ContactNo){
        this.ContactNo = ContactNo;
    }
    
    public int getICNO(){
        return ICNO;
    }
    
    public void setICNO(int ICNO){
        this.ICNO = ICNO;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public void setStatus(String Status){
        this.Status = Status;
    }
}

