//Some recursive functions (practice). https://www.w3resource.com/java-exercises/recursive/index.php#null

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
    public static Integer fibonacci(Integer integer){
        //Calculates the nth Fibonacci number. 1 1 2 3 5 8
        //Input: 6 = Output :8
        if(integer==0){
            return 0;
        }
        if(integer==1){
            return 1;
        }
        return fibonacci(integer-1)+fibonacci(integer-2);
    }
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
        return countItems(array,integer,0);
    }
    private static Integer countItems(Integer array[],Integer integer, Integer index){
        if(index==array.length){
            return 0;
        }
        if(array[index].equals(integer)){
            return 1+ countItems(array,integer, index+1);
        }
        return countItems(array,integer,index+1);
    }
//--------------------------------------------------------------------------------------
    public static Integer sumOfOddNumbers(Integer array[]){
        //Find the sum of all odd numbers in an array.
         return sumOfOddNumbers(array, 0);
    }
    private static Integer sumOfOddNumbers(Integer array[], Integer index){
        if(index==array.length){
            return 0;
        }
        if(array[index]%2==1){
            return array[index]+ sumOfOddNumbers(array, index+1);
        }
        return sumOfOddNumbers(array, index+1);
    }
//--------------------------------------------------------------------------------------
    public static Integer productOfAllNumbers(Integer array[]){
        //calculate the product of all numbers in an array.
        return productOfAllNumbers(array, 0);
    }
    private static Integer productOfAllNumbers(Integer array[], Integer index){
        if(index==array.length){
            return 1;
        }
        return array[index] * productOfAllNumbers(array, index+1);
    }
//--------------------------------------------------------------------------------------
    public static Integer lcf(Integer num1, Integer num2) {
        // Return the least common factor. Assume num1 >= num2
        return lcf(num1, num2, num2);  // Start checking from the smaller number
    }

    private static Integer lcf(Integer num1, Integer num2, Integer factor) {
        if (factor == 0) {  // Base case: No common factor, return 1
            return 1;
        }
        if (num1 % factor == 0 && num2 % factor == 0) {  
            return factor;  
        }
        return lcf(num1, num2, factor - 1);  // Recurse by checking the next smaller factor
    }
//--------------------------------------------------------------------------------------
    public static Integer maxElement(Integer array[]){
        //Find the maximum element in an array.
        if(array.length==0){
            return 0;
        }
        return maxElement(array, 0, Integer.MIN_VALUE);
    }
    private static Integer maxElement(Integer array[], Integer index, Integer element){
        if(index==array.length){
            return element;
        }
        if(array[index]>element){
            element = array[index];
        }
        return maxElement(array,index+1,element);
    }
//--------------------------------------------------------------------------------------
    public static boolean sortedCheck(Integer array[]){
        //check if a given array is sorted in ascending order.
        if (array == null || array.length <= 1) {
            return true;
        }
        return sortedCheck(array, 0);
    }
    private static boolean sortedCheck(Integer array[], Integer index) {
        if (index == array.length - 1) { 
            return true;
        }
        if (array[index] > array[index + 1]) { 
            return false;
        }
        return sortedCheck(array, index + 1); 
    }
//--------------------------------------------------------------------------------------
    public static ArrayList<String> generatePermutations(String string){
        //generate all possible permutations of a given string
        ArrayList<String> permutations = new ArrayList<>();
        generatePermutations(string,"",permutations);
        return permutations;
    }
    private static void generatePermutations(String string, String current, ArrayList<String> permutations){
        if(string.isEmpty()){
            permutations.add(current);
            return ;
        }
        for(int i=0;i<string.length();i++){
            char character = string.charAt(i);
            String remaining = string.substring(0, i) + string.substring(i + 1);
            generatePermutations(remaining, current + character, permutations);
        }
    }
}
