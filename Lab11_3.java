package Lab11;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.net.*;
import javax.swing.Timer;


public class  Lab11_3 extends JFrame {

    
    
     Lab11_3() {
        JPanel panel = new JPanel(new GridLayout(1, 1));
        panel.add(new RaceCar(4));
        
        add(panel);

    }

    public static void main(String[] args) {
         Lab11_3 frame = new  Lab11_3();
        frame.setTitle("RaceCar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

}

class RaceCar extends JPanel {

    int yBase;
    boolean timestart = false;
    private int xBase = 0, speed;
    Thread timer = new Thread(new Runnable(){
        public void run(){
            
            while(true){
                try{
                    yBase = getHeight();
                    if (xBase > getWidth()) {
                        xBase = -20;
                    } else {
                        xBase += speed;
                    }          
                    
                    Thread.sleep(50);
                    
                }catch(Exception e){
                 
                }
                if(timestart == false){
                    repaint();
                }
            }
        }
    });

    public RaceCar(int speed) {
        this.speed = speed;
        timer.start();
        
        this.setFocusable(true);
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        

        g.setColor(Color.BLACK);
        g.fillOval(xBase + 10, yBase - 10, 10, 10);
        g.fillOval(xBase + 30, yBase - 10, 10, 10);

        g.setColor(Color.GREEN);
        g.fillRect(xBase, yBase - 20, 50, 10);
        g.setColor(Color.RED);
        Polygon polygon = new Polygon();
        polygon.addPoint(xBase + 10, yBase - 20);
        polygon.addPoint(xBase + 20, yBase - 30);
        polygon.addPoint(xBase + 30, yBase - 30);
        polygon.addPoint(xBase + 40, yBase - 20);
        g.fillPolygon(polygon);
    }
}