
import java.util.*;

public class Lab3_10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int M=input.nextInt();
        int b[]=new int[M];
        int[][]a=new int[N][2];
        int i,j,count=0;
        for(i=0;i<N;i++){
            a[i][0]=input.nextInt();
            a[i][1]=input.nextInt();
        }
        for(i=0;i<M;i++){
            b[i]=input.nextInt();
        }
        for(i=0;i<N;i++){
            for(j=0;j<M;j++){
                if((b[j]>a[i][0])&&(b[j]<a[i][1])){
                   count++; 
                }
            }
        }
        System.out.println(count);
    }
    
}
