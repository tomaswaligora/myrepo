import java.util.Arrays;
import java.util.Scanner;

public class Suma {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj 5 liczb: ");
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scan.nextInt();

        }
        System.out.println("podane liczby to: " + Arrays.toString(numbers));

        int suma = getSum(numbers);

        System.out.println("suma liczb wynosi: " + suma);

        getMulti(numbers);
        System.out.println(getMulti(numbers));


        getOdejm(numbers);
        System.out.println(getOdejm(numbers));

    }

    private static int getOdejm(int[] numbers) {
        int odejmowanie=numbers[0]- numbers[1]-numbers[2]-numbers[3]-numbers[4];
        return odejmowanie;
    }

    private static int getMulti(int[] numbers) {
        return numbers[0]* numbers[1]*numbers[2]*numbers[3]*numbers[4];
    }

    private static int getSum(int[] numbers) {
        return numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
    }

}