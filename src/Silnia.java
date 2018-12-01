import java.util.Scanner;

public class Silnia {
//Wczytaj jedną liczbę (`a`) i wypisz wynik działania `a` silnia - używaj tylko mnożenia

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("podaj liczbę: ");
        int liczba = scan.nextInt();
        int wynik=1;

        for (int i = 2; i<=liczba; i++){
            wynik = wynik *i;

        }
        System.out.println(wynik);

    }
}
