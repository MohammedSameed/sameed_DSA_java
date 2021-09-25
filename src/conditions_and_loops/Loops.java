package conditions_and_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //print number from 1 to 5
        //for loop
        /*
            syntax of for loop:
            for(initialisation; condition; increments/decrements){
                  // body}
            */
//        for (int num = 1; num <= 5; num++) {
//            System.out.println(num);
//        }
//
//        //print numbers from 1 to n
//
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//
//        for (int number = 1; number <= n; number++) {
//            System.out.println(number);
//            System.out.println("Hello world");
//        }
//        //while loop
//        /*
//            syntax for while loop:
//            while(condition){
//              //  body}
//          */
//        int num = 1;
//
//        while (num <= 5) {
//            System.out.println(num);
//            num +=1;
//        }
            /*do while loop:
             syntax for do while loop:
             do{
             }while(condition);

             */
        int n = 1;
        do {
            System.out.println(n);
            n++;

        }while (n<=5);


    }
}
