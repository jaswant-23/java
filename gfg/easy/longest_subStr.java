package gfg.easy;

import gfg.potd.removeduplicate_Str;

public class longest_subStr {
    /*
     * Longest Common Prefix in an Array
     * EasyAccuracy: 29.52%Submissions: 239K+Points: 2
     * 
     * Given an array of N strings, find the longest common prefix among all strings
     * present in the array.
     * 
     * 
     * Example 1:
     * 
     * Input:
     * N = 4
     * arr[] = {geeksforgeeks, geeks, geek,
     * geezer}
     * Output: gee
     * Explanation: "gee" is the longest common
     * prefix in all the given strings.
     * 
     * Example 2:
     * 
     * Input:
     * N = 2
     * arr[] = {hello, world}
     * Output: -1
     * Explanation: There's no common prefix
     * in the given strings.
     * 
     * 
     * Your Task:
     * You don't need to read input or print anything. Your task is to complete the
     * function longestCommonPrefix() which takes the string array arr[] and its
     * size N as inputs and returns the longest common prefix common in all the
     * strings in the array. If there's no prefix common in all the strings, return
     * "-1".
     * 
     * 
     * Expected Time Complexity: O(N*min(|arri|)).
     * Expected Auxiliary Space: O(min(|arri|)) for result.
     * 
     * 
     * Constraints:
     * 1 ≤ N ≤ 103
     * 1 ≤ |arri| ≤ 103
     */
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        // System.out.println(Longest_subStr(arr));
        System.out.println(gfg_sol(arr));
        
    }
    public static String gfg_sol(String[] arr){
          // code here
          String dummy= arr[0];
          int n = arr.length;
          for(int i=0;i<n;i++)
          {
              while(arr[i].indexOf(dummy)!=0)
              {
                System.out.println(dummy+" "+(dummy.length()-1));
                  dummy=dummy.substring(0,dummy.length()-1);
              }
              if(dummy.isEmpty())
              {
                  return "-1";
              }
          }
          return dummy;
    }
    public static String Longest_subStr(String[] s){
        String temp = s[0];
        for (int i = 1; i < s.length; i++) {
            temp = isequal_Str(temp,s[i]);
        }
        return temp;
    }

    public static String isequal_Str(String t,String k){
        int t1 =0;
        int t2 = 0;
        String sAns = "";

        while(t1<t.length() && t2<k.length()){
            if(t.charAt(t1)==k.charAt(t2)){
                sAns+=t.charAt(t1);
            }
            t1++;
            t2++;
        }
        return sAns;
    }

}
