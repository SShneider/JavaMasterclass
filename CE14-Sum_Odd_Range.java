public class SumOddRange {
 public static boolean isOdd(int numIn){
     if(numIn<1) return false;
     else if(numIn%2==0) return false;
     return true;
 }
 public static int sumOdd(int start, int end){
     if (start>end || start<0 || end<0) return -1;
     int sum = 0;
     for(int i = start; i<=end; i++){
         if(isOdd(i)) sum+=i;
     }
     return sum;
 }
}
