public class switchExam {
    public static void main(String[] args) {

//        * switch
//         switch , case , default , break

        int value = 1;

        switch (value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default :
                System.out.println("the other number");
        }

        String str = "A";
        switch (str) {
            case "A":
                System.out.println("this is A");
                break;
            case "B" :
                System.out.println("this is B");
            default:
                System.out.println("i don't know this number");
        }


        int month = 3;

        switch (month) {
            case 1 :
            case 2 :
            case 3 :
                System.out.println("first");
                break;
            case 4 :
            case 5 :
            case 6 :
                System.out.println("second");
                break;




        }







    }
}
