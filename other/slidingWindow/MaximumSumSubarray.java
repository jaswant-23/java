package other.slidingWindow;
import java.util.ArrayList;

public class MaximumSumSubarray {
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr, int N) {
        long sum = 0, index = 0, ans = -1;

        for (int i = 0; i < N; i++) {
            sum += Arr.get(i);
            if (i >= k - 1) {
                ans = Math.max(ans, sum);
                sum -= Arr.get((int) index);
                index++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> Arr1 = new ArrayList<>();
        Arr1.add(1);
        Arr1.add(2);
        Arr1.add(3);
        Arr1.add(4);
        ArrayList<Integer> Arr2 = new ArrayList<>();
        Arr2.add(1);
        Arr2.add(4);
        Arr2.add(3);
        int k = 3;
        System.out.println("Maximum subarray sum for Arr1: " + maximumSumSubarray(k, Arr1, Arr1.size())); // Output: 9
        System.out.println("Maximum subarray sum for Arr2: " + maximumSumSubarray(k, Arr2, Arr2.size())); // Output: 8
    }
}
