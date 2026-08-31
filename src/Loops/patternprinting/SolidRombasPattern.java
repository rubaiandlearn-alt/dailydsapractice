package Loops.patternprinting;

public class SolidRombasPattern {
    public static void main(String[] args) {
        
        int n = 5;

        for (int rows = 1; rows <=n; rows++) {

            for (int col = 1; col <=n-rows ; col++) {
                System.out.print(" ");

            }

            for (int i = 1; i <=5 ; i++) {
                System.out.print("* ");

            }
            System.out.println();


            
        }

        System.out.println(" Another Solid Rombas--");

        int num = 5;

        for (int i = 1; i <=num ; i++) {
            for (int spaces = 1; spaces <=i ; spaces++) {
                System.out.print(" ");

            }
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        
    }
}
