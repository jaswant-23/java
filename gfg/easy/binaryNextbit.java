package gfg.easy;

// import java.util.Scanner;

public class binaryNextbit {
    /*
     * Binary representation of next number
     * EasyAccuracy: 17.05%Submissions: 3K+Points: 2
     * 
     * Given a binary representation in the form of string(S) of a number n, the
     * task is to find a binary representation of n+1.
     * 
     * Example 1:
     * 
     * Input: S = "10"
     * Output: 11
     * Explanation: "10" is the binary
     * representation of 2 and binary
     * representation of 3 is "11"
     * 
     * Example 2:
     * 
     * Input: S = "111"
     * Output: 1000
     * Explanation: "111" is the binary
     * representation of 7 and binary
     * representation of 8 is "1000"
     * 
     * 
     * Your Task:
     * You don't need to read input or print anything. Complete the function
     * binaryNextNumber()which takes S as input parameter and returns the string.
     * 
     * 
     * Expected Time Complexity:O(N)
     * Expected Auxiliary Space: O(N) to store resultant string
     * 
     * 
     * Constraints:
     * 1 <= N <= 104
     */

    public static void main(String[] args) {
        // byte s = (byte) 1101;
        // byte j = (byte) 1;
        // System.out.println(s&j);
        // 1. Function convert Binary into decimal--->
        // System.out.println(binarytoDecimal("1000"));

        /*
         * Here is the Prdiefined in which you can convert the given value into Binary
         * in single line
         * String s = Integer.toBinaryString(N);
         */

        // Q. given a string s = "1000" it means it is 8 in decimal
        // Then you must return as 1001 it is in 9 in decimal
        String s = "1000";


        //  String k =Integer.toBinaryString(binarytoDecimal(s)+1);
        System.out.println(Integer.toBinaryString(binarytoDecimal(s)+1));

        /*
         * int ans = binarytoDecimal(s)+1;
         * System.out.println(Integer.toBinaryString(ans));
         */

        // System.out.println(Integer.toBinaryString(9));

        // nextbitbinaryset(s);
        // System.out.println(binarytoDecimal(s));
    }

    public static void nextbitbinaryset(String s) {

    }

    // Function for return there binary value
    public static int binarytoDecimal(String s) {
        int count = 0;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += Integer.parseInt(s.charAt(i) + "") * Math.pow(2, count);
            count++;
        }

        return sum;
    }
}
