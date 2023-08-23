import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First\n");
        int N = input.nextInt();
        int L = input.nextInt();
        int[][] A = new int[N][L];
        for(int i=0;i<N;i++){
            for(int j=0;j<L;j++){
                A[i][j] = input.nextInt();
            }
        }
        System.out.print("Second\n");
        L = input.nextInt();
        int M = input.nextInt();
        int[][] B = new int[L][M];
        int[][] C = new int[N][M];
        for(int i=0;i<L;i++){
            for(int j=0;j<M;j++){
                B[i][j] = input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                C[i][j] = 0;
                for(int k=0;k<L;k++){
                    C[i][j] += (A[i][k]*B[k][j]);
                }
            }
        }
        System.out.print("Product of two matrices is:\n");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
