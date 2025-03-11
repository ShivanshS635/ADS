package test_java_mar11;
import java.util.*;
public class test {
    public static String reverse(String str){
        String res = "";
        for(int i = str.length()-1;i >= 0 ; i--){
            res  = res + str.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        String res = reverse(str);
        System.out.println("Reverse of the String " + str +": " + res);
    }
}
