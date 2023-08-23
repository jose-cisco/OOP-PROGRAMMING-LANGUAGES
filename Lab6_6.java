/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_6;
class account{
    private int id;
    private double balance;
    private double annualinterestrate;
    private date datacreate;
    private person objperson;
    account(){
        this.id=0;
        this.balance=0;
        this.datacreate=null;
        this.objperson=null;
    }
    account(int id,double balance){
        this.id=id;
        this.balance=balance;
    }
    void setid(int id){
        this.id=id;
    }
    void setbalance(double balance){
        this.balance=balance;
    }
    void setan(double annualinterestrate){
        this.annualinterestrate=annualinterestrate;
    }
    
    void setdate(date datacreate){
        this.datacreate=datacreate;
    }
    void setrate(double rate){
        this.annualinterestrate=rate;
    }
    
    int getid(){
        return this.id;
    }
    double getbalance(){
        return this.balance;
    }
    double getan(){
        return this.annualinterestrate;
    }
    date getdate(){
        return this.datacreate;
    }
    
    double getmonthlyinterestrate(){
        return this.annualinterestrate/100;
    }
    
    double getmonthlyinterest(){
        return (this.getmonthlyinterestrate()*this.balance)/12;
    }
    void withdraw(double with){
        this.balance-=with;
    }
    void deposit(double depo){
        this.setbalance(this.getbalance()+depo);
    }
    
    void transfermoney(account acc1,double amount){
        this.setbalance(this.getbalance()-amount);
        acc1.setbalance(acc1.getbalance()+amount);
    }
    void setperson(person p){
        this.objperson=p;
    }
    
    void setdatacreat(date d){
        this.datacreate=d;
    }

    public person getObjperson() {
        return objperson;
    }

    public date getDatacreate() {
        return datacreate;
    }
    
}

class date{
    private int d,y;
    private String m;
    date(){
        d=1;
        m="jan";
        y=2020;
    }
    date(int d,String m,int y){
        this.d=d;
        this.m=m;
        this.y=y;
    }

    public int getD() {
        return d;
    }

    public int getY() {
        return y;
    }

    public String getM() {
        return m;
    }

    public void setD(int d) {
        this.d = d;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setM(String m) {
        this.m = m;
    }
    
    @Override
    public String toString(){
        return this.d+"/"+this.m+"/"+this.y;
    }
}

class person{
    private String name,surname;
    private int age;
    private date bdate;
    person(){}
    person(String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public date getBdate() {
        return bdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBdate(date bdate) {
        this.bdate = bdate;
    }
    
    @Override
    public String toString(){
        return this.name+" "+this.surname;
    }
}

class savingaccount extends account{
    savingaccount(){
        super();
    }
    savingaccount(int id,double balance){
        super(id,balance);
    }
    @Override
    void transfermoney(account acc1,double amount){
        this.setbalance(this.getbalance()-amount-20);
        acc1.setbalance(acc1.getbalance()+amount);
    }
}

class fixaccount extends account{
    fixaccount(){
        super();
    }
    fixaccount(int id,double balance){
        super(id,balance);
    }
    @Override
    void transfermoney(account acc1,double amount){
        date d=this.getDatacreate();
        if(2020-d.getY()<1){
            System.out.println("this account cannot transfermoney");
        }
        else{
            this.setbalance(this.getbalance()-amount);
            acc1.setbalance(acc1.getbalance()+amount);
        }
    }
}
/**
 *
 * @author LAB_621
 */
public class Lab6_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        
        
        
        //person nan=new person("nantapob","duangsuwan");
        date nanbdate=new date(23,"april",2001);
        savingaccount acc1=new savingaccount(1123,20000);
        acc1.setan(4.5);
        person pacc1=new person("nantapob","duangsuwan");
        date acc1d=new date(10,"january",2010);
        acc1.setdatacreat(acc1d);
        pacc1.setBdate(nanbdate);
        acc1.setperson(pacc1);
        acc1.withdraw(2500);
        acc1.deposit(3000);
        
        person yaya=new person("yaya","sperbund");
        date yayabdate=new date(21,"jan",2000);
        yaya.setBdate(yayabdate);
        date yayacreate=new date(28,"august",2020);
        account yayaaccount=new account(1100,50000);
        yayaaccount.setperson(yaya);
        yayaaccount.setdatacreat(yayacreate);
        
        acc1.transfermoney(yayaaccount, 2000);
        System.out.println("saving account");
        System.out.println("id="+acc1.getid());
        System.out.println("name="+pacc1);
        System.out.println("date="+yayacreate);
        System.out.println("savingacount balance ="+acc1.getbalance());
        System.out.println("interest="+acc1.getmonthlyinterest());
        System.out.println();
        System.out.println("savingacount balance ="+yayaaccount.getbalance());
        
        fixaccount facc1=new fixaccount(1124,20000);
        facc1.setan(7.0);
        person fp=new person("nanta","duangsu");
        date fd=new date(10,"january",2020);
        facc1.setdatacreat(fd);
        date fbd=new date(10,"april",1999);
        fp.setBdate(fbd);
        
        facc1.setperson(fp);
        facc1.withdraw(2500);
        facc1.deposit(3000);
        System.out.println("fixaccount");
        System.out.println("name="+fp);
        System.out.println("date="+fd);
        facc1.transfermoney(yayaaccount, 1000);
        System.out.println("fixaccount balance="+facc1.getbalance());
        System.out.printf("fixaccount interest=%.2f\n",facc1.getmonthlyinterest());
    }
    
}
