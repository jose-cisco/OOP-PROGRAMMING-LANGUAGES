/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4.pkg1.java;

/**
 *
 * @author dell
 */
public class Q41Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [] a ={1,2};
        swap(a[0],a[1]);
        System.out.println("a[0]=" + a[0]+ " a[1]=" +a[1]);
    }
    public static void swap(int n1,int n2){
        int temp =n1;
        n1=n2;
        n2=temp;
    
}
}
