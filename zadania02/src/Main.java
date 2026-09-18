import java.util.Scanner;

void main() {
    //zad1
    public class Zadanie1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Podaj liczbe: ");
            int liczba = scanner.nextInt();

            if (liczba % 3 == 0) {
                System.out.println("Liczba jest podzielna przez 3.");
            } else {
                System.out.println("Liczba nie jest podzielna przez 3.");
            }
        }
    }

    //zad2
    System.out.print("Podaj 1 bok trójkąta: ");
    int bok1 = sc.nextInt();

    System.out.print("Podaj 2 bok trójkąta: ");
    int bok2 = sc.nextInt();

    System.out.print("Podaj 3 bok trójkąta: ");
    int bok3 = sc.nextInt();

    if (bok1 + bok2 > bok3 && bok1 + bok3 > bok2 && bok2 + bok3 > bok1) {
        System.out.println("Z twoich liczb można zbudować trójkąt");
    } else {
        System.out.println("Z twoich liczb nie można zbudować trójkąta");
    }

    //3
    System.out.print("Podaj liczbe: ");
    int a = sc.nextInt();

    System.out.print("Podaj liczbe: ");
    int b = sc.nextInt();

    if (a > b) {
        System.out.println("Większe jest: " + a);
    } else if (b > a) {
        System.out.println("Większe jest: " + b);
    } else {
        System.out.println("Liczby są równe");
    }

}