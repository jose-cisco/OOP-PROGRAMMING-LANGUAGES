package lab5no1.java;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab5no1Java {

    public static void main(String[] args) throws IOException{
        ArrayList<Integer>num=new ArrayList();
        Scanner scan=new Scanner(new File("C:\\Users\\LAB_621\\Desktop\\number.txt"));
        double x=0;
        double avg;
        double sum=0;
        int y;
        while(scan.hasNext())
            num.add(scan.nextInt());
        for(int i=0;i<num.size();i++){
            sum=sum+num.get(i);
        }
        avg=sum/num.size();
        int max;
        int min;
        max=num.get(0);
        for(int i=0;i<num.size();i++){
            if(max<num.get(i)){
                max=num.get(i);
            }
        }
        min=max;
        for(int i=0;i<num.size();i++){
            if(min>num.get(i)){
                min=num.get(i);
            }
        }    
        for(int i=0;i<num.size();i++){
            if(num.get(i)%2==0){
                num.remove(i);
                i--;
            }
        }
        System.out.printf("%.2f \n",avg);
        System.out.println(max);
        System.out.println(min);
        for(int i=0;i<num.size();i++){
            System.out.print(num.get(i)+" ");
        }
    }
}
