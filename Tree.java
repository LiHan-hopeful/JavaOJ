package Tree;


import java.util.*;


class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }
  public class Solution {
      public LinkedList<Integer> preOrder(TreeNode root){
          LinkedList<TreeNode> stack = new LinkedList<>();
          LinkedList<Integer> output = new LinkedList<>();
          if (root == null) {
              return output;
          }

          stack.add(root);
          while (!stack.isEmpty()) {
              TreeNode node = stack.pollLast();
              output.add(node.val);
              if (node.right != null) {
                  stack.add(node.right);
              }
              if (node.left != null) {
                  stack.add(node.left);
              }
          }
          return output;
      }

    public List<Integer> inOrder(TreeNode root){
          List < Integer > res = new ArrayList< >();
          Stack< TreeNode > stack = new Stack < > ();
          TreeNode curr = root;
          while (curr != null || !stack.isEmpty()) {
              while (curr != null) {
                  stack.push(curr);
                  curr = curr.left;
              }
              curr = stack.pop();
              res.add(curr.val);
              curr = curr.right;
          }
          return res;
      }

      public List <Integer> postOrder(TreeNode root){
          LinkedList<TreeNode> stack = new LinkedList<>();
          LinkedList<Integer> output = new LinkedList<>();
          if (root == null) {
              return output;
          }

          stack.add(root);
          while (!stack.isEmpty()) {
              TreeNode node = stack.pollLast();
              output.addFirst(node.val);
              if (node.left != null) {
                  stack.add(node.left);
              }
              if (node.right != null) {
                  stack.add(node.right);
              }
          }
          return output;

      }


      public static void main(String[] args) {
          Solution s=new Solution();
          TreeNode root = new TreeNode(1);
          root.left=new TreeNode(2);
          root.right=new TreeNode(5);
          root.left.left=new TreeNode(3);
          root.left.right=new TreeNode(4);

          System.out.println(s.preOrder(root));
          System.out.println(s.inOrder(root));
          System.out.println(s.postOrder(root));

      }

  }
