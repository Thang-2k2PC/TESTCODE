/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapfunction;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BaitapFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// Bai1: Nhap day so a co n ptu chi gom cac so nguyen duong . Kiem tra mang a co phai mang doi xung khong.
        Scanner sc = new Scanner(System.in);
//        int n, kt = 1;
//        do{
//            System.out.print("Nhap so phan tu mang a :");
//             n = sc.nextInt();
//        }while(n <= 0);
//        int a[] = new int[n];
//        for(int i = 0; i < n; i++){
//            System.out.print("a[i] = ");
//            a[i] = sc.nextInt();
//            if(a[i] < 0){
//                System.out.print("Nhap lai a[i] = ");
//                a[i] = sc.nextInt();
//            }
//        }
//        for(int i = 0; i < n; i++){
//            if(a[i] != a[n - i -1]){
//                kt = 0;
//                break;
//            }
//        }
//        if(kt == 1){
//            System.out.println("Mang a la mang doi xung");
//        }else{
//            System.out.println("Mnag a ko la mang doi xung");
//        }
//Bai2: Nhap day so a gồm n ptư là các số nguyên.Đếm số lần xuất hiện của từng phần tử trong mảng
//            In ra ptu có số lần xuất hiện nhiều nhất
            int n;
            do{
                System.out.print("Nhap so phan tu mang n: ");
                 n = sc.nextInt();       
            }while(n <= 0);
            int a[] = new int[n];
            for(int i = 0; i < n ; i++){
                System.out.printf("a[%d] = " , i);
                a[i] = sc.nextInt();
            }
            for(int i =0; i < n;i++){
                int b[] = new int[n];
                b[i] = 1;
            }
            
            
    }
    
}
