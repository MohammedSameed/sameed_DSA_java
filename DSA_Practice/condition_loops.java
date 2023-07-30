package DSA_Practice;

import java.util.*;


public class condition_loops {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
// checking the person is adult or not
        int age = input.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("not Adult");
        }
//checking even and odd

        int number = input.nextInt();

        if(number%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        //checking equal or greater or smaller


        int a = input.nextInt();
        int b = input.nextInt();
        
        if(a==b){
            System.out.println("equal");

        }
        else{
            if(a>b){
                System.out.println(" a is greater");
            }
            else{System.out.println("a is smaller");}
        }

        //checking equal or greater or smaller in else if form
        int d = input.nextInt();
        int e = input.nextInt();
        
        if(d==e){
            System.out.println("equal");}
            else if(d>e){
                System.out.println("d is greater");
            }
            else{
                System.out.println("d is smaller");
            }

            // switch 
            int button = input.nextInt();
            switch(button){
                case 1 : System.out.println("hello");
                break;
                case 2 : System.out.println("assalamualikum");
                break;
                case 3 : System.out.println("wassup");
                break;
                default : System.out.println("invalid button");
                break;

            }
       
    }
    
}
