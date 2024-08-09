package leetcode.medium;

public class longest_non_repating_subStr {
    /*
     * 3. Longest Substring Without Repeating Characters
     * Solved
     * Medium
     * Topics
     * Companies
     * Hint
     * 
     * Given a string s, find the length of the longest
     * substring
     * without repeating characters.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     * 
     * Example 2:
     * 
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     * 
     * Example 3:
     * 
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a
     * substring.
     * 
     * 
     * 
     * Constraints:
     * 
     * 0 <= s.length <= 5 * 104
     * s consists of English letters, digits, symbols and spaces.
     * 
     */
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(get_len_non_repating_str(s));
    }

    public static int get_len_non_repating_str(String s) {
        int[] freq = new int[128];
        for (int i = 0; i < freq.length; i++) {
            freq[i] = -1;
        }

        int len = 0;
        int st = 0;

        for (int i = 0; i < s.length(); i++) {
            int c= s.charAt(i);
            if (freq[c] != -1) {
                st = Math.max(st, freq[c]);
            }
            len = Math.max(len, i - st + 1);
            freq[c] = i + 1;
        }
        return len;
    }
}
