package com.mycompany.recursions;

import java.util.Scanner;

public class Recursions {

    public static void main(String[] args) {
        //Used a while loop for easier program interaction :p
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Which function would you like to run?:");
            System.out.println("A: strLength()");
            System.out.println("B: factorial()");
            System.out.println("C: exponent()");
            System.out.println("D: Exit.");
            
            String choice = scanner.next().toUpperCase();
            scanner.nextLine();
            
            switch(choice){
                
                case "A":
                    //strlength();
                    System.out.println("Enter a string:");
                    String string = scanner.next();
                    System.out.println("Length: "+ Functions.strLength(string));
                    break;
                    
                case "B":
                    //factorial();
                    System.out.println("Enter an integer:");
                    Integer integer = scanner.nextInt();
                    System.out.println(integer + "'s factorial: " + Functions.factorial(integer));
                    break;
                    
                case "C":
                    //exponent();
                    System.out.println("Enter the integer:");
                    Integer integer1= scanner.nextInt();
                    System.out.println("Enter the exponent:");
                    Integer integer2 = scanner.nextInt();
                    System.out.println(integer1 + "^"+ integer2 + "'s value: " + Functions.exponent(integer1,integer2));
                    break;
                    
                case "D":
                    System.out.println("Exitting...");
                    return;
                    
                default:
                    System.out.println("Invalid: Please enter a letter.");
                    
            }
            
            
            
        }
    }
}

