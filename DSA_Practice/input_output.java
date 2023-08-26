package DSA_Practice;

import java.util.*;
class input_output{
    public static void main (String[] args){

        System.out.println("sameed");

        int age = 43;
        String name = "mohammed sameed ";
        double salaray = 29.40;

        Scanner input = new Scanner (System.in);
        String firstname = input.nextLine(); 
        System.out.println(firstname);

        // printing the sum of 2 numbers

        int a = input.nextInt();
        int b = input.nextInt();
        float sum = a+b;

        System.out.println(sum);
       
        
    }

}