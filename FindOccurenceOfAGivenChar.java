public class FindOccurenceOfAGivenChar {
    public static void main(String[] args) {
        String word = "słowoooooo";
        System.out.println(countOccurenceOfAGivenChar(word, "o"));
    }

    private static int countOccurenceOfAGivenChar(String word, String character) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).matches(character)){
                ++counter;
            }

        }
        return counter;
    }
}
