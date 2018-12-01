import java.util.Arrays;
import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {
        int[] tab1 = new int[5];
        int[] tab2 = new int[5];
        int[] tab3 = new int[5];


        Scanner scan = new Scanner(System.in);
        System.out.println("podaj 5 liczb:");
        //zapis do tablicy tab1 ze skanera
        for (int i = 0; i <= tab1.length - 1; i++) {
            tab1[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(tab1));

        //uzupełnienie tab2 numerami indeksów
        for (int i = 0; i <= tab2.length - 1; i++) {
            tab2[i] = i;
        }

        System.out.println(Arrays.toString(tab2));

        // wypełenienie tablicy tab3 przy pomocy fill wartością 5
        Arrays.fill(tab3, 5);
        System.out.println(Arrays.toString(tab3));

        // porównanie tab 1 i tab 2
        System.out.println(Arrays.equals(tab1, tab2));
    }
}