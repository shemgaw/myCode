import java.lang.reflect.Array;
import java.util.*;

public class FindDuplicateNumberInArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,3,4,5,5,6};
        findDuplicates(array);
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
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() > 1){
                System.out.println(entry.getKey());
            }

        }

    }

}
