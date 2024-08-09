package other;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class max_sub_arr_sum_DistinctEle {
    public static void main(String[] args) {
        int[] arr={-3,-3,2,9,12,8,16,7,16,-3,2};
        int k =5;
        int sum =0;
        int max=0;

        Set<Integer> s1 = new HashSet<>();
    
        for (int i = 0; i < k; i++) {
            if(!s1.contains(arr[i])){
                sum+=arr[i];
                s1.add(arr[i]);
            }
        }
        // System.out.print(sum+"->");
        max=Math.max(max,sum);
        for (int i = 1; i < arr.length-k; i++) {
            s1.removeAll(s1);
            sum =0;
            for (int j = i; j < i+k; j++) {
                if(!s1.contains(arr[j])){
                    sum+=arr[j];
                    s1.add(arr[j]);
                }
                max=Math.max(max,sum);
                // System.out.print(sum+"->");
            }
        }
        System.out.println(max);

        // long sum = 0, index = 0, ans = -1;

        // for (int i = 0; i < arr.length; i++) {
        //     sum += arr[i];
        //     if (i >= k - 1) {
        //         ans = Math.max(ans, sum);
        //         sum -= arr[(int)index];
        //         index++;
        //     }
        // }
        // System.out.println(ans);

    }
}
