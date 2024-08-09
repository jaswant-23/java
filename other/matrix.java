package other;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
      
      
      
        // int[][] arr = {{1,0,1},{-8,-9,-1}};
        // int sum =0;

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         sum+=arr[i][j];
        //     }
        // }
        // System.out.println(sum);

        System.out.println("Enter the marks of the 5 Student");
        try (Scanner sc = new Scanner(System.in)) {
            int m1 = sc.nextInt();
            int m2 = sc.nextInt();
            int m3 = sc.nextInt();
            int m4 = sc.nextInt();
            int m5 = sc.nextInt();

            int sum = (m1+m2+m3+m4+m5);
            System.out.println("Here is the Total Marks of Student "+sum);

            float per = (sum*5)%100;
            System.out.println(per);
        }
    }
}
