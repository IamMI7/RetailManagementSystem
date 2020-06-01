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
public class RegistrationClass {
    private String UserStatus, UserType, UserID, Username, EmailAddress, Password, Re_enterPassword, Gender;
    private int ContactNo, ICNO;
    
    public RegistrationClass(){
    }
    
    public RegistrationClass (String UserStatus, String UserType, String UserID, String Username, String EmailAddress, String Password, String Re_enterPassword, int ContactNo, int ICNO, String Gender){
        this.UserStatus = UserStatus;
        this.UserType = UserType;
        this.UserID = UserID;
        this.Username = Username;
        this.EmailAddress = EmailAddress;
        this.Password = Password;
        this.Re_enterPassword = Re_enterPassword;
        this.ContactNo = 0;
        this.ICNO = 0;
        this.Gender = Gender;
    }
    
    public String getUserStatus(){
        return UserStatus;
    }
    
    public void setUserStatus(String UserStatus){
        this.UserStatus = UserStatus;
    }
    
    public String getUserType(){
        return UserType;
    }
    
    public void setUserType(String UserType){
        this.UserType = UserType;
    }
    
    public String getUserID(){
        return UserID;
    }
    
    public void setUserID(String UserID){
        this.UserID = UserID;
    }
    
    public String getUsername(){
        return Username;
    }
    
    public void setUsername(String Username){
        this.Username = Username;
    }
    
    public String getEmailAddress(){
        return EmailAddress;
    }
    
    public void setEmailAddress(String EmailAddress){
        this.EmailAddress = EmailAddress;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public String getRe_enterPassword(){
        return Re_enterPassword;
    }
    
    public void setRe_enterPassword(String Re_enterPassword){
        this.Re_enterPassword = Re_enterPassword;
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
    
    public String getGender(){
        return Gender;
    }
    
    public void setGender(String Gender){
        this.Gender = Gender;
    }
}
