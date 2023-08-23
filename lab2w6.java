package lab2;
import java.util.Scanner;
public class lab2w6 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = num.nextInt();
        System.out.println("Enter num2 ");
        int num2 = num.nextInt();
        int i,j;
        for(i = 1;i<=num2;i++)
        {
            for(j = 1;j<=num1;j++)
            {
                if((i*j) == 1)
                {
                    System.out.printf("   ");
                }
                else
                {
                    System.out.printf("%-2d ",j*i); 
                }
            }
            System.out.println("\n");
        }
    }
}
