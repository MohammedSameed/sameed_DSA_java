package problems_on_condition_and_loops;

import java.util.Scanner;

public class volume_of_pyramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("give length,width,height simultaneously");
        double l=input.nextDouble();
        double w = input.nextDouble();
        double h = input.nextDouble();
        System.out.println("volume is");
        double volume = (l*w*h)/3;
        System.out.println(volume);
    }
}
