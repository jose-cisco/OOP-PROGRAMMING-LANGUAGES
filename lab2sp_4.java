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
public class lab2sp_4 {
    public static void main(String[] args) {
        double[] num = new double[10];
        double sum = 0,sumpow = 0,sd = 0;
        int i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        for(i=0;i<10;i++){
            num[i] = in.nextDouble();
            sum += num[i];
            sumpow += Math.pow(num[i],2);
        }
        System.out.printf("The mean is %.2f \n",sum/10);
        sum = Math.pow(sum, 2);
        sd = Math.sqrt(((10*sumpow)-sum)/90);
        System.out.printf("The standard deviation is %.5f",sd);
    
    }
}
