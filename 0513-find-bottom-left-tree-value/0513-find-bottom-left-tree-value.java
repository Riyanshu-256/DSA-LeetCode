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
    public int findBottomLeftValue(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) return -1;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        List<Integer> level = new ArrayList<>();

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr == null) {

                ans.add(level);

                if (q.isEmpty())   // Last level complete
                    break;

                level = new ArrayList<>();
                q.offer(null);
                continue;
            }

            level.add(curr.val);

            if (curr.left != null)
                q.offer(curr.left);

            if (curr.right != null)
                q.offer(curr.right);
        }

        return ans.get(ans.size() - 1).get(0);
    }
}