package conditions_and_loops;

import java.util.Scanner;

//question: find the nth fibonacci number take n from user as input
// fibonacci number is (0,1,1,2,3,5,8,) means addition of previous two numbers

public class fibonacci_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count<=n){
            int temp = b;
            b = a +b ;
            a =temp;
            count++;
        }
        System.out.println(b);

    }
}
