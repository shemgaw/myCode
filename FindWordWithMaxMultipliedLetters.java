import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindWordWithMaxMultipliedLetters {
    public static void main(String[] args) {
        String sentence = "Pamiętaj o zakupach ania";
        System.out.println(checkIt(sentence));
    }

    private static String checkIt(String sentence) {
        String[] words = sentence.split("[\s]");
        Map<Character, Integer> countMap = new HashMap<>();
        int mostDuplicates = 0;
        String wordWithMostDuplicates = "";

        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                if (countMap.containsKey(word[j])) {
                    countMap.put(word[j], countMap.get(word[j]) + 1);
                } else {
                    countMap.put(word[j], 1);
                }

            }
            int counter = 0;
            Set<Map.Entry<Character, Integer>> entries = countMap.entrySet();
            for (Map.Entry<Character, Integer> entry : entries) {
                if (entry.getValue() > 1) {
                    counter += 1;
                }
                if (counter > mostDuplicates) {
                    wordWithMostDuplicates = String.valueOf(words[i]);
                }
            }
        }
        if (wordWithMostDuplicates.equals("")){
            return "No multiplied letters occured";
        }
        return wordWithMostDuplicates;
    }
}
