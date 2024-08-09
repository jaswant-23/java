package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class kDistinct_Str_2053 {
    public static void main(String[] args) {
        String[] s = { "d","b","c","b","c","a" };
        int k = 2;
        System.out.println(get_K_Distinct_ele(s, k));
    }
    

    public static String get_K_Distinct_ele(String[] arr, int k) {
        int count = 0;
        HashMap<String, Integer> hi = new HashMap<>();
        for (String s : arr) {
            hi.put(s, hi.getOrDefault(s, 0) + 1);
        }
        System.out.println(hi);
        // Method 2: Using entrySet()
        // for (Map.Entry<String, Integer> entry : hi.entrySet()) {
        //     // System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        //     if(entry.getValue()==1)count++;
        //     if(count==k){
        //         return entry.getKey();
        //     }
        // }
        String ans="";
        for (int i = 0; i < arr.length; i++) {
            ans=arr[i];
            if(hi.get(ans)==1){
                count++;
            }
            if(count==k){
                return ans;
            }
        }
        return "";
    }
}
