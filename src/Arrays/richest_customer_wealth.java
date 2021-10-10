package Arrays;

public class richest_customer_wealth {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6,7}};
        System.out.println(maximumWealth(arr));

    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int mainsum = 0;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {

              sum += accounts[row][col];

            }
            if (mainsum<sum){
                mainsum=sum;
            }

        }
        return mainsum;
    }
}