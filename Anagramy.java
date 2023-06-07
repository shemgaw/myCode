import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Anagramy {
    public static void main(String[] args) {
        String word1 = "abcabcc";
        String word2 = "abcabcc";
        System.out.println(checkIfAnagram(word1, word2));
    }

    private static boolean checkIfAnagram(String word1, String word2) {
        Map<Character, Integer> charactersMap = new HashMap<>();
        putIntegerToMap(charactersMap, word1);
        putIntegerToMap(charactersMap, word2);
        return charactersMap.values().stream().allMatch(it -> it % 2 == 0);
    }

    public static void putIntegerToMap(Map<Character, Integer> charactersMap, String word){
        for (char c : word.toCharArray()) {
            Integer counter = charactersMap.get(c);
            charactersMap.put(c, counter != null ? counter + 1 : 1);
        }
    }
}
