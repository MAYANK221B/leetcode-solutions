// ======================================
// LeetCode Problem: balanced binary tree
// Language: java
// Link: https://leetcode.com/problems/balanced-binary-tree/
// Synced by: LinkCode
// Date: 11/26/2026, 2:22:58 AM
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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;

        int res = findHeight(root);
        if(res==-1||res==0)
            return false;
        else
            return true;
    }

    private int findHeight(TreeNode node){
        if(node==null)
            return 0;
        int dl= findHeight(node.left) +1;
        int dr = findHeight(node.right) + 1;
        if(dl==0||dr==0)
            return -1;
        if(Math.abs(dl-dr)>1)
            return -1;
        return Math.max(dl,dr);
    }
}