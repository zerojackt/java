public class operator2 {
    public static void main(String[] args) {

//       * 비교연산자
//         ==   : equal
//         !=   : Not equal
//        > , < , >= , <=

        int i = 10;
        int j = 10;
        System.out.println(i == j);
        System.out.println(i != j);
        System.out.println(i < j);
        System.out.println(i > j);
        System.out.println(i <= j);
        System.out.println(i >= j);

//       * 복합연산자
//      i += 10; ->  i = i + 10
        System.out.println(i += 10);

        System.out.println("----");

//      * 논리 연산자
//        && : and
//        || : or
//        !  : Not -> boolean 의 값을 연적시킨다
//        ^ : A^B , A 와 B are different -> true
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);
//       && : 둘다 true 일때만 true
        System.out.println(b1 || b2);
//       || : 둘 중 하나라도 true 이면 true

        int score = 88;
        if(score <= 100 && score >= 70) {
            System.out.println("Success");
        }
        else {
            System.out.println("Fail");
        }

        System.out.println(b1 ^ b3);



    }
}
