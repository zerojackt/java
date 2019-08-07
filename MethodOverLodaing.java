public class MethodOverLodaing {

//    method overloading
    // : parameter 의 유형과 개수를 다르게하여 같은 이름의 method 를 여러개 가질수있게함

    //

    public int plus(int x, int y) {
        return x+y;
    }

    // 유형은 same , parameter 의 개수는 different

    public int plus(int x, int y, int z) {
        return x+y+z;
    }

    // 유형을 different , parameter 의 개수가 same

    public String plus(String x, String y) {
        return x+y;
    }

//    public int plus(int i, int j) {
//
//    }




}
