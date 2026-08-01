class Solution {
    public int minimumPairRemoval(int[] nums) {
        // code here

        ArrayList<Integer> arr = new ArrayList<>();

        for (int x : nums) {
            arr.add(x);
        }

        int count = 0;

        while (!sorted(arr)) {

            int idx = 0;
            int min = arr.get(0) + arr.get(1);

            for (int i = 0; i < arr.size() - 1; i++) {
                int sum = arr.get(i) + arr.get(i + 1);

                if (sum < min) {
                    min = sum;
                    idx = i;
                }
            }

            arr.set(idx, min);
            arr.remove(idx + 1);

            count++;
        }

        return count;
    }

    private boolean sorted(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}