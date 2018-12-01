import java.util.Arrays;
import java.util.Scanner;

public class FivenumbersFour {
    //Wczytuj liczby tak długo aż użytkownik poda 5 liczb większych od zera i
    // potem wypisz największą i najmniejszą z nich


    public static void main(String[] args) {

        int[] tab = new int[5];

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj " + tab.length + " liczb większych od zera");

        int counter = 0;
        while (IsArraynotComplete(tab)) {
            int input = scan.nextInt();
            if (input > 0) {
                tab[counter] = input;
                counter++;
            } else {
                System.out.println("ta liczba nie jest większa niż zero");
            }
        }
        System.out.println(Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
        System.out.println("najmniejsza liczba to: " + tab[0] + " a największa to: " + tab[tab.length-1]);

    }

    public static boolean IsArraynotComplete(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == 0) {
                return true;
            }
        }
        return false;
    }

}
