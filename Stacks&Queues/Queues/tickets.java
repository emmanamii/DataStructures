//Small program that allows user to enter tickets, remove first ticket, and view the ticket queue

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class tickets {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<String>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("-----------------------------");
            System.out.println("Welcome to the ticket queue.");
            System.out.println("A: Add ticket");
            System.out.println("B: Process ticket");
            System.out.println("C: View ticket queue");
            System.out.println("D: Exit");
            System.out.println("-----------------------------");
            
            String choice = scanner.next().toUpperCase();
            scanner.nextLine();
            
            switch(choice){
                
                case "A":
                    System.out.println("Enter ticket name:");
                    String name = scanner.next();
                    queue.add(name);
                    System.out.println("Ticket added.");
                    break;
                    
                case "B":
                    if(!queue.isEmpty()){
                        System.out.println("Processing ticket:" + queue.poll());
                    } else{
                        System.out.println("Error: Ticket queue is empty.");
                    }
                    break;
                    
                case "C":
                    Integer i = 1;
                    for(String ticket: queue){
                        System.out.println(i + ": " + ticket);
                        i++;
                    }
                    break;
                    
                case "D":
                    return;
                    
                default:
                    System.out.println("Enter a letter choice:");
                    break;
            }
        }
        
    }
}
