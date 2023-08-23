
package application.java;
class Account{
private int id;private double balance,annualInterestRate;
private Date dateCreated;
Account(){}
Account(int id,double balance)
{
this.id=id;this.balance=balance;
}
public void setID(int id)
{
this.id=id;
}
public int getID()
{
 return this.id;
}
public double getBalance()
{
    return balance;
}
void deposit(double amount)
{
    this.balance+=amount;
}
void withdraw(double amount)
{
    this.balance-=amount;
}
double getMonthlyInterestRate()
{
    return this.annualInterestRate/12;
}
double getMoneyInterest()
{
    return this.getMonthlyInterestRate()*this.balance;
}
void setDateCreted(Date d)
{
    this.dateCreated=d;
}
void setbalance(double balance)
{
    this.balance=balance;
}
void setAnnualInterestedRate(double annualInterestRate)
{
    this.annualInterestRate=annualInterestRate;    
}
void transfer(Account target,double amount)
{
    this.balance-=amount;
    target.setbalance(target.getBalance()+amount);
}        
}
class Date
{
    int d,m,y;
    Date(){}
    Date(int d,int m,int y)
    {
        this.d=d;
        this.m=m;
        this.y=y;
    }
}
public class APPLICATIONJava {
    public static void main(String[] args) {
        Date dateyaya= new Date(10,8,2020);
        Date datenadej= new Date(15,10,2020);
        Account yaya = new Account(001,10000);
        yaya.setDateCreted(dateyaya);
        yaya.setAnnualInterestedRate(0.045);
        Account nadej = new Account(002,1000);
        yaya.deposit(5000);
        yaya.withdraw(1000);
        yaya.transfer(nadej,5000);
        System.out.println("yaya balance= "+yaya.getBalance());
        System.out.println("nadej balance= "+nadej.getBalance());
        System.out.println("nadej balance= "+yaya.getMoneyInterest());
    }  
}
