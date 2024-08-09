package Recursion;

public class sec {
    public static void main(String[] args) {
        System.out.println(fun(10));
    }

    public static int fun(int n) {
        if (n <= 2)
            return -1;
        return n + fun(n - 2) + fun(n - 4);
    }
}
 
