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
    public List<TreeNode> generateTrees(int n) {
        return solve(1, n);
    }

    private List<TreeNode> solve(int start, int end) {

        List<TreeNode> ans = new ArrayList<>();

        // No node
        if (start > end) {
            ans.add(null);
            return ans;
        }

        // Har value ko root banayenge
        for (int i = start; i <= end; i++) {

            // Left subtree
            List<TreeNode> left = solve(start, i - 1);

            // Right subtree
            List<TreeNode> right = solve(i + 1, end);

            // Left × Right combinations
            for (TreeNode l : left) {
                for (TreeNode r : right) {

                    TreeNode root = new TreeNode(i);

                    root.left = l;
                    root.right = r;

                    ans.add(root);
                }
            }
        }

        return ans;
    }
}