import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String word = "aeiouy";
        countVowelsAndConsonants(word);
    }

    private static void countVowelsAndConsonants(String word) {
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("vowels", 0);
        countMap.put("consonants", 0);
        String test = "abc def";
        test.split("[\s]");
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).matches("[aeiouyAEIOUY]")){
                countMap.put("vowels", countMap.get("vowels") +1);
            } else {
                countMap.put("consonants", countMap.get("consonants") +1);
            }

        }
        System.out.println("Vowels: " + countMap.get("vowels"));
        System.out.println("Consonants: " + countMap.get("consonants"));
    }
}
