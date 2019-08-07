public class EnumExam {


    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";


    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 ="boy";

//       상수를 사용했때의 문제점
//      String 으로 선언된 gender1 에는 MALE,FEMALE 둘 중 한가지 값을 갖기 원하는데,
//      gender1의 type 이 String 이기 때문에 gender1 = 소년; 전혀 문제가 되지 않는다.
//
//     실행할때 원했던 값인 MALE,FEMALE 이 아닌
//     다른 값이 들어오게 되므로 문제를 발생시킬 수 있다

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

//      gender2="boy";




    }
//       * Enum
//      :  enum 이름{값1,값2};


    enum Gender{
        MALE,FEMALE
    };

}


