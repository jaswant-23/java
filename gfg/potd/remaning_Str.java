package gfg.potd;

public class remaning_Str {
    public static void main(String[] args) {
        /*
         * Remaining String
         * Difficulty: EasyAccuracy: 17.06%Submissions: 40K+Points: 2
         * 
         * Given a string s without spaces, a character ch and an integer count. Your
         * task is to return the substring that remains after the character ch has
         * appeared count number of times.
         * Note: Assume upper case and lower case alphabets are different. “ ”(Empty
         * string) should be returned if it is not possible, or the remaining substring
         * is empty.
         * 
         * Examples:
         * 
         * Input: s = "Thisisdemostring", ch = 'i', count = 3
         * Output: ng
         * Explanation: The remaining substring of s after the 3rd
         * occurrence of 'i' is "ng", hence the output is ng.
         * 
         * Input: s = "Thisisdemostri", ch = 'i', count = 3
         * Output: " "
         * Explanation: The 3rd occurence of 'i' is at the last index. In this case the
         * remaining substring is empty, hence we return empty string.
         * 
         * Input: s = "abcd", ch = 'x', count = 2
         * Output: " "
         * Explanation: The character x is not present in the string, hence we return
         * empty string.
         * 
         * Expected Time Complexity: O(|s|)
         * Expected Auxiliary Space: O(1)
         * 
         * Constraints:
         * 1<= s.length()<=105
         * 1<=count<=s.length()
         * s[i] is both upper case and lower case
         */
        String s = "Thisisdemostring";
        char ch = 'i';
        int count = 3;
        System.out.println(printString(s,ch,count));

    }
    public static String printString(String s, char ch, int count) {
        // code here
        String ans="";
        int n=s.length()-1;
        int firstOccur=0;
        for(int i =0;i<=n;i++){
            if((s.charAt(i)==ch)){
                count--;
                firstOccur=i;
            }
            if(count==0){
                break;
            }
        }
       ans = s.substring(firstOccur,n);
       return ans;
    }
}
