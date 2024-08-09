package leetcode.medium;

public class long_subStr_uniq_3 {
    // Here you need to find the Longest substring withoud repeating any character
    // leetcode que no : 3
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(len_long_subStr_uniq(s));
    }

    public static int len_long_subStr_uniq(String s) {
        int maxLen=0;
        String temp="";

        for (int i = 0; i < s.length(); i++) {
            temp+=s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                if(!temp.contains(s.charAt(j)+"")){
                    temp+=s.charAt(j);
                }else{
                    System.out.println(temp);
                    break;
                }
            }
            maxLen = Math.max(maxLen, temp.length());
            temp="";
        }
        return maxLen;
    }
   
}
