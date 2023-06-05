import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String string = "abcddefghhijkkkkkl";
        printDuplicatedLetters(string);

    }

    public static void printDuplicatedLetters(String string){
        char[] stringArray = string.toCharArray();
        Map <Character, Integer> mapWithRepetitions = new HashMap<Character, Integer>();
        for (Character character : stringArray) {
            if (mapWithRepetitions.containsKey(character)) {
                mapWithRepetitions.put(character, mapWithRepetitions.get(character) + 1);
            }
            else {
                mapWithRepetitions.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = mapWithRepetitions.entrySet();
//        System.out.println("Multiplied letters are:");
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() == 1)
                System.out.println("The first non-repeated character is: " + entry.getKey());
            break;
        }
    }
}
