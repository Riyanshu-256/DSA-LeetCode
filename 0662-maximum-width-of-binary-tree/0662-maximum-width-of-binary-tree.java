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
    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Long> index = new LinkedList<>();

        q.add(root);
        index.add(0L);

        int max = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            long first = index.peek();
            long last = first;

            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();
                long curr = index.poll();

                last = curr;

                if (node.left != null) {
                    q.add(node.left);
                    index.add(2 * curr + 1);
                }

                if (node.right != null) {
                    q.add(node.right);
                    index.add(2 * curr + 2);
                }
            }

            max = Math.max(max, (int)(last - first + 1));
        }

        return max;
    }
}