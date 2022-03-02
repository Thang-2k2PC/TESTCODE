package sinhvien1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DELL
 */
class Point {
    private int x;
    private int y;
    
    public Point(int x, int y ){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public int getX() {
        return x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getY() {
        return y;
    }
}
class PolyLine{
    private List<Point> points;

/*Phuong thuc khoi tao khong tham so , khoi tao 
     mang ArrayList rong cho thuoc tinh points
*/     
    public PolyLine() {
        this.points = new ArrayList<Point>();
    }
    
    /* Phuong thuc khoi tao co tham so
     khoi tao gia tri cho thuoc tinh points
    */
    public PolyLine(List<Point> points) {
        this.points = points;
    }
    
    /*
      Phuong thuc them 1 diem vao cuoi thuoc tinh points
    */
    public void appendPoint(Point point) {
         points.add(point);
    }
    
    /*
      Phuong thuc them 1 diem vao cuoi thuoc tinh points
    */
    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }
    
    /*
     Phuong thuc lay ra do dai PolyLine
    */
    public double getLength(){
        double length = 0;
        for(int i = 0; i < points.size() - 1; i++){
            int x1 = points.get(i).getX();
            int y1 = points.get(i).getY();
            int x2 = points.get( i + 1).getX();
            int y2 = points.get(i + 1).getY();
            double ad = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            length += ad;
        }
        System.out.println("Length = " + length);
        return length;
        
   }
    
}
public class CodeLearn51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PolyLine sc = new  PolyLine();
        sc.appendPoint(new Point(1, 1));
        sc.appendPoint(new Point(2, 3));
        sc.appendPoint(3, 0);
        sc.appendPoint(4, 2);;
//        System.out.println(sc.getLength());
        sc.getLength();
    }
    
}
