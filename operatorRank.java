public class operatorRank {
    public static void main(String[] args) {

//     * 연산자 우선 순위

        int a = 5;
        int b = 10;
        int c= 15;

        System.out.println(a-b*c);
        System.out.println((a-b)*c);

        System.out.println(a > 5 && b > 5); // false && true -> false
        System.out.println(a > 5 || b > 5);

        System.out.println(a > 5 && b>5 || c>5);
//      && > ||

//      ++a > a++
        System.out.println(a++ - 5);



    }
}
