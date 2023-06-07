import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String word = "aeiouybcd";
        countVowelsAndConsonants(word);
        countVowelsAndConsonants2(word);
        countVowelsAndConsonants3(word);
        countVowelsAndConsonants4(word);
    }


    private static void countVowelsAndConsonants(String word) {
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("vowels", 0);
        countMap.put("consonants", 0);
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).matches("[aeiouyAEIOUY]")) {
                countMap.put("vowels", countMap.get("vowels") + 1);
            } else {
                countMap.put("consonants", countMap.get("consonants") + 1);
            }
        }
        System.out.println("Vowels: " + countMap.get("vowels"));
        System.out.println("Consonants: " + countMap.get("consonants"));
    }


    private static void countVowelsAndConsonants2(String word) {
        String[] stringArray = word.split("");
        Map<String, Integer> countMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            boolean isVowel = stringArray[i].matches("[aeiouyAEIOUY]");
            Integer counter = countMap.get(isVowel ? "vowels" : "consonants");
            countMap.put(isVowel ? "vowels" : "consonants",
                    counter != null ? counter + 1 : 1);
        }
        System.out.println("Vowels: " + countMap.get("vowels"));
        System.out.println("Consonants: " + countMap.get("consonants"));
    }


    private static void countVowelsAndConsonants3(String word) {
        Character[] charObjects = word.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        long vowels = Arrays.stream(charObjects).
                filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y')
                .count();
        long consonants = word.length() - vowels;
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }


    private static void countVowelsAndConsonants4(String word) {
        String[] stringsArray = word.split("");
        long vowels = Arrays.stream(stringsArray).filter(c -> c.matches("[aeiouyAEIOUY]")).count();
        long consonants = word.length() - vowels;
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
