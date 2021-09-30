package functions_or_methods_in_java;

public class Scoping {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        String name = "sameed";
        {
        //    int a = 49; already initialised outside the block in the same method hence ypu cannot initialised again
            a= 100; // reasign the original ref variable  to the same value
            System.out.println(a);
            int c = 99;
            //value initialised in this block ,will remain in block
            name = "mohammed";
            System.out.println(name);

        }
        System.out.println(a);//cannot use outside the block
        System.out.println(name);

        //scoping in for loop

        for (int i = 0;i<4;i++ ){
            //System.out.println(i);
            int num = 100;
            a= 10000;
        }
        System.out.println();

    }
    
}
