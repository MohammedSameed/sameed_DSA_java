

public class Main{
    public static void main(String[] args){
        
pattern1(4);
pattern2(10);
patternx(5);
pattern3(5);
pattern4(5);
    }
    static void pattern1(int n){
        for(int i=0 ; i<2*n ; i++){
            int colInRow = 0;
            if (i<n) {
                colInRow = i;
            } else { 
                colInRow = 2*n-i;
            }
           
            for(int j=0 ; j<colInRow;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    static void pattern2(int n ){

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternx(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                String print = j < n-i ? " " : "*";
                System.out.print(print);
            }
            System.out.println();
        }

    }
    static void pattern3(int n ){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
    }

}

static void pattern4(int n ){
    for(int i=n ; i>=1 ; i--){
        for (int j= 1; j<=i ; j++ ){
            System.out.print(j + " ");
        }
        System.out.println();
    }
   
}
}           

        