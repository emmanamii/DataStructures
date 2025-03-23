//3 excersizes regarding recursions. 
import java.util.ArrayList;
import java.util.Random;

public class lab05 {

    public static void main(String[] args) {

        monsterName(3);
        alienTranslator("Emma Nami");
        
        System.out.println(generatePermutations("Hello"));
        
    
    }
    /*------------------------------------------------------------------------------------------------------
    Write a Java recursive method that generates a student name (oh I mean a monster name :/)
        by combining a random prefixes and suffixes from given lists. The recursive method should
        take an integer parameter that tells you to stop after a number of iterations
    ------------------------------------------------------------------------------------------------------*/
    public static void monsterName(int iterations){
        System.out.println(monsterName(0,iterations*2));
    }
    
    private static String[] prefixes= {"Fluffy","Snuggle","Grumpy","Bouncy"};
    private static String[] suffixes = {"Bug","Bear","Blob","Monster"};
    
    private static String monsterName(int current, int iterations){
        if (current==iterations){
            return "";
        }
        
        Random rand = new Random();
        if(current%2==0){ //if prefix
            int prefixIndex = rand.nextInt(prefixes.length);
            //at the value of the prefix, insert into new string?
            return prefixes[prefixIndex] + monsterName(current+1,iterations);
        }
        if(current%2==1){ //if suffix
            int suffixIndex = rand.nextInt(suffixes.length);
            return suffixes[suffixIndex] + monsterName(current+1,iterations);
        }
        return "Error";

    }

    /*------------------------------------------------------------------------------------------------------
    Exercise 2: Recursive Alien Language Translator
        Write a Java recursive method that translates a given phrase into an alien language by
        recursively replacing vowels with a sequence of alien-sounding syllables
    -------------------------------------------------------------------------------------------------------*/
    public static void alienTranslator(String string){
        System.out.println(alienTranslator(string,0));
    }
    private static String alienTranslator(String string, int iterator){
        if(iterator==string.length()){
            return "";
        }
        
        char character = string.charAt(iterator);
        String alienSound;
        
        switch (character){
            case 'a': case 'A':
                alienSound = "azz";
                break;
            case 'e': case 'E':
                alienSound = "ezz";
                break;
            case 'i': case 'I':
                alienSound = "izz";
                break;
            case 'o': case 'O':
                alienSound = "ozz";
                break;
            case 'u': case 'U':
                alienSound = "uzz";
                break;
            default:
                alienSound = String.valueOf(character);
           
        }
        return alienSound + alienTranslator(string, iterator + 1);
                
    }
    
    
    /*------------------------------------------------------------------------------------------------------
    Write a Java recursive method that generates all possible permutations of a given string. The
    method should print each permutation.
    ------------------------------------------------------------------------------------------------------*/
    public static ArrayList<String> generatePermutations(String string){
        ArrayList<String> list = new ArrayList<>();
        generatePermutations(string, "", list);
        return list;
    }
    private static ArrayList<String> generatePermutations(String string, String current, ArrayList<String> result){
        if(string.isEmpty()){
            result.add(current);
            return result;
        }
        for(int i=0; i<string.length(); i++){
            char character = string.charAt(i);
            String remaining=(string.substring(0,i)+ string.substring(i+1));
            generatePermutations(remaining, current+character, result);
        }
        return result;
    }

}
