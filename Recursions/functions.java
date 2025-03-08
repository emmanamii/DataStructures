//Some recursive functions (practice)

public class Functions {  

//------------------------------------------------------------------------
    public static Integer strLength(String string){
        //Manually creating a string.length
        if(string==null||string==""){
            return 0;
        }
        return 1+ strLength(string.substring(1));
                //at the end: return 1+0;
    }
    
    public static boolean strPalindrome(String string){
        //Return if palindrome is input
        Integer length = string.length();
        if(length<=1){
            return true;
        }
        if(string.charAt(0)==string.charAt(length-1)){
            String newString = string.substring(1, length-1);
            return strPalindrome(newString);
            
        }
        return false;
        
    }    
    
    public static String strReversal(String string){
        //Write a Java recursive method to reverse a given string.  
        Integer length = string.length();
        if(length ==1){
            return string;
        }
        
        String newString = string.substring(0, length-1);
        return string.charAt(length-1) + strReversal(newString);
    }  

//------------------------------------------------------------------------
    
    public static Integer sum(Integer integer){
        //Write a Java recursive method to calculate the sum of all numbers from 1 to n.
        if(integer ==1){
            return 1;
        }
       
        return integer + sum(integer-1);
    }     
    
    public static Integer factorial(Integer num){
        //Input: 5 returns 120. 5*4*3*2*1 = 120
        if(num ==0){
            return 1;
        }
        return (num * factorial(num-1));
                //return statement continnues until (num*factorial(num-1)) == 1: where this is called in the base case (if statement)
    }

    //fibonacci one can go here. still working on it.
    
    public static Integer gcd(Integer num1, Integer num2){
        //Assume num1 > num2
        if(num1%num2 == 0){
            return num2;
        }
        return gcd(num2, num1%num2);
    }   
    
    public static Integer exponent(Integer num, Integer exp){
        //Input: (2,4) or 2^4 will return 16
        if(exp==0){
            return 1;
        }
        return num* exponent(num, exp-1);
    }   
}

