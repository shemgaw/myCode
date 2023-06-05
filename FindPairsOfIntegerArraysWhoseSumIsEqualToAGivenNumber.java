import java.util.*;

public class FindPairsOfIntegerArraysWhoseSumIsEqualToAGivenNumber {
    public static void main(String[] args) {
        int[] array = new int[]{3,5,7,9,-1};
        int givenNumber = 8;
        findPairsThatAreEqualGivenNumber(array, givenNumber);
    }

    private static void findPairsThatAreEqualGivenNumber(int[] array, int givenNumber) {
        int index = 0;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == givenNumber){
                    set.add(array[i]);
                    set.add(array[j]);
                }
            }
        }
        Integer[] emptyArray = new Integer[set.size()];
        Integer[] numbersArray = set.toArray(emptyArray);

        for (int i = 0; i < numbersArray.length; i+=2) {
            System.out.println("Suma liczb: " + numbersArray[i] + " + " + numbersArray[i+1]);
        }

    }
}
