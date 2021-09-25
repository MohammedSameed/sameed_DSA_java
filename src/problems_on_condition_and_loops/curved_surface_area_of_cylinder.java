package problems_on_condition_and_loops;

import java.util.Scanner;

public class curved_surface_area_of_cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius and height here");
        double radius = input.nextDouble();
        double height = input.nextDouble();
        double area = 2*3.14*radius*height;
        System.out.println("area is");
        System.out.println(area);
    }
}
