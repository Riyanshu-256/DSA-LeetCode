import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // code here
        
        int n = intervals.length;
        if (n == 0) return 0;

        // Sort by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);  // [[1,2], [2,3], [1,3], [3,4]]


        int count = 0;
        int prevEnd = intervals[0][1];  // end of first interval [1,2] => 2

        for (int i = 1; i < n; i++) {
            
            if (intervals[i][0] < prevEnd) {
                // Overlapping → remove this interval
                count++;
            } else {
                // No overlap → update prevEnd
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }
}