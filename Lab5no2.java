/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5no.pkg2;
import java.util.*;
class Star
{
ArrayList<String> addStars(ArrayList<String>s)
{
    if(s.contains("*")) return s;
    else{
    ArrayList<String> res=new ArrayList<>();
    for(int i=0;i<s.size();i++)
    {
        if("*".equals(s.get(i))) res.add("*");
        else
        {
        res.add(s.get(i));
        res.add("*");
        }
    }
    return res;
    }
}
ArrayList<String> removeStars(ArrayList<String>s)
{
    for(int i=0;i<s.size();i++)
    {
        if("*".equals(s.get(i))) s.remove(i);
    }return s;
}
}
public class Lab5no2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        String in;Star star = new Star();
       
        while(true){
            in=input.nextLine();
            if("0".equals(in)) break;
            else if("1".equals(in))
            {
              list=star.addStars(list);
              System.out.printf("[");
              for(int i=0;i<list.size();i++)
              {
                  if(i==list.size()-1) System.out.printf("%s]\n",list.get(i));
                  else System.out.printf("%s]\n",list.get(i));
              }
            }
            else if("2".equals(in))
            {
              list=star.removeStars(list);
              System.out.printf("[");
              for(int i=0;i<list.size();i++)
              {
                  if(i==list.size()-1) System.out.printf("%s]\n",list.get(i));
                  else System.out.printf("%s]\n",list.get(i));
              }
            }
            else list.add(in);
        }
    }
}
    
