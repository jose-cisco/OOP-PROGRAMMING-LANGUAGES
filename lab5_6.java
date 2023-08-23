package lab5;
import java.util.Scanner;
public class lab5_6 {
    public static boolean isConsecutiveFour(int[][] value,int m,int n){
        int i,j;
        int count = 0;
        for(i=0;i<m;i++){
            for(j=0;j<n-3;j++){
                if(value[i][j+1]==value[i][j]){
                    if (value[i][j+2]==value[i][j]) {
                        if (value[i][j+3]==value[i][j]) {
                        }
                        count += 1;
                    }
                }
        }}
        for(i=0;i<m-3;i++){
            for(j=0;j<n;j++){
                if(value[i+1][j]==value[i][j]){
                    if (value[i+2][j]==value[i][j]) {
                        if (value[i+3][j]==value[i][j]) {
                        }
                        count += 1;
                    }
                }
        }}
        for(i=0;i<m-3;i++){
            for(j=0;j<n-3;j++){
                if(value[i+1][j+1]==value[i][j]){
                    if (value[i+2][j+2]==value[i][j]) {
                        if (value[i+3][j+3]==value[i][j]) {
                        }
                        count += 1;
                    }
                }
        }}
        for(i=0;i<m-3;i++){
            for(j=3;j<n;j++){
                if(value[i+1][j-1]==value[i][j]){
                    if (value[i+2][j-2]==value[i][j]) {
                        if (value[i+3][j-3]==value[i][j]) {
                        }
                        count += 1;
                    }
                }
        }}
        return count>0;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int[][] value = new int[M][N];
        int i,j;
        for(i=0;i<M;i++){
            for(j=0;j<N;j++){
                value[i][j] = in.nextInt();
            }
        }
        if(isConsecutiveFour(value,M,N)){
            System.out.println("1");
        }
    }
}