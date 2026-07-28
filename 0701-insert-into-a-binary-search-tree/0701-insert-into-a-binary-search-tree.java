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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        // code here

        TreeNode temp = new TreeNode(val);
        TreeNode parent = null;
        TreeNode curr = root;

        while(curr != null){
            parent = curr;

            if(val < curr.val){
                curr = curr.left;
            } else if(val > curr.val) {
                curr = curr.right;
            } else {
                return root;  // if val is already exits, then simply return root
            }
        }

        if(parent == null) return temp;

        if(val < parent.val){
            parent.left = temp;
        } else {
            parent.right = temp;
        }

        return root;
    }
}