import java.util.*;

public class Substr {
     
    void insert(Node root,String str,int i){
      if(i>=str.length())
          return;
      int index=str.charAt(i)-'a';
      if(root.children[index]==null){
          root.children[index]=new Node(str.charAt(i));
          if(i==str.length()-1)
              return;
      }
      insert(root.children[index], str, i+1);
    }
     
    boolean findSub(Node root,String str){
      for(int i=0;i<str.length();++i){
          Node node=root.children[str.charAt(i)-'a'];
          if(node==null||node.c!=str.charAt(i))
              return false;
          root=root.children[str.charAt(i)-'a'];
      }
      return true;
    }
     
    void build(Node root,String str){
      for(int i=0;i<str.length();++i){
          insert(root, str, i);
      }
    }
     
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] re=new boolean[n];
        if(p.length<1)
            return re;
        Node root=new Node('0');
        build(root, s);
        for(int i=0;i<p.length;++i){
            if(findSub(root, p[i]))
                re[i]=true;
            else {
                re[i]=false;
            }
        }
        return re;
    }
}
 
 
class Node {
    private static final int D_size=26;
     
    protected char c;
    protected Node[] children=new Node[D_size];
     
    Node(char c){
        this.c=c;
    }
}