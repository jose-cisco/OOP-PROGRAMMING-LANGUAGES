public class Lab3_4 {
    public static void main(String[] args){
        // 4.1
        //System.out.println(g("A"));
        
        // 4.2
        /*int max = 0;
        max(1, 2, max);
        System.out.println(max);*/
        
        int i = 0;
        while(i <= 4){
            System.out.println("i is " + i);
            method1(i);
            i++;
        }
        System.out.println("i is " + i);
    }
    
    // 4.1
   /* public static String f(){
        System.out.println("A");
        return "A";
    }
    public static String g(String s){
        return f()+s;
    }*/
    
    // 4.2
    /*public static void max(int value1, int value2, int max){
        if(value1 > value2)
            max = value1;
        else
            max = value2;
    }*/
    
    public static void method1(int i){
        do{
            if(i % 3 != 0){
                System.out.print(i + " ");
                i--;
            }
        }
        while(i >= 1);
        System.out.println();
    }
}
