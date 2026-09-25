package Loops.patternprinting;

public class HollowPyramidPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <=n ; row++) {



            for (int spaces = 1; spaces <=n-row ; spaces++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=row*2-1 ; col++) {

                System.out.print("*");

            }


            System.out.println();

        }



    }
}
