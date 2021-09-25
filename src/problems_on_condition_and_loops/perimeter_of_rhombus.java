package problems_on_condition_and_loops;

import java.util.Scanner;

public class perimeter_of_rhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give side");
        double side = input.nextDouble();
        double perimeter= 4*(side);
        System.out.println("perimeter is");
        System.out.println(perimeter);
    }
}
