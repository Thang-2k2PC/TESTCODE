/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien1;


import java.util.Scanner;
//Tạo một lớp Person lưu trữ các thông tin sau đây ( Tên, giới tính, địa chỉ,ngay sinh)
//Tạo một lớp Student kế thừa từ lớp person lưu trữ các thông tin như dưới đây:
//Mã sinh viên,điểm trung bình, email
//Viết một phương thức nhập thông tin của student
//Viết một phương thức hiện thị thông tin của student
//Viết phương trình xem xét có sinh viên nào được học bổng không? điểm trung bình hơn 8.0 sẽ được hổng bổng

/**
 *
 * @author DELL
 */
class Person{
   protected String name;
   protected String sex;
   protected String address ;
   protected String dob;
  public void inputPerson(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap ten:");
       this.name = sc.nextLine();
       System.out.println("Nhap sex: ");
       this.sex = sc.nextLine();
       System.out.println("Nhap address: ");
       this.address = sc.nextLine();
       System.out.println("Nhap dob: ");
       this.dob = sc.nextLine();
//         
   }

    public Person() {
    }
   public void showPerson(){
       System.out.print("Ho ten: " + this.name + " ;" + "sex: " + this.sex 
            + " ;"  + "address: " + this.address + " ;" + "dob: " + this.dob);
   }
}
//Tạo một lớp Student kế thừa từ lớp person lưu trữ các thông tin như dưới đây:
//Mã sinh viên,điểm trung bình, email
//Viết một phương thức nhập thông tin của student
//Viết một phương thức hiện thị thông tin của student
//Viết phương trình xem xét có sinh viên nào được học bổng không? điểm trung bình hơn 8.0 sẽ được hổng bổng

class Student extends Person{
    protected String masv;
    protected String email;
    protected float dtb;
    public void inputStudent(){
        Scanner vc = new Scanner(System.in);
        System.out.println("\nNhao masv: ");
        this.masv = vc.nextLine();
        System.out.println("Nhap email: ");
        this.email = vc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        this.dtb = vc.nextFloat();
    }
    public void showStudent(){
        System.out.println("Ma sinh vien: " + this.masv + " ;" + " email: " + this.email 
        + " ;" +"Diem rung binh: " + this.dtb);
    }
    
    public void hocbong(){
        if(dtb > 8){
            System.out.println("Sinh vien thuoc dien co hoc bong");
        }else{
            System.out.println("Khong duoc hoc bong");
        }
    }
}
public class sinhvien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student sc = new Student();
        sc.inputPerson();
        sc.showPerson();
        sc.inputStudent();
        sc.showStudent();
        sc.hocbong();
    }
    
}
