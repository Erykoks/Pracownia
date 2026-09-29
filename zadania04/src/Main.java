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

