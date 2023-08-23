package lab9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class C extends JPanel{
    //JPanel panel = new JPanel();
    Timer timer = new Timer(5 ,new TimerListener());
    int radius = 20;
    int i = 1;
    int o,l;
    
    C(){
        timer.start();
    }
    
    private class TimerListener implements ActionListener {
        @Override 
        /** Handle the action event */
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawArc(20, 220, 80, 40, 0, 180);
        g.drawLine(20 + 40, 220, 20 + 40, 20);
        g.drawLine(20 + 40, 20, 20 + 40 + 100, 20);
        g.drawLine(20 + 40 + 100, 20, 20 + 40 + 100-i, 40);
        if(160-i==200||160+l==120) o = 1;
        if(160-i==120||160+l==200) o = 0;
        g.drawOval(20 + 40 + 100 - radius - i, 40, 2 * radius, 2 * radius);
        g.drawLine(20 + 40 + 100 - i - (int)(radius *Math.cos(Math.toRadians(45))),40 + radius + (int)(radius * Math.sin(Math.toRadians(45))),20 + 40 + 100 + 10 - 60-i, 40 + radius + 60-l*3/7);
        g.drawLine(20 + 40 + 100 - i + (int)(radius *Math.cos(Math.toRadians(45))),40 + radius + (int)(radius * Math.sin(Math.toRadians(45))),20 + 40 + 100 - 10 + 60-i*2, 40 + radius + 60+l*2*3/7);
        g.drawLine(20 + 40 + 100-i, 40 + 2* radius,160-i*2, 40 + radius + 80);
        g.drawLine(20 + 40 + 100-i*2, 40 + radius + 80, 20 + 40 + 100-i*2 - 40,40 + radius + 80 + 40);
        g.drawLine(20 + 40 + 100-i*2, 40 + radius + 80, 20 + 40 + 100-i*2 + 40,40 + radius + 80 + 40);
        if(o==0){
            i--;
            l--;
        }
        else{
            i++;
            l++;
        }
    }
}


public class Lab9_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HangMan");
        frame.add(new C());
        frame.setVisible(true);
    }
    
}
