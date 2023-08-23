package lab4;
import java.util.*;
public class Lab4_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int[][] tt = new int[M][M];
        int[] t = new int [M*M];
        int i,j,k=0;
        for(i=0;i<M;i++){
            for(j=0;j<M;j++){
                t[k] = tt[i][j] = in.nextInt();
                k++;
            }
        }
        for(j=0;j<M*M;j++){
            System.out.print(t[j] + " ");
        }
        
        System.out.println();
        
        int n = t.length; 
        t[0] = 0;
        for (i = 0; i < n-1; i++){
            for (j = 0; j < n-i-1; j++){
                if(t[j] < t[j+1])
                {
                    int temp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = temp;
                } 
            }
        }
        
        for(i=0; i<M*2; i++){
            System.out.print(t[i] + " ");
        }
        
        System.out.println();
        
        for (i = 0; i < n-1; i++){
            for (j = 1; j < n-i-1; j++){
                if(t[j] == t[j-1])
                {
                    t[j] = 0;
                }
                if(t[j] < t[j+1])
                {
                    int temp = t[j]; 
                    t[j] = t[j+1]; 
                    t[j+1] = temp;
                }
            }
        }
        
        for(i=0; i<M*2; i++){
            System.out.print(t[i] + " ");
        }
        
        System.out.println();
        
        int sum = 0;
        for(i = 0;i<(M*2)-2;i++)
            sum += t[i];
        System.out.print(sum);
    } 
}
