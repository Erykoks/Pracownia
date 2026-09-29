import java.util.Random;
import java.util.Scanner;

public class Main {

    // ZADANIE 1
    public static int zwrocWiek() {
        return 20;
    }

    // ZADANIE 2
    public static String zwrocImie() {
        return "Eryk";
    }

    // ZADANIE 3
    public static void obliczenia(int liczba1, int liczba2) {
        System.out.println("Suma: " + (liczba1 + liczba2));
        System.out.println("Różnica: " + (liczba1 - liczba2));
        System.out.println("Iloczyn: " + (liczba1 * liczba2));
    }
    // ZADANIE 4
    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }

    // ZADANIE 5
    public static boolean czyPodzielnaPrzez3i5(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    // ZADANIE 6
    public static int doTrzeciejPotegi(int liczba) {
        return liczba * liczba * liczba;
    }



}
