package sliding_apprach;

public class rotate_string {
    // Leetcode question 796
    /*
     * 796. Rotate String
     * Easy
     * Topics
     * Companies
     * 
     * Given two strings s and goal, return true if and only if s can become goal
     * after some number of shifts on s.
     * 
     * A shift on s consists of moving the leftmost character of s to the rightmost
     * position.
     * 
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abcde", goal = "cdeab"
     * Output: true
     * 
     * Example 2:
     * 
     * Input: s = "abcde", goal = "abced"
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 1 <= s.length, goal.length <= 100
     * s and goal consist of lowercase English letters.
     * 
     */
    public static void main(String[] args) {
        String s = "abcde";
        String d = "cdeab";
        System.out.println(check_isRotated_Str(s, d));
    }

    public static boolean check_is_rotated(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String concatenate = s + s;
        return concatenate.contains(t);
    }

    public static boolean check_isRotated_Str(String s, String t) {

        for (int i = 0; i < s.length(); i++) {
            String ans = rotate(t, i);
            if (ans.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String t, int k) {
        String temp = "";
        for (int i = k; i < t.length(); i++) {
            temp += t.charAt(i);
        }
        for (int i = 0; i < k; i++) {
            temp += t.charAt(i);
        }
        return temp;
    }
}
