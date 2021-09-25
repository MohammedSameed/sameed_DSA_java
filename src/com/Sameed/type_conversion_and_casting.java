package com.Sameed;

import java.util.Scanner;

public class type_conversion_and_casting {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        int number =input.nextInt();// it not runs because what is written on a left is must be greater
        System.out.println(number);
        // TYPE CASTING
        int num1=(int)(67.23f);//the way how can we use float in integer
        System.out.println(num1);
        //automatic type promotion in expressions
        int a =257;
        byte b =(byte)(a);
        System.out.println(b); //here output is 1 because it did 257 % 256 =1
                               // maximum value we can store in byte is 256

        byte a1= 40;
        byte b1= 50;
        byte c1 = 100;
        int d = a1*b1/c1;
        System.out.println(d);

        System.out.println("اَلسَّلَام عَلَيْكُم");// we can write other languages it is called unicode values

        int number2 = 'A';
        System.out.println(number2); //here the answer is 65 because there are integers which is given for char

        byte B=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double D=0.1234;
        double result =(f * B) + (i / c) -(D * s);
        //float + int - double = double which one is the largest that one will be printed means it converts others into
                                //it self
        System.out.println((f * B)+ "" +(i / c) + "" +(D * s));
        System.out.println(result);
    }
}
