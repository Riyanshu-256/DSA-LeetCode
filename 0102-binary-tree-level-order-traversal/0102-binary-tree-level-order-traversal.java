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
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // code here

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);

        List<Integer> level = new ArrayList<>();

        while (q.size() > 1) {

            TreeNode curr = q.poll();

            if (curr == null) {

                ans.add(level);
                level = new ArrayList<>();

                q.offer(null);
                continue;
            }

            level.add(curr.val);

            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }
        }

        // Add the last level
        ans.add(level);

        return ans;
    }
}