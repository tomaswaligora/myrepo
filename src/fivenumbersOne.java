import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fivenumbersOne {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("input positive numbers: ");
        int counter = 0;

        try {
            while (counter < numbers.length) {

                int input = scan.nextInt();

                if (input > 0) {
                    numbers[counter] = input;
                    counter++;
                } else {
                    System.out.println("not positive!");
                }
            }
            Arrays.sort(numbers);
            System.out.println("numbers are: " + Arrays.toString(numbers));
            System.out.println("the highest number is: " + numbers[numbers.length-1]);

        } catch (InputMismatchException e) {
            System.out.println("number too big!");
        }
    }
}
