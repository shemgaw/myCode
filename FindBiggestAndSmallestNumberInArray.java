import java.util.*;

public class FindBiggestAndSmallestNumberInArray {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 4, 3, 3, 5, 6, 5, 15, -9, 0, -500000000, 4000000};
        largestAndSmallest1(array);
        largestAndSmallest2(array);
    }

    private static void largestAndSmallest1(int[] array) {
        Arrays.sort(array);
        System.out.println("Smallest number: " + array[0]);
        System.out.println("Biggest number: " + array[array.length - 1]);

    }

    public static void largestAndSmallest2(int[] numbers) {
        int largest = numbers[0];
        int smallest = largest;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Smallest number : " + smallest);
        System.out.println("Largest number : " + largest);
    }

}
