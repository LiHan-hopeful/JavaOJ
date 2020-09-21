/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode convertBST(TreeNode root) {
        if(root == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        f(root, stack);
        TreeNode next = stack.pop();
        while(!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            cur.val += next.val;
            next = cur;
        }
        return root;
    }
    private void f(TreeNode root, Stack<TreeNode> stack) {
        if(root != null) {
            f(root.left, stack);
            stack.push(root);
            f(root.right, stack);
        }
    }
}

