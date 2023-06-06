public class FizzBuzz {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                System.out.println(array[i] + " FizzBuzz");
            } else if ((i + 1) % 5 == 0) {
                System.out.println(array[i] + " Fizz");
            } else if ((i + 1) % 3 == 0) {
                System.out.println(array[i] + " Buzz");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
