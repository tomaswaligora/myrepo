import java.util.Arrays;
import java.util.Scanner;

// wpisuj liczby tak długo aż będzie 5 dodatnich i 5 ujemnych

public class FivenumbersThree {
    public static void main(String[] args) {
        int[] positiveNums = new int[5];
        int[] negativeNums = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj " + positiveNums.length + " liczb dodatnich i " + negativeNums.length + " liczb ujemnych");

        int counterPostive = 0;
        int counterNegative = 0;

        while (
                !(isArrayComplete(positiveNums) && isArrayComplete(negativeNums))
        ) {
            int input = scan.nextInt();

            if (input > 0) {
                if (isArrayComplete(positiveNums)) {
                    System.out.println("mamy już 5 liczb dodatnich, ta liczba bedzie zignorowana");
                } else {
                    positiveNums[counterPostive] = input;
                    counterPostive++;
                }

            } else if (input < 0) {
                if (isArrayComplete(negativeNums)) {
                    System.out.println("mamy juz 5 ujemnych, ta liczba bedzie pominięta");
                } else {
                    negativeNums[counterNegative] = input;
                    counterNegative++;
                }
            } else {
                System.out.println("wpisaleś 0 i je pomijam, wpisuj dalej");
            }

        }
        System.out.println(Arrays.toString(positiveNums));
        System.out.println(Arrays.toString(negativeNums));
    }

    /**
     * ta metoda ma sprawdzić czy którykolwiek z elementów tablicy jest równy 0
     *
     * @param tablica tablica do sprawdzenia
     * @return zwraca true jeśli nie zawiera zer a false jeśli zawiera przynajmniej jedno
     */
    public static boolean isArrayComplete(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] == 0) {
                return false;
            }
        }
        return true;
    }
}