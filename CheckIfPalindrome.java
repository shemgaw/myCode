public class CheckIfPalindrome {
    public static void main(String[] args) {
        String word = "kajaki";
        String reversedWord = reverseWord(word);
        System.out.println(isPalindrome(word, reversedWord));
    }

    private static String reverseWord(String word) {
        if (word.length() < 2)
            return word;
        else
            return reverseWord(word.substring(1)) + word.charAt(0);
    }

    private static boolean isPalindrome(String word, String reversedWord) {
        return word.equals(reversedWord);
    }
}
