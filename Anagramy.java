import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Anagramy {
    public static void main(String[] args) {
        String word1 = "abcc";
        String word2 = "abc";
        System.out.println(checkIfAnagram(word1, word2));
    }

    private static boolean checkIfAnagram(String word1, String word2){
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        boolean isAnagram = true;
        Map<Character, Integer> charactersMap = new HashMap<>();
        for (char c : array1) {
            if (charactersMap.containsKey(c)) {
                charactersMap.put(c, charactersMap.get(c) + 1);
            } else
                charactersMap.put(c, 0);
        }
        for (char c : array2) {
            if (charactersMap.containsKey(c)) {
                charactersMap.put(c, charactersMap.get(c) + 1);
            } else
                charactersMap.put(c, 0);
        }
        Set<Map.Entry<Character, Integer>> entries = charactersMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() % 2 == 0 ){
                return false;
            }
        }
        return isAnagram;
    }
}
