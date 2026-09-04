package Loops.patternprinting;

public class InvertedPyramid {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <=n ; row++) {
            for (int spaces = n; spaces <=n+row ; spaces++) {

                System.out.print(" ");

            }

            for (int col = row; col <=2*n-row; col++) {
                System.out.print("* ");

            }
            System.out.println();





        }


        System.out.println("Second Version---");
        
        int num = 4;

        for (int line = 1; line <=num ; line++) {
            // for each row -> variable col;

            //spaces
            for (int col = 1; col <=line-1 ; col++) {
                System.out.print(" ");

            }

            //stars
            for (int stars = 1; stars <=2*num-2*line+1 ; stars++) {

                System.out.print("* ");

            }

            //move to next row;
            System.out.println();
            
        }

    }
}
