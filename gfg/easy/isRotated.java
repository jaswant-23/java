package gfg.easy;

import java.util.Arrays;

import leetcode.medium.reverseString;

public class isRotated {
    /*
     * Check if string is rotated by two places
     * EasyAccuracy: 32.7%Submissions: 212K+Points: 2
     * 
     * Matrix Partners India: Exclusive Job-A-Thon | Apply to 15+ Companies via 1
     * Hiring Challenge | Starting from 29th April onwards
     * banner
     * 
     * Given two strings a and b. The task is to find if the string 'b' can be
     * obtained by rotating (in any direction) string 'a' by exactly 2 places.
     * 
     * Example 1:
     * 
     * Input:
     * a = amazon
     * b = azonam
     * Output:
     * 1
     * Explanation:
     * amazon can be rotated anti-clockwise by two places, which will make it as
     * azonam.
     * 
     * Example 2:
     * 
     * Input:
     * a = geeksforgeeks
     * b = geeksgeeksfor
     * Output:
     * 0
     * Explanation:
     * If we rotate geeksforgeeks by two place in any direction, we won't get
     * geeksgeeksfor.
     * 
     * Your Task:
     * The task is to complete the function isRotated() which takes two strings as
     * input parameters and checks if given strings can be formed by rotations. The
     * function returns true if string 1 can be obtained by rotating string 2 by two
     * places, else it returns false.
     * 
     * Expected Time Complexity: O(N).
     * Expected Auxilary Complexity: O(N).
     * Challenge: Try doing it in O(1) space complexity.
     * 
     * Constraints:
     * 1 ≤ length of a, b ≤ 105
     */
    public static void main(String[] args) {
        String a = "daxjheq";
        String b = "eqdaxjh";
        System.out.println("here is the final:->"+reverseWords("i.like.this.program.very.much"));

        System.out.println("Is rotated by 2 plcae:->" + isRotated_str(a, b));
    }

    public static boolean isRotated_str(String s, String t) {
        String temp = "";
        temp = s.substring(2);
        temp = temp + s.substring(0, 2);
        if (!temp.equals(t)) {
            temp = "";
            temp = s.substring(s.length() - 2, s.length());
            temp = temp + s.substring(0, s.length() - 2);
        }
        System.out.println(temp);
        return temp.equals(t);
    }

    public static String reverseWords(String S) {
        // code here
        String ans[] = S.split("\\.");
        System.out.println(Arrays.toString(ans));
        String finalAns = "";
        for (int i = ans.length-1; i >= 0; i--) {
            finalAns += ans[i]+" ";
        }
        return finalAns;
    }
}
