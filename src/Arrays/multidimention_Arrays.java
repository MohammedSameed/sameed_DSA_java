package Arrays;

import java.util.Scanner;

public class multidimention_Arrays {
    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9
         */
        Scanner in = new Scanner(System.in);
//        int[][] Arr=new int[3][3];
//
//        int[][]arr = {
//                {1,2,3},// 0th index
//                {4,5,6},// 1st index
//                {7,8,9}// 2nd index
//        };
        int[][] Array = new int[3][3];
        System.out.print(Array.length);//this will give no. of rows

         //input

        for (int row = 0; row< Array.length;row++){
            //for each collom in every row
            for (int col = 0; col< Array[row].length;col++){
                Array[row][col] =in.nextInt();

            }
        }
        for (int row = 0; row< Array.length;row++){
            //for each collom in every row
            for (int col = 0; col< Array[row].length;col++){
                System.out.print(Array[row][col] + " ");

            }
            System.out.println();
        }
    }
}
