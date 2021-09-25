// question : subtract the product and sum of digits of an integer

package problems_on_condition_and_loops;

import java.util.Scanner;

public class subtract_product_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 345;
        int ans = 0;
        int multiply=1;
        int addition =0;



        while (num>0){
            int rem = num%10;
            num/=10;
            multiply=multiply*rem;
            addition=addition+rem;


        }
        System.out.println(multiply);
        System.out.println(addition);
        System.out.println("answer is");
        System.out.println(multiply-addition);


    }

}
