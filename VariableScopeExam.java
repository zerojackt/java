
//   *  Variable 변수의 scope 범위



public class VariableScopeExam {
    int globalScope = 10;

    static int staticVal = 7;
    //   static 사용하면 인스턴스 instance 화 하지 않아도 사용할수있음



    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
//      System.out.println(localScope); - Not use
//      System.out.println(value); - Not use
        System.out.println(value2);

    }


    public static void main(String[] args) {
//        System.out.println(globalScope);
//        System.out.println(localScope);
//        System.out.println(value);
        System.out.println(staticVal);
        //   static 사용하면 인스턴스화 하지 않아도 사용할수있음

        // 원래는 이렇게 ~
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);

        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);

        System.out.println("-------");

        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
//        static variable 는 공유된다
//        static 하게 선언된 변수는 값을 저장할 수 있는 공간이 하나만 생성된다.
//        그러므로, 인스턴스가 여러개 생성되도 static 한 변수는 하나다.


        System.out.println(VariableScopeExam.staticVal);
//       클래스 변수는 클래스명.변수명 으로 사용하는것이 더 바람직하다고 하다.


    }






}
