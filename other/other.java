import java.util.ArrayList;
import java.util.List;

public class other {
    /*
     * Scored
     * 01Hrs
     * 11Min
     * Too Far For Comfort
     * 
     * This is the hard version of TOOFAREZ, and is worth 6060 points. Note that the
     * input formats of both problems differ slightly - in particular, this version
     * has an additional array AA as input.
     * 
     * An array AA of length MM is said to be prefix-balanced under the following
     * conditions:
     * 
     * Let SASA​ denote the set of all elements that appear in AA.
     * For each x∈SAx∈SA​, and index ii (1≤i≤M1≤i≤M), let fi(x)fi​(x) denote the
     * number of times xx appears among [A1,A2,…,Ai][A1​,A2​,…,Ai​].
     * That is, fi(x)fi​(x) denotes the frequency of xx in AA's prefix of length ii.
     * Then, AA is called prefix-balanced if, for every triple of integers
     * (x,y,i)(x,y,i) such that x,y∈SAx,y∈SA​ and 1≤i≤M1≤i≤M, we have
     * ∣fi(x)−fi(y)∣≤1∣fi​(x)−fi​(y)∣≤1
     * 
     * For example, the arrays [1,2,1][1,2,1] and [1,3,2,3][1,3,2,3] are
     * prefix-balanced, but [2,3,2,4][2,3,2,4] is not (the prefix of length 33
     * contains two occurrences of 22 and no occurrences of 44).
     * 
     * You are given an array AA of length NN, and an integer MM.
     * Every element of AA lies between 00 and MM.
     * 
     * Let KK denote the number of zeros in AA. There are MKMK arrays that can be
     * obtained by replacing every 00 in AA with an integer between 11 and MM.
     * How many of these MKMK arrays are prefix-balanced?
     * 
     * The answer might be large, so find it modulo 998244353998244353.
     * Input Format
     * 
     * The first line of input will contain a single integer TT, denoting the number
     * of test cases.
     * Each test case consists of two lines of input.
     * The first line of each test case contains two space-separated integers NN and
     * MM — the length of the array and the maximum allowed value.
     * The second line of each test case contains NN space-separated integers
     * A1,A2,…,ANA1​,A2​,…,AN​ — the elements of array AA.
     * 
     * Output Format
     * 
     * For each test case, output on a new line the number of ways of replacing the
     * zeros in AA, such that the resulting array is prefix-balanced, modulo
     * 998244353998244353.
     * Constraints
     * 
     * 1≤T≤1051≤T≤105
     * 1≤N≤5⋅1051≤N≤5⋅105
     * 1≤M≤5⋅1051≤M≤5⋅105
     * 0≤Ai≤M0≤Ai​≤M
     * The sum of NN and the sum of MM over all test cases won't exceed 5⋅1055⋅105.
     * 
     * Sample 1:
     * Input
     * Output
     * 
     * 3
     * 4 4
     * 3 0 4 0
     * 4 10
     * 1 1 0 0
     * 6 7
     * 0 1 0 2 3 0
     * 
     * 9
     * 1
     * 110
     * 
     * Explanation:
     * 
     * Test case 11: The 99 prefix-balanced arrays are:
     * [3,1,4,1],[3,1,4,2],[3,1,4,3],[3,1,4,4],[3,1,4,1],[3,1,4,2],[3,1,4,3],[3,1,4,
     * 4],
     * [3,2,4,1],[3,2,4,2],[3,2,4,3],[3,2,4,4],[3,2,4,1],[3,2,4,2],[3,2,4,3],[3,2,4,
     * 4],
     * [3,4,4,3][3,4,4,3]
     * 
     * Test case 22: The only possible prefix-balanced array is [1,1,1,1][1,1,1,1].
     */
    /*
     * Scored
     * 01Hrs
     * 10Min
     * ABC Conjecture 3
     * 
     * You are given a string SS of length NN, containing only the characters a, b,
     * and c.
     * 
     * In one move, you can modify SS as follows:
     * 
     * Choose three indices i,j,ki,j,k (1≤i<j<k≤∣S∣1≤i<j<k≤∣S∣) such that
     * Si=a,Sj=b,Sk=cSi​=a,Sj​=b,Sk​=c.
     * That is, choose some subsequence of SS that equals abc.
     * Then, delete either the a or the c from SS, that is, either index ii or index
     * kk.
     * Note that this reduces the length of SS by 11.
     * 
     * For example, if S=cbba‾cb‾ac‾cS=cbba​cb​ac​c, you can choose
     * i=4,j=6,k=8i=4,j=6,k=8 (the underlined indices), and then delete either index
     * 44 (obtaining S=cbbcbaccS=cbbcbacc) or index 88 (obtaining
     * S=cbbacbacS=cbbacbac).
     * 
     * Find the minimum number of moves that can be made on SS, such that it's
     * impossible to perform any further moves on the resulting string.
     * Input Format
     * 
     * The first line of input will contain a single integer TT, denoting the number
     * of test cases.
     * Each test case consists of two lines of input.
     * The first line of each test case contains a single integer NN — the length of
     * SS.
     * The second line of each test case contains the string SS of length NN.
     * 
     * Output Format
     * 
     * For each test case, output on a new line minimum possible number of moves
     * that can be made on SS, such that it's not possible to perform any further
     * moves.
     * Constraints
     * 
     * 1≤T≤1051≤T≤105
     * 1≤N≤3⋅1051≤N≤3⋅105
     * Si∈{’a’, ’b’, ’c’}Si​∈{’a’, ’b’, ’c’}
     * The sum of NN over all test cases won't exceed 3⋅1053⋅105.
     * 
     * Sample 1:
     * Input
     * Output
     * 
     * 3
     * 4
     * abcc
     * 9
     * cbcaacacb
     * 7
     * aabacbc
     * 
     * 1
     * 0
     * 2
     * 
     * Explanation:
     * 
     * Test case 11: Choose i=1,j=2,k=3i=1,j=2,k=3 and delete index 11. Now,
     * S=bccS=bcc and no more moves can be performed.
     * 
     * Test case 22: No moves can be performed for the given string, so the answer
     * is 00.
     * 
     * Test case 33: One optimal solution is as follows:
     * 
     * Choose i=2,j=6,k=7i=2,j=6,k=7, and delete index 77.
     * Now, S=aabacbS=aabacb.
     * Choose i=2,j=3,k=5i=2,j=3,k=5, and delete index 55.
     * Now, S=aababS=aabab, and no more moves can be performed.
     * 
     * It can be shown that using less than 22 moves is not possible.
     */
    public static List<Integer> spiralMat(int[][] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        int r = arr.length;
        int c = arr[0].length;
        int startRow = 0;
        int endRow = r - 1;
        int startCol = 0;
        int endCol = c - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse top row
            for (int col = startCol; col <= endCol; col++) {
                li.add(arr[startRow][col]);
            }
            startRow++;

            // Traverse right column
            for (int row = startRow; row <= endRow; row++) {
                li.add(arr[row][endCol]);
            }
            endCol--;

            // Traverse bottom row
            if (startRow <= endRow) { // Check if there are still rows remaining
                for (int col = endCol; col >= startCol; col--) {
                    li.add(arr[endRow][col]);
                }
                endRow--;
            }

            // Traverse left column
            if (startCol <= endCol) { // Check if there are still columns remaining
                for (int row = endRow; row >= startRow; row--) {
                    li.add(arr[row][startCol]);
                }
                startCol++;
            }
        }
        return li;
    }
}
