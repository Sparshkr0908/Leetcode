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
    public int maxDepth(TreeNode root) {
        return helperFcn(root);
    }

    private int helperFcn(TreeNode root){
        if(root==null){
            return 0;
        }

        int rootLeft = helperFcn(root.left);
        int rootRight = helperFcn(root.right);

        return Math.max(rootLeft, rootRight) + 1;
    }
}