package Recursion;

public class first {
    public static void main(String []args){
        // Today we can Learn the concept of recursion ...
        fun1(1);
        // System.out.println(n);
    }
    public static void fun1(int n){
        System.out.print(n+" ");
        fun2(n+1);
    }
    public static void fun2(int n){
        System.out.print(n+" ");
        fun3(n+1);
    }
    public static void fun3(int n){
        System.out.print(n+" ");
        fun4(n+1);
    }

    public static void fun4(int n){
        System.out.print(n+" ");
        fun5(n+1);
    }
    public static void fun5(int n){
        System.out.print(n+" ");
    }
}
