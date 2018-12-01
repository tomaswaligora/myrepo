public class Choinki4 {
    /*
 1 0 0 0 0 0 0 0
 1 1 0 0 0 0 0 0
 1 1 1 0 0 0 0 0
 1 1 1 1 0 0 0 0
 1 1 1 1 1 0 0 0
 1 1 1 1 1 1 0 0
 1 1 1 1 1 1 1 0
 1 1 1 1 1 1 1 1
     */

    public static void main(String[] args) {

        int dimension = 7;
        for (int i = 0; i <= dimension; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" 1");
            }
            for (int j = 1; j <= dimension-i; j++) {
                System.out.print(" 0");
            }
            System.out.println();

        }
    }
}