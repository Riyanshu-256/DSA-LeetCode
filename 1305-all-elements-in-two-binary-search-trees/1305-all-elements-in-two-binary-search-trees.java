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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        // code here

        List<Integer> list = new ArrayList<>();
        inorder(root1, list);
        inorder(root2, list);

        Collections.sort(list);

        return list;
    }

    public void inorder(TreeNode root, List<Integer> list){

        if(root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);

    }
}