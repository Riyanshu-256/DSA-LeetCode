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
    public boolean isEvenOddTree(TreeNode root) {

        if (root == null) return true;

        List<List<Integer>> ans = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        List<Integer> level = new ArrayList<>();

        while (!q.isEmpty()) {

            TreeNode curr = q.poll();

            if (curr == null) {

                ans.add(level);

                if (q.isEmpty()) break;

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

        // Check every level
        for (int i = 0; i < ans.size(); i++) {

            List<Integer> list = ans.get(i);

            for (int j = 0; j < list.size(); j++) {

                int val = list.get(j);

                if (i % 2 == 0) { // Even level

                    if (val % 2 == 0)
                        return false;

                    if (j > 0 && val <= list.get(j - 1))
                        return false;

                } else { // Odd level

                    if (val % 2 != 0)
                        return false;

                    if (j > 0 && val >= list.get(j - 1))
                        return false;
                }
            }
        }

        return true;
    }
}