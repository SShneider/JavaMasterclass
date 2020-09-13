import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);
    public static int[] readIntegers(int count){
        int[] numArr = new int[count+1];
        while(count>=0){
            System.out.println("Enter a number: ");
            numArr[count] = scanner.nextInt();
            scanner.nextLine();
            count--;
        }
        return numArr;
    }
    public static int findMin(int[] arrIn){
        int min = arrIn[0];
        int max = arrIn[0];
        for(int i = 1; i<arrIn.length; i++){
            if(arrIn[i]<min) min = arrIn[i];
            if(arrIn[i]>max) max = arrIn[i];
        }
        System.out.println(min);
        return min;
    }


}
