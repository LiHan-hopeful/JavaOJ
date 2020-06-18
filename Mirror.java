public class Solution {
    public void Mirror(TreeNode root) {
          if(root == null){
            return;
        }
        if(root.left == null){
            root.left = root.right;
            root.right = null;
            Mirror(root.left);
            return;
        }
        if(root.right == null){
            root.right = root.left;
            root.left = null;
            Mirror(root.right);
            return;
        }
        TreeNode help = root.left;
        root.left = root.right;
        root.right = help;
        Mirror(root.left);
        Mirror(root.right);
        return;
    }
}