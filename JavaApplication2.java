/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author LAB_621
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][] a=new int[m][n];
        int sx=input.nextInt();
        int sy=input.nextInt();
        int ex=input.nextInt();
        int ey=input.nextInt();
        sx--;
        sy--;
        ex--;
        ey--;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        a[ex][ey]=10;*/
        boolean[][] bool=new boolean[5][5];
        //boolean[][] bool1=new boolean[5][5];
        boolean[][] bool1=(boolean[][])bool.clone();
        //for(int i=0;i<5;i++){
            //System.arraycopy(bool[i], 0, bool1[i], 0, 5); 
            /*for(int j=0;j<5;j++){
            
                boolean temp=bool[i][j];
                bool1[i][j]=temp;
            }*/
        //}
        System.out.println(bool[0][0]);
        find(bool);
        //bool[0][0]=false;
        System.out.println("aftermethod "+bool[0][0]);
        System.out.println("last"+bool1[0][0]);
    }
    public static int min=1000000;
    public static int cout=0;
    
    public static void find(boolean[][] b){
        boolean[][] b1=new boolean[5][5];
        for(int i=0;i<5;i++){
            System.arraycopy(b[i], 0, b1[i], 0, 5);
        }
        System.out.println(b[0][0]);
        System.out.println(min);
        System.out.println(cout);
        b[0][0]=true;
    }
    
}
