package functions_or_methods_in_java;
import java.util.Scanner;

public class Question_no1 {

    public static void main(String[] args){
        //question : take input the number and check its prime or not
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans= isprime(n);
        System.out.println(ans);
    }
    static boolean isprime(int n){
        if (n<=1){
            return  false;
        }
        int c =2;
        while (c*c<=n){
            if (n%c==0){
                return false;

            }
            c++;

        }
        return c*c>n;
    }
}
