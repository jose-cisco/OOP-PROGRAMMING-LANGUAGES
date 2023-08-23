/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_7;
/**
 *
 * @author Windows
 */

class myrectangle2d{
    double x,y,width,height;
    myrectangle2d(){
        x=y=1;
        width=height=1;
    }
    myrectangle2d(double x,double y,double width,double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getarea(){
        return width*height;
    }
    
    public double getperimeter(){
        return width+width+height+height;
    }
    
    public boolean contains(double x,double y){
        return ((this.x-width/2<x&&this.x+width/2>x)&&(this.y-height/2<y&&this.y+height/2>x));
    }
    
    public boolean contains(myrectangle2d r){
        double thisXup=this.x-width/2;
        double thisYup=this.y+height/2;
        double thisXdn=this.x+width/2;
        double thisYdn=this.y-height/2;
        double Xup=r.getX()-r.getWidth()/2;
        double Yup=r.getY()+r.getHeight()/2;
        double Xdn=r.getX()+r.getWidth()/2;
        double Ydn=r.getY()-r.getHeight()/2;
        return thisXup<Xup&&thisYup>Yup&&thisXdn>Xdn&&thisYdn<Ydn;
    }
    public boolean overlaps(myrectangle2d r){
        double thisXup=this.x-width/2;
        double thisYup=this.y+height/2;
        double thisXdn=this.x+width/2;
        double thisYdn=this.y-height/2;
        double Xup=r.getX()-r.getWidth()/2;
        double Yup=r.getY()+r.getHeight()/2;
        double Xdn=r.getX()+r.getWidth()/2;
        double Ydn=r.getY()-r.getHeight()/2;
        boolean check=false;
        if(thisXup>Xup&&thisYup>Yup&&thisXdn>Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup<Xup&&thisYup<Yup&&thisXdn>Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup<Xup&&thisYup>Yup&&thisXdn<Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup<Xup&&thisYup>Yup&&thisXdn>Xdn&&thisYdn>Ydn) check=true;
        else if(thisXup>Xup&&thisYup<Yup&&thisXdn>Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup>Xup&&thisYup<Yup&&thisXdn<Xdn&&thisYdn<Ydn) check=true;
        return check;
    }
}

public class Lab6_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
