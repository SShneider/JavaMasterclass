public class artSort {
//    // write your code here
//    int[] myArr = {2, 1, 4, 5, 13, 55, 124, 14, 13};
//    int[] sortedArr = artSort.artSortAlg(myArr);
//        for(int i = 0; i<sortedArr.length; i++) {
//        System.out.println(sortedArr[i]);
//    }
    public static int[] artSortAlg(int[] arrIn) {
        if (arrIn.length < 2) return arrIn;
        boolean Notcompleted = true;
        while (Notcompleted) {
            Notcompleted = false;
            for (int i = 0; i < arrIn.length - 1; i++) {
                if (arrIn[i] > arrIn[i + 1]) {
                    Notcompleted = true;
                    int temp = arrIn[i];
                    arrIn[i] = arrIn[i + 1];
                    arrIn[i + 1] = temp;
                }
            }
        }
        return arrIn;
    }
}
