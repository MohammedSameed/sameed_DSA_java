package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class inputs_and_outputs_in_Arrays {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
//        // Array of primitive
//        int[] arr = new int [5];
//        arr[0]=  543;
//        arr[1]=  34;
//        arr[2]=  876;
//        arr[3]=  967;
//        arr[4]=  87;
//        // internally its like {543,34,876,967,87}
//        System.out.println(arr[3]);
//        //other method for this is
//        for (int i =0;i<arr.length;i++){    //if we dont know the length of the array then we use arr.length
//            arr[i]= input.nextInt();
//        }
//        for (int i =0 ; i<arr.length;i++){
//            System.out.print(arr[i]+" ");} // if we give input 1 2 3 4 5 here output is 1 2 3 4 5
//
//            //most common and easy way to do this is
//            for (int j =0;j<arr.length;j++){
//                arr[j]= input.nextInt();// if we give input 1 2 3 4 5 here output is [1, 2, 3, 4, 5]
//            }
//            System.out.println(Arrays.toString(arr));

            //Array of object
        String[] str = new String[5];
        for (int i =0;i<str.length;i++){
            str[i]= input.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[0]= "mohammed sameed";
        System.out.println(Arrays.toString(str));

    }

    }

