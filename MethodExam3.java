public class MethodExam3 {



//    - 복수의 return


    public static String[] getnames() {

        String[] names = {"jenny","alice"};
        return names;
    }


    public static void main(String[] args) {
        stats(1,2,3);
        String[] members = getnames();


    }


//    - 수 세개의 합계, 평균, 최솟값, 최댓값을 출력하는 코드를 짜보자.

        static void stats(int x, int y,int z) {

            int s = sum(x,y,z);

            int avg = sum(x,y,z)/ 3;

            int ma = max(x,y,z);

            int mi = min(x,y,z);


            System.out.println("sum : " + s);
            System.out.println("avg : " + avg);
            System.out.println("max : " + ma);
            System.out.println("min : " + mi);

        }

        static int sum(int x,int y, int z) {
             return x+y+z;
        }

        static int max(int x,int y,int z) {
            int max2 = x;
            if (max2 < y) {
                max2 = y;
            }
            if (max2 < z) {
                max2 = z;
            }
            return max2;

        }
        static int min(int x,int y,int z) {
            int min2 = x;
            if (min2 > y) {
                min2 = y;
            }
            if (min2 > z) {
                min2 = z;
            }
            return min2;
        }























    }

