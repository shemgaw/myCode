import java.util.BitSet;

public class MissingNumberInArray {

    public static void main(String args[]) {
        int[] array = new int[] {1, 2, 4, 6};
        printMissingNumbers(array);

    }

    private static void printMissingNumbers(int[] array) {
        BitSet bitSet = new BitSet();
        for (int i : array) {
            bitSet.set(i-1);
        }
        int lastInt = array[array.length-1];
        int amountOfMissingNumbers = lastInt - array.length;

        int checkFrom = 0;
        System.out.println("Brakuje cyfr:");
        for (int i = 0; i < amountOfMissingNumbers; i++) {
            checkFrom = bitSet.nextClearBit(checkFrom);
            System.out.println(++checkFrom);
        }
    }


}