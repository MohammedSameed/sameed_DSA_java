package conditions_and_loops;

import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        /*
        syntax of if statement:
         if (boolean expression T or F){
          //body
          }else {
          //do this
          }
          */
        Scanner input = new Scanner(System.in);
        int salary =input.nextInt() ;

        if(salary>10000){
            salary=salary+2000;

        } else {
            salary=salary+1000;
        }
        System.out.println(salary);

        // multiple if conditions

        if(salary>10000){
            salary=salary+2000;

        }
        else if (salary>20000){
            salary = salary + 3000;

        } else{
            salary = salary+1000;
        }
        System.out.println(salary);

        // && condition

        int a = 10;
        int b = 20;
        if (a==10 && b==20);
        System.out.println("hello world");

    }
}
