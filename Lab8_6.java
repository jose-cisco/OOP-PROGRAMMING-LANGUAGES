/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_6;

/**
 *
 * @author Windows
 */

interface movable{
    void moveup();
    void movedown();
    void moveright();
    void moveleft();
}

class movablepoint implements movable{
    int x,y,xspeed,yspeed;
    movablepoint(){
        x=0;
        y=0;
        xspeed=5;
        yspeed=5;
    }
    @Override
    public String toString(){
        return "x="+x+" y="+y+" xspeed="+xspeed+" yspeed="+yspeed;
    }
    
    @Override
    public void moveup() {
        y+=yspeed;
    }

    @Override
    public void movedown() {
        y-=yspeed;
    }

    @Override
    public void moveright() {
        x+=xspeed;
    }

    @Override
    public void moveleft() {
        x-=xspeed;
    }
    
}

class movablecircle implements movable{
    int radius;
    movablepoint center;
    movablecircle(){
        radius=10;
        center=new movablepoint();
    }

    @Override
    public void moveup() {
        center.moveup();
    }

    @Override
    public void movedown() {
        center.movedown();
    }

    @Override
    public void moveright() {
        center.moveright();
    }

    @Override
    public void moveleft() {
        center.moveleft();
    }
    
    @Override
    public String toString(){
        return center.toString()+" radius="+radius;
    }
}

public class Lab8_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        movablecircle c=new movablecircle();
        c.movedown();
        System.out.println(c.toString());
        c.moveleft();
        System.out.println(c.toString());
        c.moveright();
        System.out.println(c.toString());
        c.moveup();
        System.out.println(c.toString());
    }
    
}
