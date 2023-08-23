/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3.java;

public class Q3Java {

    public static void main(String[] args) {
    Count myCount = new Count();
      int times=0;
      for (int i=0; i<100 ;i++)
         increment(myCount, times);
      System.out.println("count is "+myCount.count);
      System.out.println("times is "+times);    
   }
   public static void increment(Count c, int times){
      c.count++;
      times++;
   }
}
public class Count{
   public int count;
   
   public Count(int c){
     count =c;
   }
   public Count(){
     count =1;
   }     
    } 
}
