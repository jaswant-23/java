package gfg.potd;

import java.util.ArrayList;
import java.util.Stack;

public class Braces_count {
    /*
     * Print Bracket Number
     * Difficulty: EasyAccuracy: 51.19%Submissions: 32K+Points: 2
     * 
     * Given a string str, the task is to find the bracket numbers, i.e., for each
     * bracket in str, return i if the bracket is the ith opening or closing bracket
     * to appear in the string.
     * 
     * Examples:
     * 
     * Input: str = "(aa(bdc))p(dee)"
     * Output: 1 2 2 1 3 3
     * Explanation: The highlighted brackets in
     * the given string (aa(bdc))p(dee) are
     * assigned the numbers as: 1 2 2 1 3 3.
     * 
     * Input: str = "(((()("
     * Output: 1 2 3 4 4 5
     * Explanation: The highlighted brackets in
     * the given string (((()( are assigned
     * the numbers as: 1 2 3 4 4 5
     * 
     * Expected Time Complexity: O(|str|)
     * Expected Auxiliary Space: O(|str|)
     * 
     * Constraints:
     * 1 <= |str| <= 105
     * str contains lowercase English alphabets, and '(', ')' characters
     * At any index, the number of opening brackets is greater than or equal to
     * closing brackets
     */
    public static void main(String[] args) {
        String s = "(((()(";
        ArrayList<Integer> li = get_braces_no(s);
        System.out.println(li);
    }
    public static ArrayList<Integer> get_braces_no(String s){
        int count=0;
        ArrayList<Integer> li = new ArrayList<>();
        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                count++;
                s1.push(count); 
                li.add(count);
            }
            if(s.charAt(i)==')'){
                int a=s1.pop();
                li.add(a);
            }
                
        }
        return li;
    }
}
