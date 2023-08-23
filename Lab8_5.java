/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_5;

/**
 *
 * @author Windows
 */

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    protected GeometricObject() {
    }
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}

class circle extends GeometricObject implements Comparable{
    double radius;
    circle(double r){
        radius=r;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    
    @Override
    public boolean equals(Object o){
        return this.radius==((circle) o).radius;
    }
    
    @Override
    public int compareTo(Object o) {
        if(this.radius==((circle) o).radius) return 1;
        return 0;
    }
    
}

class rectangle extends GeometricObject implements Comparable{
    double width,height;
    rectangle(double w,double h){
        width=w;
        height=h;
    }
    
    
    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter() {
        return width*height*width*height;
    }

    @Override
    public int compareTo(Object o) {
        if(this.getArea()==((rectangle) o).getArea()) return 1;
        return 0;
    }
    @Override
    public boolean equals(Object o){
        return this.getArea()==((rectangle) o).getArea();
    }
}

public class Lab8_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle c1=new circle(5);
        System.out.println(c1.compareTo(new circle(5)));
        System.out.println(c1.equals(new circle(5)));
        rectangle r1=new rectangle(5,10);
        System.out.println(r1.compareTo(new rectangle(5,10)));
        System.out.println(r1.equals(new rectangle(5,10)));
    }
    
}
