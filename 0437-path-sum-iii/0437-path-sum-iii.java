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
    public int pathSum(TreeNode root, int targetSum) {
        // code here 

        if(root == null){
            return 0;
        }

        return check(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int check(TreeNode root, long targetSum){

        if(root == null){
            return 0;
        }

        int count = 0;

        if(root.val == targetSum){
            count++;
        }

        count += check(root.left, targetSum - root.val);
        count += check(root.right, targetSum - root.val);

        return count;

    }
}