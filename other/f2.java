package other;
public class f2 {
    /*
     * Find the N-th character
     * MediumAccuracy: 19.13%Submissions: 40K+Points: 4
     * 
     * Internship Alert!
     * New month-> Fresh Chance to top the leaderboard and get SDE Internship!
     * banner
     * 
     * Given a binary string s. Perform r iterations on string s, where in each
     * iteration 0 becomes 01 and 1 becomes 10. Find the nth character (considering
     * 0 based indexing) of the string after performing these r iterations (see
     * examples for better understanding).
     * 
     * Example 1:
     * 
     * Input:
     * s = "1100"
     * r = 2
     * n = 3
     * Output:
     * 1
     * Explanation:
     * After 1st iteration s becomes "10100101".
     * After 2nd iteration s becomes "1001100101100110".
     * Now, we can clearly see that the character at 3rd index is 1, and so the
     * output.
     * 
     * Example 2:
     * 
     * Input:
     * s = "1010"
     * r = 1
     * n = 2
     * Output:
     * 0
     * Explanation :
     * After 1st iteration s becomes "10011001".
     * Now, we can clearly see that the character at 2nd index is 0, and so the
     * output.
     */
    public static void main(String[] args) {
        //input 1010    --->  Output 10011001 and      * r = 1(no. of interation)   --> n = 2 (Return nth index char)
        String str ="111101"; //111101 2 3
        int r =2;
        int n = 3;
        String temp = "";
        // int tempn = 1;// It is No of Iteration
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='0'){
                  temp+="01";
                }else{
                  temp+="10";
                }
                // if(str.length()<temp.length()){
                //   break;
                // }
             }
             str="";
             str = temp;
             temp="";
        }
        System.out.println(str);
        System.out.println(str.charAt(n));

    }
}
