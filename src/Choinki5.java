public class Choinki5 {

    /*
0 1 0 1 0 1 0
1 1 1 1 1 1 1
0 1 0 1 0 1 0
1 1 1 1 1 1 1
0 1 0 1 0 1 0
1 1 1 1 1 1 1
0 1 0 1 0 1 0
     */
    public static void main(String[] args) {
        int dimension = 8;
        for (int i = 1; i <= dimension; i++) {
            for (int j = 1; j <= dimension; j++) {
                if (i % 2 == 0 || (j % 2 == 0)) {
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
            }

            System.out.println();
        }
    }


}