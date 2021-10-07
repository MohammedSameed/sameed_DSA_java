package Arrays;

import java.util.Arrays;

public class reverse_of_array {
        public static void main(String[] args){
        int[] arr = {1,2,3,4,5,34,65,74,37};
        swap(arr,1,2);
        reverse(arr);
            System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr){
            int start = 0;
            int end = arr.length-1;

            while(start<end){
                //swap
                swap(arr,start,end);
                start++;
                end--;
            }

    }
        static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]= arr[index2];
        arr[index2] =temp ;
    }
    }

