import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateNumberInArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println("------First Solution:------");
        findDuplicates(array);
        System.out.println("------Second Solution:------");
        findDuplicates2(array);
        System.out.println("------Third Solution:------");
        findDuplicates2EvenMorePacked(array);
    }

    private static void findDuplicates(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : array) {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else
                countMap.put(n, 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = countMap.entrySet();
        System.out.println("Liczby zdublowane: ");
        boolean areAnyDoubledNumbers = false;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                areAnyDoubledNumbers = true;
                System.out.println("[" + entry.getKey() + "]");
            }
        }
        if (!areAnyDoubledNumbers) {
            System.out.println("brak");
        }
    }

    private static void findDuplicates2(int[] arrayOfNumbers) {
        List<Integer> listOfNumbers = Arrays.stream(arrayOfNumbers).boxed().toList();
        Set<Integer> doubledNumbers = listOfNumbers.stream()
                .filter(l -> Collections.frequency(listOfNumbers, l) > 1)
                .collect(Collectors.toSet());
        System.out.println(doubledNumbers.size() != 0 ? "Duplicated numbers are: " + doubledNumbers : "No duplicated numbers");
    }

    private static void findDuplicates2EvenMorePacked(int[] arrayOfNumbers) {
        Set<Integer> doubledNumbers = Arrays.stream(arrayOfNumbers).boxed().toList().stream()
                .filter(l -> Collections.frequency(Arrays.stream(arrayOfNumbers).boxed().toList(), l) > 1)
                .collect(Collectors.toSet());
        System.out.println(doubledNumbers.size() != 0 ? "Duplicated numbers are: " + doubledNumbers : "No duplicated numbers");
    }
}
