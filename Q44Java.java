/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q4.pkg4.java;
class Coin{
int value;char side; char[] list={'H','T'};
Coin(){side='T';value=0;}
Coin(char side,int value){this.side=side;this.value=value;}
void flip(){int a =(int)(Math.random()*10)%2;
if(a==0)this.side='H';else this.side='T';
}
void reverse(){if(this.side=='H')this.side='T';
else this.side='H';
}
public boolean equals(Coin c)
{
    if(this.side==c.side&&this.value==c.value)return true;
    else return false;
}
}
public class Q44Java {

   
    public static void main(String[] args) {
        Coin[] a=new Coin[4];
        a[0]=new Coin('H',1);
        a[1]=new Coin('H',1);
        a[2]=new Coin('T',5);
        a[3]=new Coin('T',5);
        for(int i=0;i<20;i++)
        {
            a[0].flip();
            System.out.println(a[0].side+""+a[0].value);
            a[1].reverse();
            System.out.println(a[1].side+""+a[1].value);
            a[2].flip();
            System.out.println(a[2].side+""+a[2].value);
            a[3].reverse();
            System.out.println(a[3].side+""+a[3].value);
        }
        boolean ans= a[0].equals(a[1]);
        boolean ans1= a[2].equals(a[3]);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
