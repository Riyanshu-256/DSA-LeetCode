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
    public boolean isSymmetric(TreeNode root) {
        // code here

        if(root == null) return true;

        return checkSymmentry(root.left, root.right);
    }

    public boolean checkSymmentry(TreeNode left, TreeNode right){

        if(left == null && right == null) return true;
        if(left == null || right == null) return false;

        if(left.val != right.val) return false;

        return checkSymmentry(left.left, right.right) && checkSymmentry(left.right, right.left);
    }
}





















// class Solution {
//     public boolean isSymmetric(TreeNode root) {
//         if (root == null) {
//             return true;
//         }

//         return isMirror(root.left, root.right);
//     }

//     private boolean isMirror(TreeNode left, TreeNode right) {

//         if (left == null && right == null) {
//             return true;
//         }

//         if (left == null || right == null) {
//             return false;
//         }

//         if (left.val != right.val) {
//             return false;
//         }

//         return isMirror(left.left, right.right) &&
//                isMirror(left.right, right.left);
//     }
// }