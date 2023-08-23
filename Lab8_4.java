/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_4;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Windows
 */

abstract class Employee{
    private String firstname;
    private String lastname;
    private String id;
    public Employee(String firstname,String lastname,String id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.id=id;
    }
    public abstract double earning();
    public abstract double bonus(int year);

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    
}

class SalariedEmployee extends Employee{
    double salary;
    public SalariedEmployee(String firstname,String lastname,String id, double sal){
        super(firstname,lastname,id);
        this.salary=sal;
    }

    @Override
    public double earning() {
        return salary-(salary*0.05);
    }

    @Override
    public double bonus(int year) {
        if(year>5){
            return salary*12;
        }
        else{
            return salary*6;
        }
    }
    public String getname(){
        return super.getFirstname();
    }
    public String getlastname(){
        return super.getLastname();
    }
}
 
class ComEmployee extends Employee{
    double grosssale;
    double comrate;
    public ComEmployee(String firstname,String lastname,String id, double sales, double percent){
        super(firstname,lastname,id);
        grosssale=sales;
        comrate=percent;
    }

    @Override
    public double earning() {
        return grosssale*comrate;
    }

    @Override
    public double bonus(int year) {
        if(year>5){
            return grosssale*6;
        }
        return grosssale*3;
    }
    public String getname(){
        return super.getFirstname();
    }
    public String getlastname(){
        return super.getLastname();
    }
}

public class Lab8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> emp=new ArrayList<Employee>();
        emp.add(new SalariedEmployee("nannannan","duan","001",10000));
        emp.add(new SalariedEmployee("pobpobpob","dang","002",9000));
        emp.add(new ComEmployee("duaduadua","nant","003",12000,5));
        emp.add(new ComEmployee("yutyutyutyut","jut","004",15000,10));
        printemp(emp);
    }
    
    public static void printemp(ArrayList<Employee> a){
        double[] earnings=new double[a.size()];
        double[] bonus=new double[a.size()];
        for(int i=0;i<a.size();i++){
            earnings[i]=a.get(i).earning();
            bonus[i]=a.get(i).bonus(i);
        }
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        String s="fisrtname   lastname    earning     bonus  \n";
        for(int i=0;i<a.size();i++){
            s+=a.get(i).getFirstname()+"        "+a.get(i).getLastname()+"    "+a.get(i).earning()+"        "+a.get(i).bonus(i)+"\n";
        }
        JOptionPane.showMessageDialog(f,s); 
        //JOptionPane.showMessageDialog(f,"adw"); 
    }
}
