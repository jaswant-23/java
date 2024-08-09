package leetcode.easy;

public class first_occur_str {
    /*
     * 28. Find the Index of the First Occurrence in a String
     * Attempted
     * Easy
     * Topics
     * Companies
     * 
     * Given two strings needle and haystack, return the index of the first
     * occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     * 
     * Example 2:
     * 
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.
     * 
     * 
     * 
     * Constraints:
     * 
     * 1 <= haystack.length, needle.length <= 104
     * haystack and needle consist of only lowercase English characters.
     * 
     */
    public static void main(String[] args) {
        String s ="abc";
        String f="c";
        System.out.println(check_first_occur(s, f));
    }
    public static int check_first_occur(String s,String t){
        if(s.length()==t.length()){
            if( s.equals(t)){
                return 0;
            }
        }
        if(t.length()>s.length()){
            return -1;

        }
        int f=0,e=t.length();
        while(e-1<s.length()){
            String temp = s.substring(f, e);
            if(temp.equals(t)){
                return f;
            }
            f++;
            e++;
        }
        return -1;
    }
}
