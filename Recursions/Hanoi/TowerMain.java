//Just declares the pegs (stacks) and calls each function

import java.util.Stack;

public class testing {

    public static void main(String[] args) {

        Stack<Integer> start = new Stack<>();   //Starting stack    #1
        Stack<Integer> temp = new Stack<>();    //Temporary stack   #2
        Stack<Integer> end = new Stack<>();     //Ending stack     #3
        
        Integer disc = 3;                      //Number of discs
        
        for(int i=disc;i>0;i--){               //Add the discs to the first stack
            start.push(i);
        }
        
        System.out.println("Before-----------------------------------");
        TowerOfHanoi.printTower(start,temp,end);
        System.out.println("-----------------------------------------");
        
        TowerOfHanoi.solveTower(disc, start, temp, end);

        System.out.println("After------------------------------------");
        TowerOfHanoi.printTower(start,temp,end);
        System.out.println("-----------------------------------------");
        
        System.out.println("Moves used:" + TowerOfHanoi.calculateMoves(disc));

    }


}
