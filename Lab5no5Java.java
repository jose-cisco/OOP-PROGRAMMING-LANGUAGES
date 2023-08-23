/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5no5.java;
import java.util.*;
class Employee
{
    private String firstname,lastname,id;private double salary,Bonus;
    public Employee(String firstname,String lastname,String id,double salary)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.id=id;
        this.salary=salary;
    }
    public String getfirstname(){return firstname;}
    public String getlastname(){return lastname;}
    public String getid(){return id;}
    public double getsalary(){return salary;}
    double earning(){return salary-(salary*0.05);}
    void bonus(int year){if(year>5)Bonus=this.earning()*12;else Bonus=this.earning()*6;}
    public double getBonus(){return Bonus;}
}
public class Lab5no5Java {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Employee>arrayEarn=new ArrayList<>();
        System.out.println("Enter 1:add employe 2:print employee 0:Exit");
        while(true){
            int in=input.nextInt();
            if(in==0) break;
            else if(in==1)
            {
                System.out.print("Enter name: ");
                String name = input.next();
                System.out.print("Enter lastname: ");
                String lastname = input.next();
                System.out.print("Enter id: ");
                String id = input.next();
                System.out.print("Enter salary: ");
                double salary = input.nextDouble();
                System.out.print("Enter year: ");
                int year = input.nextInt();
                Employee em=new Employee(name,lastname,id,salary);
                em.bonus(year);
                arrayEarn.add(em);
            }
            else if(in==2) printEmp(arrayEarn);
            }
    }
    static void printEmp(ArrayList a)
    {
        for(int i=0;i<a.size();i++)
        {
            Employee E =(Employee) a.get(i);
            System.out.println(E.getfirstname()+" "+E.getlastname()+" "+E.earning()+" "+E.getBonus());
        }
    }
    
}
