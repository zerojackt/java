public class extendsExam {


    // * extends 상속
    // public Bus extends Car {}

    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.run(); // Bus class 에는 아무것도 없지만 Car class 에 있는걸 불러옴
        bus.pang();

    }
}
