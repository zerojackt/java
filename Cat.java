public class Cat {

    String name;

    void eat(int portion) {
        String behavior = name+"eats rice"+portion;
        System.out.println(behavior);
    }

    void sleep(int hour) {
        if (hour>1) {
            System.out.println(name+"sleeps"+hour+"hours");
        }
        else {
        System.out.println(name+"sleeps"+hour+"hour");
        }
    }


}
