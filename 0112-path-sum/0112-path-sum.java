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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // code here

        if(root == null){
            return false;
        }
        return checkTargetSum(root, targetSum);
    }
    public boolean checkTargetSum(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }

        // If it is leaf node
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }

        return checkTargetSum(root.left, targetSum - root.val) ||
            checkTargetSum(root.right, targetSum - root.val);
    }
}