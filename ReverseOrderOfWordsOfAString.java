public class ReverseOrderOfWordsOfAString {
    public static void main(String[] args) {
        String sentence = "Jeszcze Polska nie zginęła";
        sentence.indexOf("v");
        System.out.println(reverseWordsOrder(sentence));
    }

    private static String reverseWordsOrder(String sentence) {
        int index = sentence.indexOf(" ");
        if (index == -1)
            return sentence + " ";
        return reverseWordsOrder(sentence.substring(index+1)) + sentence.substring(0, index+1);
    }

}
