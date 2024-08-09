package gfg.easy;

public class n_Meeting {
    public static void main(String[] args) {
        /*
         * N meetings in one room
         * Difficulty: EasyAccuracy: 45.3%Submissions: 260K+Points: 2
         * 
         * You are given timings of n meetings in the form of (start[i], end[i]) where
         * start[i] is the start time of meeting i and end[i] is the finish time of
         * meeting i. Return the maximum number of meetings that can be accommodated in
         * a single meeting room, when only one meeting can be held in the meeting room
         * at a particular time.
         * 
         * Note: The start time of one chosen meeting can't be equal to the end time of
         * the other chosen meeting.
         * 
         * Examples :
         * 
         * Input: n = 6, start[] = [1, 3, 0, 5, 8, 5], end[] = [2, 4, 6, 7, 9, 9]
         * Output: 4
         * Explanation: Maximum four meetings can be held with given start and end
         * timings. The meetings are - (1, 2), (3, 4), (5,7) and (8,9)
         * 
         * Input: n = 3, start[] = [10, 12, 20], end[] = [20, 25, 30]
         * Output: 1
         * Explanation: Only one meetings can be held with given start and end timings.
         * 
         * Expected Time Complexity: O(n*logn)
         * Expected Auxilliary Space: O(n)
         * 
         * Constraints:
         * 1 ≤ n ≤ 105
         * 0 ≤ start[i] < end[i] ≤ 106
         */
        int[] start ={1, 3, 0, 5, 8, 5};
        int[] end={2, 4, 6, 7, 9, 9};
        int count=0;
        if(start[0]<end[0])count++;
        int fs=start[0];
        int en=end[0];

        for (int i = 1; i < end.length; i++) {
            if(en<start[i] && start[i]<end[i]){
                count++;
                en=end[i];
            }
        }
        System.out.println(count);
    }
}
