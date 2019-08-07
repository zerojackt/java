import java.util.Scanner;

public class Project0TimeTables {

//   * title : 구구단 - Time tables
// enter the number -> make Time tables

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = scan.nextInt();

        System.out.println("----------");

        for (int i=1;i<10;i++) {
            System.out.println(number+"*"+i+"="+number*i);

        }

        System.out.println("----------");

    }

}
