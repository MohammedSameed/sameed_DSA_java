package intermediate_condition_and_loops_problems;

import java.util.Scanner;

public class factorial_program_in_java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double fact=1;

        for(int i=1 ;i<=n; i++){

            fact = fact *i;

        }
        System.out.println(fact);
    }
}
