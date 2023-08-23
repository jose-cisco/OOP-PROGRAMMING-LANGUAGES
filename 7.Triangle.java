package mytriangle;

import java.util.Scanner;

class MyTriangle {
    private double area;
    public boolean isValid(double side1, double side2, double side3){
        return side1+side2>side3;
    }
    public double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3)/2;
        return Math.sqrt(area = s*(s - side1)*(s - side2)*(s - side3));
    }
}
public class Triangle{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        MyTriangle obj = new MyTriangle();
        boolean valid=obj.isValid(a, b, c);
        double area=obj.area(a, b, c);
        if(valid){
            System.out.println("1");
            System.out.println(area);
        }
        else{
            System.out.println("0");
        }
    }
}
