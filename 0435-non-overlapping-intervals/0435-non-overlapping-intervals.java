class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // code here

        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] < end) {
                // overlap -> remove this interval
                count++;
            } else {
                // no overlap -> keep it
                end = intervals[i][1];
            }
        }

        return count;
    }
}