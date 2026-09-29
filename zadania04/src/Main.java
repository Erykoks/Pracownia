import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ZADANIA WYKONANE PRZEZ JAKUBA BUJAKIEWICZA

        Scanner scanner = new Scanner(System.in);

        // ZADANIE 1

        System.out.println("ZADANIE 1");

        int[] tablicaParzysta = {1, 2, 3, 4, 5, 6};
        int[] tablicaNieparzysta = {10, 20, 30, 40, 50};

        System.out.println("Co drugi element pierwszej tablicy:");

        for (int i = 0; i < tablicaParzysta.length; i += 2) {
            System.out.print(tablicaParzysta[i] + " ");
        }

        System.out.println();

        System.out.println("Co drugi element drugiej tablicy:");

        for (int i = 0; i < tablicaNieparzysta.length; i += 2) {
            System.out.print(tablicaNieparzysta[i] + " ");
        }

        System.out.println();
        System.out.println();

        // ZADANIE 2

        System.out.println("ZADANIE 2");

        int[] liczby = {5, 12, 3, 27, 8, 15};

        int najwieksza = liczby[0];

        for (int i = 1; i < liczby.length; i++) {
            if (liczby[i] > najwieksza) {
                najwieksza = liczby[i];
            }
        }

        System.out.println("Największa liczba: " + najwieksza);
        System.out.println();

        // ZADANIE 3

        System.out.println("ZADANIE 3");

        String[] napisy = {"Ala", "ma", "kota", "Java", "IntelliJ"};

        for (String napis : napisy) {
            System.out.println(napis.toUpperCase());
        }

        System.out.println();

        // ZADANIE 4

        System.out.println("ZADANIE 4");

        String[] slowa = new String[5];

        System.out.println("Podaj 5 słów:");

        for (int i = 0; i < slowa.length; i++) {
            slowa[i] = scanner.next();
        }

        System.out.println("Słowa od ostatniego do pierwszego, odwrócone:");

        for (int i = slowa.length - 1; i >= 0; i--) {

            for (int j = slowa[i].length() - 1; j >= 0; j--) {
                System.out.print(slowa[i].charAt(j));
            }

            System.out.println();
        }

        System.out.println();

        // ZADANIE 5

        System.out.println("ZADANIE 5");

        int[] liczbyDoSortowania = new int[8];

        System.out.println("Podaj 8 liczb:");

        for (int i = 0; i < liczbyDoSortowania.length; i++) {
            liczbyDoSortowania[i] = scanner.nextInt();
        }

        // Sortowanie rosnąco
        for (int i = 0; i < liczbyDoSortowania.length - 1; i++) {

            for (int j = 0; j < liczbyDoSortowania.length - 1 - i; j++) {

                if (liczbyDoSortowania[j] > liczbyDoSortowania[j + 1]) {

                    int pomocnicza = liczbyDoSortowania[j];
                    liczbyDoSortowania[j] = liczbyDoSortowania[j + 1];
                    liczbyDoSortowania[j + 1] = pomocnicza;
                }
            }
        }

        System.out.println("Posortowana tablica:");

        for (int liczba : liczbyDoSortowania) {
            System.out.print(liczba + " ");
        }

        System.out.println();
        System.out.println();

        // ZADANIE 6

        System.out.println("ZADANIE 6");

        int[] liczbyDoSilni = new int[5];

        System.out.println("Podaj 5 liczb:");

        for (int i = 0; i < liczbyDoSilni.length; i++) {
            liczbyDoSilni[i] = scanner.nextInt();
        }

        for (int liczba : liczbyDoSilni) {

            long silnia = 1;

            for (int i = 1; i <= liczba; i++) {
                silnia = silnia * i;
            }

            System.out.println(liczba + "! = " + silnia);
        }

        System.out.println();

        // ZADANIE 7

        System.out.println("ZADANIE 7");

        String[] tablica1 = {"Ala", "ma", "kota"};
        String[] tablica2 = {"Ala", "ma", "kota"};

        boolean takieSame = Arrays.equals(tablica1, tablica2);

        if (takieSame) {
            System.out.println("Tablice są takie same.");
        } else {
            System.out.println("Tablice nie są takie same.");
        }

        System.out.println();

        // ZADANIE 8

        System.out.println("ZADANIE 8");

        Random random = new Random();

        int[] tablicaLosowa = new int[10];

        // Wypełnienie tablicy liczbami od -10 do 10
        for (int i = 0; i < tablicaLosowa.length; i++) {
            tablicaLosowa[i] = random.nextInt(21) - 10;
        }

        System.out.println("Zawartość tablicy:");

        for (int liczba : tablicaLosowa) {
            System.out.print(liczba + " ");
        }

        System.out.println();

        // Szukanie najmniejszego i największego elementu

        int minimum = tablicaLosowa[0];
        int maksimum = tablicaLosowa[0];

        int suma = 0;

        for (int liczba : tablicaLosowa) {

            if (liczba < minimum) {
                minimum = liczba;
            }

            if (liczba > maksimum) {
                maksimum = liczba;
            }

            suma += liczba;
        }

        double srednia = (double) suma / tablicaLosowa.length;

        int mniejsze = 0;
        int wieksze = 0;

        for (int liczba : tablicaLosowa) {

            if (liczba < srednia) {
                mniejsze++;
            }

            if (liczba > srednia) {
                wieksze++;
            }
        }

        System.out.println("Najmniejszy element: " + minimum);
        System.out.println("Największy element: " + maksimum);
        System.out.println("Średnia arytmetyczna: " + srednia);
        System.out.println("Elementów mniejszych od średniej: " + mniejsze);
        System.out.println("Elementów większych od średniej: " + wieksze);

        System.out.println("Tablica od końca:");

        for (int i = tablicaLosowa.length - 1; i >= 0; i--) {
            System.out.print(tablicaLosowa[i] + " ");
        }

        System.out.println();
        System.out.println();


    }}