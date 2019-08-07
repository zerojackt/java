public class Project2DogMaker {

//    * Dog's maker
//    the dog can eat , play , sleep , bark
//    eat - food kinds , portion
//    play - hour
//    sleep - time
//    bark - who

//    day check -

    String name; // Dog's name

    String food; String color; String who;
    int hour; int portion; int time;

    int star = 6;

    public Project2DogMaker(String name) {
        this.name = name;
    }

    static void start() {
        System.out.println("* --- Dog's maker ! --- *");
        System.out.println("* the dog can do eat , play , sleep , bark");
    }

    // eat
    void eat(String food, int portion) {
        System.out.println(name+" eats "+portion+" "+food+"s");
        this.portion = portion;
    }
    void eat(String food) {
        System.out.println(name+" eats "+portion+" "+food);
        this.portion = portion;
    }
    //play
    void play(int hour) {
        System.out.println(name+" plays for "+hour+" hour");
        this.hour = hour;
    }
    //sleep
    void sleep(int time) {
        System.out.println(name+" sleeps at "+time);
        this.time = time;
    }
    //bark
    void bark(String who) {
        System.out.println();

    }
    void day() {
        if(portion==3) {
            System.out.println("+ Good eating");
            star++;
        }
        else {
            System.out.println("+ Bad eating");
            star--;
        }

        if(hour>=2) {
            System.out.println("+ Good playing and exercising");
            star++;
        }
        else {
            System.out.println("+ Bad playing");
            star--;
        }

        if(time<=9) {
            System.out.println("+ Good enough sleeping");
            star++;
        }
        else {
            System.out.println("+ Bad sleeping");
            star--;
        }

        System.out.println("+ Good barking...? just it is a Dog!");
        star++;

        System.out.println("* --- --- --- ---  ---  ---  *");
        System.out.println("* --- Who is a Good Dog? --- *");

        if (star==10) {
            System.out.println("* Best ! "+name+" is Good Dog *");
        }
        if(star==9 || star ==8 || star==7) {
            System.out.println(name+" is Good Dog ");
        }
        else{
            System.out.println(name+"is Bad Dog... Nope, Bad guy is you");
        }
    }

    public static void main(String[] args) {
        Project2DogMaker test = new Project2DogMaker("사탕이");
        start();

        test.eat("사료",3);
        test.play(1);
        test.sleep(9);
        test.bark("men");

        test.day();


    }



}
