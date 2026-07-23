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
    public TreeNode increasingBST(TreeNode root) {
        // code here

        ArrayList<Integer> list = new ArrayList<>();

        preorder(root, list);

        Collections.sort(list);
        int n = list.size();

        TreeNode newRoot = new TreeNode(list.get(0));
        TreeNode curr = newRoot;

        for(int i=1; i<n; i++){
            curr.right = new TreeNode(list.get(i));
            curr = curr.right;
        }

        return newRoot;
    }

    public void preorder(TreeNode root, ArrayList<Integer> list){

        if(root == null) return;

        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);

    }
}