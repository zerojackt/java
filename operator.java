public class operator {
    public static void main(String[] args) {

        int i1 = -5;
//       - , + , /  ... -> operation 연산자
//       5 -> 피연산자

        int i2 = +i1; System.out.println(i2);
//      + 으로 전환되지 않음

        int i3 = -i1; System.out.println(i3);

//      * 증감 연산자
//        ex) ++ , --
        int i4 = ++i3; // i3 = i3 + 1;
        System.out.println(i4);
        System.out.println(i3);

        int i5 = i3++; // i3 = i3 + 1;
        System.out.println(i5);
        System.out.println(i3);


//      * 산술 연산자
        int i = 5;
        int j = 4;
        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / (double)j);
        System.out.println(i % j);

        String a = "Hello";
        String b = "World!";
        System.out.println(a + b);





    }
}
