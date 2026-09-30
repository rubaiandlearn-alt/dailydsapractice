package Loops.patternprinting;

public class HollowPyramidPattern {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <=n ; row++) {
            //for each row -> variable col
            //spaces print part 1
            for (int spaces = 1; spaces <=n-row ; spaces++) {
                System.out.print(" ");

            }
            // Part 2

            for (int col = 1; col <=row*2-1 ; col++) {

                //1 row & last row star print
                if (row==1 || row==n){
                    System.out.print("*");

                // Left side rows star print
                }else if (col ==1){

                    System.out.print("*");

                // right side rows star print
                }else {
                    if (col==row*2-1){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }



            }


            System.out.println();

        }



    }
}
