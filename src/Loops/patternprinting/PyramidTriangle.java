package Loops.patternprinting;

public class PyramidTriangle {
    public static void main(String[] args) {

        int n = 3;

        for (int rows = 1; rows <=n; rows++) {
            for (int col = 6; col >=n-rows ; col--) {

                System.out.print(" ");

            }

            for (int i = rows; i <=n ; i++) {
                System.out.print("* ");

            }
            System.out.println();


        }
        //


    }
}
