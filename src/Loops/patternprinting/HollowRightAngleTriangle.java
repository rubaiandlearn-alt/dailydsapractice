package Loops.patternprinting;

public class HollowRightAngleTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {

                if (row==col || row==n){
                    System.out.print("* ");
                }



            }
            System.out.println();

        }

    }
}
