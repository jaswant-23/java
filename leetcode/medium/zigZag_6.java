public class zigZag_6 {
   /*
    * 6. Zigzag Conversion
    * Medium
    * Topics
    * Companies
    * 
    * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
    * of rows like this: (you may want to display this pattern in a fixed font for
    * better legibility)
    * 
    * P A H N
    * A P L S I I G
    * Y I R
    * 
    * And then read line by line: "PAHNAPLSIIGYIR"
    * 
    * Write the code that will take a string and make this conversion given a
    * number of rows:
    * string convert(string s, int numRows);
    * Input: s = "PAYPALISHIRING", numRows = 3
    * Output: "PAHNAPLSIIGYIR"
    * 
    * Example 2:
    * 
    * Input: s = "PAYPALISHIRING", numRows = 4
    * Output: "PINALSIGYAHRPI"
    * Explanation:
    * P I N
    * A L S I G
    * Y A H R
    * P I
    * Example 3:
    * Input: s = "A", numRows = 1
    * Output: "A"
    * Constraints:
    * 1 <= s.length <= 1000
    * s consists of English letters (lower-case and upper-case), ',' and '.'.
    * 1 <= numRows <= 1000
    */
   public static void main(String[] args) {
      String s = "PAYPALISHIRING"; // Output: "PINALSIGYAHRPI"
      int k = 4;
      System.out.println(zigZag_Converion(s, k));

   }

   public static String zigZag_Converion(String s, int k) {
      if (s.length() <= k || k == 1) {
         return s;
      }
      StringBuilder[] strBul = new StringBuilder[k];

      // Here we can create stringbuilder on each index of srBul arr
      for (int i = 0; i < strBul.length; i++) {
         strBul[i] = new StringBuilder();
      }

      // now according to our need traverse the String and add the value in an String
      // (StringBuilder)
      int currentRow = 0;
      boolean direction = false;
      for (int i = 0; i < s.length(); i++) {
         strBul[currentRow].append(s.charAt(i));
         if (currentRow == 0 || currentRow == k - 1) {
            direction = !direction;// It will be change the bool value if is false then become true; and vicevers
         }
         currentRow += direction ? 1 : -1;
      }

      // Now finally merge the each string whose create row wise....
      StringBuilder ans = new StringBuilder();
      for (int i = 0; i < strBul.length; i++) {
         ans.append(strBul[i]);
      }
      return ans.toString();

   }
}
