import java.util.Scanner;

public class financial_Calculator {

    public static void main(String [] args) {

        System.out.println(" p*(1+i)^(n)");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" 1. enter the p ");
        int p = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" 2. enter the i ");
        Double i = scanner1.nextDouble();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println(" 3. enter the n ");
        int n = scanner1.nextInt();
        Double re1 = 1+i;
        Double re2 = Math.pow(re1,n);


        Double result = p*re2;
        System.out.println("result :"+result);




    }
}
