package Loops.patternprinting;

public class HollowRightAngleTriangle {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {

                if (col==1 ||  row ==n){
                    System.out.print("* ");
                }else if (row==2){
                    System.out.print("* ");
                }else {
                    if (col==3 || col==4){
                        System.out.print(" *");
                    }

                }

            }
            System.out.println();

        }

    }
}
