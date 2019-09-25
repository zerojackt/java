public class Recursion2 {

    public static void main(String[] args) {


        int result = func(4);
        System.out.println(result);

        int result1 = factorial(4);
        System.out.println(result1);

        System.out.println(Math.pow(2,2));
        System.out.println(power(2,2));
        System.out.println(fibonacci(4));
        System.out.println(gcd(12,18));

        System.out.println(18%12);
    }

    static int func(int a) {
        if (a<=0) {
            return 0;
        } else {
            return a+func(a-1);
        }
    }

    static int factorial(int number) {
        if(number == 0)
            return 1;
        else
            return number*factorial(number-1);
    }

    static double power(double x, int n) {
        if(n==0) return 1;
        else {
            return x*power(x,n-1);
        }
    }

    static int fibonacci(int a) {
        if (a<2)
            return a;
        else {
            return factorial(a-1) + factorial(a-2);
        }
    }

    static int gcd(int m, int n) {
        if (m<n) {
            int tmp = m; m=n; n=tmp; // swap m and n
        }
        if (m%n == 0)
            return n;
        else
            return gcd(n,m%n);

    }
}
