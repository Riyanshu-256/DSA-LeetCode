/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

import java.util.*;

class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();
    int maxFreq = 0;

    public int[] findFrequentTreeSum(TreeNode root) {

        if (root == null) {
            return new int[0];
        }

        dfs(root);

        List<Integer> list = new ArrayList<>();

        for (int sum : map.keySet()) {
            if (map.get(sum) == maxFreq) {
                list.add(sum);
            }
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    private int dfs(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);

        int sum = root.val + leftSum + rightSum;

        map.put(sum, map.getOrDefault(sum, 0) + 1);

        maxFreq = Math.max(maxFreq, map.get(sum));

        return sum;
    }
}