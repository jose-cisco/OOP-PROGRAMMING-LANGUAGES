package lab5;
import java.util.Scanner;
public class Lab5_4{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int K = in.nextInt();
        int[][] pp = new int[M][N];
        int i,j,l,m;
        if(M>=2&&M<=1000&&N>=2&&N<=1000){
            if(K>0&&K<M&&K<N){
                for(i=0;i<M;i++){
                    for(j=0;j<N;j++){
                        pp[i][j] = in.nextInt();
                }}
        }}
        int s = 0;
        int max = 0;
        int xx = K*K;
            for(i=0;i<M-1;i++){
                for(j=0;j<N-1;j++){
                    for(m=0;m<K*K;m++){
                        if(m==0){
                            s+=pp[i][j];
                        }
                        else if (m==1){
                            s+=pp[i][j+1];
                        }
                        else if (m==2){
                            s+=pp[i+1][j+1];
                        }
                        else if (m==3){
                            s+=pp[i+1][j];
                        }
                    }
                    if(max<s){
                        max = s;
                    }
                    s = 0;
                }
            }
        System.out.println(max);
    }
}
