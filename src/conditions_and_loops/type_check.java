package conditions_and_loops;

import java.util.Scanner;

public class type_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); // .trim is used to cut extra space
        if (ch>= 'a'&& ch <='z'){
            System.out.println("lowercase");
        }else {
            System.out.println("uppercase");
        }
        System.out.println(ch);
    }
    }

