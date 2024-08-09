package dsa_30_03_24;

public class mul_str {
    public static void main(String[] args) {
        String s1 = "0033";
        String s2 = "2";
        System.out.println(mul_str_fun(s1,s2));
    }
    public static int mul_str_fun(String s,String t){
        // int a = Integer.parseInt(s);
        // int b = Integer.parseInt(t);
        // return a*b;

        return Integer.parseInt(s)*Integer.parseInt(t);
    }
}
