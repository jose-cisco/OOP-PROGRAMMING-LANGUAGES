import java.util.*;

class AscendSortFreq{
   
    public static void AscendSort(double[] a){
        double[] c = {};
        for (int i = 0; i < a.length-1; i++){
            for (int j = 0; j < a.length-i-1; j++){
                if (a[j] > a[j+1])
                {
                    double temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        
        System.out.println();
        
        for(int i=0; i<a.length; i++){
            System.out.printf("%.0f ", a[i]);
        }
        
        System.out.println();
    }
    
    public static void SortCommuFreq(double[] b){
        double[] check = new double[b.length];
        double checker;
        double count = 0;
        System.out.printf("%.0f ", b[0]);
        for(int k=0; k<b.length-1; k++){
            if(b[k] != b[k+1]){
                System.out.printf("%.0f ",b[k+1]);
            }
        }
        System.out.println();
        
        /*for (int i = 0; i <3; i++){
            checker = c[i];
            for(int j=i; j<b.length; j++){
               if(checker == b[j]){
                    count++;
                } 
            }
            System.out.printf("%.0f ",count);
        }*/
        //System.out.println(count);
    }
}

public class Lab4_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] x;
        x = new double[n];
        for(int i=0; i<n; i++){
            x[i] = input.nextDouble();
        }
        AscendSortFreq ss = new AscendSortFreq();
        ss.AscendSort(x);
        ss.SortCommuFreq(x);
    }
}
