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
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         // code here

//         List<Integer> list = new ArrayList<>();
//         if(root == null) return list;

//         list.addAll(postorderTraversal(root.left));
//         list.addAll(postorderTraversal(root.right));
//         list.add(root.val);

//         return list;
//     }
// }

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // code here

        List<Integer> list = new ArrayList<>();
        preorder(root, list);

        return list;
    }

    public void preorder(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }
        preorder(root.left, list);
        preorder(root.right, list);
        list.add(root.val);
    }
}