public class FindIfAWordIsARotationOfAnother {

    public static void main(String[] args) throws Exception {

        String input = "JeszczePolskanie";

        String rotation = "PolskanieJeszcze";

        if (checkRotatation(input, rotation)) {
            System.out.println(input + " and " + rotation
                    + " are rotation of each other");
        } else {
            System.out.println("Sorry, they are not rotation of another");
        }
    }

    public static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }

        String concatenated = original + original;

        return concatenated.contains(rotation);
    }
}