// ======================================
// LeetCode Problem: invert binary tree
// Language: java
// Link: https://leetcode.com/problems/invert-binary-tree/
// Synced by: LinkCode
// Date: 11/20/2026, 2:46:49 PM
// ======================================


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
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }

    public TreeNode invert(TreeNode node){
        if(node == null)
            return null;

        TreeNode leftt = invert(node.left);
        TreeNode rightt = invert(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        return node;




    }
}