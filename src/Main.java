import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String imie=scan.next();
        System.out.print("Podaj nazwisko: ");
        String nazwisko=scan.next();
        System.out.print("Podaj nrIndeksu: ");
        int nrindeksu=scan.nextInt();

        System.out.println(imie+" " + nazwisko+" " +nrindeksu);
        System.out.println();

        System.out.print("Podaj a: ");
        int a=scan.nextInt();
        System.out.print("Podaj b: ");
        int b=scan.nextInt();
        System.out.println("suma: "+(a+b));
        System.out.println("roznica: "+(a-b));
        System.out.println("mnozenie: "+(a*b));
        System.out.println("dzielenie: "+(a/b));
        System.out.println("modulo: "+(a%b));
    }
}
