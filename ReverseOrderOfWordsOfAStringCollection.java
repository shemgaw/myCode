import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseOrderOfWordsOfAStringCollection {
    public static void main(String[] args) {
        String sentence = "JeszczePolskanie";
        sentence.indexOf("nieJeszczePolska");
        System.out.println(reverseWordsOrder(sentence));
    }

    private static String reverseWordsOrder(String sentence) {
        List<String> words = Arrays.asList(sentence.split("[\s]"));
        Collections.reverse(words);
        StringBuilder sB = new StringBuilder();
        for (int i = words.size() - 1; i > -1; --i) {
            if (i != 0)
                sB.append(words.get(i) + " ");
            else
                sB.append(words.get(i));
        }
        return sB + ".";
    }

}
