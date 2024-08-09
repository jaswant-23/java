package leetcode.medium;

import java.util.LinkedList;
import java.util.List;

import gfg.easy.ArraysList;

public class oascals_trianngle {
    public static void main(String[] args) {
        // List<List<Integer>> li = new LinkedList<>();
        List<List<Integer>> li = get_pascals_List(5);
        System.out.println();
    }
    public static List<List<Integer>> get_pascals_List(int n){
        List<List<Integer>> li = new LinkedList<>();
        int count=1;
        while(n!=0){
            List<Integer> l2 = new LinkedList<>();
            while(count==n){
                List<Integer> l3 = new LinkedList<>();
                int temp = l2.get(count)+l2.get(count+1);
                l3.add(temp);
            }
        }
    }
} 
