package switch_statements;

import java.util.Scanner;

public class basics_of_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//
//        switch (fruit){
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("sweet red fruit");
//                break;
//            case "orange":
//                System.out.println("round juicy fruit");
//                break;
//            case"grapes":
//                System.out.println("small fruit");
//                break;
//
//            default:
//                System.out.println("please give valid fruit");
//        }
//        // we can also use this syntax which is called enhanced switch
//
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("sweet red fruit");
//            case "orange" -> System.out.println("round juicy fruit");
//            case "grapes" -> System.out.println("small fruit");
//            default -> System.out.println("please give valid fruit");
//        }
//        // we can also write it in if and else if condition
//
//        if ("mango".equals(fruit)) {
//            System.out.println("king of fruits");
//        } else if ("apple".equals(fruit)) {
//            System.out.println("sweet red fruit");
//        } else if ("orange".equals(fruit)) {
//            System.out.println("round juicy fruit");
//        } else if ("grapes".equals(fruit)) {
//            System.out.println("small fruit");
//        } else {
//            System.out.println("please give valid fruit");
//        }

//        int day = in.nextInt();

//        switch (day){
//            case 1-> System.out.println("monday");
//            case 2-> System.out.println("tuesday");
//            case 3-> System.out.println("wednesday");
//            case 4-> System.out.println("thursday");
//            case 5-> System.out.println("friday");
//            case 6-> System.out.println("saturday");
//            case 7-> System.out.println("sunday");


    // if we want same output from more than on case then

    int day = in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: System.out.println("week day");
            break;
            case 6:
            case 7: System.out.println("weekend");
        }
        // we can write it in enhanced switch like this
        int days = in.nextInt();
        switch (days) {
            case 1, 2, 3, 4, 5 -> System.out.println("week day");
            case 6, 7 -> System.out.println("weekend");
        }

    }
}
