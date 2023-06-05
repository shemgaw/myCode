public class CheckIfStringContainsDigits {
    public static void main(String[] args) {
        String word = "abcd7";
        System.out.println(checkIfContainsDigit(word));
    }

    private static boolean checkIfContainsDigit(String wordToCheck) {
        for (int i = 0; i < wordToCheck.length(); i++) {
            char c = wordToCheck.charAt(i);
             if (String.valueOf(c).matches("[0-9]")){
                 return true;
             }
        }
        return false;
    }
}
