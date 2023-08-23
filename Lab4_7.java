package week4;

import java.util.Scanner;

public class minTwoSet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n(3<=n<1000) :");
        int n = input.nextInt();
        int[] A = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            A[i] = input.nextInt();
            sum += A[i];
        }
        boolean[][] dp =new boolean[n+1][sum/2+1];
        for(int i=0;i<=n;i++)
            dp[i][0]=true;
        for(int i=1;i<=sum/2;i++)
            dp[0][i]=false;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum/2;j++){
                dp[i][j]=dp[i-1][j];
                if(j >= A[i-1])
                    dp[i][j] |= dp[i-1][j-A[i-1]];
            }
        }
        int diff=0;
        for(int i=sum/2;i>=0;i--){
            if(dp[n][i]){
                diff=sum-2*i;
                break;
            }
        }
        System.out.print(diff);
       }
}
