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
class Solution {
    public int maxLevelSum(TreeNode root) {
        // code here 
        
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);

        List<Integer> level = new ArrayList<>();

        while (q.size() > 1) {

            TreeNode curr = q.poll();

            if (curr == null) {

                ans.add(level);
                level = new ArrayList<>();

                q.offer(null);
                continue;
            }

            level.add(curr.val);

            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }
        }

        // Add last level
        ans.add(level);

        int maxSum = Integer.MIN_VALUE;
        int levelNo = 1;

        for (int i = 0; i < ans.size(); i++) {

            int sum = 0;

            for (int val : ans.get(i)) {
                sum += val;
            }

            if (sum > maxSum) {
                maxSum = sum;
                levelNo = i + 1;
            }
        }

        return levelNo;
    }
}