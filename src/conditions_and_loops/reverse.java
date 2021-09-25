package conditions_and_loops;

public class reverse {
    public static void main(String[] args) {
        int num = 4563;

        int ans = 0;
        while (num>0){
            int rem = num %10;
            num/=10;
            ans = ans*10 + rem;

        }
        System.out.println(ans);
    }
}
