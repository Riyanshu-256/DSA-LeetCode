class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // Combination complete
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Choose numbers from start to n
        for (int i = start; i <= n; i++) {
            current.add(i);

            backtrack(i + 1, n, k, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}