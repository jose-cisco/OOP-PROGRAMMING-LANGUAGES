package lab10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise extends JFrame {
    int xBase = 10;
    public Exercise() {
        JPanel p = new JPanel(new GridLayout(4,1));
        p.add(new RaceCar(0));
        p.add(new RaceCar(1));
        p.add(new RaceCar(2));
        p.add(new RaceCar(3));
        add(p);
    }
    public static void main(String[] args) {
        Exercise frame = new Exercise();
        frame.setTitle("Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 500);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }
}
class RaceCar extends JPanel {
    private int xBase = 0;
    private Timer timer = new Timer(0, new Listener());
    public RaceCar(int x) {
        timer.start();
        timer.setDelay(x);
        this.setFocusable(true);
        this.addKeyListener(new KeyAdapter(){
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == e.VK_UP) {
                    timer.setDelay(timer.getDelay() - 5);
                }
                else if (e.getKeyCode() == e.VK_DOWN)
                    timer.setDelay(timer.getDelay() + 1);
            }
            });
        }
    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int yBase = getHeight();
        if (xBase > getWidth())
            xBase = -20;
        else
            xBase += 1;
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
