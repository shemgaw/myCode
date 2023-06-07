import java.nio.CharBuffer;

public class CheckIfStringContainsDigits {
    public static void main(String[] args) {
        System.out.println(checkIfContainsDigit("abcdsrhrstnsftn"));
        System.out.println(checkIfContainsDigit("abcdsrhrstnsftn456"));
    }

    private static boolean checkIfContainsDigit(String wordToCheck) {
        return CharBuffer.wrap(wordToCheck.toCharArray()).chars()
                .anyMatch(Character::isDigit);
    }
}
