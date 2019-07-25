public class typecasting {
    public static void main(String[] args) {


//     - byte < short , char < int < long < float < double

//     - 묵시적형변환 Explicit Conversion
//        small type -> big type
        int x = 50000;
        long y = x;

        char one = 'o';
        int two = one; System.out.println(one);

//      - 강제형변환
//         big type -> small type
        long x2 = 5;
        int y2 = (int)x2;

        double d = 12.4;
        int i = (int)d;






    }
}
