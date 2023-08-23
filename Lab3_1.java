package lab3;
class A{
    int x = 10, y = 10;
    void medthodA(B objB){
        objB.var1 = x;
        objB.var2 = y;
    }
}
class B{
    int var1, var2;
}

public class Lab3_1 {
    public static void main(String[] args) {
        B objB = new B();
        A objA = new A();
        objB.var1 = 5;
        objB.var2 = 5;
        System.out.println("var1 (before) = " + objB.var1);
        System.out.println("var2 (before) = " + objB.var2);
        objA.medthodA(objB);
        System.out.println("var1 (after) = " + objB.var1);
        System.out.println("var2 (after) = " + objB.var2);
    }
    
}
