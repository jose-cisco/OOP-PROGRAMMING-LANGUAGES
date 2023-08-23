/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2sp;

import java.util.Scanner;

/**
 *
 * @author Punyaweejear
 */
public class lab2sp_2 {
    public static void main(String[] args) {
        int h,q,m,j,k;
        int yy;
        double a;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year month day: ");
        yy = in.nextInt();
        m = in.nextInt();
        q = in.nextInt();
        k = yy%100;
        j = yy/100;
        h = (q + (26*(m+1)/10)+k+(k/4)+(j/4)+(5*j))%7;
        if(h==0) System.out.println("Day of the week is Saturday");
        if(h==1) System.out.println("Day of the week is Sunday");
        if(h==2) System.out.println("Day of the week is Monday");
        if(h==3) System.out.println("Day of the week is Tuesday");
        if(h==4) System.out.println("Day of the week is Wednesday");
        if(h==5) System.out.println("Day of the week is Thursday");
        if(h==6) System.out.println("Day of the week is Friday");
    }
}
