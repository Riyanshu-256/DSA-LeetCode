// class Solution {
//     public int minIncrementForUnique(int[] nums) {
//         // code here

//         HashSet<Integer> set = new HashSet<>();
//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {

//             int num = nums[i];

//             while (set.contains(num)) {
//                 num++;
//                 count++;
//             }

//             set.add(num);
//         }

//         return count;
//     }
// }


class Solution {
    public int minIncrementForUnique(int[] nums) {
        // code here

        Arrays.sort(nums);

        int count = 0;
        int next = 0;

        for (int num : nums) {

            if (num < next) {
                count += next - num;
            }

            next = Math.max(next, num) + 1;
        }

        return count;
    }
}