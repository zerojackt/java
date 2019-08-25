public class InnerExam3 {

    public void exec() {

        class  Cal {
            int value = 0;
            public void plus() {
                value++;
                }
            }


        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);


    }

    public static void main(String[] args) {

        InnerExam3 te = new InnerExam3();
        te.exec();


    }
}
