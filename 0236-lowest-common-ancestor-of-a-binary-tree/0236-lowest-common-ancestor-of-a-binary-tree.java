/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Create two lists to store the path from root to p and root to q
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        // Find and store the path from root to p
        findPath(root, p, pathP);

        // Find and store the path from root to q
        findPath(root, q, pathQ);

        TreeNode ans = null;

        // Compare both paths and store the last common node
        for (int i = 0; i < Math.min(pathP.size(), pathQ.size()); i++) {
            if (pathP.get(i) == pathQ.get(i)) {
                ans = pathP.get(i);
            } else {
                break;
            }
        }

        // Return the Lowest Common Ancestor
        return ans;
    }

    public boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path) {

        // If node is null, target is not found
        if (root == null) {
            return false;
        }

        // Add current node to the path
        path.add(root);

        // If target node is found, return true
        if (root == target) {
            return true;
        }

        // Search in left and right subtree
        if (findPath(root.left, target, path) ||
            findPath(root.right, target, path)) {
            return true;
        }

        // remove if target is not found in this path
        path.remove(path.size() - 1);

        return false;
    }
}