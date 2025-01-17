package gfg.easy;

/*202. Happy Number
Easy
Topics
Companies

Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

 

Example 1:

Input: n = 19
Output: true
Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100 
1^2 + 0^2 + 0^2 = 1

Example 2:

Input: n = 2
Output: false

 

Constraints:

    1 <= n <= 231 - 1

 */
public class count {
    public static void main(String[] args) {

        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {

        // int mul = 1;
        int ans = 0;
        while (ans != 1) {
            while (n != 0) {
                double r = n % 10;
                ans += Math.pow(r, 2);
                n = n / 10;
            }
            if (ans == 1) {
                return true;
            }
            n = ans;
            ans=0;
        }

        return false;
    }
}
