package gfg.easy;

public class factDigit {
    /*
     * Count digits in a factorial
     * EasyAccuracy: 36.84%Submissions: 9K+Points: 2
     * 
     * Fast-Track your resumes to top tech companies and get the job you deserve!
     * Register for Job-A-Thon Hiring Challenge
     * banner
     * 
     * Given an integer N. You have to find the number of digits that appear in its
     * factorial, where factorial is defined as, factorial(N) = 1*2*3*4..*N and
     * factorial(0) = 1.
     * 
     * 
     * Example 1:
     * 
     * Input:
     * N = 5
     * Output:
     * 3
     * Explanation:
     * 5! is 120 so there are 3
     * digits in 120
     * 
     * Example 2:
     * 
     * Input:
     * N = 10
     * Output:
     * 7
     * Explanation:
     * 10! is 3628800 so there are
     * 7 digits in 3628800
     * 
     * 
     * Your Task:
     * You don't need to read input or print anything. Your task is to complete the
     * function facDigits() which takes an integer N as input parameter and returns
     * the number of digits in factorial of N.
     * 
     * 
     * Expected Time Complexity: O(Log(N))
     * Expected Space Complexity: O(1)
     * 
     * 
     * Constraints:
     * 1 ≤ N ≤ 104
     */
    public static void main(String[] args) {
        int x = 5;
        System.out.println(facDigits(x));

        int factAns = fact(x);
        //  int factAns1 = Math.factorial(x);
         String s = factAns+"";
        //  return s.length();
        System.out.println(s.length());
        System.out.println(factLong(8));
    }
    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static long factLong(long n){
        if(n<=1){
            return 1;
        }
        return n*factLong(n-1);
    }

    public static int facDigits(int N) {
        // code here
        // int fact =1;
        // for(int i =1;i<=N;i++){
        // fact*=i;
        // }
        // String s = fact+"";
        // return s.length();
        if (N < 0) {
            return 0;
        }
        if (N <= 1) {
            return 1;
        }
        double d = 0.0;
        for (int i = 2; i <= N; i++) {
            System.out.println(Math.log10(i));// it riun as i=100 then it worlk as 10^2
            d = d + Math.log10(i);
            System.out.println(d);
        }
        d = d + 1;
        return (int) d;
    }
}
