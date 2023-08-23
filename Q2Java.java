
package q2.java;
import java.util.Scanner;
public class Q2Java {
    public static double recursive(double a,int i){
    double inrate=(5/100.0)/12.0;
    if (i==6){return a;}else{return (a+recursive(a,i+1))*(1+inrate);}
    }
    public static void main(String[] args) {
        System.out.println("Enter the monthly saving amount:");
        Scanner in=new Scanner(System.in);
        double a=in.nextDouble();
        recursive(a,1);
        System.out.printf("After six month,the account value is $%.2f\n",recursive(a,1));
    }
    
}
