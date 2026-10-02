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

    // ZADANIE 7
    public static double pierwiastek(double liczba) {
        return Math.sqrt(liczba);
    }

    // ZADANIE 8
    public static boolean czyTrojkatProstokatny(double a, double b, double c) {

        if (a >= b && a >= c) {
            return a * a == b * b + c * c;
        } else if (b >= a && b >= c) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }

    // Zadanie 9
    public static char ostatniZnak(String tekst) {
        return tekst.charAt(tekst.length() - 1);
    }

    // Zadanie 10
    public static boolean czyPalindrom(String tekst) {
        tekst = tekst.toLowerCase();

        String odwrocony = new StringBuilder(tekst)
                .reverse()
                .toString();

        return tekst.equals(odwrocony);
    }

    // Zadanie 11
    public static int sumaTablicy(int[] tablica) {
        int suma = 0;

        for (int liczba : tablica) {
            suma += liczba;
        }

        return suma;
    }

    // Zadanie 12
    public static int zliczWystapienia(String tekst, char znak) {
        int licznik = 0;

        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                licznik++;
            }
        }

        return licznik;
    }



}
