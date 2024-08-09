package gfg.easy;

public class factNum {
    public static void main(String[] args) {
        /*
         * Back to Explore Page
         * Count digits in a factorial
         * EasyAccuracy: 36.51%Submissions: 9K+Points: 2
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
         */
        System.out.println(facDigits(27));
    }

    public static int facDigits(int N) {
        // code here
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }
        String s = fact + "";
        System.out.println(s);
        return s.length();
    }
}
