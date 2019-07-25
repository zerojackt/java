public class forExam {
    public static void main(String[] args) {

//        * for
//        : for ( 초기화; , 조건식; 증감)

        int total = 0;

        for (int i = 1; i<=100; ++i) {

            total+=i;
        }
        System.out.println(total);

//        if just add even number

        int even = 0;

        for(int j = 1; j<=100; ++j) {

            if (j%2!=0) {
                continue; // like pass by

            }
            even+=j;

        }
        System.out.println(even);

//        a == 50

        int all = 0;

        for(int a = 1; a<=100; ++a) {

            all+=a;
            if (a==50) {
                break;
            }

        }
        System.out.println(all);

//        구구단

        System.out.println(" ");

        for (int x = 1; x<10 ; x++) {
            for (int y =1; y<10 ; y++) {
                System.out.println(x+"*"+y+"="+x*y);
            }
            System.out.println("--");
        }









    }
}
