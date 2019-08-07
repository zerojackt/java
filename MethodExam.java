import java.lang.reflect.Parameter;

public class MethodExam {


//        * Method

//        field == 물체의 상태 , 물체의 행동 ==  method

//        입력값을 매개변수 Parameter 라고 하고,결과값을 리턴값이라고 합니다.

//         Class 안에 선언됩니다.



//       * 형식
//       public returnType MethodName (Parameters ) { 구현 }



        // if returnType None && Parameter None

        public void method1 () { /* 생략할수없고 void 를 넣어줌 */
            System.out.println(" m1 is running....");
        }

        // int x is input
        public void method2 (int x) {
            System.out.println(x+" is using , m2 is running");
        }

        // return O -> return 할 부분이 있어야한다
        public int method3() {
            System.out.println("m3 is running");
            return 10;

        }

        // int x && int y are input , not return
       public void method4(int x, int y) {
            System.out.println(x + y +"  method4 is running");
       }

       // int y -(input)> return int ?
       public int method5(int y) {
            System.out.println(y+" is using , m5 is running");
            return y*2;
        }







    }

