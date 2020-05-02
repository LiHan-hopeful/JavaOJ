import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class TestStackAndQueue {
    public boolean isValid(String s) {
        // key 左括号. value 该左括号匹配的右括号
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue; 
            }
            if (stack.empty()) {
                return false;
            }

            char top = stack.pop();
            //  1) 合法情况1
            if (top == '(' && c == ')') {
              continue;
            }
           //  2) 合法情况2
           if (top == '[' && c == ']') {
               continue;
           }
            //  3) 合法情况3
           if (top == '{' && c == '}') {
                continue;
           }
            if (map.get(top) == c) {
                continue;
            }
            // 除了上面的三种合法情况, 剩下的都是非法情况
            return false;
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
