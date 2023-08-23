/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Lab7_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int m=input.nextInt();
        int n=input.nextInt();
        int[][] a=new int[m][n];
        int startx=input.nextInt();
        int starty=input.nextInt();
        int endx=input.nextInt();
        int endy=input.nextInt();
        startx--;
        starty--;
        endx--;
        endy--;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=input.nextInt();
            }
        }
        a[endx][endy]=10;
        boolean check[][]=new boolean[m][n];
        find(a,check,startx,starty,1,-1,-1);
        System.out.println(bombx.size());
        System.out.println(mincount);
    }
    //static int bomb=0;
    static int mincount=1000000000;
    static ArrayList<Integer> bombx=new ArrayList<Integer>();
    static ArrayList<Integer> bomby=new ArrayList<Integer>();
    
    static void find(int[][] p,boolean[][] cp,int partx,int party,int count,int bx,int by){
        int[][] part=new int[p.length][p[0].length];
        boolean[][] checkpart=new boolean[cp.length][cp[0].length];
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p[i].length;j++){
                part[i][j]=p[i][j];
                checkpart[i][j]=cp[i][j];
            }
        }
        if(checkpart[partx][party]) return;
        else checkpart[partx][party]=true;
        
        if(part[partx][party]==0&&bx==-1){
            bx=partx;
            by=party;
        }
        else if(part[partx][party]==0&&bx!=-1) return;
        
        if(part[partx][party]==10){
            if(bx!=-1&&((!bombx.contains(bx)||(!bomby.contains(by))))){
                bombx.add(bx);
                bomby.add(by);
            }
            
            if(count<mincount){
                mincount=count;
            }
        }
        else{
            if(partx+1<part.length){
                find(part,checkpart,partx+1,party,count+1,bx,by);
            }
            if(party+1<part[0].length){
                find(part,checkpart,partx,party+1,count+1,bx,by);
            }
            if(partx-1>=0){
                find(part,checkpart,partx-1,party,count+1,bx,by);
            }
            if(party-1>=0){
                find(part,checkpart,partx,party-1,count+1,bx,by);
            }
        }
    }
}
/*
5 8
4 5
2 8
0 0 1 1 0 0 0 0 
1 0 1 1 0 1 1 1
1 0 1 1 1 0 0 1
1 1 0 0 1 0 0 1
0 0 1 1 0 1 1 1

5 8
 4 5
 2 8 
0 0 1 1 0 0 0 0 
1 0 1 1 0 1 1 1 
1 0 1 1 1 0 0 1 
1 1 0 0 1 0 0 1 
0 0 1 1 0 1 1 1


6 8
1 4
2 7
0 0 1 1 0 0 0 0
1 0 1 1 0 0 1 1
1 0 1 1 1 0 0 1
1 1 0 0 1 0 0 1
0 0 1 1 0 1 1 1
0 1 0 1 1 1 1 1

6 8
 1 4
 2 7
 0 0 1 1 0 0 0 0 
1 0 1 1 0 0 1 1
 1 0 1 1 1 0 0 1 
1 1 0 0 1 0 0 1
 0 0 1 1 0 1 1 1 
0 1 0 1 1 1 1 1
*/
