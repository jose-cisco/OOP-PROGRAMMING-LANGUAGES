import java.util.Scanner;

public class Lab3_9 {

    public static boolean leftoftheline(double x0,double y0,double x1,double y1,double x2,double y2){
        return (((x2<x0)&&(y2<y0))&&((x2<x1)&&(y2<y1)));     
    }
    public static boolean rightoftheline(double x0,double y0,double x1,double y1,double x2,double y2){
        return (((x2>x0)&&(y2>y0))&&((x2>x1)&&(y2>y1)));     
    }
    public static boolean onthesameline(double x0,double y0,double x1,double y1,double x2,double y2){
        return (((x2>=x0)&&(y2>=y0))&&((x2<=x1)&&(y2<=y1)))||(((x2<=x0)&&(y2<=y0))&&((x2>=x1)&&(y2>=y1)));     
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x0=input.nextDouble();
        double y0=input.nextDouble();
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        double x2=input.nextDouble(); 
        double y2=input.nextDouble();
        if(leftoftheline(x0, y0, x1, y1, x2, y2)){
            System.out.println("2");
        }
        else if(rightoftheline(x0, y0, x1, y1, x2, y2)){
            System.out.println("1");
        }
        else if(onthesameline(x0, y0, x1, y1, x2, y2)){
            System.out.println("0");
        }
        
    }
    
}
