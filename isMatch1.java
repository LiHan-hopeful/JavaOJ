class Solution {
   public boolean isMatch(String s, String p) {
    if (p.length() == 0) {
        return s.length() == 0;
    }
    if (p.length() > 1 && p.charAt(1) == '*') {
        // p的第二个字符是 '*'
        //1,字符"*"把前面的字符消掉，也就是匹配0次
        //2,字符"*"匹配1次或多次
        return isMatch(s, p.substring(2)) || (s.length() > 0 
        && comp(s, p)) && isMatch(s.substring(1), p);
    } else {
        // p的第二个字符不是 '*'，判断首字符是否相同，如果相同再从第二位继续比较
        return s.length() > 0 && comp(s, p) && (isMatch(s.substring(1), p.substring(1)));
    }
     }

//比较s的首字符和p的首字符是否匹配
   private boolean comp(String s, String p) {
        return s.charAt(0) == p.charAt(0) || p.charAt(0) == '.';
    }
}
