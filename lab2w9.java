package occurrenceofmaxnumber;
import java.util.*;

public class Occurrenceofmaxnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[100];
        int coutmax = 0;
        int checkcount = 0;
        
        for(int i = 0; i < n.length; i++){
            n[i] = input.nextInt();
            if(n[i] == 0) break;
            checkcount++;
        }
        
        int max = n[0];
        for(int i = 0; i < checkcount; i++) {
            if(max < n[i])
            max = n[i];
        }
        
        for(int i = 0; i < checkcount; i++){
            if(n[i] == max){
                coutmax++;
            }
        }
        
        System.out.println(max + " " + coutmax);
    }
    
}
