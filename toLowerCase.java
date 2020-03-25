class Solution {
public String toLowerCase(String str) {
        String res = "";
       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           if (ch >= 'A' && ch <= 'Z') {
               ch = (char) (ch + 32);
           }
           res += ch;
       }
       return res;
   }
}//实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
//示例 ：
//输入: "Hello"
//输出: "hello"

