package other.graph;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[][] arr = { {0,1},{ 0, 2 },{ 1, 3 }, { 2, 3 }, { 3, 4 }, { 4,5 }, { 4,6} ,{6,7},{5,7}};
        get_direction(arr);
    }

    public static void get_direction(int[][] arr) {
        // if graph is weighted then assign to 1 where i==j
        int[][] ans = new int[8][8];
        for (int i = 0; i <arr.length; i++) {
            int[] dest=new int[2];
            int c=0;
            for (int j = 0; j < 2; j++) {
                dest[c++]=arr[i][j];
            }
            ans[dest[0]][dest[1]]=1;
            ans[dest[1]][dest[0]]=1;
        }
        for (int[] is : ans) {
            System.out.println(Arrays.toString(is));
        }
    }
}
