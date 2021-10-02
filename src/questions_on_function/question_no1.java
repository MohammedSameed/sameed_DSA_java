package questions_on_function;

import java.util.Scanner;

public class question_no1 {
    // define two methods to  print maximum and minimum respectively among three numbers:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in .nextInt();

        int max = a;

        if (b>a){
            max=b;
        }
        if (c>b){
             max=c;

        }
        System.out.println(max);


        int d = in.nextInt();
        int e = in.nextInt();
        int f = in .nextInt();

        int min = d;

        if (e<d){
            min=e;
        }
        if (f<e){
            min= f;

        }
        System.out.println(min);
    }
}
