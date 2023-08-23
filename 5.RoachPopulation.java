package lab3no1;

import java.util.Scanner;

public class RoachPopulation {
    private int num;
    RoachPopulation(){}
    RoachPopulation(int n){
        this.num=n;
    }
    void waitR(){
        num=num*2;
    }
    void spray(){
        num=num-(num*10/100);
    }
    public void get(){
        System.out.println(num);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int r= input.nextInt();
        RoachPopulation roach = new  RoachPopulation(n);
        for(int i=0;i<r;i++){
            roach.waitR();
            roach.spray();
        }
        roach.get();
    }
}