public class Solution {
    public int sumNumbers(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> numQueue = new LinkedList<Integer>();
        if(root == null) {
          return 0;
        }
        int res = 0;
        queue.add(root);
        numQueue.add(0);
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                root = queue.poll();
                int val = numQueue.poll() * 10 + root.val;
                if(root.left == null && root.right == null)  {
                    res += val;
                }
                if(root.left != null) {
                    queue.add(root.left);
                    numQueue.add(val);
                }
                if (root.right != null) {
                    queue.add(root.right);
                    numQueue.add(val);
                }
            }
        }
        return res;
    }
}