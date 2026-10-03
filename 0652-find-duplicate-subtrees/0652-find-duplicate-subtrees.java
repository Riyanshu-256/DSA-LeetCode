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

    HashMap<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        solve(root);
        return ans;
    }

    String solve(TreeNode root) {

        if (root == null) {
            return "#";
        }

        String left = solve(root.left);
        String right = solve(root.right);

        String key = root.val + "," + left + "," + right;

        int count = map.getOrDefault(key, 0);

        if (count == 1) {
            ans.add(root);
        }

        map.put(key, count + 1);

        return key;
    }
}