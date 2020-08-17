import java.util.*;


public class Solution {
    /**
     * 反转字符串
     * @param str string字符串 
     * @return string字符串
     */
    public String solve (String str) {
        // write code here
       if(str==null||str.equals("")) {
        	return str;
        }
        Stack<Character> st=new Stack<Character>();
        char [] c1 =str.toCharArray();
        for(int i=0;i<str.length();i++) {
        	st.push(c1[i]);  //字符Push入栈
        }
        int k=0;
        while(!st.isEmpty()) {
        	c1[k++]=st.pop();
        }
        return String.valueOf(c1);
    }
}