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
//     public boolean isUnivalTree(TreeNode root) {
//         // code here

//         return check(root, root.val);
//     }
//     private boolean check(TreeNode root, int val){
//         if(root == null) return true;

//         if(root.val != val) return false;

//         return check(root.left, val) && check(root.right, val);
//     }
// }


class Solution {
    public boolean isUnivalTree(TreeNode root) {
        // code here

        HashMap<Integer, Integer> map = new HashMap<>();
        traverse(root, map);
        return map.size() == 1;
    }

    public void traverse(TreeNode root, HashMap<Integer, Integer> map){

        if(root == null) return;
        
        map.put(root.val, map.getOrDefault(root.val, 0)+1);

        traverse(root.left, map);
        traverse(root.right, map);

    }
}