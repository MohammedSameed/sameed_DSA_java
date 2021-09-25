package basic_problems;

import java.util.Scanner;

public class even_or_odd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter some number");
        int number =input.nextInt();

        if(number%2==0){
            System.out.println("the number is even");

            }
        else {
            System.out.println("the number is odd");
        }

        }
    }

