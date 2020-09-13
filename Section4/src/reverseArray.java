import java.util.Arrays;
public class reverseArray {
    public static void reverse(int[] arrIn){
        int arrRev[] = new int[arrIn.length];
        for(int i = 0; i<arrIn.length; i++){
            arrRev[arrIn.length-1-i]= arrIn[i];
        }
        System.out.println(Arrays.toString(arrRev));
        System.out.println(Arrays.toString(arrIn));
    }
}
