import java.io.FileNotFoundException;
import java.io.IOException;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        String stringToReverse = "12345";
        System.out.println(reverseString(stringToReverse));
    }

    private static String reverseString(String stringToReverse) {
        if (stringToReverse.length() < 2)
            return stringToReverse;

        return reverseString(stringToReverse.substring(1)) + stringToReverse.charAt(0);
    }
}