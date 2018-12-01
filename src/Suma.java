import java.util.Arrays;
import java.util.Scanner;

// podaj X liczb i wypisz ich sume

public class Suma {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj " + numbers.length + " liczb:");
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scan.nextInt();

        }
        System.out.println("podane liczby to: " + Arrays.toString(numbers));

        getSum(numbers);

        System.out.println("suma liczb wynosi: " + getSum(numbers));

    }


    private static int getSum(int[] numery) {
        int sumaliczb = 0;
        for (int i = 0; i < numery.length; i++) {
            sumaliczb = sumaliczb + numery[i];
        }
        return sumaliczb;
    }
}