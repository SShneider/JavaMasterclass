public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo){
        if ((int) numOne != (int) numTwo) return false;
        if ((int) (numOne*10)%10 != (int) (numTwo*10)%10) return false;
        if ((int) (numOne*100)%100 != (int) (numTwo*100)%100) return false;
        if ((int) (numOne*1000)%1000 != (int) (numTwo*1000)%1000) return false;
        return true;
    }
}
