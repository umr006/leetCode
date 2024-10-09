package ValidParentheses;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char leftCh : s.toCharArray()) {
            if (leftCh == '(' || leftCh == '{' || leftCh == '[') {
                stack.push(leftCh);
            } else if (leftCh == ')' && !stack.isEmpty() && stack.peek() =='(') {
                stack.pop();
            } else if (leftCh == '}' && !stack.isEmpty() && stack.peek() =='{') {
                stack.pop();
            } else if (leftCh == ']' && !stack.isEmpty() && stack.peek() =='[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(((((((){}[])()[]{})))))"));
    }
}
