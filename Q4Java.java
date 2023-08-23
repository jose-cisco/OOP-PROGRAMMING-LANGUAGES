
package q4.java;
import java.util.Scanner;

public class Q4Java {
    public static void main(String[] args) {
        System.out.println("Enter balance and interest rate(e.g., 3 for 3%):");
        Scanner in=new Scanner(System.in);
        double b=in.nextDouble();double a=in.nextDouble();
        double i=b*(a/1200);
        System.out.printf("The Interest is %.4f\n",i);
    }
    
}
