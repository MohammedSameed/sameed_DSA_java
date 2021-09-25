package problems_on_condition_and_loops;

import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("give radius of circle");
        double radius = input.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("area of circle is");
        System.out.println(area);
    }
}
