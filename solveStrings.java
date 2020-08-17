import java.util.*;


public class Solution {
    /**
     * 旋转字符串
     * @param A string字符串 
     * @param B string字符串 
     * @return bool布尔型
     */
    public boolean solve (String A, String B) {
        // write code here
        //方法一：将两个A字符串拼接成一个字符串，判断B字符串是否为其子串
//         if(A.length()!=B.length()) return false;
//        return (A+A).contains(B);
        //方法二：根据题意进行操作比较
        int size = A.length();
        for (int i = 0; i < size; i++) {
            String first = A.substring(0, 1);
            String last = A.substring(1, size);
            A = last + first;
            if (A.equals(B)) {
                return true;
            }
        }
        return false;
    }
}