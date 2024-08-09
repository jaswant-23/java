package leetcode.easy;

public class climb_stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climb_stirs_rec(5));
    }
    public static int climb_stirs_rec(int n) {
        if(n<=2)return n;
        return climb_stirs_rec(n-1)+climb_stirs_rec(n-2);
    }
    public static int climbStairs(int n) {
        int prev1 = 1; // dp[i - 1]
        int prev2 = 1; // dp[i - 2]

    for (int i = 1; i <n; i++) {
     int dp = prev1 + prev2;
      prev2 = prev1;
      prev1 = dp;
    }

    return prev1;
    }
}
