package com.mycompany.recursions; 

public class Functions {
    
    public static Integer strLength(String string){
        //Manually creating a string.length
        if(string==null||string==""){
            return 0;
        }
        return 1+ strLength(string.substring(1));
                //at the end: return 1+0;
    }
    
    public static Integer factorial(Integer num){
        //Input: 5 returns 120. 5*4*3*2*1 = 120
        if(num ==0){
            return 1;
        }
        return (num * factorial(num-1));
                //return statement continnues until (num*factorial(num-1)) == 1: where this is called in the base case (if statement)
    }
    
    public static Integer exponent(Integer num, Integer exp){
        //Input: (2,4) or 2^4 will return 16
        if(exp==0){
            return 1;
        }
        return num* exponent(num, exp-1);
    }   
}

