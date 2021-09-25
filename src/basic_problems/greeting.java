package basic_problems;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your name");

        String name =input.nextLine();
        System.out.println("hii welcome to my shop " +name);

    }
}
