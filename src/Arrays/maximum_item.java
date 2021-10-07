package Arrays;

public class maximum_item {
    public static void main(String[] args) {
        int[]arr = {1,2,45,4,5};
        System.out.println();
    }
    static void max (int[]arr){
        int maxval= arr[0];
        for (int i =0 ; i<arr.length; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }
        }
    }

}
