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

        System.out.println("Second Version--");

        int num = 5;

        for (int row = 1; row <=num ; row++) {
            for (int spaces = 1; spaces <=num- row; spaces++) {
                System.out.print(" ");

            }
            for (int col = 1; col<=2* row -1 ; col++) {

                System.out.print("* ");

            }
            System.out.println();

        }





    }
}
