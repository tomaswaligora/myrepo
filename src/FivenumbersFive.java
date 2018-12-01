import java.util.Arrays;
import java.util.Scanner;

public class FivenumbersFive {
    public static void main(String[] args) {

        int[] positiveNumbers = new int[5];
        int[] negativNumbers = new int[5];

        Scanner scan = new Scanner(System.in);

        System.out.println("podaj 5 liczb dodatnich i 5 liczb ujemnych");

        int counterPositive = 0;
        int counterNegative = 0;

        while (!(isArrayComplete(positiveNumbers) && isArrayComplete(negativNumbers))) {

            int input = scan.nextInt();
            if (input > 0) {
                if (isArrayComplete(positiveNumbers)) {
                    System.out.println("dodatnie juz full");
                } else {
                    positiveNumbers[counterPositive] = input;
                    counterPositive++;
                }
            }

            if (input < 0) {
                if (isArrayComplete(negativNumbers)) {
                    System.out.println("ujemne juz full");
                } else {
                    negativNumbers[counterNegative] = input;
                    counterNegative++;
                }
            }
        }
        System.out.println("podane liczby to: " + Arrays.toString(positiveNumbers));
        System.out.println("podane liczby to: " + Arrays.toString(negativNumbers));

        int sumaDodatnich = 0;
        for (int i = 0; i < positiveNumbers.length; i++) {
            sumaDodatnich = sumaDodatnich + positiveNumbers[i];
        }
        System.out.println("suma pierwszej tablicy to: " + sumaDodatnich);
        int sumaUjemnych = 0;
        for (int i = 0; i < negativNumbers.length; i++) {
            sumaUjemnych = sumaUjemnych + negativNumbers[i];
        }
        System.out.println("suma drugiej tablicy to: " + sumaUjemnych);

        int sumaObuTablic = sumaDodatnich + sumaUjemnych;
        System.out.println("suma obu tablic to: " + sumaObuTablic);

    }

    public static boolean isArrayComplete(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == 0) {
                return false;
            }
        }
        return true;
    }
}