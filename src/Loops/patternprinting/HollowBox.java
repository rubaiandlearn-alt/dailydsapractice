package Loops.patternprinting;

public class HollowBox {

    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=5 ; col++) {

                //for eachrow -> 6 column
                //first row 6 * print & last row 6 * print

                if (row == 1 || row == n){
                    System.out.print("* ");
                }else {
                    // middle rows
                    if (col == 1){
                        System.out.print("* ");


                    } else if (col == 5) {
                        System.out.print("* ");

                    } else {
                        System.out.print("  ");
                    }
                }

            }
            System.out.println();

        }

    }

}
