import java.util.Scanner;

public class ifExam {
    public static void main(String[] args) {

//        * if

        int x = 50;
        int y = 50;

        if(x < y) {
            System.out.println("The x is smaller than y");
            System.out.println("test");
        }
//        {} 으로 묶으지 않으면 한줄만 printIn


        if( x < y)
            System.out.println("x and y are equal");
        System.out.println("test");

        if(x == y) {
            System.out.println("x and y are equal");
        }
        else {
            System.out.println("x and y are different");
        }
//       else

        if(x == y) {
            System.out.println("x and y are equal");
        }
        else if( x < y ){
            System.out.println("x is smaller than y ");
        }
        else
            System.out.println("x and y atr different");
//        else if : 너무많이 쓰면 실행속도를 느리게 함

//        if you have money -> go to train
//        else you don't have money -> walk
        boolean money = true;
        if(money) {
            System.out.println("go to train station");
        }
        else {
            System.out.println("just keep walking");
        }



        Scanner scan = new Scanner(System.in);
        System.out.println("what time is it :");

        int time = scan.nextInt();

        int tiredness = 4;

        if ((time<=7) && (tiredness <5)) {
            System.out.println("have breakfast and exercise");
        } else if (time<=8 && (3<tiredness && tiredness<=7)) {
            System.out.println("eat a serial and exercise");
        }

        Scanner scanHeight = new Scanner(System.in);
        System.out.println(" enter your height :");
        int yourHeight = scanHeight.nextInt();

        if (yourHeight>160) {
            System.out.println("you are taller than me");
        } else if (yourHeight == 160) {
            System.out.println("you and me are same height");
        } else {
            System.out.println("you are smaller than me");
        }









    }
}
