
package DSA_Practice;
import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();   

        switch(fruit){
        
            case "mango":
            System.out.println("king of fruits");
            break;

            case "apple":
            System.out.println("red fruit");
            break;

            case "strawberry":
            System.out.println("little red fruit");
            break;
            

        }

       // enhanced version

       String day = in.next();

       switch (day){

        case "monday" -> System.out.println("not weekend");
        case "sunday" -> System.out.println(" weekend");
        case "friday" -> System.out.println("not weekend");
       }
        
    }
    
}
