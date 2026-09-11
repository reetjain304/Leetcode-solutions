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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case 1: Both nodes are null
        if (p == null && q == null) {
            return true;
        }
        
        // Base case 2: One node is null while the other is not
        if (p == null || q == null) {
            return false;
        }
        
        // Base case 3: Values do not match
        if (p.val != q.val) {
            return false;
        }
        
        // Recursive step: Check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}