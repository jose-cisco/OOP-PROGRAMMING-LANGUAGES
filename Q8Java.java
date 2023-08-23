/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q8.java;
import java.util.Scanner;
class square{
    double x;
    double y;
    double hei;
    double wid;
    point l= new point();
    point r= new point();
    public square(double x, double y, double hei, double wid) {
        this.x = x;
        this.y = y;
        this.hei = hei;
        this.wid = wid;
        this.l.x1= x-wid;
        this.l.y1= y+hei;
        this.r.x1= x+wid;
        this.r.y1= y-hei;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getHei() {
        return hei;
    }
    public void setHei(double hei) {
        this.hei = hei;
    }
    public double getWid() {
        return wid;
    }
    public void setWid(double wid) {
        this.wid = wid;
    }    
    boolean Overlap(point l1,point r1,point l2, point r2){  //l=leftupper  r=rightbottom//
        if(l1.x1>r2.x1 || l2.x1 > r1.x1){ 
            return false;
        }
        else if(l1.y1<r2.y1 || l2.y1<r1.y1){
            return false;
        }
        else return true;
    }
    boolean inside(point l1,point r1,point l2,point r2){  //l=leftupper  r=rightbottom//
        if(l1.x1>l2.x1 && r1.x1<r2.x1 && l1.y1<l2.y1 && r1.y1>r2.y1 ){  // 1 inside 2//
            System.out.println(" r1 is inside r2");
            return true;
        }
        if(l2.x1>l1.x1 && r2.x1<r1.x1 && l2.y1<l1.y1 && r2.y1>r1.y1 ){ // 2 inside 1
             System.out.println(" r2 is inside r1");
             return true;
        }
        else return false;        
    }
}
class point{
    double x1;
    double y1;
    point(){}    
}
public class Q8Java {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Enter r1's center x-,y-coordinates, width, and height: ");
        double xc= myObj.nextDouble();
        double yc= myObj.nextDouble();
        double hc= myObj.nextDouble();
        double wc= myObj.nextDouble();
        square r1 = new square(xc,yc,hc,wc);
        System.out.println("Enter r2's center x-,y-coordinates, width, and height: ");
        xc= myObj.nextDouble();
        yc= myObj.nextDouble();
        hc= myObj.nextDouble();
        wc= myObj.nextDouble();
        square r2 = new square(xc,yc,hc,wc);
        r1.inside(r1.l, r1.r, r2.l,r2.r);
        if(r1.inside(r1.l, r1.r, r2.l,r2.r)==false){
            if(r1.Overlap(r1.l,r1.r, r2.l,r2.r)== true){
                System.out.println(" A rectangle overlaps another one");
            }
        }        
    }
}
