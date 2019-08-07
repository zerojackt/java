public class ClassObjectExam {

    int value;
    String name;

    ClassObjectExam(String n, int v) {
        name = n;
        value = v;
    }




    public static void main(String[] args) {
        ClassObjectExam myObject = new ClassObjectExam("this is my first object",1);
//        myObject.value = 10;
//        myObject.name ="this is my object";

        myObject.print();
        myObject.add(100);


    }

    void print() {
        System.out.println(name+" : "+value);
    }


    void add(int x) {
        value=x+value;
        print();
    }



}
