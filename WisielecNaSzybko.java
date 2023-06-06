import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WisielecNaSzybko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> slowa = List.of("pomarańcza", "łódka", "kwiatki", "grzebać", "wyjazd");
        Random random = new Random();
        String slowo = slowa.get(random.nextInt(slowa.size()));
        String slowoModified = slowo.replaceAll("[A-Za-zęóąśłżźćń]", "_");
        int lives = 3;
        while (!slowoModified.equals(slowo) && lives >0){
            String slowoModifiedResult = checkAndGetNewModifiedWord(slowo, slowoModified, scanner);
            if (slowoModified.equals(slowoModifiedResult)) {
                lives-=1;
                System.out.println("Ilość pozostałych żyć: " + lives);
            }
            slowoModified = slowoModifiedResult;
        }
        if (lives>0) {System.out.println("Brawo! odgadłeś hasło: " + slowoModified);}
        else System.out.println("loooooser :)");
        scanner.close();
    }

    private static String checkAndGetNewModifiedWord(String slowo, String slowoModified, Scanner scanner) {
        StringBuilder slowoModifiedSB = new StringBuilder(slowoModified);
        System.out.println("Zgadnij słowo: ");
        System.out.println();
        System.out.println(slowoModified);
        System.out.println("Podaj literkę ");
        String s = scanner.nextLine();
        if (s.matches("[A-Za-zęóąśłżźćń]")) {
            for (int i = 0; i < slowo.length(); i++) {
                if (s.equals(String.valueOf(slowo.charAt(i)))) {
                    slowoModifiedSB.setCharAt(i, slowo.charAt(i));
                    slowoModified = slowoModifiedSB.toString();
                }
            }
        } else {
            System.out.println("Nie podałeś literki, spróbuj jeszcze raz");
        }
        return slowoModified;
    }

}
