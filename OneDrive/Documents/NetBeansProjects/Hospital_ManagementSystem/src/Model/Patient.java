/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sarth
 */
public class Patient {
    private String Name;
    private String Age;
    private String Gender;
    private String Mobile_Number;
    private String Email_ID;
    


    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_Number(String Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }

    public String getEmail_ID() {
        return Email_ID;
    }

    public void setEmail_ID(String Email_ID) {
        this.Email_ID = Email_ID;
    }
    @Override
    public String toString(){
        return Name;
    }
}
