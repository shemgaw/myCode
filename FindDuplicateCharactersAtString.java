import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharactersAtString {
    public static void main(String[] args) {
        String word = "abcddddd";
//        System.out.println(checkIfDuplicateChars(word));
        printDuplicateCharacters("Programmingg");
    }

    private static void printDuplicateCharacters(String word) {

        // build HashMap with character and number of times they appear in String
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (int i =0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (charMap.containsKey(word.charAt(i))) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > 1){
                System.out.println("The letter " + entry.getKey() + " occured " + entry.getValue() + " times");
            }
        }

    }

    private static boolean checkIfDuplicateChars(String word) {
        boolean hasDuplicates = false;
        char[] wordArray = word.toCharArray();
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : wordArray) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        Collection<Integer> values = countMap.values();
        for (Integer value : values) {
            if (value > 1) {
                hasDuplicates= true;
                break;
            }
        }
        return hasDuplicates;
    }
}