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


/*
 * Diameter = max(
 *     height(left) + height(right),
 *     diameter(left),
 *     diameter(right)
 * )
 *
 * maxDepth() gives the height of each subtree.
 * We check every node because the longest path may pass through
 * the current node OR be completely inside one of its subtrees.
 */

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);


        return Math.max(
            leftHeight + rightHeight,
            Math.max(
                diameterOfBinaryTree(root.left),
                diameterOfBinaryTree(root.right)
            )
        ); 
    }

    public int maxDepth(TreeNode root) {
        if (root==null) return 0 ;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}
