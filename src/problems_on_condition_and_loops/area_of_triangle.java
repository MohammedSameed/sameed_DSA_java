package problems_on_condition_and_loops;

import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give base and height respectively");
        double base = input.nextDouble();
        double height= input.nextDouble();
        double area = (base*height)/2;
        System.out.println("area of triangle is");
        System.out.println(area);
    }
}
