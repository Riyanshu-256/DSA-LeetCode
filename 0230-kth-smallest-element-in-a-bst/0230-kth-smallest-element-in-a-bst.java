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
    public int kthSmallest(TreeNode root, int k) {
        // code here

        List<Integer> list = new ArrayList<>();

        if(root == null) return -1;
        preorder(root, list);

        Collections.sort(list);
         return list.get(k-1);
    }

    public void preorder(TreeNode root, List<Integer> list){

        if(root == null) return;

        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);
    }
}