/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien1;

/**
 *
 * @author DELL
 */
//class Point {
//
//    private int x;
//    private int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }

    public void setY(int y) {
        this.y = y;
    }
}

class Line {

    private Point begin;
    private Point end;

    public  Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength() {
        return Math.sqrt(Math.pow(end.getX() - begin.getX(), 2) + Math.pow(end.getY() - begin.getY(), 2));
    }
}

public class CodeLearn {

    public static void main(String[] args) {
//        Line line1 = new Line(1, 1, 2, 2);
//        System.out.println(line1.getLength());
        Point begin = new Point(1, 1);
        Point end = new Point(2, 2);
        Line line1 = new Line(begin, end);
        System.out.println(line1.getLength());

        Line line2 = new Line(2, 3, 5, 4);
        System.out.println(line2.getLength());
    }
}
