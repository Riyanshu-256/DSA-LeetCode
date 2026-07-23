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
    public int findSecondMinimumValue(TreeNode root) {
        // code here

        ArrayList<Integer> list = new ArrayList<>();

        if(root == null) return -1;

        preorder(root, list);

        Collections.sort(list);

        int firstMin = list.get(0);

        for(int num : list){
            if(num > firstMin){
                return num;
            }
        }
        return -1;
    }

    public void preorder(TreeNode root, ArrayList<Integer> list){

        if(root == null) return;

        list.add(root.val);
        preorder(root.left, list);
        preorder(root.right, list);

    }
}