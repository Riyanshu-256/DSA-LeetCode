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
// import java.util.*;

// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         // code here

//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new ArrayList<>();

//         preorder(p, list1);
//         preorder(q, list2);

//         return list1.equals(list2);
//     }

//     private void preorder(TreeNode root, List<Integer> list) {

//         if (root == null) {
//             list.add(null);
//             return;
//         }

//         list.add(root.val);
//         preorder(root.left, list);
//         preorder(root.right, list);
//     }
// }


class Solution {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // code here

        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}