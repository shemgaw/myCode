import java.util.Scanner;

/*
 * Java Program to check if one String is rotation of
 * another.
 */
public class Main2 {

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

    /**
     * This method check is given strings are rotation of each other
     * @param original
     * @param rotation
     * @return true or false
     */
    public static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }

        String concatenated = original + original;

        if (concatenated.indexOf(rotation) != -1) {
            return true;
        }

        return false;
    }
}