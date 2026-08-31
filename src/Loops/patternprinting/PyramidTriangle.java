package Loops.patternprinting;

public class PyramidTriangle {
    public static void main(String[] args) {

        int n = 5;


        for (int rows = 1; rows <=n; rows++) {
            for (int space = 1; space<=(n-1)-rows ; space++) {

                System.out.print(" ");

            }

            for (int i = rows; i >=1 ; i--) {
                System.out.print("* ");

            }
            System.out.println();


        }





    }
}
