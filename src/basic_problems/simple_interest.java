package basic_problems;

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("give principal value");
        int principal =input.nextInt();

        System.out.println("give time value");
        int time =input.nextInt();

        System.out.println("give rate value");
        int rate =input.nextInt();

        System.out.println("the simple interest is");
        int simple_interest=(principal*time*rate)/100;
        System.out.println(simple_interest);


    }
}
