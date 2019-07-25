public class arrayExam {
    public static void main(String[] args) {


//        * array 배열
//        ~[] name = new ~[몇개나 담을건지];

        int[] array1 = new int[100];

//      value 를 save
        array1[0] = 50;
        array1[10] = 100;

        int[] array2 = new int[4];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        array2[3] = 4;

//      선언과 동시에 초기화하는 방법
        int[] array3 = new int[]{1,2,3,4};

//       - --

        int[] array4 = {1,2,3,4};

        System.out.println(array3[3]);

        int value = array3[0];
        System.out.println(value);

        String[] names = {"jenny","anne","merry"};
        String[] weeks = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};










    }
}
