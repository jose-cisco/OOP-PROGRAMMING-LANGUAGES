package palindrome;
import java.util.Scanner;
public class Palindrome {
    public static boolean flag;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        isPalindrome(s);
    }
    public static void isPalindrome(String s){
        int l = s.length();
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(l-1-i)){
                flag=false;
                break;
            }
            flag=true;
        }
        System.out.println(flag);
    }
}
