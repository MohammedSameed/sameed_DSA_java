package functions_or_methods_in_java;
import java.util.Scanner;

public class Question_no2 {
    // print all the three armstrong number (armstrong of 153 = (1*1*1)+(5*5*5)+(3*3*3) both are equal)
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isarmstrong(n);
        System.out.println(ans);

    }
    static boolean isarmstrong(int n){
        int original = n;
        int sum = 0;

        while(n>0){
            int rem = n%10;
            n/=10;
            sum = sum +rem*rem*rem;

        }
        if(sum == original){
            return true;
        }
        return false;
    }
}
