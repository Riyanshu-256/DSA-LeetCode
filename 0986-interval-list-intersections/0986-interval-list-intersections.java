class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        // code here

        ArrayList<int[]> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length && j < secondList.length) {

            // Intersection start
            int start = Math.max(firstList[i][0], secondList[j][0]);

            // Intersection end
            int end = Math.min(firstList[i][1], secondList[j][1]);

            // Is valid intersection
            if (start <= end) {
                ans.add(new int[]{start, end});
            }

            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}