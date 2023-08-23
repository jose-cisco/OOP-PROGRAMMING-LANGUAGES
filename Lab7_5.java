/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_5;
import java.util.*;
/**
 *
 * @author Windows
 */
class Address{
    String street;
    String city;
    Address(){}
    Address(String street,String city){
        this.street=street;
        this.city=city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getaddressinfo(){
        return "street="+this.getStreet()+" city="+this.getCity();
    }
}

class employee{
    int id;
    String name;
    double salary;
    Address address;
    employee(){
        
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getdetails(){
        return "id="+id+" name="+name+" salary="+salary+" "+this.getAddress().getaddressinfo();
    }
}

class manager extends employee{
    String parkingno;
    
    manager(){
    }
    
    
    
    public String getParkingno() {
        return parkingno;
    }

    public void setParkingno(String parkingno) {
        this.parkingno = parkingno;
    }
    
    @Override
    public String getdetails(){
        return super.getdetails()+" parkingno="+this.getParkingno();
    }
}

public class Lab7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        employee emp=new manager();
        Scanner input=new Scanner(System.in);
        System.out.println("id= ");
        int id=input.nextInt();
        ((manager) emp).setId(id);
        System.out.println("name= ");
        String name=input.next();
        ((manager) emp).setName(name);
        System.out.println("salary= ");
        double salary=input.nextDouble();
        ((manager) emp).setSalary(salary);
        Address a=new Address();
        System.out.println("street= ");
        String street=input.next();
        a.setStreet(street);
        System.out.println("city= ");
        String city=input.next();
        a.setCity(city);
        ((manager) emp).setAddress(a);
        System.out.println("parking no= ");
        String pno=input.next();
        ((manager) emp).setParkingno(pno);
        System.out.println(((manager) emp).getdetails());
    }
    
}
