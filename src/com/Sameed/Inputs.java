package com.Sameed;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter some input:");
        int rollno= input.nextInt();
        System.out.println("your rol number is" + rollno);
        int s=983_000_000; //If we want some long numbers simply put underscore(_) instead of commas(,)
        System.out.println(s);
        String name = input.next();// if we take next() only it will take first word and if we take nextln() then it
                                   //will take entire line
        System.out.println(name);

        float marks= input.nextFloat();
        System.out.println(marks);

    }

}
