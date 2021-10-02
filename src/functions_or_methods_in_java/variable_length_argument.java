package functions_or_methods_in_java;

import java.util.Arrays;

public class variable_length_argument {
    public static void main(String[] args) {
        fun(23,45,86,9685,595,5756,585);
        multiple(2,3,"sameed","mohammed");
        demo("assalamualaikum");
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    //multiple arguments like
    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));

    }
}
