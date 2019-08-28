import java.util.Scanner;
import java.lang.String;

public class Calender {

    static int maxday = 0;
    static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String num ;

    static void cal(int month) {

        for (int i = 1; i < 13; i++) {

            if (month == i) {
                maxday = days[i - 1];
                break;
            }
        }
    }

    static void callCal(int month, int maxday) {

        System.out.println(month + " month has " + maxday + " day");

    }


    static void minlCal(int i) {

        if (i == 30) {
            num = "\n" + " 29" + "  30";
        }if (i == 31) {
            num = "\n" + " 29" + "  30" + "  31";
        }if (i==28) {
            num = "";
        }

        System.out.println(
                "sun mon tue wed thu fri sat"
                        + "\n---------------------------"
                        + "\n 1   2   3   4   5   6   7 "
                        + "\n 8   9   10  11  12  13  14 "
                        + "\n 15  16  17  18  19  20  21 "
                        + "\n 22  23  24  25  26  27  28 "
                        + num);
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
        int sum = first + second;

        System.out.println("The sum of the two numbers is " + sum);

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
        int i = 0;
        int[] months = new int[num];

        while (true) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("");
            int add = scanner3.nextInt();
            months[i] = add;
            i++;

            if (i == num) break;
        }


        for (int j = 0; j < num; j++) {
            cal(months[j]);
            callCal(months[j], maxday);
        }

        // 5

        while (true) {

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter the month");
            int mon = scanner3.nextInt();
            cal(mon);
            callCal(mon, maxday);

            if (mon == -1) {
                System.out.println("Have a nice day!");
                break;
            }

        }

        System.out.println(" ---- 6 ---- ");

        // 6


        while (true) {

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Enter the month");
            int mont = scanner4.nextInt();
            cal(mont);


            if (maxday == 28) {
                minlCal(28);
            } if (maxday == 30) {
                minlCal(30);
            } if(maxday == 31) {
                minlCal(31);
            } if (mont == -1) {
                System.out.println("Bye ~");
                break;
            }


//                for (int array : thirth) {
//                        if (mont == array) {
//                            minlCal(30);
//                        }
//                    }
//                for (int array1 : thirth_one) {
//                        if (mont == array1) {
//                            minlCal(31);
//                        }
//                    }
//                 if (mont == -1) {
//                        System.out.println("Bye~");
//                        break;
//                    }
//                 if(mont == 2) {
//                     minlCal(28);
//                 }
//                }

        }


    }

}








