//nested switch means in switch statement there is another switch statement

package switch_statements;

import java.util.Scanner;

public class nested_switch_statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Mohammed Sameed");
                break;
            case 2:
                System.out.println("Mohammed Moheed");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "management":
                        System.out.println("management department");
                        break;
                }
                break;
            default:
                System.out.println("enter correct employ ID");

        }
        //  we can write it in enhanced switch like this
        switch (empId) {
            case 1:
                System.out.println("Mohammed Sameed");
                break;
            case 2:
                System.out.println("Mohammed Moheed");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "management" -> System.out.println("management department");
                }
                break;
            default:
                System.out.println("enter correct employ ID");

        }
    }
}