package leetcode.hard;

import java.util.ArrayList;

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<String>> result = getPossibleQueenAlignments(n);
        for (ArrayList<String> solution : result) {
            for (String row : solution) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<String>> getPossibleQueenAlignments(int n) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        int[] col = new int[n];
        int[] dia = new int[2 * n - 1];
        int[] revdia = new int[2 * n - 1];
        ArrayList<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }
        System.out.println(board);
        solveNQueens(0, n, col, dia, revdia, board, result);
        return result;
    }

    private static void solveNQueens(int row, int n, int[] col, int[] dia, int[] revdia, ArrayList<String> board, ArrayList<ArrayList<String>> result) {
        if (row == n) {
            result.add(new ArrayList<>(board));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isValid(row, j, n, col, dia, revdia)) {
                placeQueen(row, j, n, col, dia, revdia, board, true);
                solveNQueens(row + 1, n, col, dia, revdia, board, result);
                placeQueen(row, j, n, col, dia, revdia, board, false);
            }
        }
    }

    private static boolean isValid(int row, int col, int n, int[] cols, int[] diags, int[] revDiags) {
        return cols[col] == 0 && diags[row - col + n - 1] == 0 && revDiags[row + col] == 0;
    }

    private static void placeQueen(int row, int col, int n, int[] cols, int[] diags, int[] revDiags, ArrayList<String> board, boolean place) {
        char[] rowChars = board.get(row).toCharArray();
        rowChars[col] = place ? 'Q' : '.';
        board.set(row, new String(rowChars));
        cols[col] = place ? 1 : 0;
        diags[row - col + n - 1] = place ? 1 : 0;
        revDiags[row + col] = place ? 1 : 0;
    }
}
