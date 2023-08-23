package q6.java;
class Regularpolygon{
private int n=3;private double side=1.0,x=0.0,y=0.0;
Regularpolygon(){}
Regularpolygon(int n,double side){this.n=n;this.side=side;}
Regularpolygon(int n,double side,double x,double y){this.n=n;this.side=side;this.x=x;this.y=y;}
public int getn(){return n;}
public double getside(){return side;}
public double getx(){return x;}
public double gety(){return y;}
public void setn(int n){this.n=n;}
public void setside(double side){this.side=side;}
public void setx(double x){this.x=x;}
public void sety(double y){this.y=y;}
double getArea(){return n*side*side/4*Math.tan(Math.PI/n+0.0);}
double getPerimeter(){return n*side;}
}

public class Q6Java {
    public static void main(String[] args) {
        Regularpolygon r1 = new Regularpolygon();
        Regularpolygon r2 = new Regularpolygon(6,4);
        Regularpolygon r3 = new Regularpolygon(10,4,5.6,7.8);
        System.out.println("Perimeter of r1 = " + r1.getPerimeter());
        System.out.println("Area of r1 = " + r1.getArea());
        System.out.println("Perimeter of r2 = " + r2.getPerimeter());
        System.out.println("Area of r2 = " + r2.getArea());
        System.out.println("Perimeter of r3 = " + r3.getPerimeter());
        System.out.println("Area of r3 = " + r3.getArea());
    }   
}
