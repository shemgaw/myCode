public class FindPermutationOfTheString {
    public static void main(String[] args) {
        String word = "onet";
        System.out.println(permutationsCount(word.length()));
    }

    private static int permutationsCount(int length) {
        if (length < 2)
                return length;
        return length * permutationsCount(length-1);
    }
}
