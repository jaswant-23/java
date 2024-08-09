package codetantraTest;

import java.util.Scanner;

public class negativeArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr");
        int size = sc.nextInt();
        if(size<0){
            size = size*(-1);
            int[] arr = new int[size];
        }
        int[] arr = new int[size];
        System.out.println("Succsful array Created"+arr.length);
    }
}
