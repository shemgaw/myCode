import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateCharactersAtString {
    public static void main(String[] args) {
        String word = "abcd";
        System.out.println(checkIfDuplicateChars(word));
        System.out.println(hasDuplicatedLetters(word));
        printDuplicateCharacters(word);
        printDuplicatedLetters(word);

        printDuplicatedLetters2(word);
    }

    private static void printDuplicateCharacters(String word) {

        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (charMap.containsKey(word.charAt(i))) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = charMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println("The letter " + entry.getKey() + " occured " + entry.getValue() + " times");
            }
        }

    }

    public static void printDuplicatedLetters(String string) {
        char[] stringArray = string.toCharArray();
        Map<Character, Integer> mapWithRepetitions = new HashMap<>();
        for (Character character : stringArray) {
            if (mapWithRepetitions.containsKey(character)) {
                mapWithRepetitions.put(character, mapWithRepetitions.get(character) + 1);
            } else {
                mapWithRepetitions.put(character, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = mapWithRepetitions.entrySet();
        boolean areDoubledLetters = false;
        System.out.print("Multiplied letters are:");
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                areDoubledLetters = true;
                System.out.println(entry.getKey());
            }
        }
        if (!areDoubledLetters) System.out.println(" there are NO multiplied letters!");
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
                hasDuplicates = true;
                break;
            }
        }
        return hasDuplicates;
    }


    private static boolean hasDuplicatedLetters(String word) {
        String[] wordString = word.split("");
        long count = Arrays.stream(wordString).distinct().count();
        return wordString.length != count;

    }


    private static void printDuplicatedLetters2(String word) {
        Set<String> doubledLetters = Stream.of(word.split(""))
                .filter(l -> Collections.frequency(List.of(word.split("")), l) > 1)
                .collect(Collectors.toSet());
        System.out.println(doubledLetters.size() != 0 ? "Duplicated Letters are: " + doubledLetters : "No duplicated letters");
    }

}
