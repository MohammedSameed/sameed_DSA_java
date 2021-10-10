package Arrays;

import java.util.Arrays;

public class Array_for_permutation {
    public static void main(String[] args) {

        int[] ans ={0,2,1,5,3,4};

        System.out.println(Arrays.toString(buildArray(ans)));
    }

        public static int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];

            for(int i = 0 ; i<nums.length; i++){
                ans[i] = nums[nums[i]];
            }
            return ans;
        }

}
