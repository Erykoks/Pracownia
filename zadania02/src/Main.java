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

    //4
    System.out.print("Podaj liczbe: ");
    int a2 = sc.nextInt();

    System.out.print("Podaj liczbe: ");
    int b2 = sc.nextInt();

    System.out.print("Podaj liczbe: ");
    int c2 = sc.nextInt();

    int najwieksza = a2;

    if (b2 > najwieksza) {
        najwieksza = b2;
    }

    if (c2 > najwieksza) {
        najwieksza = c2;
    }

    System.out.println("Najwieksza liczba to " + najwieksza);

    //5
    System.out.print("Podaj numer miesiaca: ");
    int miesiac = sc.nextInt();

    String nazwa = switch (miesiac) {
        case 1 -> "Styczen";
        case 2 -> "Luty";
        case 3 -> "Marzec";
        case 4 -> "Kwiecien";
        case 5 -> "Maj";
        case 6 -> "Czerwiec";
        case 7 -> "Lipiec";
        case 8 -> "Sierpien";
        case 9 -> "Wrzesien";
        case 10 -> "Pazdziernik";
        case 11 -> "Listopad";
        case 12 -> "Grudzien";
        default -> "Nieprawidlowy numer miesiaca";
    };

    //6
    System.out.print("Podaj imie: ");
    String imie = sc.next();

    String mojeImie = "Jakub";

    if (imie.equalsIgnoreCase(mojeImie)) {
        System.out.println("Masz takie samo imie jak ja");
    } else {
        System.out.println("Masz inne imie niz ja");
    }

    //7
    System.out.print("Podaj swoj wiek: ");
    int wiek = sc.nextInt();

    boolean pelnoletni = wiek >= 18 ? true : false;

    System.out.println("Czy jestes pelnoletni? " + pelnoletni);


    //8
    System.out.print("Podaj rok: ");
    int rok = sc.nextInt();

    if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
        System.out.println("Podany rok jest przestepny");
    } else {
        System.out.println("Podany rok nie jest przestepny");
    }




    System.out.println(nazwa);



}