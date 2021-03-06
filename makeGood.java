class Solution {
    public String makeGood(String s) {
        if(s.length() == 0 || s.length() == 1){
            return s;
        } 
        Stack<Character> stack = new Stack<>();
        //遍历s
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            //若栈为空，则直接压栈即可
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            //栈顶元素
            char tmp = stack.peek();
            //如果当前字母是栈顶元素对应的大写或小写，则弹出栈顶元素
            if(cur-tmp == 32 || cur-tmp == -32){
                stack.pop();
            }else{
                stack.push(cur);
            }
        }
        //将栈中元素依次弹出反转即可
        String res = "";
        while(!stack.isEmpty()){
            res += String.valueOf(stack.peek());
            stack.pop();
        }
        StringBuilder sb = new StringBuilder(res);
        return sb.reverse().toString();
    }
}

