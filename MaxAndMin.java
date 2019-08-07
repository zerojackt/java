public class MaxAndMin {
    public static void main(String[] args) {

//        * max

        int[] numbers = {3, 2, 14, 21, 100, 4, 2, 1};
        int max = 0;

        for (int i =0;i<numbers.length;i++) {
            if (max<numbers[i]) {
                max = numbers[i];
            }


        }
        System.out.println(max);

//        * min

        int min = 100;
        for(int i=0;i<numbers.length;i++) {
            if(min>=numbers[i]) {
                min =numbers[i];
            }
        }
        System.out.println(min);
    }
}
