package lab2;
import java.util.Scanner;
public class lab2w7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input x, n: ");
        double x = in.nextDouble();
        double n = in.nextDouble();
        double i;
        double output=0;
        for(i=0;i<=n;i++)
        {
            output += Math.pow(x,i);
        }
        System.out.printf("%.0f",output);
    }
}
