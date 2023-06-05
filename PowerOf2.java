public class PowerOf2 {
    public static void main(String[] args) {
        int number = 16;
        System.out.println(isPowerOf(number));
    }

    private static boolean isPowerOf(int number) {
        int resultPowerOfTwo = 2;
        while (resultPowerOfTwo != number) {
            if (resultPowerOfTwo > number){
                return false;
            }
            resultPowerOfTwo = resultPowerOfTwo * 2;

        }
        return true;
    }
}
