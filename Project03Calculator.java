import java.util.Scanner;

public class Project03Calculator {

    static int one;
    static int two;

    static void start() {
        System.out.println("* --- Calculator --- *");
        System.out.println("* --- USE > " +
                            "0 : sum , 1: minus, 2: muit , 3: divi");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("First number :");
        one =scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Second number :");
        two =scan1.nextInt();
    }


    static void sum() {

        int sum1 = one+two;
        System.out.println(one+" + "+two+" = "+sum1);
    }

    static void minus() {
        int minus1 =one-two;
        System.out.println(one+" - "+two+" = "+minus1);
    }

    static void muit() {
        int muit1 =one*two;
        System.out.println(one+" * "+two+" = "+muit1);
    }

    static void divi() {
        int divi1 =one/two;
        System.out.println(one+" / "+two+" = "+divi1);
    }

    public static void main(String[] args) {

        while (true) {

            start();

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number :");
            int number = scan.nextInt();

            if (number == 0) {
                sum();
            }
            if (number == 1) {
                minus();
            }
            if (number == 2) {
                muit();
            }
            if (number == 3) {
                divi();
            }
        }
    }


}
