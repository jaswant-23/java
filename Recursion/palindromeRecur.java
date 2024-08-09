package Recursion;

public class palindromeRecur {
    public static void main(String[] args) {
        String s ="malayalam";
        System.out.println("Is palindrome:->"+isPalindrome_rec(s,0,s.length()-1));
    }
    public static boolean isPalindrome_rec(String str,int s,int e) {
         if(s>=e){
            return true;
        }
        if(str.charAt(e--)!=str.charAt(s++)){
            return false;
        }
        return isPalindrome_rec(str, s, e);
    }
}
