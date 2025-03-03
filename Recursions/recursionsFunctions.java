package com.mycompany.recursions;

public class recursionsFunctions {
    
    
    public Integer strLength(String string){
        //Manually creating a string.length
        if(string==null||string==""){
            return 0;
        }
        return 1+ strLength(string.substring(1));
                //at the end: return 1+0;
        
    }
    
    public Integer factorial(Integer num){
        //Input: 5 returns 120. 5*4*3*2*1 = 120

        if(num ==0){
            return 1;
        }
        return (num * factorial(num-1));
                //return statement continnues until (num*factorial(num-1)) == 1: where this is called in the base case (if statement)
    }
    
}
