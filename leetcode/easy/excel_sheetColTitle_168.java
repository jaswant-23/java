package leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

public class excel_sheetColTitle_168 {
    /*
     * Here you need to find the the value with given integer value:->
     * A->1,B-2,C-3.....Z->26
     * AA->27,AB-28,AC-29.....AZ->52 BZ->78 CZ->104........>
     * 
     * ex I/p 30 then output = AD
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any value for you want character:->");
        int a = sc.nextInt();
        System.out.println("Here is character:->" + int_to_char_Fun(a));

        // System.out.println((char)701);// It will give from ASCII value defiend
    }

    public static String int_to_char_Fun(int a) {
        char[] ch = new char[27];
        for (int i = 1; i < ch.length; i++) {
            ch[i] = (char) (i + 64);
        }
        int div = a / 26;
        int mod = a % 26;
        return ch[div] + "" + ch[mod];
    }
}
