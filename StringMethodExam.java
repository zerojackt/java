public class StringMethodExam {
    public static void main(String[] args) {

//      * String method

//        String str = new String("hello");
        String str ="hello";

        // .length() 길이
        System.out.println(str.length());

        // .concat() 결합
        System.out.println(str.concat(" world"));
        System.out.println(str); // 변하지 않음

        str = str.concat(" world"); System.out.println(str);

        // .substring() 자르기
        System.out.println(str.substring(3));
        // ->  3 ~ end 까지 잘라서보여줌
        System.out.println(str.substring(3,6));
        // 3 ~ 5

        // .equalsIgnoreCase() equal 인지 true,false
        System.out.println(str.equalsIgnoreCase("hello world"));













    }
}
