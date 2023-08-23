package lab5;
import java.util.ArrayList;
import java.util.Scanner;
class SortMergeList{
    void intersect(ArrayList<Integer> list1, ArrayList<Integer> list2){
        int i,j;
        for(int e:list1){
            for(int g:list2){
                if(e == g){
                    System.out.printf("%d ",e);
                }
            }
        }
    }
}
public class lab5_3 {
    public static void main(String[] args) {
        int num,n=1;
        ArrayList<Integer>list1 = new ArrayList<Integer>();
        ArrayList<Integer>list2 = new ArrayList<Integer>();
        SortMergeList aa = new SortMergeList();
        Scanner in = new Scanner(System.in);
        n=0;
        do{
            num = in.nextInt();
            if(num!=0)
                list1.add(new Integer(num));
            n++;
        }while(num!=0);
      //  System.out.printf("next");
        n=0;
        do{
            num = in.nextInt();
            if(num!=0)
                list2.add(new Integer(num));
            n++;
        }while(num!=0);
      //  System.out.printf("finish");
        aa.intersect(list1, list2);
    }
    
}
