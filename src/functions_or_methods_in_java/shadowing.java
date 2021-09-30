package functions_or_methods_in_java;

public class shadowing {
    static int x= 90;//this will be shadowed at line 8
    public static void main(String[] args){
        System.out.println(x);// here output is 90
        int x =40;// the class variable at line 4 is shadowed by this
        System.out.println(x);// here output is 40
        fun ();
    }
    static void fun(){
        System.out.println(x);
    }
}
