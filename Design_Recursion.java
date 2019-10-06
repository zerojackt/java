public class Design_Recursion {

    public static void main(String[] args) {


    }

//    static int search(int[] data, int n, int target) {
//        for(int i=0;i<n; i++) {
//            if(data[i] == target)
//                return i;
//        }
//        return -1;
//    }

//    static int search(int[] data, int begin, int end, int target) {
//        if(begin>end) {
//            return -1;
//        }
//        else if (target==data[begin]) {
//            return begin;
//        } else {
//            return search(data, begin+1,end,target);
//        }
//    }

    static int search(int[] data, int begin, int end, int target) {
        if(end<0) {
            return -1;
        }
        else if (target==data[end]) {
            return end;
        } else {
            return search(data, begin,end-1,target);
        }
    }

    int findMax(int [] data, int begin, int end) {
        if(begin==end) {
            return data[begin];
        } else {
            return Math.max(data[begin], findMax(data,begin+1,end));
        }
    }

    static int binarySearch(String[] items, String target, int begin, int end) {
        if (begin>end) return -1;
        else {
            int middle = (begin+end)/2;
            int compREsult = target.compareTo(items[middle]);
            if (compREsult == 0) return middle;
            else if (compREsult<0)
                return binarySearch(items,target,begin,middle-1);
            else
                return binarySearch(items,target,middle+1,end);
        }
    }
}
