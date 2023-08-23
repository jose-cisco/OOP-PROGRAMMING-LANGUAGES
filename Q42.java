/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4.pkg2;

/**
 *
 * @author dell
 */
public class Q42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        T t1= new T();
        T t2= new T();
        System.out.println("t1's i = " +     t1.i+ " and j = " + t1.j);
        System.out.println("t2's i = " +     t2.i+ " and j = " + t2.j);
    }
}

class T {
    static int i = 0;
    int j=0;
    T(){
        i++;
        j=1;
    }
}
+
