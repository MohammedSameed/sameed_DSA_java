package basic_problems;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        String c = input.next();
        int b = input.nextInt();




        if(c.equals("*")){
            System.out.println(a*b);
        } if(c.equals("+")){
            System.out.println(a+b);
        } if(c.equals("-")){
            System.out.println(a-b);
        }if(c.equals("/")){
            System.out.println((double) a/ b);
        }

    }
}
