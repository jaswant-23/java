import java.util.Arrays;

public class raj{
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1,1,0,1,0,1,0};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}