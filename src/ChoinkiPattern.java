public class ChoinkiPattern {
/*
1 1 1 1 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 1 1 1 1
 */
    public static class Main {
        private static final int DIMENSION = 5;

        public static void main(String[] args) {
            for(int i = 0; i < DIMENSION; i++) {
                for(int j = 0; j < DIMENSION; j++) {
                    if(i == 0 || i == DIMENSION - 1 || j == 0 || j == DIMENSION - 1) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
}
