/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4.pkg6.java;
import java.util.*;
class dot
{
    double[][] point;int size;
    dot(double[][] point,int size){this.point=point;this.size=size;}
    double find(){
    double min=100000000;
    for(int i=0;i<size-1;i++)
    {for(int j=i+1;j<size;j++){
        double d=Math.sqrt(((point[i][0]-point[j][0])*(point[i][0]-point[j][0]))+((point[i][1]-point[j][1])*(point[i][1]-point[j][1])));
        if(d<min)
            min=d;   
    }
    }return min;
}
}
public class Q46Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        double[][] point=new double[size][2];
        for(int i=0;i<size;i++){
            for(int j=0;j<2;j++)
                point[i][j]=input.nextDouble();
        }
        dot p=new dot(point,size);
        System.out.printf("%.2f",p.find());
    }
}
