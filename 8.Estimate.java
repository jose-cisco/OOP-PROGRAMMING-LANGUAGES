package estimate;
import java.util.Scanner;
public class Estimate {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
         double sum=0;
        for(int i=1; i<=n; i++){
             sum += 4*((Math.pow(-1, i+1))/((2*i)-1));
        }
        //sum = sum*4;
        System.out.println(sum);


    }
}
