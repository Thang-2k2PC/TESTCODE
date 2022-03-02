package sinhvien1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

class Hinh {
    protected double length;
    protected double  width;
    public Hinh(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public double display() {
        return length * width;
//        return 0;
    }
}

class HCN extends Hinh {
     
     public HCN(double  length, double width) {
        super(length, width);
    }
   
    @Override
    public double display() {
        super.display();
        return  length * width;
    } 
}

class TG extends Hinh{
    public TG(double length, double width) {
        super(length, width);
    }
    @Override 
    public double display() {
        return (length * width)/2;
    }
}
public class CodeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        HCN vn  = new HCN(0, 0);
        System.out.print("Nhap length = ");
        vn.setLength(sc.nextDouble());
        System.out.print("Nhap width = ");
        vn.setWidth(sc.nextDouble());
        System.out.println("dien tic hcn = " + vn.display());
        
        TG bv = new TG(0, 0);
        System.out.print("Nhaap chieu cao ");
        bv.setLength(sc.nextDouble());
        System.out.print("Nhap width ");
        bv.setWidth(sc.nextDouble());
        System.out.println("Dien tich tam giac = " + bv.display());
    }
    
}
