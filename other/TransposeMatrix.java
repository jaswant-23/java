package other;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printMatrix(arr);

        // System.out.println("Here Transpose Matrix:->");
        // transposeMatrix(arr);
        // printMatrix(arr);

        System.out.println("Here is the Rotation of Matrix:->");
        rotate90Degree(arr);
        printMatrix(arr);
    }

    public static void rotate90Degree(int[][] arr) {
        // Transpose the matrix
        transposeMatrix(arr);

        // Reverse each row
        for (int i = 0; i < arr.length; i++) {
            reverseArray(arr[i]);
        }
    }

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
