package problems_on_condition_and_loops;

import java.util.Scanner;

public class perimeter_of_parallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give side and base simultaneously");
        double side =input.nextDouble();
        double base = input.nextDouble();
        System.out.println("perimeter is");
        double perimeter = 2*(side + base);
        System.out.println(perimeter);

    }
}
