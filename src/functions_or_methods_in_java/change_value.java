package functions_or_methods_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class change_value {
    public static void main(String[] args) {
        //create an array
        int[]arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] nums) {
        nums[0]= 99; //if we make a change to the object via this reference variable same object will be changed

    }
}
