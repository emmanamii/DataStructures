
import java.util.ArrayList;
import java.util.Collections;

public class ListUtilities {
    
    public static boolean scrollOfUniqueness(ArrayList<String> list){
        //Checks if all items in list are unique
        ArrayList<String> seen = new ArrayList<>();
        for(String item: list){
            if(seen.contains(item)){
                return false;
            }
            seen.add(item);
        }
        return true;
    }
    public static ArrayList<Integer> multiplesMirror(ArrayList<Integer> list, Integer n){
        //Returns new list of only elements that are multiples of n
        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer item: list){
            if(item%n == 0){
                newList.add(item);
            }
        }
        return newList;
        
    }
    public static ArrayList<String> runeOfWordLength(ArrayList<String> list, Integer n){
        //Only words of length n will be returned into new list
        ArrayList<String> newList = new ArrayList<>();
        for(String item: list){
            if(item.length()==n){
                newList.add(item);
            }
        }
        return newList;
    }
    
    public static boolean spellOfPermutations(ArrayList<String> list1, ArrayList<String> list2){
        //If the two lists have the same permutations, return ture
        if(list1.size() != list2.size()){
            System.out.println("Not the same size.");
            return false;
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        return list1.equals(list2);
        
        
    }/*not finished with this one
    public static ArrayList<String> whisperingWords(String string){
        //Transforms a sentence into a list of words
        ArrayList<String> list = new ArrayList<>((string.split(" ")));
        return list;
    }*/
    
    public static ArrayList<String> vanishingCurse(ArrayList<String> list, String string){
        //Removes all occurences of input item from list
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(string)){
                list.remove(list.get(i));
            }
        }

        return list;    
    }
}


