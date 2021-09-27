/*the syntax for the function is
           return_type name(arguments) {
                    //body
                   return statement;
                              }
*/


//function or methods simply work for if we want to call something it would help
package functions_or_methods_in_java;


import java.util.Scanner;

public class basics_of_functions {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

    }
    // question : return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1= in.nextInt();
        System.out.println("enter number 2");
        int num2= in.nextInt();
        int sum = num1+num2;
        return sum;

    }
}
