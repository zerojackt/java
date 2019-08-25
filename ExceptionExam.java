public class ExceptionExam {

    public static void main(String[] args) {

        int i = 10;
        int j = 0;

        try {

            int k = i/j;
            System.out.println(k);

        } catch (ArithmeticException e) {

            System.out.println(" Can't divide into 0 it : "+e.toString());

        } finally {
            System.out.println(" no error ? i must show");
        }
    }
}
