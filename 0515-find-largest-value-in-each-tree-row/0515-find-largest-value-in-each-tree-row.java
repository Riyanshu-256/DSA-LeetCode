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
    public List<Integer> largestValues(TreeNode root) {
        // code here

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null) return  new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);

        ArrayList<Integer> level = new ArrayList<>();

        while(!q.isEmpty()){

            TreeNode curr = q.poll();

            if(curr == null){
                ans.add(level);

                if(q.isEmpty()){
                    break;
                }

                level = new ArrayList<>();
                q.offer(null);
                continue;
            }

            level.add(curr.val);

            if(curr.left != null){
                q.offer(curr.left);
            }

            if(curr.right != null){
                q.offer(curr.right);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0; i<ans.size(); i++){
            
            int max = ans.get(i).get(0);

            for(int num : ans.get(i)){
                max = Math.max(max, num);
            }
            res.add(max);
        }

        return res;
    }
}