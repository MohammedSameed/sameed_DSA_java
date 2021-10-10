package Arrays;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int[] ans = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(ans)));

    }

    public  static int[] getConcatenation (int[] nums) {
        int[] ans = new int[2 * nums.length];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}