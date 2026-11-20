// ======================================
// LeetCode Problem: maximum depth of binary tree
// Language: java
// Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Synced by: LinkCode
// Date: 11/19/2026, 7:08:56 PM
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
    public int maxDepth(TreeNode root) {
        //return depth(root, 0);
        return root==null ? 0: Math.max(maxDepth(root.left), maxDepth(root.right))+1 ;
    }

    // public int depth(TreeNode root, int count){
    //     if(root==null)
    //         return count;
    //     int left = depth(root.left, count+1);
    //     int right = depth(root.right, count+1);

    //     return Math.max(left, right);
    // }
}