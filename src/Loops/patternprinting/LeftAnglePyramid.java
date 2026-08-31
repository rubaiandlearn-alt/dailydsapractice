package Loops.patternprinting;

public class LeftAnglePyramid {
    public static void main(String[] args) {


        int n = 5;

        for (int rows = 1; rows <=5 ; rows++) {
            for (int col = n; col >=rows ; col--) {
                System.out.print("* ");

            }
            System.out.println();


        }
    }
}
