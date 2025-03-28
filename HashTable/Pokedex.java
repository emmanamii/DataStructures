
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author emmam
 */
public class Pokedex {

    public static Hashtable<String, String> dex = new Hashtable();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your pokedex!");
        
        while(true){
            System.out.println("------------------------------------------");
            System.out.println("1: Add a new Pokemon.");
            System.out.println("2: Get a Pokemon's favorite move.");
            System.out.println("3: Update a Pokemon's favorite move.");
            System.out.println("4: Remove a Pokemon.");
            System.out.println("5: Check if a Pokemon exsits.");
            System.out.println("6: List all Pokemon.");
            System.out.println("7: Clear the Pokedex.");
            System.out.println("8: Pokemon battle!");
            System.out.println("9: Calculate power level.");
            System.out.println("10: Exit.");
            System.out.println("------------------------------------------");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){

                case 1:
                    System.out.println("Enter a pokemon:");
                    String pokemon = scanner.nextLine();
                    System.out.println("Enter its move:");
                    String move = scanner.nextLine();
                    addPokemon(pokemon, move);
                    break;
                case 2:
                    System.out.println("Enter a pokemon:");
                    String pokemon2 = scanner.nextLine();
                    System.out.println(getMove(pokemon2));
                    break;
                case 3:
                    System.out.println("Enter a pokemon:");
                    String pokemon3 = scanner.nextLine();
                    System.out.println("Enter its move:");
                    String move3 = scanner.nextLine();
                    updateMove(pokemon3, move3);
                    break;
                case 4: 
                    System.out.println("Enter a pokemon:");
                    String pokemon4 = scanner.nextLine();
                    removePokemon(pokemon4);
                   
                    break;
                case 5:
                    System.out.println("Enter a pokemon:");
                    String pokemon5 = scanner.nextLine();
                    System.out.println(pokemonExists(pokemon5));
                    break;
                case 6: 
                    listPokemon();
                    break;
                case 7:
                    clearPokedex();
                    break;
                case 8:
                    System.out.println("Enter first pokemon.");
                    String Poke1= scanner.nextLine();
                    System.out.println("Enter second pokemon.");
                    String Poke2= scanner.nextLine();
                    pokemonBattle(Poke1, Poke2);
                    break;
                case 9:
                    System.out.println("Enter a move");
                    String move9 = scanner.nextLine();
                    System.out.println("Level: " + calculatePowerLevel(move9));
                    break;
                case 10:
                    return;
            }
                
        }
        
    }
    
    public static void addPokemon(String pokemon, String move){
        //Case 1
        if(dex.containsKey(pokemon)){
            System.out.println("Pokemon already exists.");
            return;
        }
        System.out.println("Successfully added Pokemon.");
        dex.put(pokemon, move);
    }
    
    public static String getMove(String pokemon){
        //Case 2
        if(dex.containsKey(pokemon)){
            return dex.get(pokemon);
        }
        return "Pokemon does not exist";
    }
    
    public static void updateMove(String pokemon, String move){
        //Case 3
        if(dex.containsKey(pokemon)){
            dex.put(pokemon ,move);
            System.out.println("Successfully updated move.");
            return;
        }
        System.out.println("Pokemon does not exist.");
    }
    
    public static void removePokemon(String pokemon){
        //Case 4
        if(dex.containsKey(pokemon)){
            System.out.println("Does contain");
            dex.remove(pokemon);
            System.out.println("Successfully removed Pokemon");
            return;
        }
        System.out.println("Pokemon does not exist.");
    }
    
    public static boolean pokemonExists(String pokemon){
        //Case 5
        return dex.containsKey(pokemon);
    }
    
    public static void listPokemon(){
        //Case 6
        System.out.println("Pokemon in dex{");
        for(String key : dex.keySet()){
            System.out.println(key);
        }
       System.out.println("}");
    }
    
    public static void clearPokedex(){
        //Case 7
        dex.clear();
        System.out.println("Dex has been cleared");
    }
    
    public static void pokemonBattle(String pokemon1, String pokemon2){
        //Case 8
        String move1 = dex.get(pokemon1);
        String move2 = dex.get(pokemon2);
        if (move1 == null)
        {
            System.out.println(pokemon1 + " does not exist in the Pokedex.");
            return;
        }
        if (move2 == null)
        {
            System.out.println(pokemon2 + " does not exist in the Pokedex.");
            return;
        }
        int power1 = calculatePowerLevel(move1);
        int power2 = calculatePowerLevel(move2);
        System.out.println(pokemon1 + " uses " + move1 + " (Power: " + power1 + ")");
        System.out.println(pokemon2 + " uses " + move2 + " (Power: " + power2 + ")");
        if (power1 > power2)
        {
            System.out.println(pokemon1 + " wins!");
        }
        else if (power2 > power1)
        {
            System.out.println(pokemon2 + " wins!");
        }
        else
        {
            System.out.println("It's a tie!");
        }
    }
    
    public static int calculatePowerLevel(String move){
        //Case 9
        switch (move.toLowerCase())
        {
            case "thunderbolt":
                return 90;
            case "flamethrower":
                return 95;
            case "vine whip":
                return 45;
            case "solar beam":
                return 120;
            default:
                return 50;
    
        }
    }
     
}
