package leetcode.medium;

public class lee1254 {
    /*
     * 1249. Minimum Remove to Make Valid Parentheses ....-> Medium
     * Given a string s of '(' , ')' and lowercase English characters.
     * 
     * Your task is to remove the minimum number of parentheses ( '(' or ')', in any
     * positions ) so that the resulting parentheses string is valid and return any
     * valid string.
     * 
     * Formally, a parentheses string is valid if and only if:
     * 
     * It is the empty string, contains only lowercase characters, or
     * It can be written as AB (A concatenated with B), where A and B are valid
     * strings, or
     * It can be written as (A), where A is a valid string.
     * 
     * Input: s = "lee(t(c)o)de)"
     * Output: "lee(t(c)o)de"
     * Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
     * 
     * Input: s = "a)b(c)d"
     * Output: "ab(c)d"
     * 
     * Input: s = "))(("
     * Output: ""
     * Explanation: An empty string is also valid.
     * 
     * Constraints:
     * 1 <= s.length <= 105
     * s[i] is either'(' , ')', or lowercase English letter.
     * 
     */
    public static void main(String[] args) {
        /* Input: s = "lee(t(c)o)de)"
         * Output: "lee(t(c)o)de"   ------> Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
         */
        String s = "lee(t(c)o)de)";
        System.out.println(validParen(s));
    }
    public static String validParen(String s){
        String ans ="";

        int start =0;
        int end = s.length();

        while(start<end){
            
        }



















        // int i =0,n = s.length();
        // int count=0;
        // while(i<n){
        //     if(s.charAt(i)!='(' && s.charAt(i)!=')'){
        //         ans+=s.charAt(i)+"";
        //     }else if(s.charAt(i)=='('){
        //         count++;
        //         int j = i;
        //         String st ="";
        //         while(count!=0 && j<n){
        //             if(s.charAt(j)!='(' && s.charAt(j)!=')'){
        //                 st+=s.charAt(j);
        //             }
        //             else if(s.charAt(j)=='('){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        
        return ans;
    }
}
