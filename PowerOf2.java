public class PowerOf2 {
    public static void main(String[] args) {
        int number = 16;
        System.out.println(isNumberAPowerOf(number));
    }

    private static boolean isNumberAPowerOf(int number) {
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
