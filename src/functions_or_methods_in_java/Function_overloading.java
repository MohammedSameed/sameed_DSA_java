package functions_or_methods_in_java;

public class Function_overloading {
    public static void main(String[] args) {
        func(67);
        func("sameed");

    }
    static void func(int a){
        System.out.println(a);
    }

    static void func(String name){
        System.out.println(name);
    }
}
