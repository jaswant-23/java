package gfg.easy;

public class swapAlladjDigit {
    /*
     * Swap all odd and even bits
     * EasyAccuracy: 77.25%Submissions: 45K+Points: 2
     * 
     * Given an unsigned integer N. The task is to swap all odd bits with even bits.
     * For example, if the given number is 23 (00010111), it should be converted to
     * 43(00101011). Here, every even position bit is swapped with an adjacent bit
     * on the right side(even position bits are highlighted in the binary
     * representation of 23), and every odd position bit is swapped with an adjacent
     * on the left side.
     * 
     * Example 1:
     * 
     * Input: N = 23
     * Output: 43
     * Explanation:
     * Binary representation of the given number
     * is 00010111 after swapping
     * 00101011 = 43 in decimal.
     * 
     * Example 2:
     * 
     * Input: N = 2
     * Output: 1
     * Explanation:
     * Binary representation of the given number
     * is 10 after swapping 01 = 1 in decimal.
     * 
     * 
     * Your Task: Your task is to complete the function swapBits() which takes an
     * integer and returns an integer with all the odd and even bits swapped.
     * 
     * 
     * Expected Time Complexity: O(1).
     * Expected Auxiliary Space: O(1).
     * 
     * Constraints:
     * 1 ≤ N ≤ 10
     */
    public static void main(String[] args) {
        int x = 23;
        System.out.println(swapAdjecDigit(x));
        System.out.println(swapAdjecDigit2(x));
    }

    public static int swapAdjecDigit(int x) {
        char[] s = Integer.toBinaryString(x).toCharArray();
        if(s.length<2){
            return x;
        }
        System.out.println("Before Operation" + String.valueOf(s));
        int start = 0, end = 1;
        while (start < s.length && end < s.length) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start+=2;
            end+=2;
        }
        System.out.println("After operation" + String.valueOf(s));
        return Integer.parseInt(String.valueOf(s), 2);
    }
    public static int swapAdjecDigit2(int x) {
        char[] s = Integer.toBinaryString(x).toCharArray();
        if(s.length<2){
            return x;
        }
        System.out.println("Before Operation: " + String.valueOf(s));
        int start = 0, end = 1;
        while (start < s.length && end < s.length) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start += 2;
            end += 2;
        }
        System.out.println("After operation: " + String.valueOf(s));
        return Integer.parseInt(String.valueOf(s), 2);
    }
}
