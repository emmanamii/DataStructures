//Game logic + prints current tower + calculate moves
//https://www.mathsisfun.com/games/towerofhanoi.html

import java.util.Stack;

public class TowerOfHanoi {
    
    public static void printTower(Stack<Integer> start, Stack<Integer> temp, Stack<Integer> end){
        System.out.println("A: " + start);
        System.out.println("B: " +temp);
        System.out.println("C: " +end);
    }
    public static Integer calculateMoves(Integer n){
        
        if(n==3){
            return 7;   //3 discs = 7 moves
        }
        return 1+ 2* calculateMoves(n-1);
    }
    
    public static void solveTower(Integer n, Stack<Integer> start, Stack<Integer> temp, Stack<Integer> end){

        if(n==1){                           //if we only have 1 disk left to move, move it to ending peg.
            Integer disc = start.pop();     //from the recursion, the last disc will always be on the starting peg.
            end.push(disc);
            return;
        }else{
            solveTower(n-1,start,end,temp);     //Must move all smaller discs out of the way first.
        }

        //BEFORE THIS EXECUTES: the return from is/else calls to previous recursive call.
        //EXAMPLE: if (1,A,B,C) executed then now (2,A,C,B) executes from here.
        Integer disc = start.pop();            
        end.push(disc);
        
        solveTower(n-1, temp,start,end);
    }
    

}
