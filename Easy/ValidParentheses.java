package Easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean validParentheses(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                System.out.println(top);
                System.out.println(c);
                if(c == ')' && top != '(') return false;
                if(c == ']' && top != '[') return false;
                if(c == '}' && top != '{') return false;

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({})";
        boolean result = validParentheses(s);
        System.out.println(result); // true
    }
}
