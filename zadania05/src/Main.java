import java.util.Random;
import java.util.Scanner;

public class Main {

    // ZADANIE 1
    public static int zwrocWiek() {
        return 20;
    }
    //WYKONANE PRZEZ ERYKA WARWASA

    // ZADANIE 2
    public static String zwrocImie() {
        return "Eryk";
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // ZADANIE 3
    public static void obliczenia(int liczba1, int liczba2) {
        System.out.println("Suma: " + (liczba1 + liczba2));
        System.out.println("Różnica: " + (liczba1 - liczba2));
        System.out.println("Iloczyn: " + (liczba1 * liczba2));
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // ZADANIE 4
    public static boolean czyParzysta(int liczba) {
        return liczba % 2 == 0;
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // ZADANIE 5
    public static boolean czyPodzielnaPrzez3i5(int liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // ZADANIE 6
    public static int doTrzeciejPotegi(int liczba) {
        return liczba * liczba * liczba;
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // ZADANIE 7
    public static double pierwiastek(double liczba) {
        return Math.sqrt(liczba);
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // ZADANIE 8
    public static boolean czyTrojkatProstokatny(double a, double b, double c) {
        //WYKONANE PRZEZ ERYKA WARWASA
        if (a >= b && a >= c) {
            return a * a == b * b + c * c;
        } else if (b >= a && b >= c) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // Zadanie 9
    public static char ostatniZnak(String tekst) {
        return tekst.charAt(tekst.length() - 1);
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // Zadanie 10
    public static boolean czyPalindrom(String tekst) {
        tekst = tekst.toLowerCase();
        //WYKONANE PRZEZ ERYKA WARWASA
        String odwrocony = new StringBuilder(tekst)
                .reverse()
                .toString();
        //WYKONANE PRZEZ ERYKA WARWASA
        return tekst.equals(odwrocony);
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // Zadanie 11
    public static int sumaTablicy(int[] tablica) {
        int suma = 0;

        for (int liczba : tablica) {
            suma += liczba;
        }
        //WYKONANE PRZEZ ERYKA WARWASA
        return suma;
    }
    //WYKONANE PRZEZ ERYKA WARWASA
    // Zadanie 12
    public static int zliczWystapienia(String tekst, char znak) {
        int licznik = 0;
        //WYKONANE PRZEZ ERYKA WARWASA
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak) {
                licznik++;
            }
        }
        //WYKONANE PRZEZ ERYKA WARWASA
        return licznik;
    }
}
