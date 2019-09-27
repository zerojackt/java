import java.util.Scanner;

public class Recursion3 {

    public static void main(String[] args) {

        String str = "developer";
        System.out.println(strLen(str));
        System.out.println(strLen2(str));
        strPrint(str);
        reverP(str);
        printInBinary(10);
    }

    static int strLen(String str) {
        if (str.length() == 0) return 0;
        else {
            return str.length();
        }
    }

    static int strLen2(String str) {
        if (str.equals("")) return 0;
        else {
            return 1 + strLen2(str.substring(1));
        }
    }

    static void strPrint(String str) {
        if (str.length() == 0) return ;
        else {
            System.out.println(str.charAt(0));
            strPrint(str.substring(1));
        }
    }

    static void reverP(String str) {
        if (str.length() == 0) return;
        else {
            reverP(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }

    static void printInBinary(int n) {
        if (n<2)
            System.out.println(n);
        else {
            printInBinary(n/2);
            System.out.println(n%2);
        }

    }

    static void readFrom(int n, int[] data, Scanner scan) {
        if(n==0) return;
        else {
            readFrom(n-1,data,scan);
            data[n-1]=scan.nextInt();
        }
    }
}
