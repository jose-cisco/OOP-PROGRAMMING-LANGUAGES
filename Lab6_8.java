/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_8;

/**
 *
 * @author Windows
 */

class rectangle{
    double x,y,width,height;
    rectangle(){
    }
    rectangle(double x,double y,double width,double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    
    public double getarea(rectangle r){
        return r.width*r.height;
    }
    
}

class line{
    double x1,x2,y1,y2;
    line(){
        
    }
    line(double x1,double y1,double x2,double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    double getlong(line a) { 
        return Math.sqrt(Math.pow(a.x2 - a.x1, 2) + Math.pow(a.y2 - a.y1, 2) * 1.0); 
    } 
}

public class Lab6_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static boolean contains(line a,rectangle b){
        double Xup=b.x-b.width/2;
        double Yup=b.y+b.height/2;
        double Xdn=b.x+b.width/2;
        double Ydn=b.y-b.height/2;
        return ((Xup<a.x1||Xup<a.x2)&&(Xdn>a.x1||Xdn>a.x2)&&(Yup>a.y1||Yup>a.y2)&&(Ydn<a.y1||Ydn<a.y2));
    }
    public static boolean overlaps(rectangle a,rectangle b){
        double thisXup=a.x-a.width/2;
        double thisYup=a.y+a.height/2;
        double thisXdn=a.x+a.width/2;
        double thisYdn=a.y-a.height/2;
        double Xup=b.x-b.width/2;
        double Yup=b.y+b.height/2;
        double Xdn=b.x+b.width/2;
        double Ydn=b.y-b.height/2;
        boolean check=false;
        if(thisXup>Xup&&thisYup>Yup&&thisXdn>Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup<Xup&&thisYup<Yup&&thisXdn>Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup<Xup&&thisYup>Yup&&thisXdn<Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup<Xup&&thisYup>Yup&&thisXdn>Xdn&&thisYdn>Ydn) check=true;
        else if(thisXup>Xup&&thisYup<Yup&&thisXdn>Xdn&&thisYdn<Ydn) check=true;
        else if(thisXup>Xup&&thisYup<Yup&&thisXdn<Xdn&&thisYdn<Ydn) check=true;
        return check;
    }
    public static boolean cross(line a,line b){
        return Math.abs(a.x1-a.x2)==Math.abs(b.x1-b.x2)&&Math.abs(a.y1-a.y2)==Math.abs(b.y1-b.y2);
    }
    public static double distance(line a,rectangle b){
        return Math.sqrt(Math.pow(a.x2-a.x1 - b.x+b.width/2, 2) + Math.pow(a.y2-a.y1 - b.y-b.height/2, 2) * 1.0); 
    }
}
