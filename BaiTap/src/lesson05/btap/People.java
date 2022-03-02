package lesson05.btap;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class People {
    String fullName;
    String gender ;
    String birthday;
    String address;
    public People(){
    }
    public People(String fullName, String gender,String birthday, String address){
        this.fullName = fullName;
        this.gender = gender;
        this. birthday = birthday;
        this.address = address;
    }
    public String getFullName(){
        return fullName;
    } 
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getBirthday(){
        return birthday;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public void input(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap fullName: ");
        fullName = scn.nextLine();
        
        System.out.println("Nhap Gender: ");
        gender = scn.nextLine();
        
        System.out.println("Nhap birthday: ");
        birthday = scn.nextLine();
        
        System.out.println("Nhap address: ");
        address = scn.nextLine();
        
    }

    
    public void display(){
        System.out.println("");
    }
    
    
}
