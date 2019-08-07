public class Stringclass {
    public static void main(String[] args) {

//        * String class 는 new 이용하지않아도 ㄱㄴ

        String str1 = "hello";
        String str2 = "hello";

        // 위 아레가 같지 않음 ,

        String str3 = new String("hello");
        String str4 = new String("hello");

        if(str1 == str2) {
            System.out.println("str1 and str2 are equal Reference");
        }

        if(str3==str4) {
            System.out.println("str3 and str4 are equal Reference");
        }
        else {System.out.println("different");}

        System.out.println(str1);

        System.out.println(str1.substring(3));

        System.out.println(str1);

//        String 은 내부의 값이 변하지않음

//        String equal()

        System.out.println(str1.equals(str2));








    }
}
