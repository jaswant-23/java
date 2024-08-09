package leetcode.medium;

public class stickler_thief {
    /*
     * Back to Explore Page
     * Stickler Thief
     * MediumAccuracy: 37.98%Submissions: 215K+Points: 4
     * 
     * Stickler the thief wants to loot money from a society having n houses in a
     * single line. He is a weird person and follows a certain rule when looting the
     * houses. According to the rule, he will never loot two consecutive houses. At
     * the same time, he wants to maximize the amount he loots. The thief knows
     * which house has what amount of money but is unable to come up with an optimal
     * looting strategy. He asks for your help to find the maximum money he can get
     * if he strictly follows the rule. ith house has a[i] amount of money present
     * in it.
     * 
     * Example 1:
     * 
     * Input:
     * n = 5
     * a[] = {6,5,5,7,4}
     * Output:
     * 15
     * Explanation:
     * Maximum amount he can get by looting 1st, 3rd and 5th house. Which is
     * 6+5+4=15.
     * 
     * Example 2:
     * 
     * Input:
     * n = 3
     * a[] = {1,5,3}
     * Output:
     * 5
     * Explanation:
     * Loot only 2nd house and get maximum amount of 5.
     * 
     * Your Task:
     * Complete the functionFindMaxSum() which takes an array arr[] and n as input
     * which returns the maximum money he can get following the rules.
     * 
     * Expected Time Complexity:O(N).
     * Expected Space Complexity:O(1).
     * 
     * Constraints:
     * 1 ≤ n ≤ 105
     * 1 ≤ a[i] ≤ 104
     */
    public static void main(String[] args) {
        // int[] arr = { 6, 5, 5, 7, 4 };
        int[] arr = { 1,5,3 };
        System.out.println(max_profit(arr));
    }

    public static int max_profit(int[] arr) {
        // int n = arr.length;
        // if (n < 2) {
        //     return arr[0];
        // }
        // int maxAmount = Math.max(arr[0], arr[1]);
        // for (int i = 2; i < n; i++) {
        //     {
        //         if (i % 2 == 0) {
        //             maxAmount += arr[i];
        //         }
        //     }
        // }
        // return maxAmount;

        int profit = arr[0];
        int i = 1;
        int n = arr.length;
        while (i < n-1) {
            if((arr[i+1]+profit)>(arr[i])){
                profit+=arr[i+1];
                System.out.println(arr[i+1]);
                i+=2;
            }
        }
        return profit;
    }
}
