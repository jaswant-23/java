package codeChef.codeChef_contest;

import java.util.Arrays;
import java.util.Scanner;

public class max_EvenSum_subarr {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println(get_maxSumfun(new int[]{1,2,3}));

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >= 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            int count = 0;
            for (int i = 0; i < n; i++) {
                int sum = arr[i];
                int size =1;
                for (int j = i + 1; j < n; j++) {
                    if (sum % 2 == 0) {
                        count = Math.max(count, size);
                    }
                    sum += arr[j];
                    size++;
                }
            }
            System.out.println(count);
            t--;
        }

    }

    public static int get_maxSumfun(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            int size =1;
            for (int j = i + 1; j < arr.length; j++) {
                if (sum % 2 == 0) {
                    count = Math.max(count, size);
                }
                sum += arr[j];
                size++;
            }
        }
        return count;
    }
}
