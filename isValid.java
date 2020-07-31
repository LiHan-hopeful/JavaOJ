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

        //  创建一个栈. 栈中保存字符类型即可
        Stack<Character> stack = new Stack<>();
        //  循环遍历字符串中的每个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 判定 c 是否是左括号. 如果是左括号, 就入栈
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue; // 进入下次循环, 取出下一个字符
            }
            if (stack.empty()) {
                // 如果发现当前字符不是左括号, 并且栈又为空, 此时也说明字符串非法.
                return false;
            }
            // 判定 c 是否是右括号. 如果是右括号, 就取出栈顶元素来对比一下
            char top = stack.pop();

            if (map.get(top) == c) {
                continue;
            }
            return false;
        }
        // 遍历完字符串之后, 还得看下栈是否为空. 空栈才能是合法的字符串.
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
