package Loops;

public class MultiplesOfN {
    public static void main(String[] args) {



        // print prime number from 1 to 100;





      // Print numbers from 1 to 100 that are not divisible by 4.


//        for (int i = 1; i <=100 ; i++) {
//
//            if (i%4 != 0){
//                System.out.println(i);
//            }
//
//
//
//        }


        //Find the sum of numbers from 1 to 100.

//        int num = 6;
//        int sum = 0;
//
//        for (int i = 1; i <=100; i++) {
//
//            sum = sum + i;
//
//        }
//
//        System.out.println(sum);


        //Find the sum of all even numbers from 1 to 100.
//        int sum = 0;
//
//        for (int i = 2; i <=100 ; i=i+2) {
//
//            sum = sum +i;
//
//
//        }
//        System.out.println(sum);


        //Count how many numbers from 1 to 100 are divisible by 7


//        int count = 0;
//
//
//        for (int i = 1; i <=100 ; i++) {
//
//            if (i%7 == 0){
//                count++;
//            }
//
//        }
//
//        System.out.println(count);


        //Check whether a number is prime or not.

//        int prime = 10;
//
//        int num = 2;
//
//        boolean isitPrime = true;
//
//        for (int i = num; i <prime ; i++) {
//
//            if (prime%i == 0){
//                isitPrime = false;
//
//            }
//
//
//        }
//
//        System.out.println(isitPrime);
//
//
//        if (isitPrime){
//            System.out.println("Prime: "+prime);
//        }else {
//            System.out.println("Not Prime: "+prime);
//        }

//        int a = 5;
//        int b = 2;
//
//        System.out.println(a%b);



        //Print all prime numbers from 1 to 100.

        int num = 2;

        int prime = 100;

        int count = 0;

        boolean isitPrime = true;


        for (int i = num; i <=100  ; i++) {

            if (prime%i == 0){

                isitPrime = false;
                System.out.println(isitPrime+" Not Prime "+i);


            }


        }









    }
}
