package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial Calculator--");
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int factorial = factorialCalculator(num);
        System.out.println("Factorial Number is: "+factorial);



    }

    public static int factorialCalculator(int num){
        int fact = 1;

        for (int i = 1; i <=num ; i++) {

            fact = fact*i;

        }

        return fact;
    }
}
