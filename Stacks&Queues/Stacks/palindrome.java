
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        
        System.out.println("Enter a string:");
        String string = scanner.next();
        
        Stack<Character> stack = fillStack(string);
        
        String newString = buildReverse(stack);
        
        System.out.println(newString);
        System.out.println(isPalindrome(string,newString));
        
    }

    
    public static Stack<Character> fillStack(String string){
        Stack<Character> stack = new Stack<>();

        for(int i =0; i<string.length();i++){
            stack.push(string.charAt(i));
        }
        return stack;
    }
   
    
    public static String buildReverse(Stack<Character> stack){
        StringBuilder result = new StringBuilder();
        while(!stack.empty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
    
    public static boolean isPalindrome(String original, String reversed){
        
        return original.equalsIgnoreCase(reversed);
    }
}
