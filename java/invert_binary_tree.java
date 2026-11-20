// ======================================
// LeetCode Problem: invert binary tree
// Language: java
// Link: https://leetcode.com/problems/invert-binary-tree/
// Synced by: LinkCode
// Date: 11/20/2026, 3:34:38 PM
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
        if(root==null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left!=null)
                queue.offer(node.left);

            if(node.right!=null)
                queue.offer(node.right);
        }

        return root;    
    }

    public TreeNode invert(TreeNode node){
        if(node == null)
            return null;

        TreeNode left = invert(node.left);
        TreeNode right = invert(node.right);
        node.left=right;
        node.right=left;

        return node;




    }
}