package questions_on_function;
// grade system from marks

import java.util.Scanner;

public class question_no8 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
//        int marks = in.nextInt();
        
//        if(marks>=90){
//            System.out.println("AA");
//        }
//        else if(marks>=80){
//            System.out.println("A");
//        }
//       else if(marks>=70){
//            System.out.println("b");
//        }
//       else if(marks>=60){
//            System.out.println("c");
//        }
//        else if(marks>=50){
//            System.out.println("d");
//        }
//        else if(marks>=40){
//            System.out.println("e");
//        }
//        else {
//            System.out.println("fail");
//        }
        int mark = in.nextInt();

        switch (mark/10){
            case 9 :
                System.out.println("A+");
                break;

            case 8:
            case 7 :
                System.out.println("A");
                break;

            case 6:
                System.out.println("c");
                break;

            case 5:
                System.out.println("d");
                break;

            case 4:
                System.out.println("fail");
                break;

        }



        }

        }


