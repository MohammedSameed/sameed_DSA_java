package Arrays;

import java.util.Arrays;

public class shuffle_the_array {
    public static void main(String[] args) {
        int[] ans={1,2,3,1,2,3};
        int n = ans.length/2;
        System.out.println(Arrays.toString(shuffle(ans, n)));
    }
    public static int[] shuffle(int[] nums, int n) {
        for(int i=1; i<n; i++) {
            for(int j=i, k=n; j<n; j++,k++) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
            }
        }
        return nums;

    }
}
