void main() {
    boolean warunek = true;
    System.out.println(warunek);

    if (!warunek) {
        System.out.println("Warunek prawdziwy");
    } else {
        System.out.println("Warunek nieprawdziwy");
    }

    int Liczba1 = 5;
    int Liczba2 = 10;

    if (Liczba1>Liczba2) {
        System.out.println(Liczba1 + " jest większa niż" + Liczba2);
    } else if {
        System.out.println("Liczby są równe");
    } else {
        System.out.println(Liczba2 + " jest większa niż" + Liczba1);
    }

    if (Liczba1 != Liczba2) {
        System.out.println("Liczby są różne");
    }


    string napis1 = "napis";
    string napis2 = "napis drugi";

    if (!napis1.equals(napis2)) {
        System.out.println("Napisy są różne");
    }

    Scanner sc = new Scanner(System.in);

    System.out.println("Podaj liczbę: ");
    int liczba = sc.nextInt();

    switch (liczba) {
        case 0:
            System.out.println("Zmienna ma wartość 0");
            break;
//        case 5:
//            System.out.println("Zmienna ma wartość 5");
//            break;
//        default:
//            System.out.println("Każdy inny przypadek");
//    }
//        boolean wyrazenie1 = true && false; // 1 i 0 -> 0
//        boolean wyrazenie2 = false || false; // 0 lub 0 -> 0
//
//        System.out.println(wyrazenie2);

        //logowanie

        String login, haslo;
        login = "user";
        haslo = "psswd";

        String loginPodany, hasloPodane;
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj login: ");
        LoginPodany = sc.nextline();
        System.out.println("Podaj hasło");
        hasloPodane = sc.nextline();

        if (hasloPodane.equals(haslo) && loginPodany.equals(login)) {
            System.out.println("Zalogowałeś się!");
        } else if (!hasloPodane.equals(haslo) && loginPodany.equals(login)) {
            System.out.println("Złe hasło!");
        } else {
            System.out.println("Zły login lub hasło");
        }
}

