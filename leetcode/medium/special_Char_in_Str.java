package leetcode.medium;

public class special_Char_in_Str {
    /*
     * 3120. Count the Number of Special Characters I
     * 
     * User Accepted: 17680
     * User Tried: 19278
     * Total Accepted: 18584
     * Total Submissions: 32231
     * Difficulty: Easy
     * 
     * You are given a string word. A letter is called special if it appears both in
     * lowercase and uppercase in word.
     * 
     * Return the number of special letters in word.
     * 
     * Input: word = "aaAbcBC"
     * Output: 3
     * The special characters in word are 'a', 'b', and 'c'.
     * Example 2:
     * Input: word = "abc"
     * Output: 0
     * No character in word appears in uppercase.
     * Example 3:
     * Input: word = "abBCab"
     * Output: 1
     * The only special character in word is 'b'.
     * Constraints:* 1 <= word.length <= 50 word consists of only lowercase and
     * uppercase English letters.
     */

    // Leetcode 3121 - Count the no of special Character in word String - ||
    /*
     * You are given a string word. A letter c is called special if it appears both
     * in lowercase and uppercase in word, and every lowercase occurrence of c
     * appears before the first uppercase occurrence of c.
     * 
     * Return the number of special letters in word.
     */
    public static void main(String[] args) {
        String word = "aaAbCBc";
        // System.out.println((int)'b');
        // System.out.println(no_Special_Char_str_3120(word));
        System.out.println(no_Special_Char_str_2_3121(word));
    }

    // Leetcode 3120 Count the no of Special character - |
    public static int no_Special_Char_str_3120(String s) {
        int[][] freq = new int[26][2];
        int count = 0;

        for (char is : s.toCharArray()) {
            if (is <= 'z' && is >= 'a') {
                freq[is - 'a'][0] = 1;
            } else if (is <= 'Z' && is >= 'A') {
                freq[is - 'A'][1] = 1;
            }
        }

        for (int[] arr : freq) {
            if (arr[0] == 1 && arr[1] == 1)
                count++;
        }
        return count;
    }

    // Leetcode 3121 - Count the no of special Character in word String - ||
    /*
     * You are given a string word. A letter c is called special if it appears both
     * in lowercase and uppercase in word, and every lowercase occurrence of c
     * appears before the first uppercase occurrence of c.
     * 
     * Return the number of special letters in word.
     */// "aaAbCBc"
    public static int no_Special_Char_str_2_3121(String s) {
        int freq[][] = new int[26][2];
        int ans = 0;

        for (char is : s.toCharArray()) {
            if (is <= 'z' && is >= 'a') {
                if (freq[is - 'a'][1] == 1 || freq[is - 'a'][0] == -1) {
                    freq[is - 'a'][0] = -1;
                    freq[is - 'a'][1] = -1;
                } else {
                    freq[is - 'a'][0] = 1;
                }
            } else if (is <= 'Z' && is >= 'A' && freq[is - 'A'][0] != -1 || freq[is - 'A'][1] != -1) {
                freq[is - 'A'][1] = 1;
            }
        }

        for (int[] arr : freq) {
            if (arr[0] == 1 && arr[1] == 1) {
                ans++;
            }
        }
        return ans;
    }
}
