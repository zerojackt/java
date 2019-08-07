public class MethodExam2 {
    public static void main(String[] args) {

//        * MethodExam 에 있는 method 를 불러사용해보기

        MethodExam myclass = new MethodExam(); // myclass object 생성

        myclass.method1();

        myclass.method2(10);

        int value = myclass.method3();
        System.out.println("m3's return value : " + value);

        myclass.method4(5,10);

        int value2 = myclass.method5(55);
        System.out.println("m5 's return value : " + value2);









    }
}
