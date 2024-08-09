package leetcode.medium;

public class reverseString {
    /*
     * 151. Reverse Words in a String
     * Medium
     * Topics
     * Companies
     * 
     * Given an input string s, reverse the order of the words.
     * 
     * A word is defined as a sequence of non-space characters. The words in s will
     * be separated by at least one space.
     * 
     * Return a string of the words in reverse order concatenated by a single space.
     * 
     * Note that s may contain leading or trailing spaces or multiple spaces between
     * two words. The returned string should only have a single space separating the
     * words. Do not include any extra spaces.
     * 
     * Input: s = "the sky is blue"
     * Output: "blue is sky the"
     * 
     * Input: s = "  hello world  "
     * Output: "world hello"
     * Explanation: Your reversed string should not contain leading or trailing
     * spaces.
     * 
     * Input: s = "a good   example"
     * Output: "example good a"
     * Explanation: You need to reduce multiple spaces between two words to a single
     * space in the reversed string.
     */

    public static void main(String[] args) {
        String s = "the    sky is        blue";

        s = s.replaceAll("\\s+", " ").trim(); // remove extra white spaces from the string
        System.out.println(s);

        String temp = "";
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else {
                reversed += reverseString_fun(temp) + " ";
                temp = "";
            }
        }
        reversed += reverseString_fun(temp); // Add the last word
        
        System.out.println(reversed);
    }

    public static String reverseString_fun(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
