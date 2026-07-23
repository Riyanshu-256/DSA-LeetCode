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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, path, ans);

        return ans;
    }

    public void dfs(TreeNode root, int targetSum,
                    List<Integer> path,
                    List<List<Integer>> ans) {

        if (root == null) {
            return;
        }

        // Add current node to the path
        path.add(root.val);

        // If it's a leaf node
        if (root.left == null && root.right == null) {

            if (targetSum == root.val) {
                ans.add(new ArrayList<>(path));
            }

        } else {

            dfs(root.left, targetSum - root.val, path, ans);
            dfs(root.right, targetSum - root.val, path, ans);
        }

        path.remove(path.size() - 1);
    }
}