package gfg.potd;

import java.util.Arrays;

public class compare_friction {
    /*
     * Compare two fractions
     * Difficulty: EasyAccuracy: 54.74%Submissions: 12K+Points: 2
     * 
     * You are given a string str containing two fractions a/b and c/d, compare them
     * and return the greater. If they are equal, then return "equal".
     * 
     * Note: The string str contains "a/b, c/d"(fractions are separated by comma(,)
     * & space( )).
     * 
     * Examples
     * 
     * Input: str = "5/6, 11/45"
     * Output: 5/6
     * Explanation: 5/6=0.8333 and 11/45=0.2444, So 5/6 is greater fraction.
     * 
     * Input: str = "8/1, 8/1"
     * Output: equal
     * Explanation: We can see that both the fractions are same, so we'll return a
     * string "equal".
     * 
     * Input: str = "10/17, 9/10"
     * Output: 9/10
     * Explanation: 10/17 = 0.588 & 9/10 = 0.9, so the greater fraction is "9/10".
     * 
     * Expected Time Complexity: O(len|str|)
     * Expected Auxiliary Space: O(1)
     * 
     * Constraints:
     * 0<=a,c<=103
     * 1<=b,d<=103
     */
    public static void main(String[] args) {
        String str = "5/6,11/45";
        String strArr[] = str.split(",");
        String str1[] = strArr[0].split("/");
        String str2[] = strArr[1].split("/");


        int t0 = Integer.parseInt(str1[0]);
        int t1 = Integer.parseInt(str1[1]);
        int t2 = Integer.parseInt(str2[0]);
        int t3 = Integer.parseInt(str2[1]);

        double ans1 = (double) t0 / (double) t1;
        double ans2 = (double) t2 / (double) t3;
        if (ans1 > ans2) {
            System.out.println(strArr[0]);
        }else if (ans1==ans2){
            System.out.println("is equal");
        }else{
            System.out.println(strArr[1]);
        }

        // String str = "5/6";
        // String str1 = "11/45";
        // if (str.equals(str1)) {
        // System.out.println("it is equal");
        // }

        // String[] temp = str.split("/");
        // String[] temp2 = str1.split("/");
        // System.out.println(Arrays.toString(temp));
        // System.out.println(Arrays.toString(temp2));
        // System.out.println();
        // int t0 = Integer.parseInt(temp[0]);
        // int t1 = Integer.parseInt(temp[1]);
        // int t3 = Integer.parseInt(temp2[0]);
        // int t4 = Integer.parseInt(temp2[1]);
        // // System.out.println(t0+"-"+t1+"-"+t3+"-"+t4);
        // double f1= (double)t0/(double)t1;
        // double f2= (double)t3/(double)t4;
        // // System.out.println(f1 + "--" + f2);

        // if(f1>f2){
        // System.out.println(str);
        // }else{
        // System.out.println(str1);
        // }
    }
}
