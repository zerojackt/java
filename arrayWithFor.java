public class arrayWithFor {
    public static void main(String[] args) {


//        * use array

        int[] set = new int[100];
        set[0] = 1;
        set[1] = 2;
        System.out.println(set.length); // 100

        // i를 index 로 사용 , length == array size
        for (int i =0; i< set.length; i++) {
            set[i] = i + 1;
        }

        // for 블럭 안에 있는 변수 i 는 for 문이 실행되고 끝날때 사라짐 그래서
        // 이렇게 또 나와도 no problem

        int sum =0;
        for(int i = 0; i< set.length; i++) {
            sum += set[i];

        }
        System.out.println(sum);

        int mul = 0;
        for (int i = 0; i < set.length; i++) {
            mul *= set[i];
        }

        System.out.println(mul);


//        test

        int[] integers = new int[]{ 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int index = 0;  index < integers.length; index++)  {
            if (integers[index]>50) {
                System.out.println("bigger than 50");
            }
            else {
                System.out.println("equal and smaller than 50");
            }

        }
    }
}















