import java.io.FileNotFoundException;
import java.io.IOException;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        String stringToReverse = "abcdefgh";
        System.out.println(reverseString(stringToReverse));
    }

    private static String reverseString(String stringToReverse) {
        if (stringToReverse.length() < 2)
            return stringToReverse;

        return stringToReverse.charAt(0) + reverseString(stringToReverse.substring(1));
    }
}