import java.util.*;

public class FindPairsOfIntegerArraysWhoseSumIsEqualToAGivenNumber {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 7, 9, -1, -8, 16, -100, 108};
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

        Integer[] numbersArray = set.toArray(new Integer[set.size()]);

        System.out.println(givenNumber + " jest wynikiem sumy liczb:");

        for (int i = 0; i < numbersArray.length; i+=2) {
            System.out.println("(" + numbersArray[i] + ")" + " + " + "(" + numbersArray[i+1] + ")");
        }

    }
}
