package Arrays;

import java.util.*;

public class Array_list_example {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        // syntax for Array list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(57);
        list.add(65);
        list.add(575);
        list.add(544);
        list.add(87);
        list.add(98);

        //for checking that the list contain this integer or not
        System.out.println(list.contains(544));

        //for changing the value in list use this
        list.set(0,32);

        //for removing the value from the list use this
        list.remove(4);

        System.out.println(list);

        //input for list

        for (int i =0 ; i<5;i++){
            list.add(in.nextInt());
        }

        //output for list
        for (int i =0 ; i<5;i++){
            System.out.println();
        }
        System.out.println(list);

        //get item at any index
        for (int i =0 ; i<5;i++){
            System.out.println(list.get(i)); //pass index here, list[index]syntax will not work here

        }
        System.out.println(list);

    }
}
