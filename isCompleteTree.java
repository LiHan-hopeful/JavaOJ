import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class InterviewTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean isSecondStep = false;

        // 针对这个树进行层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            // 针对当前节点进行访问(判断是否符合完全二叉树的要求)
            if (!isSecondStep) {
                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left == null && cur.right != null) {
                    return false;
                } else if (cur.left != null && cur.right == null) {
                    isSecondStep = true;
                    queue.offer(cur.left);
                } else {
                    isSecondStep = true;
                }
            } else {
                if (cur.left != null || cur.right != null) {
                    return false;
                }
            }
        }
        return true;
    }
    static List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return result;
        }
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int level) {
        if (level == result.size()) {
            result.add(new ArrayList<>());
        }
        List<Integer> row = result.get(level);
        row.add(root.val);
        if (root.left != null) {
            helper(root.left, level + 1);
        }
        if (root.right != null) {
            helper(root.right, level + 1);
        }
    }
}
