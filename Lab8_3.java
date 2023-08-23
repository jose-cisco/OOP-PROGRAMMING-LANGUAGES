/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_3;
import java.awt.*;
import javax.swing.*;
abstract class AbstractDrawFunction extends JPanel{
    private Polygon p=new Polygon();
    protected AbstractDrawFunction(){
        drawFunction();
        setBackground(Color.white);
    }
    public abstract double f(double x);
    public void drawFunction(){
        for(int x=-100;x<=100;x++){
            p.addPoint(x+200, 200-(int)f(x));
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(10, 200, 390, 200);
        g.drawLine(200, 30, 200, 390);
        g.drawLine(390, 200, 370, 190);
        g.drawLine(390, 200, 370, 210);
        g.drawLine(200, 30, 190, 50);
        g.drawLine(200, 30, 210, 50);
        
        g.drawString("X",370,170);
        g.drawString("Y",220,40);
        
        g.drawPolyline(p.xpoints,p.ypoints,p.npoints);
    }
}

class DrawsinA extends AbstractDrawFunction{
    DrawsinA(){
        super();
    }
    @Override
    public double f(double x){
       return 100*Math.sin(x);
    }
}

class DrawcosA extends AbstractDrawFunction{
    DrawcosA(){
        super();
    }
    @Override
    public double f(double x){
       return 100*Math.cos(x);
    }
}

class DrawtanA extends AbstractDrawFunction{
    DrawtanA(){
        super();
    }
    @Override
    public double f(double x){
       return Math.tan(x);
    }
}

class Drawcos5sin extends AbstractDrawFunction{
    Drawcos5sin(){
        super();
    }
    @Override
    public double f(double x){
       return Math.cos(x)+(5*Math.sin(x));
    }
}

class Draw5cossin extends AbstractDrawFunction{
    Draw5cossin(){
        super();
    }
    @Override
    public double f(double x){
       return (5*Math.cos(x))+Math.sin(x);
    }
}

class Drawlog extends AbstractDrawFunction{
    Drawlog(){
        super();
    }
    @Override
    public double f(double x){
       return Math.log(x)+(x*x);
    }
}

class Drawexpo extends AbstractDrawFunction{
    Drawexpo(){
        super();
    }
    @Override
    public double f(double x){
       return x*x;
    }
}

class Test extends JFrame{
    public Test(){
        getContentPane().setLayout(new GridLayout(2,3,5,5));
        getContentPane().add(new Drawexpo());
        getContentPane().add(new DrawsinA());
        getContentPane().add(new DrawcosA());
        getContentPane().add(new DrawtanA());
        getContentPane().add(new Drawcos5sin());
        getContentPane().add(new Draw5cossin());
        getContentPane().add(new Drawlog());
    }
}

/**
 *
 * @author LAB_621
 */
public class Lab8_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test frame=new Test();
        frame.setSize(400,400);
        frame.setTitle("lab8_3");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
