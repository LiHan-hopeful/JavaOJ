import java.util.Stack;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack<Character> stack = new Stack<>();
        if(n % 2 != 0) {
            return false;
        }
        for(int i = 0; i < n; i++) {
            char c = A.charAt(i);
            if(c != '(' && c != ')') {
                return false;
            }
            if(c == '(') {
                stack.push(c);
            }else if(c == ')') {
                if(stack.isEmpty()) {
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }
}