package leetcode.medium;

public class max_point_can_achieve {
    public static void main(String[] args) {
        int[] arr={100,40,17,9,73,75};
        System.out.println(maxScore(arr,3));
    }
    public static int maxScore(int[] cardPoints, int k) {
        int s = 0, n = cardPoints.length;
        for (int i = n - k; i < n; ++i) {
            s += cardPoints[i];
        }
        int ans = s;
        for (int i = 0; i < k; ++i) {
            s += cardPoints[i] - cardPoints[n - k + i];
            ans = Math.max(ans, s);
        }
        return ans;
    }
}
