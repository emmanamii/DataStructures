//This checks if parentheses () are balanced. Does not check for [] or {}

import java.util.Scanner;
import java.util.Stack;

public class Parantheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter equation:");
        String string = scanner.next();
        
        System.out.println(hasBalancedParentheses(string));
        
    }

    public static Boolean hasBalancedParentheses(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            char value = string.charAt(i);

            if (value == '(') {
                stack.push(value);
            }

            else if (value == ')') {

                if (stack.isEmpty()) {
                    // If stack is empty, there is no matching '('
                    return false;
                }
                // Pop the matching '(' from the stack
                stack.pop();
            }
        }

        // If stack is empty, parentheses are balanced; otherwise, they are not
        return stack.isEmpty();
    }
}
