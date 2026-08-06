class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {

        int n = tasks.length;
        int m = shifts.length;

        long[] prefix = new long[n];
        prefix[0] = tasks[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + tasks[i];
        }

        long total = prefix[n - 1];
        long spent = 0;

        int[] ans = new int[m];

        for (int i = 0; i < m; i++) {
            spent += shifts[i];

            if (spent >= total) {
                spent = 0;
                ans[i] = 0;
                continue;
            }

            int left = 0, right = n - 1;
            while (left < right) {
                int mid = left + (right - left)/2;

                if (prefix[mid] > spent)
                    right = mid;
                else 
                    left = mid + 1;
                
            }
            ans[i] = n - left;
        }

        return ans;
    }
}