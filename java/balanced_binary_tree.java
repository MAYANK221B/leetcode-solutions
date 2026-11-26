// ======================================
// LeetCode Problem: balanced binary tree
// Language: java
// Link: https://leetcode.com/problems/balanced-binary-tree/
// Synced by: LinkCode
// Date: 11/26/2026, 2:53:56 AM
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
    boolean result = true;
    public boolean isBalanced(TreeNode root) {
        int a = height(root);
        return result;
    }

    private int height(TreeNode node){
        if(node == null || !result)
            return 0;
        int left = height(node.left);
        if(!result)
            return 0;
        int right = height(node.right);
        if(Math.abs(left-right)>1)
            result = false;
        return Math.max(left, right)+1;

        
    }
}