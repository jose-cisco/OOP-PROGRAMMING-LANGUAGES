/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2sp;

import java.util.Scanner;

/**
 *
 * @author punyawee jear
 */
public class lab2SP_1 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
       double a = scan.nextDouble();
       double b = scan.nextDouble();
       double c = scan.nextDouble();
       double d = scan.nextDouble();
       double e = scan.nextDouble();
       double f = scan.nextDouble();
        if((a*d)-(b*c) == 0)
        {
            System.out.println("The equation has no solution");
            System.exit(0);
        }
        else{
            System.out.println("x is " + ((e*d)-(b*f))/((a*d)-(b*c))+ " y is " + ((a*f)-(e*c))/((a*d)-(b*c)));
        }
    }
}
