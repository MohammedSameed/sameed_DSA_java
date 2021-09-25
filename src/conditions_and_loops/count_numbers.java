package conditions_and_loops;

public class count_numbers {
    public static void main(String[] args) {
        int n = 45553;

        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem==5){
                count++;

            }n=n/10;
        }
        System.out.println(count);
    }
}
