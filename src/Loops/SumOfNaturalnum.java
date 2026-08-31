package Loops;

public class SumOfNaturalnum {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for (int i = 1; i <=n ; i++) {
            sum = i+sum;
        }

        System.out.println(sum);

        System.out.println(n*(n+1)/2);

        //Square of every Number;
        sumOfSquare();



    }

    public static void sumOfSquare(){
        int num = 4;
        int add = 0;

        for (int i = 1; i <=num ; i++) {

            add = add+i*i;
            System.out.println("Debugg of Add Number: "+add);

        }
        System.out.println("Sum of Square is: "+add);
    }

}
