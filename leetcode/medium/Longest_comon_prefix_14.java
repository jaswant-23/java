package leetcode.medium;

public class Longest_comon_prefix_14 {
    /*
     * 14. Longest Common Prefix
     * Easy
     * Topics
     * Companies
     * 
     * Write a function to find the longest common prefix string amongst an array of
     * strings. If there is no common prefix, return an empty string "".
     * Example 1:
     * Input: strs = ["flower","flow","flight"] Output: "fl"
     * Input: strs = ["dog","racecar","car"] Output: ""
     * Explanation: There is no common prefix among the input strings.
     * Constraints:
     * 1 <= strs.length <= 200
     * 0 <= strs[i].length <= 200
     * strs[i] consists of only lowercase English letters.
     * 
     */
    public static void main(String[] args) {
        // String[] arr = { "flower", "flow", "flight" };
        String[] arr = { "a" };
        System.out.println(longestCommon_prefix_str(arr));

        // System.out.println(get_equal_str("jaswant","jasbal")); // It give same common Prefix char in string like ---> jas
    }

    public static String longestCommon_prefix_str(String[] s) {
        if(s.length==0){
            return "";
        }
        else if(s.length==1){
            return s[0];
        }
        String ans ="";
        String temp = s[0];

        for (int i = 1; i < s.length; i++) {
            ans = get_equal_str(temp,s[i]);
            temp = ans;
        }
        return ans;
    }
    public static String get_equal_str(String s,String t){
        String ans ="";
        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if(s.charAt(i)==t.charAt(i)){
                ans+=s.charAt(i)+"";
            }else{
                break;
            }
        }
        return ans;
    }
}
