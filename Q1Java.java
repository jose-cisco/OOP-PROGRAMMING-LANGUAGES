/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1.java;

import javax.swing.JOptionPane;
public class Q1Java {
    public static void main(String[] args) {
        String in =JOptionPane.showInputDialog(null,"Please input Fahrenheit","Converter",JOptionPane.QUESTION_MESSAGE);
        double f =Double.parseDouble(in);
        double cel=(5.0/9)*(f-32);
        System.out.printf("%.2f", cel);
        JOptionPane.showMessageDialog(null,"Col "+String.format("%.2f",cel));
    }
    
}
