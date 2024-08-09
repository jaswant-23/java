package leetcode.medium;

public class long_Palin_substr {
    public static void main(String[] args) {
        String s = "babad";

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            temp+=s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
                temp+=s.charAt(j);
                if(isPalindrome_str_fun(temp)){
                    System.out.println(temp+" "); 
                    
                }
            }  
            temp="";
        }
    }
    public static boolean isPalindrome_str_fun(String t){
        int left = 0;
        int right = t.length() - 1;

        while (left < right) {
            if (t.charAt(left) != t.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
