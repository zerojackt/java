public class Multiples {

    public static void main(String[] args) {

//        If we list all the natural numbers below 10 that are multiples of 3 or 5,
//        we get 3, 5, 6 and 9. The sum of these multiples is 23.
//        Find the sum of all the multiples of 3 or 5 below 1000.

        int result = 0;

        for(int i=1;i<1001;i++) {
            if(3%i==0 || 5%i==0) {
                result+=i;
            }
        }

        System.out.println(result);

    }
}
