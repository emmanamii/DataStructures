//Some recursive functions (practice)

public class Functions {  

//--------------------------------------------------------------------------------------
    public static Integer strLength(String string){
        //Manually creating a string.length
        if(string==null||string==""){
            return 0;
        }
        return 1+ strLength(string.substring(1));
                //at the end: return 1+0;
    }
//--------------------------------------------------------------------------------------
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
//--------------------------------------------------------------------------------------
    public static String strReversal(String string){
        //Reverses a given string.  
        Integer length = string.length();
        if(length ==1){
            return string;
        }
        String newString = string.substring(0, length-1);
        return string.charAt(length-1) + strReversal(newString);
    }  
//------------------------------------------------------------------------
    public static Integer sum(Integer integer){
        //Calculates the sum of all numbers from 1 to n.
        if(integer ==1){
            return 1;
        }
       
        return integer + sum(integer-1);
    }     
//--------------------------------------------------------------------------------------    
    public static Integer factorial(Integer num){
        //Returns factorial
        if(num ==0){
            return 1;
        }
        return (num * factorial(num-1));
                //return statement continnues until (num*factorial(num-1)) == 1: where this is called in the base case (if statement)
    }
//--------------------------------------------------------------------------------------
    //fibonacci one can go here. still working on it.
//--------------------------------------------------------------------------------------    
    public static Integer gcd(Integer num1, Integer num2){
        //Returns the gcd. Assume num1 > num2
        if(num1%num2 == 0){
            return num2;
        }
        return gcd(num2, num1%num2);
    }   
//--------------------------------------------------------------------------------------
    public static Integer exponent(Integer num, Integer exp){
        //Returns the exponent
        if(exp==0){
            return 1;
        }
        return num* exponent(num, exp-1);
    }   
}
//--------------------------------------------------------------------------------------
    public static Integer countItems(Integer array[], Integer integer){
        //Method to count the number of occurrences of a specific element in an array.
        Integer length = array.length;
        return countItems(array,integer,length);
        
    }
    private static Integer countItems(Integer array[],Integer integer, Integer length){
        if(length==0){
            return 0;
        }
        if(array[length-1].equals(integer)){
            return 1+ countItems(array,integer, length-1);
        }
        return countItems(array,integer,length-1);
    }
//--------------------------------------------------------------------------------------
    public static Integer sumOfOddNumbers(Integer array[]){
        //Find the sum of all odd numbers in an array.
         Integer length = array.length;
         return sumOfOddNumbers(array, length);
    }
    private static Integer sumOfOddNumbers(Integer array[], Integer length){
        if(length==0){
            return 0;
        }
        if(array[length-1]%2==1){
            return array[length-1]+ sumOfOddNumbers(array, length-1);
        }
        return sumOfOddNumbers(array, length-1);
    }
//--------------------------------------------------------------------------------------
