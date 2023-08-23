/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1.pkg2.java;
import java.util.Scanner;
public class Q12Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double F=in.nextDouble();
        double C=(5/9.0)*(F-32);
        System.out.printf("Celcius=%.2f\n",C);
    }
    
}
