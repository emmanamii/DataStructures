//This program lets user enters as many items as they want into their stack.
//then, returns how many items had to be removed to retrieve an item.

import java.util.Scanner;
import java.util.Stack;

public class items {

    public static void main(String[] args) {
        //Creating the stack of books and using funcs
        
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        
        System.out.println("Welcome to your stack!");
        System.out.println("Enter your items. When finished, enter '0' ");
        
        while(true){
            String input = scanner.next();
            
            if(input.equals("0")){
                break;
            }
            stack.push(input.toLowerCase());
            
        }
        
        System.out.println("Enter the item you want to retrieve:");
        String item = scanner.next();
        Integer result = retrieveIndex(item, stack);
        System.out.println("We had to remove " + result + " items to reach " + item);
        //"items to reach" does not include item itself

    } 
    
    
    public static Integer retrieveIndex(String item, Stack<String> stack){
        Integer num = 0;
      
        while(!stack.empty()){
            if(stack.pop().equals(item.toLowerCase())){
                return num;
            }
            num++;
        }
        return num;
    }
}
