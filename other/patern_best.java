package other;

public class patern_best {
    public static void main(String[] args) {
        /*
         * 1
         * A B
         * 1 2 3
         * A B C D
         * 1 2 3 4 5
         */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(((char) (65 + j-1)) + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
