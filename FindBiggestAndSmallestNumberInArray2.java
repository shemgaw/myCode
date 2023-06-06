import java.util.Arrays;
public class FindBiggestAndSmallestNumberInArray2{

    public static void main(String args[]) {
        largestAndSmallest(new int[]{15, -9, 0, -500000000, 4000000});
    }

    public static void largestAndSmallest(int[] numbers) {
        int largest = 100;
        int smallest = 1;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number is : " + largest);
        System.out.println("Smallest number is : " + smallest);
    }
}