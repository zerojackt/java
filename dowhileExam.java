import java.util.Scanner;

public class dowhileExam {
    public static void main(String[] args) {

//       * do while
//        while 문의 경우 조건이 만족하지 않는다면 한번도 반복하지 않을 수 있다.하지만,
//        do while 문의 경우는 무조건 한번은 실행되는 반복문이다.

        int value = 0;
        Scanner scan = new Scanner(System.in);


        do {
            // 반복할 문장들
             value = scan.nextInt();
             System.out.println(" your value :"+value);

        } while (value != 10); // 입력받은 값이 != 10 이 아닐 경우에 계속반복
        {
            System.out.println("replay end");
        }








    }
}
