public class CarExam2 {
    public static void main(String[] args) {
//        Car c1 = new Car();
        Car c2 = new Car("firetruck");
        Car c3 = new Car("ambulance");

        System.out.println(c2.name);

        Car c4 = new Car(1111);
        Car c5 = new Car("ambulance",1111);

    }
}
