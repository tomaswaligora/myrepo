import java.util.Arrays;
import java.util.Scanner;

public class fivenumbersTwo {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj 5 liczb: ");

        int counter = 0;
        while (counter < 5) {
            int num = scan.nextInt();
            numbers[counter] = num;
            counter++;
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("the lowest number is : " + numbers[0] + " and the highest is :" + numbers[4]);
    }
}
