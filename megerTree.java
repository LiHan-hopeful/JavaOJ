import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class node {
    public node left = null;
    public node right = null;
    public int value = 0;
};


public class Main {
    //此处孩子的编号从1开始计数
    public static void creatTree(node[] treeVec, int num)
    {
        Scanner scanner = new Scanner(System.in);
//按照顺序存储树的各节点，并建立相互之间的联系
        for (int i = 1; i <= num; i++)
        {
            int l, r, v;
            l = scanner.nextInt();
            r = scanner.nextInt();
            v = scanner.nextInt();
            if (l != 0)
                treeVec[i].left = treeVec[l];
            if (r != 0)
                treeVec[i].right = treeVec[r];
            treeVec[i].value = v;
        }
    }
    //合并树的节点
    public static node mergeTree(node root1, node root2)
    {
        if (root1 != null && root2 != null)
        {
            root1.left = mergeTree(root1.left, root2.left);
            root1.right = mergeTree(root1.right, root2.right);
            root1.value += root2.value;
            return root1;
        }
        return root1 == null ? root2 : root1;
    }
    //层序遍历，使用dfs算法
    public static void leverOrder(node root)
    {
        Queue<node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty())
        {
            node cur = q.poll();
            System.out.print(cur.value + " ");
            if (cur.left != null)
                q.offer(cur.left);
            if (cur.right != null)
                q.offer(cur.right);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        node[] treeVec1 = new node[n + 1];
        node[] treeVec2 = new node[m + 1];
        for (int i = 0; i <= n; i++) {
            treeVec1[i] = new node();
        }
        for (int i = 0; i <= m; i++) {
            treeVec2[i] = new node();
        }
        creatTree(treeVec1, n);
        creatTree(treeVec2, m);
        node root1 = null;
        node root2 = null;
        if (treeVec1.length > 1)
            root1 = treeVec1[1];
        if (treeVec2.length > 1)
            root2 = treeVec2[1];
        node root = mergeTree(root1, root2);
        leverOrder(root);
    }
}

