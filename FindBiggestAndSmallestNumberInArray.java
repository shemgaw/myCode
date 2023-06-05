import java.util.*;

public class FindBiggestAndSmallestNumberInArray {
    public static void main(String[] args) {
        int[] array = new int[] {2,1,4,3,3,5,6,5};
        findDuplicates(array);
    }

    private static void findDuplicates(int[] array) {
        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[array.length-1]);
        System.out.println("123");

    }

}
