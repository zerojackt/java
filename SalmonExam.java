public class SalmonExam {

    public static void main(String[] args) {
        Salmon salmon = new Salmon();
        salmon.breathe();

        Fish f = new Salmon();
        f.breathe();

        Salmon salmon1 = (Salmon) f;
        ((Salmon) f).jump();



    }
}
