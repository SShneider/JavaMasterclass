public class FirstLastDigitSum {
    // write your code here
    public static int sumFirstAndLastDigit(int numIn){
        if(numIn<0) return -1;
        if(numIn<10) return numIn*2;
        int last = numIn%10;
        do{
            numIn/=10;
        }while(numIn>=10);
        return last+numIn;
    }
}
