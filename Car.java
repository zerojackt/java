public class Car {

//  file field name

    String name;
    int number;

// make 생성자 : class name == 생성자 name
    public Car(String name) {
        this.name = name;
        // this -> 객체 자기자신

    }

//    생성자 overloading

    public Car() {
//        this.name = "None";
//        this.number = 0;
//
        this("None",0);
    }

    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public  Car(int number) {
        this.number = number;
    }

//    extends

    public void run() {
        System.out.println("run!");
    }

}
