import java.util.Scanner;

public class Project1Quiz {
    public static void  main(String[] args) {

        //        Quiz project

        String[] quizSet = {"1. i am not 100","2. i know 20 , this number is alike ",
                "3. five ","4. i have two number ",
                "5. simple number "};

        System.out.println("*** Start A Quiz! ***");

        for(int i=0;i<quizSet.length;i++) {

            System.out.println(quizSet[i]);

            Scanner scan = new Scanner(System.in); System.out.println("Enter the answer :");
            int answer =scan.nextInt();

            if (answer==10) {
                System.out.println("Excellent! correct your answer");
                break;
            }
            else {
                System.out.println("Wrong, go to the next step");
                System.out.println("*** *** *** *** *** ***");
            }

        }
    }
}
