package codetantraTest;

import java.util.Scanner;

public class missingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] numbers = new boolean[10];
        
        System.out.println("Enter digits (0-9), enter a number outside this range to stop:");

        while (true) {
            int num = scanner.nextInt();
            if (num < 0 || num > 9) {
                break;
            }
            numbers[num] = true;
        }

        System.out.println("Missing numbers:");

        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
