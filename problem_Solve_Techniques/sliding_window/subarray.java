package problem_Solve_Techniques.sliding_window;

import java.util.HashMap;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4,2 };
        // get_subarr(arr);
        // get_subarray_myMeth(arr);
        int val = get_fre(arr);
        int f = 0, e = arr.length - 1;
        int firstOcur = 0, endOccur = 0;
        while (f <= e) {
            if (arr[f] == val && firstOcur==0) {
                firstOcur = f;
            }
            if (arr[e] == val && endOccur==0) {
                endOccur = e;
            }
            f++;
            e--;
        }
        // return e;
        System.out.println("firstOccur_> " + firstOcur + " EndOccur: " + endOccur);
    }

    public static int get_fre(int[] arr) {
        int maxFreq = 0;
        int elementWithMaxFreq = arr[0];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxFreq) {
                maxFreq = frequencyMap.get(key);
                elementWithMaxFreq = key;
            }
        }

        return elementWithMaxFreq;
    }

    public static void get_subarray_myMeth(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                }
                System.out.print("-->");
            }
        }
    }

    public static void get_subarr(int[] arr) {
        int k = 3;
        for (int i = 0; i < arr.length - k; i++) {
            for (int j = 0; j < i + k; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
