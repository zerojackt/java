import java.util.Scanner;
import java.lang.String;

public class Calender {


    public static void main(String[] args) {


        System.out.println("sun mon tue wed thu fri sat");
        System.out.println("---------------------------");
        System.out.println(" 1   2   3   4   5   6   7 ");
        System.out.println(" 8   9   10  11  12  13  14 ");
        System.out.println(" 15  16  17  18  19  20  21 ");
        System.out.println(" 22  23  24  25  26  27  28 ");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers.");
        String a = scanner.nextLine();
        String[] b = a.split(" ");

        int first = Integer.parseInt(b[0]);
        int second = Integer.parseInt(b[1]);
        int sum = first+second;

        System.out.println("The sum of the two numbers is "+sum);




    }
}
