package leetcode.easy;

import java.util.HashMap;

public class make_two_arr_equal_suArr1460 {
    public static void main(String[] args) {
        int[] target = { 1, 2, 3, 4 };
        int[] arr = { 2, 4, 1, 3 };
        System.out.println(Is_able_to_make_equal(target, arr));
    }

    public static boolean Is_able_to_make_equal(int[] target, int[] arr) {
        HashMap<Integer, Integer> hi = new HashMap<>();
        for (int i : target) {
            hi.put(i, hi.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (hi.containsKey(i)) {
                hi.put(i, hi.get(i) - 1);
            }
        }
        for (int key : hi.keySet()) {
            if (hi.get(key) != 0) {
                return false;
            }
        }
        return true;
    }
    }
}
