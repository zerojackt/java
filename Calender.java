import java.util.Scanner;
import java.lang.String;

public class Calender {

    static int maxday = 0;
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    static void cal(int month) {

        for (int i =1;i<13;i++) {

            if (month == i) {
                maxday = days[i - 1];
                break;
            }
        }
    }

    static void callCal(int month, int maxday) {

        System.out.println(month+" month has "+maxday+" day");

    }


    public static void main(String[] args) {


        // step 1 :


        System.out.println("sun mon tue wed thu fri sat");
        System.out.println("---------------------------");
        System.out.println(" 1   2   3   4   5   6   7 ");
        System.out.println(" 8   9   10  11  12  13  14 ");
        System.out.println(" 15  16  17  18  19  20  21 ");
        System.out.println(" 22  23  24  25  26  27  28 ");

        // 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers.");
        String a = scanner.nextLine();
        String[] b = a.split(" ");

        int first = Integer.parseInt(b[0]);
        int second = Integer.parseInt(b[1]);
        int sum = first+second;

        System.out.println("The sum of the two numbers is "+sum);

        // 3


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the Month.");
        int month = scanner1.nextInt();

        cal(month);
        callCal(month, maxday);

        // 4

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many returns?");
        int num = scanner2.nextInt();
        int i =0;
        int[] months = new int[num];

        while (true) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("");
            int add = scanner3.nextInt();
            months[i] = add;
            i++;

            if (i==num) break;
        }


        for (int j=0;j<num;j++) {
            cal(months[j]);
            callCal(months[j],maxday);
        }

        // 5

        while (true) {

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter the month");
            int mon = scanner3.nextInt();
            cal(mon);
            callCal(mon,maxday);

            if (mon==-1) {
                System.out.println("Have a nice day!");
                break;
            }

        }








    }
}
