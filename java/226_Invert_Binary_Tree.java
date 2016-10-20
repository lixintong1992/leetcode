/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode result = root;
        invert(root);
        return result;
    }
    void invert(TreeNode root){
        if (root == null) return;
        invert(root.left);
        invert(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
    }
}