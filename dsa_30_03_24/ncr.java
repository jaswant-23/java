package dsa_30_03_24;

public class ncr {
    public static void main(String[] args) {
        int n = 69;
        int r=43;
        // In which you need to find the combination of the given value;
        //   System.out.println((fact(n)/(fact(n-r)*fact(r))));

        System.out.println(combination_N_R(n, r));
    }
    public static int combination_N_R(int n, int r){
        if(n<r){
            return 0;// Because Here r is greater than n
        }
        return (int) (fact(n)/(fact(n-r)*fact(r))%(Math.pow(10, 9)+7));  // For the gfg question in which given the modulas task
    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*(fact(n-1));
    }
}
