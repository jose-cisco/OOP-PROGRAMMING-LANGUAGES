package lab2;
import java.util.Scanner;
public class lab2w8 {
    public static void main(String[] args) {
        double[] a = new double[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Please input n, a0 and a1: ");
        double n = in.nextDouble();
        double b0 = in.nextDouble();
        double b1 = in.nextDouble();
        a[0] = b0;
        a[1] = b1;
        int i;
        for(i=2;i<=n;i++)
        {
            a[i] = (Math.pow(i, 2)*a[i-1])-a[i-2]+Math.pow(3, i);
        }
        for(i=0;i<=n;i++)
        {
            System.out.printf("%.0f ", a[i]);
        }
    }
}