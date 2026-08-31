package Conditions;

import java.util.Scanner;

public class LeastOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Calculating Overall percentage considering only top 4 Marks---");
        System.out.print("Enter Science Marks: ");
        double sci = input.nextDouble();

        System.out.print("Enter Computer Science Marks: ");
        double cmSci = input.nextDouble();

        System.out.print("Enter Math Marks: ");
        double math = input.nextDouble();

        System.out.print("Enter English Marks: ");
        double eng = input.nextDouble();

        System.out.print("Enter Bengali Marks: ");
        double beng = input.nextDouble();



        if (sci<cmSci && sci<math && sci<eng && sci<beng){
            System.out.println("Lowest Number: "+sci);
            double totalNum = cmSci + math + eng + beng;
            System.out.println("Total Number: "+totalNum);
            double avg = totalNum/4;
            System.out.println("Average: "+avg);

        } else if (cmSci<sci && cmSci<math && cmSci<eng && cmSci<beng) {

            System.out.println("Lowest Number: "+cmSci);
            double totalNum = sci + math + eng + beng;
            System.out.println("Total Number: "+totalNum);
            double avg = totalNum/4;
            System.out.println("Average: "+avg);

        } else if (math<sci && math<cmSci && math<eng && math<beng) {

            System.out.println("Lowest Number: "+math);
            double totalNum = sci+cmSci+eng+beng;
            System.out.println("Total Number: "+totalNum);
            double avg = totalNum/4;
            System.out.println("Average: "+avg);

        } else if (eng<sci && eng<cmSci && eng<math && eng<beng) {

            System.out.println("Lowest Number: "+eng);
            double totalNum = sci+cmSci+math+beng;
            System.out.println("Total Number: "+totalNum);
            double avg = totalNum/4;
            System.out.println("Average: "+avg);

        }else if (beng<sci && beng<cmSci && beng<math && beng<eng){

            System.out.println("Lowest Number: "+beng);
            double totalNum = sci+cmSci+math+eng;
            System.out.println("Total Number: "+totalNum);
            double avg = totalNum/4;
            System.out.println("Average: "+avg);
        }



    }
}
